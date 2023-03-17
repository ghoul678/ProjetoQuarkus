package quarkushello.DTO;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import quarkushello.model.Biblioteca;
public class BibliotecaResponseDTO {

    private Map<String, Object> Biblioteca;
    private Integer idLivro ;
    
    private Date dataCompra;

    private Integer quantidade;

    private String descricao;

    private double localEstante;

    public BibliotecaResponseDTO(Map<String, Object> biblioteca, Integer idLivro, Date dataCompra, Integer quantidade,
            String descricao, double localEstante) {
        Biblioteca = biblioteca;
        this.idLivro = idLivro;
        this.dataCompra = dataCompra;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.localEstante = localEstante;
    }

    public Map<String, Object> getBiblioteca() {
        return Biblioteca;
    }

    public void setBiblioteca(Map<String, Object> biblioteca) {
        Biblioteca = biblioteca;
    }

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