package web.spring.chatick.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/chat")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@GetMapping("/main")
	public void main(Model model) {
		logger.info("메인페이지 호출");
		
		
		
	}

}
