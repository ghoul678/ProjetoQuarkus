package quarkushello.service;

import java.util.List;

import quarkushello.DTO.BibliotecaDTO;
import quarkushello.DTO.BibliotecaResponseDTO;

public interface BibliotecaService {

    // recursos basicos
    List<BibliotecaResponseDTO> getAll();

    BibliotecaResponseDTO findByIdLivro(Integer idLivro);

    BibliotecaResponseDTO create(BibliotecaDTO productDTO);

    BibliotecaResponseDTO update(Integer idLivro, BibliotecaDTO productDTO);

    void delete(Integer idLivro);

    // recursos extras
    //List<BibliotecaResponseDTO> findByIdLivro(Integer idLivro);

    Integer count();

}
