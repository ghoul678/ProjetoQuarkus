package quarkushello.resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;

import java.util.Date;
import java.util.List;

import quarkushello.model.Biblioteca;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

@Path("/Biblioteca")
public class ControleBiblioteca {
   
    /* @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Transactional
    public Biblioteca inserte(Biblioteca teste){
        teste.setIdLivro(1);
        teste.setDescricao("Quarkus");
        teste.setLocalEstante(0055);
       teste.persist();
        return teste;
    } */
    @POST
    @Transactional
    public Biblioteca inserir(Biblioteca NovaBiblioteca) {
        Biblioteca.persist(NovaBiblioteca);
        Date data = new Date();
        NovaBiblioteca.setDataCompra(data);
        NovaBiblioteca.setDescricao("Teste o novo");
        NovaBiblioteca.setLocalEstante(120.212);
        NovaBiblioteca.setQuantidade(12);

        return  NovaBiblioteca;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Biblioteca uptadte(@PathParam("id") Long id, Biblioteca atualizaBiblioteca) {

        Biblioteca entity = atualizaBiblioteca.findById(id);

        entity.setLocalEstante(12345);
        entity.setDescricao("Novo livro");

        return entity;
    }

    @GET
    public List<Biblioteca> findAll() {
        return Biblioteca.listAll();
    }
    @GET
    @Path("{id}")
    public Biblioteca Buscaporid(@PathParam("id") Long id) {
        Biblioteca BibliotecaEntityporid = Biblioteca.findById(id);
        return BibliotecaEntityporid;
    }
    @DELETE
    @Path("{id}")
    @Transactional
    public Biblioteca delete(@PathParam("id") Long id) {
        Biblioteca BibliotecaEntity = Biblioteca.findById(id);
        BibliotecaEntity.delete();

        return BibliotecaEntity;
    
    }
}
