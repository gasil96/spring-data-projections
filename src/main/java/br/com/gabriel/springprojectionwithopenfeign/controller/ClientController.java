package br.com.gabriel.springprojectionwithopenfeign.controller;

import br.com.gabriel.springprojectionwithopenfeign.entity.Client;
import br.com.gabriel.springprojectionwithopenfeign.repository.ClientRepository;
import br.com.gabriel.springprojectionwithopenfeign.service.ClientServiceImpl;
import br.com.gabriel.springprojectionwithopenfeign.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("client-controller")
public class ClientController implements CrudController<Client> {

    @Autowired
    private IClientService clientService;

    @Override
    public ResponseEntity<Client> save(Client genericClass) {
        return new ResponseEntity<Client>(clientService.save(genericClass), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Client> update(Client genericClass) {
        return new ResponseEntity<Client>(clientService.update(genericClass), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Client> delete(Long id) {
        clientService.delete(id);
        return new ResponseEntity<Client>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Optional<Client>> findById(Long id) {
        return new ResponseEntity<Optional<Client>>(clientService.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Client>> findAll() {
        return new ResponseEntity<List<Client>>(clientService.findAll(), HttpStatus.OK);
    }
}
