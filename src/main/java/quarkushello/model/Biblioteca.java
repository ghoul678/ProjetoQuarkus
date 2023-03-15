package quarkushello.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Biblioteca  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idLivro ;
    @Column
    Date dataCompra;
    @Column
    Integer quantidade;
    @Column
    String descricao;
    @Column
    double localEstante;

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
    }

    

    

    
}
