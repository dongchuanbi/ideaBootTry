package com.example.demo.data.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/try")
public class TryController {

	@GetMapping("/tryDemo")
	public String tryDemo(){
		String str="给你demo啊！!!";
		return str;
	}
}
