package br.com.gabriel.springdataprojection.controller;

import br.com.gabriel.springdataprojection.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public abstract class CrudControllerDefault<T, Z extends CrudService> {

    @Autowired
    private Z genericService;

    @PostMapping("save")
    public ResponseEntity<T> save(@RequestBody T genericClass){
        return new ResponseEntity<T>((T) genericService.save(genericClass),HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<T> update(@RequestBody T genericClass){
        return new ResponseEntity<T>((T) genericService.save(genericClass), HttpStatus.OK);
    }

    @DeleteMapping("delete-by-id/{id}")
    public ResponseEntity delete(@PathVariable("id") Long id){
        genericService.delete(id);
        return ResponseEntity.ok(HttpStatus.NO_CONTENT);
    }

    @GetMapping("find-by-id/{id}")
    public ResponseEntity<Optional<T>> findById(@PathVariable("id") Long id){
        return new ResponseEntity<Optional<T>>(genericService.findById(id), HttpStatus.OK);
    }

    @GetMapping("find-all")
    public ResponseEntity<List<T>> findAll(){
        return new ResponseEntity<List<T>>(genericService.findAll(), HttpStatus.OK);
    }

}
