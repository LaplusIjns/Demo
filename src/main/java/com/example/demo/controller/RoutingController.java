package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoutingController {
	
	@RequestMapping(path = {"/"})
	public String Home() {
		return "/demo1";
	}
	@RequestMapping(path = {"/demo1"})
	public String Home1() {
		return "/demo1";
	}
}
