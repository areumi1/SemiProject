package com.javassem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("{url}.do")
	public String bv(@PathVariable String url) {
		System.out.println("확인");
		return url;
	}
	
	
	

}
