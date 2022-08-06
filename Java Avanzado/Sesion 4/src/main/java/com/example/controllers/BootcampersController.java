package com.example.controllers;

import com.example.models.Bootcamper;
import com.example.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private final BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;

        this.bootcamperService.add(new Bootcamper("uno", 1));
        this.bootcamperService.add(new Bootcamper("dos", 2));
        this.bootcamperService.add(new Bootcamper("tres", 3));
        this.bootcamperService.add(new Bootcamper("cuatro", 4));
        this.bootcamperService.add(new Bootcamper("cinco", 5));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> listarTodos() {
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper listarUno(@PathParam("name") String name) {
        return bootcamperService.getOne(name);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response meterBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(URI.create("/bootcampers/" + bootcamper.getName())).build();
    }
}
