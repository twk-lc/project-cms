package com.briup.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.demo.bean.Article;
import com.briup.demo.service.IArticleService;
import com.briup.demo.utils.CustomerException;
import com.briup.demo.utils.Message;
import com.briup.demo.utils.MessageUtil;
import com.briup.demo.utils.StatusCodeUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 文章相关信息的controller
 * @author 一代渣男不让烫
 *
 */
@RestController
@Api(description="文章相关接口")
public class ArticleController {
	@Autowired
	private IArticleService articleService;
	@PostMapping("/addArticle")
	@ApiOperation("添加文章信息")
	public Message<String> saveArticle(Article article){
		try {
			articleService.saveOrUpdateArticle(article);
			return MessageUtil.success();
		} catch (CustomerException e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误"+e.getMessage());
		}
	}
	@PostMapping("/updateArticle")
	@ApiOperation("修改文章信息")
	public Message<String> updateArticle(Article article){
		try {
			articleService.saveOrUpdateArticle(article);
			return MessageUtil.success();
		} catch (CustomerException e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误"+e.getMessage());
		}
	}
	@GetMapping("/deleteArticleById")
	@ApiOperation("根据id删除文章文章信息")
	public Message<String> deleteArticleById(short id){		
			articleService.deleteArticleById(id);
			return MessageUtil.success();		
	}
	@GetMapping("/findArticleByCondition")
	@ApiOperation("根据条件查询文章信息")
	public Message<List<Article>> getArticleByCondition(String keyStr,String condition){
		try {
			List<Article> list=articleService.findArticleByCondition(keyStr, condition);
			return MessageUtil.success(list);
		} catch (CustomerException e) {
			return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误"+e.getMessage());
		}
	}
	@GetMapping("/findArticleById")
	@ApiOperation("根据id查询文章信息")
	public Message<Article> getArticleById(short id){
		Article article=articleService.findArticleById(id);
		return MessageUtil.success(article);
	}
}
