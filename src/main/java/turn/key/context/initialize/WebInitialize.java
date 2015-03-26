package turn.key.context.initialize;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import turn.key.context.web.WebContext;

public class WebInitialize extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		//The root configuration classes will live here
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		//The controller configuration classes will be here
		return new Class<?>[]{WebContext.class};
	}

	@Override
	protected String[] getServletMappings() {
		//Servlet mapping for what the application listens on
		return new String[]{"/"};
	}
	
	

}
