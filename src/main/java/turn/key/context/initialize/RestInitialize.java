package turn.key.context.initialize;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;


@ApplicationPath("/rest")
public class RestInitialize extends ResourceConfig {
	
	public RestInitialize(){
		packages("turn.key.rest");
		register(JacksonFeature.class);
	}

}
