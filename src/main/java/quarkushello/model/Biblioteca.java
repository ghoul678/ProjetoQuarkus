package quarkushello.model;

//Trabalho colaborativo André e Nicole

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


<<<<<<< HEAD

=======
>>>>>>> a45a0e9778e640120535c94ab3f6b1257d0b9d49
@Entity
public class Biblioteca  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
   private Integer idLivro ;
=======
    Integer idLivro ;
>>>>>>> a45a0e9778e640120535c94ab3f6b1257d0b9d49
    @Column
    //@ManyToOne
   private Date dataCompra;
    @Column
    private Integer quantidade;
    @Column
   private String descricao;
    @Column
    private double localEstante;

    private Integer getIdLivro() {
        return idLivro;
    }
    private void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }
    private Date getDataCompra() {
        return dataCompra;
    }
    private void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    private Integer getQuantidade() {
        return quantidade;
    }
    private void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    private String getDescricao() {
        return descricao;
    }
    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private double getLocalEstante() {
        return localEstante;
    }
    private void setLocalEstante(double localEstante) {
        this.localEstante = localEstante;
    }    
}
