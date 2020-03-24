package com.briup.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.demo.bean.Link;
import com.briup.demo.service.ILinkService;
import com.briup.demo.utils.CustomerException;
import com.briup.demo.utils.Message;
import com.briup.demo.utils.MessageUtil;
import com.briup.demo.utils.StatusCodeUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 与链接相关,和前端交互的web层
 * @author admin
 *
 */
@RestController
@Api(description="链接相关接口")
public class LinkController {
  
  @Autowired
  private ILinkService linkService;
  
  @PostMapping("/addLink")
  @ApiOperation("新增链接")
  public Message<String> addLink(Link link){
    
    try {
      linkService.saveOrUpdateLink(link);
      return MessageUtil.success();
    } catch (CustomerException e) {
      return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "系统错误: "+e.getMessage());
    }
  }
  @PostMapping("/updateLink")
  @ApiOperation("修改链接信息")
  public Message<String> updateLink(Link link){
	  linkService.saveOrUpdateLink(link);
	  return MessageUtil.success();
  }
  @GetMapping("/selectLinks")
  @ApiOperation("查询所有链接")
  public Message<List<Link>> selectLinks(){
	  List<Link> list = linkService.findAllLinks();
	return MessageUtil.success(list);
  }
  @GetMapping("/deleteLinkById")
  @ApiOperation("根据id删除链接")
  public Message<String> deleteById(short id){
	  linkService.deleteLinkById(id);
	  return MessageUtil.success();
  }
  @GetMapping("/selectLinkByName")
  @ApiOperation("根据链接名查询")
  public Message<List<Link>> selectLinkByName(String name){
	  List<Link> list = linkService.findLinkByName(name);
	  return MessageUtil.success(list);
  }
}