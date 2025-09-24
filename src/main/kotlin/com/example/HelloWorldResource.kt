package com.example

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource {

    @GET
    fun hello(): Map<String, String> {
        // e.g. {"message":"Hello, World!"}
        return mapOf("message" to "Hello, World!")
    }
}
