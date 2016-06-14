/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import model.DataFactory;

/**
 * REST Web Service
 *
 * @author Alex
 */
@Path("factories")
public class Factories {

    @Context
    private UriInfo context;

    
    /**
     * Creates a new instance of Factories
     */
    public Factories() {
       
    }

    /**
     * Retrieves representation of an instance of REST.Factories
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    @Path("/members")
    public String getJson() {
        DataFactory f = new DataFactory(); 
        return f.getMembersAsJson();
    }

    /**
     * PUT method for updating or creating an instance of Factories
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
