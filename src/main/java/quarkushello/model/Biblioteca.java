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

   public Integer getIdLivro() {
        return idLivro;
    }
   public void setIdLivro(Integer idLivro) {
        this.idLivro = idLivro;
    }
   public Date getDataCompra() {
        return dataCompra;
    }
   public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
   public Integer getQuantidade() {
        return quantidade;
    }
   public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
   public String getDescricao() {
        return descricao;
    }
   public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   public double getLocalEstante() {
        return localEstante;
    }
   public void setLocalEstante(double localEstante) {
        this.localEstante = localEstante;
    }   }
