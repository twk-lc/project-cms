package com.briup.demo.service;

import java.util.List;

import com.briup.demo.bean.Link;
import com.briup.demo.utils.CustomerException;


/**
 * 关于链接的service层
 * @author 一代渣男不让烫
 *
 */
public interface ILinkService {
	/**
	 * 保存或修改链接信息
	 * @param link
	 */
	void saveOrUpdateLink(Link link) throws CustomerException;
	
	/**
	 * 查询所有链接信息
	 */
	List<Link> findAllLinks() throws CustomerException;
	
	/**
	 * 根据id删除对应链接
	 */
	void deleteLinkById(short id) throws CustomerException;
	
	/**
	 * 根据   链接名   查询链接
	 */
	List<Link> findLinkByName(String name) throws CustomerException;
}
