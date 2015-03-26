package turn.key.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import turn.key.service.HelloWorldService;
import static turn.key.controller.View.*;
import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
@Controller
public class HelloWorldController {
	
	@Autowired
	private HelloWorldService helloWorldService;
	
	@RequestMapping(value=HELLO_WORLD_URI, produces=TEXT_HTML_VALUE)
	public String helloWorld(Model model){
		
		model.addAttribute("message", helloWorldService.sayHello());
		return HELLO_WORLD_VALUE;
	}

}
