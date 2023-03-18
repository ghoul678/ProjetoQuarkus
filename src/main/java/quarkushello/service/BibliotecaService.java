package quarkushello.service;

import java.util.List;

import quarkushello.DTO.BibliotecaDTO;
import quarkushello.DTO.BibliotecaResponseDTO;

public interface BibliotecaService {

    // recursos basicos
    List<BibliotecaResponseDTO> getAll();

    BibliotecaResponseDTO findById(Long idLivro);

    //BibliotecaResponseDTO create(bibliotecaDTO productDTO);

    //BibliotecaResponseDTO update(Long idLivro, bibliotecaDTO productDTO);

    void delete(Long idLivro);

    // recursos extras
    //List<BibliotecaResponseDTO> findByNome(String nome);

    long count();

}
