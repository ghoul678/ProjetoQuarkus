package quarkushello.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SecaoBiblioteca {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_secao;

<<<<<<< HEAD
    /* @Column
    @ManyToOne
    @JoinColumn(name = "id_Biblioteca")
    private Biblioteca biblioteca; */
=======
    @Column
    @ManyToOne
    @JoinColumn(name = "id_Biblioteca")
    private Biblioteca biblioteca;
>>>>>>> a45a0e9778e640120535c94ab3f6b1257d0b9d49

    public Integer getId_secao() {
        return id_secao;
    }

    public void setId_secao(Integer id_secao) {
        this.id_secao = id_secao;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    

}
