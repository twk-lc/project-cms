package com.briup.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.demo.bean.Article;
import com.briup.demo.bean.ArticleExample;
import com.briup.demo.bean.Category;
import com.briup.demo.bean.CategoryExample;
import com.briup.demo.mapper.ArticleMapper;
import com.briup.demo.mapper.CategoryMapper;
import com.briup.demo.service.IArticleService;
import com.briup.demo.utils.CustomerException;
import com.briup.demo.utils.StatusCodeUtil;

/**
 * 实现文章管理相关的逻辑类
 * @author 一代渣男不让烫
 *
 */
@Service
public class ArticleServiceImpl implements IArticleService{
	@Autowired
	  private ArticleMapper articleMapper;
	  @Autowired
	  private CategoryMapper categorymapper;
	@Override
	public void saveOrUpdateArticle(Article article) throws CustomerException {
		if(article==null) {
		      throw new CustomerException(StatusCodeUtil.ERROR_CODE,"参数为空");
		    }
		    if(article.getId()==null) {
		      article.setPublishdate(new Date());
		      article.setClicktimes((short) 0);
		      articleMapper.insert(article);
		    }
		    else {
		      articleMapper.updateByPrimaryKey(article);
		      articleMapper.updateByPrimaryKey(article);
		    }
	}

	@Override
	public void deleteArticleById(short id) throws CustomerException {
		// TODO Auto-generated method stub
		articleMapper.deleteByPrimaryKey(id);

	}

	@Override
	public List<Article> findArticleByCondition(String keyStr, String condition) throws CustomerException {
		/**
		 * 分三种情况:
		1.没有添加任何条件，则查询所有文章;
		2.没有指定栏目，但指定了查询的关键字，则根据关键字查询满足条件的所有文章;
		3.指定栏目，没有指定了查询的关键字，则根据栏目查询其中的所有文章;
		4.指定栏目，同时指定查询的关键字，则根据栏目和关键字查询满足条件的文章。
		 */
		keyStr = keyStr == null? "" : keyStr.trim();
		condition=condition==null?"" : condition.trim();
		ArticleExample example=new ArticleExample();
		if ("".equals(keyStr) && "".equals(condition)) {
			//情况1
			return articleMapper.selectByExample(example);
		}else if("".equals(keyStr) && "".equals(condition)){
			//情况2
			example.createCriteria().andTitleLike("%"+keyStr+"%");
			return articleMapper.selectByExample(example);
		}else if (!"".equals(condition)&& "".equals(keyStr)) {
			//情况3
			CategoryExample categoryExample = new CategoryExample();
			categoryExample.createCriteria().andNameEqualTo(condition);
			List<Category> categorie=categorymapper.selectByExample(categoryExample);
			if(categorie.size()>0) {
			//根据栏目信息,找到里面所有的文章
			example.createCriteria().andCategoryIdEqualTo(categorie.get(0).getId());
			}else {
				throw new CustomerException(StatusCodeUtil.ERROR_CODE, "没有指定的搜索栏目");
			}
			return articleMapper.selectByExample(example);
		}else {
			//情况4
			CategoryExample categoryExample = new CategoryExample();
			categoryExample.createCriteria().andNameEqualTo(condition);
			List<Category> categorie=categorymapper.selectByExample(categoryExample);
			//and的方式拼接
			example.createCriteria().andCategoryIdEqualTo(categorie.get(0).getId()).andTitleLike("%"+keyStr+"%");
			//or的方式,拼接条件
			//example.or().andTitleLike("%"+keyStr+"%");
			return articleMapper.selectByExample(example);
		}
	}

	@Override
	public Article findArticleById(short id) throws CustomerException {
		Article article = articleMapper.selectByPrimaryKey(id);
		//添加点击次数
		short clickTime=article.getClicktimes()==null?0:article.getClicktimes();
		article.setClicktimes((short) (clickTime+1));
		 this.saveOrUpdateArticle(article);
		return article;
	}

}
