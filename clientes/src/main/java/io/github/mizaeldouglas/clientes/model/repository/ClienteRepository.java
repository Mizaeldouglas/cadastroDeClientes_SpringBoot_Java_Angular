package io.github.mizaeldouglas.clientes.model.repository;

import io.github.mizaeldouglas.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {


}
