package br.com.gabriel.springprojectionwithopenfeign.service;

import br.com.gabriel.springprojectionwithopenfeign.entity.Client;
import br.com.gabriel.springprojectionwithopenfeign.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client save(Client genericClass) {
        return clientRepository.save(genericClass);
    }

    @Override
    public Client update(Client genericClass) {
        return clientRepository.save(genericClass);
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }
}
