package com.cetc.data.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetc.data.client.entity.Demo;
import com.cetc.data.client.service.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "test")
	public String test() {
		Demo demo = new Demo();
		demo.setId(1);
		demo.setName("test");
		demoService.demo(demo);
		return "测试成功";
	}
}
