package com.briup.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.demo.bean.Link;
import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.bean.ex.IndexResult;
import com.briup.demo.service.ICategoryService;
import com.briup.demo.service.IIndexResultService;
import com.briup.demo.service.ILinkService;
import com.briup.demo.utils.CustomerException;

/**
 * 查询首页所有数据的实现类
 * @author 一代渣男不让烫
 *
 */
@Service
public class IndexResultServiceImpl implements IIndexResultService{
	//关联超链接的service层接口
	@Autowired
	private ILinkService linkService;
	@Autowired
	private ICategoryService categoryService;
	
	
	@Override
	public IndexResult findIndexAllResult() throws CustomerException {
		
		IndexResult indexResult=new IndexResult();
		//设置所有的超链接信息
		List<Link> links=linkService.findAllLinks();
		indexResult.setLinks(links);
		//设置所有的栏目及其包含的所有文章信息
		List<CategoryEx> categoryExs = categoryService.findAllCategoryEx();
		indexResult.setCategoryExs(categoryExs);
		return indexResult;
	}

}
