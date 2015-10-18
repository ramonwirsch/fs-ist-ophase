package de.fs_ist.ophase.rest;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import com.fasterxml.jackson.jaxrs.smile.JacksonSmileProvider;
import com.fasterxml.jackson.jaxrs.xml.JacksonXMLProvider;
import de.fs_ist.ophase.rest.api.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ramon on 04.10.2015.
 */
@ApplicationPath("/")
public class OphaseRestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(Server.class);

        return classes;
    }

	@Override
	public Set<Object> getSingletons() {
		Set<Object> singletons = new HashSet<>();
		singletons.add(new JacksonJsonProvider());
		singletons.add(new JacksonSmileProvider());
		singletons.add(new JacksonXMLProvider());
	}
}
