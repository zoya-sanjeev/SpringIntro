package com.bridgelabz.helloworlddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {
	@GetMapping("/web")
	public String hello() {
		return "hello";
	}

}
