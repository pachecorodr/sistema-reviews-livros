package br.edu.iff.ccc.bsidev.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "home") //URL
public class MainViewController {

	@GetMapping("/") //http:localhost:8080/home/
	public String getHome() {
		return "home.html";
	}
}
