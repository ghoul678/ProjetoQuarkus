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
import quarkushello.model.biblioteca;
import quarkushello.repository.BibliotecaRepository;

@ApplicationScoped
public class BibliotecaServiceImpl implements BibliotecaService {

    @Inject
    BibliotecaRepository bibliotecaRepository;

    @Inject
    Validator validator;

    @Override
    public List<BibliotecaResponseDTO> getAll() {
        List<Biblioteca> list = bibliotecaRepository.listAll();
        return list.stream().map(BibliotecaResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public BibliotecaResponseDTO findById(Long idLivro) {
        Biblioteca biblioteca = bibliotecaRepository.findById(idLivro);
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
        //entity.setIdLivro(bibliotecaDTO.getIdLivro());
        //entity.setEstado(bibliotecaRepository.findById(bibliotecaDTO.getIdEstado()));
        bibliotecaRepository.persist(entity);

        return new BibliotecaResponseDTO(entity);
    }

    @Override
    @Transactional
    public BibliotecaResponseDTO update(Long idLivro, BibliotecaDTO bibliotecaDTO) {
        Biblioteca entity = bibliotecaRepository.findById(idLivro);

        //entity.setNome(bibliotecaDTO.getNome());
        //entity.setEstado(bibliotecaRepository.findById(bibliotecaDTO.getIdEstado()));

        return new BibliotecaResponseDTO(entity);
    }

    @Override
    @Transactional
    public void delete(Long idLivro) {
        bibliotecaRepository.deleteById(idLivro);
    }

    @Override
    public List<BibliotecaResponseDTO> findByNome(String nome) {
        //List<Biblioteca> list = bibliotecaRepository.findByNome(nome);
        return list.stream().map(BibliotecaResponseDTO::new).collect(Collectors.toList());
    }

    @Override
    public long count() {
        return bibliotecaRepository.count();
    }

}
