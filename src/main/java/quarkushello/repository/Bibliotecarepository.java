package quarkushello.repository;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import quarkushello.model.Biblioteca;

@ApplicationScoped
public class Bibliotecarepository implements PanacheRepository<Biblioteca> {
    
    public List<Biblioteca> findBydescricao(String id){
        if (id == null)
            return null;
        return find("UPPER(id) LIKE ?1 ", "%"+id.toUpperCase()+"%").list();
    }

    
    public List<Biblioteca> findByIdLivro(Integer idLivro){
    return find("UPPER(id) LIKE ?1 ", "%"+idLivro+"%").list();
    }
}


