package turn.key.context.initialize;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

/**
 * The only purpose of this class is so that Jersey and Spring4 will play
 * nice together
 * @author keithkreissl
 *
 */
@Order(2)
public class BridgeInitialize implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext)
			throws ServletException {
		//This fixes a bug within jersey-spring3 which is looking for the contextConfigLocation
		servletContext.setInitParameter("contextConfigLocation", "");
	}

}
