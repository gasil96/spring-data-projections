package br.com.gabriel.springprojectionwithopenfeign.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CrudService<T>  {

    T save(T genericClass);

    T Update(T genericClass);

    void delete(Long id);

    Optional<T> findById(Long id);

    List<T> findAll();

}
