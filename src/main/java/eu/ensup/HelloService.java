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
    @Consumes(MediaType.APPLICATION_JSON)
    public User postMsg(User user){
        if(user.getUsername().equals("youness")){
            User person = new User("youness", "password", "admin");
            return person;
        }
        else
        {
            User person = new User();
            String output = "Erreur";
            return person;
        }

    }

}
