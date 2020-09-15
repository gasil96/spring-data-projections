package br.com.gabriel.springprojectionwithopenfeign.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;
import java.util.Optional;

public interface CrudController<T> {

    @PostMapping("save")
    ResponseEntity<T> save(@RequestBody T genericClass);

    @PutMapping("update")
    ResponseEntity<T> update(@RequestBody T genericClass);

    @DeleteMapping("delete-by-id/{id}")
    void delete(@PathVariable("id") Long id);

    @GetMapping("find-by-id/{id}")
    ResponseEntity<Optional<T>> findById(@PathVariable("id") Long id);

    @GetMapping("find-all")
    ResponseEntity<List<T>> findAll();




}
