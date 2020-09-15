package br.com.gabriel.springprojectionwithopenfeign.repository;

import br.com.gabriel.springprojectionwithopenfeign.entity.Client;
import br.com.gabriel.springprojectionwithopenfeign.entity.projections.ClientViewSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {


}