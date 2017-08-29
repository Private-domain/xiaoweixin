package com.xiaoweixin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Transactional
@RestController
@RequestMapping("/v1/control/")
public class RecControl {

	@RequestMapping(value = "/insert" , method = RequestMethod.POST)
	public String insert(HttpServletRequest request) throws Exception{
    	return "success";
	    }
	
		
	
	
	
	 
	
}