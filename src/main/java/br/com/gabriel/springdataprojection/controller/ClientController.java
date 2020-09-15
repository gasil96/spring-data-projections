package br.com.gabriel.springdataprojection.controller;

import br.com.gabriel.springdataprojection.entity.Client;
import br.com.gabriel.springdataprojection.service.IClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("client-controller")
public class ClientController extends CrudControllerDefault<Client, IClientService>{



}
