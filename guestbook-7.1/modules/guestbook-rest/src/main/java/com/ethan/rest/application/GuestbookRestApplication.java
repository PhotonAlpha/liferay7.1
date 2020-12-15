package com.ethan.rest.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import com.ethan.rest.application.config.CORSFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

/**
 * @author Ethan
 */
@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/v1/api",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Guestbook.Rest",
			"auth.verifier.guest.allowed=true",
			"liferay.access.control.disable=true",
			// disable scope check
			"oauth2.scopechecker.type=none"
	},
	service = Application.class
)
public class GuestbookRestApplication extends Application {

	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();

		singletons.add(this);

		singletons.add(getJacksonJsonProvider());
		// add resources
		singletons.add(new GuestbookResource());
		//add cors filter
		singletons.add(new CORSFilter());

		return Collections.unmodifiableSet(singletons);
		// return Collections.<Object>singleton(this);

	}

	private JacksonJsonProvider getJacksonJsonProvider() {

		JacksonJsonProvider jacksonJsonProvider = new JacksonJsonProvider();

		ObjectMapper objectMapper = new ObjectMapper();

		// Prevent serialization of null and empty string values
		objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);

		jacksonJsonProvider.setMapper(objectMapper);
		jacksonJsonProvider.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		return jacksonJsonProvider;
	}
}