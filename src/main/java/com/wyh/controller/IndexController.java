package com.wyh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	private static Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/")
	public String IndexControl(HttpServletRequest request, HttpServletResponse response, Model model) {
		logger.info("+++++++进入/接口");
		//数据交互
		logger.info("+++++++退出/接口");
		return "/index";
	}
}
