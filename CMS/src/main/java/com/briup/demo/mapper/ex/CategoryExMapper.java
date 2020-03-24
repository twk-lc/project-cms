package com.briup.demo.mapper.ex;
/**
 * 处理查询栏目及其包含的文章信息
 */
import java.util.List;

import com.briup.demo.bean.ex.CategoryEx;

public interface CategoryExMapper {
/**
 * 实现查询所有栏目及其包含的文章信息
 */
	List<CategoryEx> findAllCategoryExs();
	
	/**
	 * 通过id查询对应栏目及其包含的文章信息
	 */
	CategoryEx findCategoryExById(short id);
}
