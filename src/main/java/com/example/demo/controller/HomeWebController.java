package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeWebController {
	@GetMapping("/web")
	public String printHello() {
		return "hello";
	}
	@GetMapping("/web/message")
	public String printmessage(Model model) {
		model.addAttribute("message","This is custom message");
		return "message";
	}
}
