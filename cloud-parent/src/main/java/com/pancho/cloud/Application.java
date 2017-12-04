package com.pancho.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

	@ResponseBody
	@RequestMapping(value = "/")
	public String findCity() {
		return "珠海";
	}

	public static void main(String[] args) {
		System.out.println("-------------");
		SpringApplication.run(Application.class, args);
	}

}
