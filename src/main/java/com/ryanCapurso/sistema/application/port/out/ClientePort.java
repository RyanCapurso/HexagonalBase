package com.ryanCapurso.sistema.application.port.out;

import com.ryanCapurso.sistema.domain.Cliente;
import java.util.List;
import java.util.UUID;

public interface ClientePort {

  Cliente save(Cliente cliente);
  List<Cliente> getAllClientes();
  Cliente getClienteById(UUID id);
  void delete(UUID id);

}
