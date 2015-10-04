package de.fs_ist.ophase.rest;

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

    private static final Set<Class<?>> classes = new HashSet<>();

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(Server.class);

        return classes;
    }
}
