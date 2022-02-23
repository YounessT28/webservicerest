package eu.ensup;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMsg() {
        return "Hello ENSITECH";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response postMsg(String username){
        if(username.equals("youness")){
            User person = new User("youness", "password", "admin");
            return Response.status(200).entity(person).build();
        }
        else
        {
            String output = "Erreur";
            return Response.status(200).entity(output).build();
        }

    }

}
