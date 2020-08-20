package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomController {
	@GetMapping("/")
	public String login() {
		return "home";
	}
		@GetMapping("/user")
		public String userlogin() {
			return "user successfully logined";
		}
		@GetMapping("/admin")
		public String adminlogin() {
			return "admin login successful";
		}
	}



