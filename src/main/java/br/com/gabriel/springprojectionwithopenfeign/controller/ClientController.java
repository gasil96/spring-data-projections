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
public class ClientController extends CrudControllerDefault<Client, ClientRepository>{



}
