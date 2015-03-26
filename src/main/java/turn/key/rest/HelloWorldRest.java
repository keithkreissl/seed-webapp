package turn.key.rest;

import java.util.Collections;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import turn.key.service.HelloWorldService;

@Component
@Path("hello-world")
public class HelloWorldRest {

	@Autowired
	private HelloWorldService helloWorldService;
	
	@GET
	@Produces("application/json")
	public Map<String, String> helloWorld(){
		return Collections.singletonMap("jersey",helloWorldService.sayHello());
	}

}
