package com.briup.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.demo.bean.Customer;
import com.briup.demo.service.ICustomerService;
import com.briup.demo.utils.Message;
import com.briup.demo.utils.MessageUtil;
import com.briup.demo.utils.StatusCodeUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description="用户管理")
public class CustomerController {
	@Autowired
	private ICustomerService customerService;
	
	@PostMapping("/addCustomer")
	@ApiOperation("注册用户")
	public Message<String> addCustomer(String username,String password){
		Customer customer = new Customer();
		customer.setUsername(username);
		customer.setPassword(password);
		customerService.save(customer);
		return MessageUtil.success();
	}
	@GetMapping("/findAllCustomer")
	@ApiOperation("获得所有用户信息")
	public Message<List<Customer>> findAllCustomer(){
		return MessageUtil.success(customerService.findAll());
	}
	
	@GetMapping("/loginCustomer")
	@ApiOperation("登录")
	public Message<String> loginCustomer(String username,String password){
		Customer customer = customerService.findByUsernameAndPassword(username, password);
		Customer customer2 = customerService.findByUsername(username);
		if(customer==null) {
			if(customer2==null) {
				return MessageUtil.error(StatusCodeUtil.ERROR_CODE,"没有此用户");
			}else {
				return MessageUtil.error(StatusCodeUtil.ERROR_CODE, "密码错误");
			}
		}
		return MessageUtil.success();
	}
}
