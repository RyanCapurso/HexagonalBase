package com.ryanCapurso.sistema.adapter.in.web;


import com.ryanCapurso.sistema.adapter.out.repository.ClienteRepository;
import com.ryanCapurso.sistema.application.port.in.ClienteUseCase;
import com.ryanCapurso.sistema.domain.Cliente;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.List;


@Path("/Cliente")
public class ClienteController  {
  @Inject
  ClienteRepository clienteRepository;
  @Inject
  ClienteUseCase clienteUseCase;
  //public ClienteController(ClienteUseCase clienteUseCase){
    //this.clienteUseCase = clienteUseCase;
  //}

  @POST
  @Produces(MediaType.APPLICATION_JSON)
  @Consumes(MediaType.APPLICATION_JSON)
  public Cliente save( Cliente cliente){
    return this.clienteUseCase.save(cliente);
  }
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Cliente> GetAllClientes(){
    return this.clienteUseCase.getAllClientes();
  }


}
