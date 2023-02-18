package quarkushello.resource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;

import java.util.List;

import quarkushello.model.Biblioteca;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;

@Path("/Biblioteca")
public class ControleBiblioteca {
   
    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    @Transactional
    public Biblioteca inserte(Biblioteca teste){
       /*  teste.setIdLivro(1);
        teste.setDescricao("Quarkus");
        teste.setLocalEstante(0055);
       teste.persist(); */
        return teste;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Biblioteca testeBiblioteca(){
       Biblioteca teste=new Biblioteca();
       
       teste.setIdLivro(1);
        teste.setDescricao("Quarkus");
        teste.setLocalEstante(0055);
       teste.persist();
       return teste;
    } 
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Biblioteca> getAll(){
       //retorna todas as pessoas da tabela
        return Biblioteca.findAll().list();
    }
}
