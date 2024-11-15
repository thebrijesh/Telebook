package com.telebook.mytelebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class TeleBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeleBookApplication.class, args);
	}

	@RequestMapping("/index")
	public String message() {
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/service")
	public String service() {
		return "service";
	}
}
