package quarkushello.DTO;

import java.sql.Date;

import javax.validation.constraints.NotNull;

public class BibliotecaDTO {

    @NotNull
    private Integer idLivro ;
    
    private Date dataCompra;

    private Integer quantidade;

    private String descricao;

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
    }
    
}
