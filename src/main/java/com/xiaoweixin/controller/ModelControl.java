package com.xiaoweixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelControl {


	 /**
     * 测试hello
     * @return
     */
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "hello";
    }

    /**
     * 测试indxe
     */
	@RequestMapping(value = "/indxe",method = RequestMethod.GET)
	public String indxe(Model model) {
		model.addAttribute("name", "OUYANGGUANGLIN");
		return "index";
	}

}