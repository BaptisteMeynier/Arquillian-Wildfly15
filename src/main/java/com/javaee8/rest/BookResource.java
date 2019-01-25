package com.javaee8.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;
import static javax.ws.rs.core.MediaType.WILDCARD;

@Path("book")
@Produces(APPLICATION_JSON)
public class BookResource {

    private List<String> books = Arrays.asList("Le Proces","Lettre a mon pere","La metamorphose");

    @GET
    public Response getBook() {
        return Response.ok(books).build();
    }
}
