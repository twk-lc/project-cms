package com.briup.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.demo.bean.ex.IndexResult;
import com.briup.demo.service.IIndexResultService;
import com.briup.demo.utils.Message;
import com.briup.demo.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="首页需要的所有数据")
public class IndexResultController {
	
	@Autowired
	private IIndexResultService indexResultService;
	@GetMapping("/getIndexResult")
	@ApiOperation("首页展示")
	public Message<IndexResult> getIndexResult(){
		return MessageUtil.success(indexResultService.findIndexAllResult());
	}
}
