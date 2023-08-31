package com.ryanCapurso.sistema.adapter.out.repository;


import io.quarkus.mongodb.panache.PanacheMongoRepository;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository implements PanacheMongoRepository<ClienteEntity> {

}
