package turn.key.service.impl;

import org.springframework.stereotype.Service;

import turn.key.service.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String sayHello() {
		return "Hello World"; 
	}

}
