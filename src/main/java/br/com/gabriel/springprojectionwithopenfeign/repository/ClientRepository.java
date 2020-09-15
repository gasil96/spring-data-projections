package br.com.gabriel.springprojectionwithopenfeign.repository;

import br.com.gabriel.springprojectionwithopenfeign.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}