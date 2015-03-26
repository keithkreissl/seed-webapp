package turn.key.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static turn.key.controller.View.*;
import static org.springframework.http.MediaType.TEXT_HTML_VALUE;
@Controller
public class HelloWorldController {
	
	@RequestMapping(value=HELLO_WORLD_URI, produces=TEXT_HTML_VALUE)
	public String helloWorld(){
		return HELLO_WORLD_VALUE;
	}

}
