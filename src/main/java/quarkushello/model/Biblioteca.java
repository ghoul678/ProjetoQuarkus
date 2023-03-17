package quarkushello.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Biblioteca  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idLivro ;
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
    }   }
