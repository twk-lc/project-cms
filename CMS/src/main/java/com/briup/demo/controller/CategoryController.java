package com.briup.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.demo.bean.Category;
import com.briup.demo.bean.ex.CategoryEx;
import com.briup.demo.service.ICategoryService;
import com.briup.demo.utils.Message;
import com.briup.demo.utils.MessageUtil;
import com.briup.demo.utils.StatusCodeUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 栏目相关的Controller
 * @author zcg
 *
 */
@RestController
@Api(description = "栏目相关接口")
public class CategoryController {
	
	@Autowired
	private ICategoryService categoryService;
	
	/**
	 * 查询所有栏目信息
	 */
	@GetMapping("/getAllCategory")
	@ApiOperation("获取所有的栏目信息")
	public Message<List<Category>> findAllCategorys(){
		return MessageUtil.success(categoryService.findAllCategorys());
	}
	
	/**
	 * 新增栏目信息
	 */
	@PostMapping("/saveCategory")
	@ApiOperation("新增栏目信息")
	public Message<String> saveCategory(Category category){
		try {
			categoryService.saveOrUpdateCategory(category);
			return MessageUtil.success();
		} catch (Exception e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误："+e.getMessage());
		}
	}
	
	/**
	 * 修改栏目信息
	 */
	@PostMapping("/updateCategory")
	@ApiOperation("修改栏目信息")
	public Message<String> updateCategory(Category category){
		try {
			categoryService.saveOrUpdateCategory(category);
			return MessageUtil.success();
		} catch (Exception e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误："+e.getMessage());
		}
	}
	
	/**
	 * 根据id删除栏目信息
	 */
	@GetMapping("/deleteCategoryById")
	@ApiOperation("根据id删除栏目信息")
	public Message<String> deleteCategory(short id){
		categoryService.deleteCategoryById(id);
		return MessageUtil.success();
	}
	
	/**
	 * 根据id查找栏目信息
	 */
	@GetMapping("/findCategoryById")
	@ApiOperation("根据id查找指定栏目信息")
	public Message<Category> findCategoryById(short id){
		return MessageUtil.success(categoryService.findCategoryById(id));
	}
	
	/**
	 * 根据id查找栏目及其包含的所有文章信息
	 */
	@GetMapping("/findCategoryExById")
	@ApiOperation("根据栏目id查找栏目及其包含文章的信息")
	public Message<Category> findCategoryExById(short id){
		return MessageUtil.success(
				categoryService.findCategoryById(id));
	}
	
}














