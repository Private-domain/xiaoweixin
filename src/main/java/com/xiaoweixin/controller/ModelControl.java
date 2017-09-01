package com.xiaoweixin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiaoweixin.dto.TQr;
import com.xiaoweixin.dto.TQrExample;
import com.xiaoweixin.dto.TUser;
import com.xiaoweixin.dto.TUserExample;
import com.xiaoweixin.service.TQrService;
import com.xiaoweixin.service.TUserService;

@Controller
public class ModelControl {

	@Autowired
	private TQrService tQrService;
	@Autowired
	private TUserService tUserService;

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
     */
	@RequestMapping(value = "/indxe",method = RequestMethod.GET)
	public String indxe(Model model) {
		TUserExample example = new TUserExample();
		List<TUser> data = tUserService.findTUserList(example);
		model.addAttribute("data", data);
		return "index";
	}

}