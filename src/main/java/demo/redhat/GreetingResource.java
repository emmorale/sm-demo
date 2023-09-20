package demo.redhat;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.UUID;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        UUID randomUUID = UUID.randomUUID();
        return "PAC: "+System.getenv("PAC")+" UUID: "+randomUUID;
    }
}
