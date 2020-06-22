package org.acme;

import javax.inject.Inject;
import javax.inject.Qualifier;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    private HelloService helloService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return helloService.say();
    }
}