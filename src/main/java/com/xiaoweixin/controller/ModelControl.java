package com.xiaoweixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelControl {


	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}

	@RequestMapping("/indxe")
	public String put(Model model) {
		model.addAttribute("name", "OUYANGGUANGLIN");
		return "index";
	}

}