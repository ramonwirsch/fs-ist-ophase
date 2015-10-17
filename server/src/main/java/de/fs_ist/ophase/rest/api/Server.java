package de.fs_ist.ophase.rest.api;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ramon on 04.10.2015.
 */
@Path("server")
public class Server {

	private static final Logger log = LoggerFactory.getLogger(Server.class);

    @PersistenceUnit
    EntityManagerFactory emf;

    @GET
    @Path("status")
    public String getStatus() {
		log.info("ok");
        return "Up and running";
    }

    @GET
    @Path("jpatest")
    public String getJpaTest() {
        emf = Persistence.createEntityManagerFactory("de.fs_ist.ophase");
		log.info("EMF: {}", emf);
        EntityManager em = emf.createEntityManager();
		log.info("EM: {}", em);
        return em.toString();
    }
}
