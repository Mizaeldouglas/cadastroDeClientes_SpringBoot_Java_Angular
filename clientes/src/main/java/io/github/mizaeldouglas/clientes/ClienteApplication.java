package io.github.mizaeldouglas.clientes;

import io.github.mizaeldouglas.clientes.model.entity.Cliente;
import io.github.mizaeldouglas.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClienteApplication {

    @Bean
    public CommandLineRunner run(@Autowired ClienteRepository repository){
        return  args -> {
            Cliente cliente = Cliente.builder().cpf("42833017871").nome("Mizael").build();
            repository.save(cliente);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(ClienteApplication.class,args);
    }
}
