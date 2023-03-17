package quarkushello.resource;

<<<<<<< HEAD
import java.util.Date;
=======
//import java.util.Date;
>>>>>>> a45a0e9778e640120535c94ab3f6b1257d0b9d49
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import quarkushello.model.Biblioteca;
import quarkushello.repository.Bibliotecarepository;
<<<<<<< HEAD
import quarkushello.repository.Bibliotecarepository;
=======
//import quarkushello.repository.Bibliotecarepository;
>>>>>>> a45a0e9778e640120535c94ab3f6b1257d0b9d49

import javax.ws.rs.DELETE;

@Path("/biblioteca")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ControleBiblioteca {
   
    @Inject
<<<<<<< HEAD
    private Bibliotecarepository repository;
=======
     Bibliotecarepository repository;
>>>>>>> a45a0e9778e640120535c94ab3f6b1257d0b9d49
    
    @GET
    public List<Biblioteca> getAll() {
        
        // seleciona todas as Bibliotecas do banco de dados
         return repository.findAll().list();

    }

    @POST
    @Transactional
    public Biblioteca insert(Biblioteca biblioteca) {

        repository.persist(biblioteca);

        return biblioteca;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Biblioteca update(@PathParam("id") Long id, Biblioteca biblioteca) {

         Biblioteca entity = repository.findById(id);

         entity.setDescricao(biblioteca.getDescricao());
         entity.setDescricao(biblioteca.getDescricao());

        return entity;
    }

    @GET
    @Path("/count")
    public long count(){
        return repository.count();
    }
    
    @GET
    @Path("/search/{descricao}")
    public List<Biblioteca> search(@PathParam("idLivro") Integer idLivro){
        
        return repository.findByIdLivro(idLivro);

    }

    @DELETE
    @Path("{idLivro}")
    @Transactional
    public List<Biblioteca> delete(@PathParam("idLivro") Integer idLivro) {
        
        return repository.findByIdLivro(idLivro);
    
    }

}
