/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.restful;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

import ws.entity.DashBoardEntityWS;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author Sergey
 */
@Path("dashboard")
public class DashBoardRest {

    /**
     * Creates a new instance of RestfulwsResource
     */
    public DashBoardRest() {
    }

    /**
     * Retrieves representation of an instance of restful.RestfulwsResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getJson() {
        ws.entity.DashBoardEntityWS de = new DashBoardEntityWS();
        de.setFirst("first");
        
        
        return Response.ok(de).build();
    }

    /**
     * PUT method for updating or creating an instance of RestfulwsResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
