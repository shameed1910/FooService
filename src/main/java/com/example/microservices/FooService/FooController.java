package com.example.microservices.FooService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
public class FooController {
	@RequestMapping("/foo")
	@ResponseBody
	public String fooTest(){
		
		String response="Foo bar";

		return response;
		
	}
}
