package org.dubbo.impl;

import org.dubbo.service.DemoService;

public class DemoServiceImpl implements DemoService{

	public String testDubbo(String name) {
		System.out.println("-----------testDubbo-------");
		return "Hello,"+name;
	}

}
