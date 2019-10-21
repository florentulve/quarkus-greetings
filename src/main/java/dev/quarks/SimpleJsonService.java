package dev.quarks;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greetings")
public class SimpleJsonService {

    @GET
    @Path("{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public GreetingMessage hello(@PathParam("name") String name) {
        GreetingMessage g =  new GreetingMessage();
        g.setMessage("hello");
        g.setName(name);
        return g;
    }
}