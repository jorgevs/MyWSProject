package com.jvs.ws.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by jorgevs on 11/5/2016.
 */
@Path("/books")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
//@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
//@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class BookResource {

    @GET
    public String getAllBooks(){
        return "Hello REST WS!";
    }

    /*@GET
    @Path("/{id}")
    public Response getBookById(@PathParam("id") String id){
    }

    @POST
    public Response createBook(Book book){
    }

    @PUT
    public Response updateBook(Book book){
    }

    @DELETE
    public Response deleteBook(@PathParam("id") String id){
    }*/
}
