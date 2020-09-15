package br.com.gabriel.springdataprojection.repository;

import br.com.gabriel.springdataprojection.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}