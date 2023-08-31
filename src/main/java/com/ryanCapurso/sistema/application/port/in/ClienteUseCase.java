package com.ryanCapurso.sistema.application.port.in;

import com.ryanCapurso.sistema.domain.Cliente;
import java.util.List;
import java.util.UUID;

public interface ClienteUseCase {

  Cliente save(Cliente cliente);
  List<Cliente> getAllClientes();

  Cliente getClienteById(UUID id);

  void delete(UUID id);

}
