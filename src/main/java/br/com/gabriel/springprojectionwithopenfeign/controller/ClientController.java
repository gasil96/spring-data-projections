package br.com.gabriel.springprojectionwithopenfeign.controller;

import br.com.gabriel.springprojectionwithopenfeign.entity.Client;
import br.com.gabriel.springprojectionwithopenfeign.repository.ClientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("client-controller")
public class ClientController implements CrudController<Client> {

    @Override
    public ResponseEntity<Client> save(Client genericClass) {
        return null;
    }

    @Override
    public ResponseEntity<Client> update(Client genericClass) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ResponseEntity<Optional<Client>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Client>> findAll() {
        return null;
    }
}
