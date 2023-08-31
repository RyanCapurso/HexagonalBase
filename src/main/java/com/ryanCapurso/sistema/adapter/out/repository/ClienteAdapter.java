package com.ryanCapurso.sistema.adapter.out.repository;

import com.ryanCapurso.sistema.application.port.out.ClientePort;
import com.ryanCapurso.sistema.domain.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.UUID;
import org.bson.types.ObjectId;

@ApplicationScoped
public class ClienteAdapter implements ClientePort {

  @Inject
  ClienteRepository clienteRepository;

  //public ClienteAdapter(ClienteRepository clienteRepository){this.clienteRepository = clienteRepository;}
  @Override
  public Cliente save(Cliente cliente) {
    this.clienteRepository.persist(new ClienteEntity.Builder()
        .withId(new ObjectId())
        .withNome(cliente.getNome())
        .withCpf(cliente.getCpf())
        .withTelefone(cliente.getTelefone())
        .build());
        return cliente;
  }

  @Override
  public List<Cliente> getAllClientes() {
    return null;
  }

  @Override
  public Cliente getClienteById(UUID id) {
    return null;
  }

  @Override
  public void delete(UUID id) {

  }
}
