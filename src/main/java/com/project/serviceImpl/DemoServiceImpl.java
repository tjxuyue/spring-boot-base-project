package com.cetc.data.client.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.cetc.data.client.entity.Demo;
import com.cetc.data.client.mapper.DemoMapper;
import com.cetc.data.client.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoDao;

	public Demo demo(Demo demo) {

		System.out.println("--------------输入参数--------------");
		System.out.println(JSON.toJSONString(demo));
		System.out.println("--------------demoMapper--------------");
		List<Demo> list1 = demoDao.demo();
		System.out.println(JSON.toJSONString(list1));
		System.out.println("--------------BaseMapper--------------");
		List<Demo> list2 = demoDao.selectAll();
		System.out.println(JSON.toJSONString(list2));
		return demo;
	}

}
