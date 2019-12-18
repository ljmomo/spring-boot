package com.lvzhu.springboot.lvzhu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class DemoController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "world";
	}
}
