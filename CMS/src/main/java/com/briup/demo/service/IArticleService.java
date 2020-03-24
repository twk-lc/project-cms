package com.briup.demo.service;

import java.util.List;

import com.briup.demo.bean.Article;
import com.briup.demo.utils.CustomerException;

/**
 * 文字相关内容的service接口
 * @author 一代渣男不让烫
 *
 */
public interface IArticleService {
	/**
	 * 新增或修改文章
	 */
	public void saveOrUpdateArticle(Article article) throws CustomerException;
	/**
	 * 删除文章
	 */
	public void deleteArticleById(short id) throws CustomerException;
	/**
	 * 查询文章
	 */
	public List<Article> findArticleByCondition(String keyStr,String condition) throws CustomerException;
	/**
	 * 根据id查询文章
	 */
	public Article findArticleById(short id) throws CustomerException;
	
}
