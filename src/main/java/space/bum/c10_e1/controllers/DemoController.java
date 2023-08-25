package space.bum.c10_e1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	@GetMapping("/demo")
	String demo() {
		return "데모:";
	}

}
