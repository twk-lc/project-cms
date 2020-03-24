package com.briup.demo.service;

import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.bean.ex.IndexResult;
import com.briup.demo.utils.CustomerException;

/**
 * 首页数据管理的Service接口
 * @author 一代渣男不让烫
 *
 */
public interface IIndexResultService {
	/**
	 * 查询首页需要的所有数据
	 * @return
	 * @throws CustomerException
	 */
	IndexResult findIndexAllResult() throws CustomerException;
	
}

