package quarkushello.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import javax.ws.rs.NotFoundException;

import quarkushello.DTO.BibliotecaDTO;
import quarkushello.DTO.BibliotecaResponseDTO;
import quarkushello.model.Biblioteca;
import quarkushello.repository.Bibliotecarepository;

@ApplicationScoped
public class BibliotecaServiceImpl implements BibliotecaService {

    @Inject
    Bibliotecarepository bibliotecaRepository;

    @Inject
    Validator validator;

    @Override
    public List<BibliotecaResponseDTO> getAll() {
        List<Biblioteca> list = bibliotecaRepository.listAll();
        return list.stream().map(BibliotecaResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public BibliotecaResponseDTO findByIdLivro(Integer idLivro) {
        Biblioteca biblioteca = bibliotecaRepository.findByIdLivro(idLivro);
        if (biblioteca == null)
            throw new NotFoundException("Livro não encontrado! ");
        return new BibliotecaResponseDTO(biblioteca);
    }

    @Override
    @Transactional
    public BibliotecaResponseDTO create(BibliotecaDTO bibliotecaDTO) {
        Set<ConstraintViolation<BibliotecaDTO>> violations = validator.validate(bibliotecaDTO);
        if (!violations.isEmpty())
            throw new ConstraintViolationException(violations);

        Biblioteca entity = new Biblioteca();
        entity.setIdLivro(bibliotecaDTO.getIdLivro());
        //entity.setEstado(bibliotecaRepository.findByIdLivro(bibliotecaDTO.getIdEstado()));
        bibliotecaRepository.persist(entity);

        return new BibliotecaResponseDTO(entity);
    }

    @Override
    @Transactional
    public BibliotecaResponseDTO update(Integer idLivro, BibliotecaDTO bibliotecaDTO) {
        Biblioteca entity = bibliotecaRepository.findByIdLivro(idLivro);

        entity.idLivro(bibliotecaDTO.getIdLivro());
        //entity.setIdLivro(bibliotecaRepository.findByIdLivro(bibliotecaDTO.getIdLivro()));

        return new BibliotecaResponseDTO(entity);
    }

    @Override
    @Transactional
    public void delete(Integer idLivro) {
        bibliotecaRepository.deleteByIdLivro(idLivro);
    }

    /*
    @Override
    public List<BibliotecaResponseDTO> findByIdLivro(Integer idLivro) {
        List<Biblioteca> list = bibliotecaRepository.findByIdLivro(idLivro);
        return list.stream().map(BibliotecaResponseDTO::new).collect(Collectors.toList());
    }*/

    @Override
    public Integer count() {
        return bibliotecaRepository.count();
    }

}
