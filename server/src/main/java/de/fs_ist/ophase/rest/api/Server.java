package de.fs_ist.ophase.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by ramon on 04.10.2015.
 */
@Path("server")
public class Server {

    @GET
    @Path("status")
    public String getStatus() {
        return "Up and running";
    }
}
