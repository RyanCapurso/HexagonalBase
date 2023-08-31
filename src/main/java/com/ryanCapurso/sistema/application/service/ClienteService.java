package com.ryanCapurso.sistema.application.service;

import com.ryanCapurso.sistema.application.port.in.ClienteUseCase;
import com.ryanCapurso.sistema.application.port.out.ClientePort;
import com.ryanCapurso.sistema.domain.Cliente;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.List;
import java.util.UUID;

@ApplicationScoped
public class ClienteService implements ClienteUseCase {

  //private ClientePort clientePort;

  //public ClienteService(ClientePort clientePort){
    //this.clientePort = clientePort;}

  @Inject ClientePort clientePort;
  @Override
  public Cliente save(Cliente cliente) {
    cliente.setId(UUID.randomUUID());
    return this.clientePort.save(cliente);
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
