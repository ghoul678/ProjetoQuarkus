package quarkushello.resource;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import quarkushello.model.Biblioteca;
import quarkushello.repository.Bibliotecarepository;
import quarkushello.service.BibliotecaService;
import quarkushello.DTO.BibliotecaResponseDTO;
import quarkushello.DTO.BibliotecaDTO;

import javax.ws.rs.DELETE;

@Path("/biblioteca")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ControleBiblioteca {
   
    @Inject
    BibliotecaService bibliotecaService;
    
    @GET
    public List<BibliotecaResponseDTO> getAll() {
        return bibliotecaService.getAll();
    }

    @GET
    @Path("/{id}")
    public BibliotecaResponseDTO findByIdLivro(@PathParam("id") Integer id) {
        return bibliotecaService.findByIdLivro(id);
    }

    @POST
    public Response insert(BibliotecaDTO dto) {
        BibliotecaResponseDTO biblioteca = bibliotecaService.create(dto);
        return Response.status(Status.CREATED).entity(biblioteca).build();
    }

    @PUT
    @Path("/{id}")
    public Response update(@PathParam("id") Integer id, BibliotecaDTO dto) {
        BibliotecaResponseDTO biblioteca = bibliotecaService.update(id, dto);
        return Response.status(Status.NO_CONTENT).build();
    }

    @GET
    @Path("/count")
    public long count(){
        return bibliotecaService.count();
    }

    @DELETE
    @Path("{idLivro}")
    //@Transactional
    public Response delete(@PathParam("id") Integer id) {
        bibliotecaService.delete(id);
        return Response.status(Status.NO_CONTENT).build();
    }

}
