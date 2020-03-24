package com.briup.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.briup.demo.bean.ArticleExample;
import com.briup.demo.bean.Category;
import com.briup.demo.bean.CategoryExample;
import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.mapper.ArticleMapper;
import com.briup.demo.mapper.CategoryMapper;
import com.briup.demo.mapper.ex.CategoryExMapper;
import com.briup.demo.service.ICategoryService;
import com.briup.demo.utils.CustomerException;
import com.briup.demo.utils.StatusCodeUtil;

/**
 * 栏目管理相关功能逻辑实现类
 * @author 一代渣男不让烫
 *
 */
@Service
public class CategoryServiceImpl implements ICategoryService{
	//栏目的dao
	@Autowired
	private CategoryMapper categoryMapper;
	//栏目的拓展dao
	@Autowired
	private CategoryExMapper categoryExMapper;
	
	//文章的dao
		@Autowired
		private ArticleMapper articleMapper;
	@Override
	public List<Category> findAllCategorys() throws CustomerException {
		return categoryMapper.selectByExample(new CategoryExample());
	}

	@Override
	public void saveOrUpdateCategory(Category category) throws CustomerException {
		if(category == null) {
			throw new CustomerException(StatusCodeUtil.ERROR_CODE, "参数为空");
		}
		//手动插了id=1   你的目录有id,这边在判断
		if(category.getId()==null) {  //这不是自己写的代码嘛，==null时，条件才成立走括号
			//没有id才会插入
			categoryMapper.insert(category);
		}else {
			// 你现在走的是这步，有id,进入此处，这边是更新操作，不是插入。所以数据库没有信息。
			categoryMapper.updateByPrimaryKey(category);
		}
		
	}

	@Override
	public void deleteCategoryById(short id) throws CustomerException {
		//删除栏目的同时，需要先删除栏目中包含的文章信息。
				ArticleExample example = new ArticleExample();
				example.createCriteria().andCategoryIdEqualTo(id);
				articleMapper.deleteByExample(example);
				
				categoryMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public Category findCategoryById(short id) throws CustomerException {
		return categoryMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<CategoryEx> findAllCategoryEx() throws CustomerException {
		List<CategoryEx> list = categoryExMapper.findAllCategoryExs();
		System.out.println(list);
		return list;
	}

	@Override
	public CategoryEx findCategoryExById(short id) throws CustomerException {
		return categoryExMapper.findCategoryExById(id);
	}
	

}












