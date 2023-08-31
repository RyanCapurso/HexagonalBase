package com.ryanCapurso.sistema.adapter.out.repository;


import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import java.util.UUID;
import org.bson.types.ObjectId;

@MongoEntity(collection = "cliente")
public class ClienteEntity extends PanacheMongoEntity {

  public ObjectId id;
  private UUID idCliente;

  private String nome;

  private String telefone;

  private String cpf;

  public ObjectId getId() {
    return id;
  }

  public UUID getIdCliente() {
    return idCliente;
  }

  public void setIdCliente(UUID idCliente) {
    this.idCliente = idCliente;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public ClienteEntity(Builder builder) {
    this.id = builder.id;
    this.nome = builder.nome;
    this.telefone = builder.telefone;
    this.cpf = builder.cpf;
  }
  public ClienteEntity() {

  }
  public ClienteEntity(ObjectId id, String nome, String telefone, String cpf) {
    this.id = id;
    this.nome = nome;
    this.telefone = telefone;
    this.cpf = cpf;
  }
  public static class Builder {

    private ObjectId id;
    private String nome;
    private String telefone;
    private String cpf;

    public Builder() {
    }

    public ClienteEntity.Builder withId(ObjectId id) {
      this.id = id;
      return this;
    }

    public ClienteEntity.Builder withNome(String nome) {
      this.nome = nome;
      return this;
    }
    public ClienteEntity.Builder withTelefone(String telefone) {
      this.telefone = telefone;
      return this;
    }
    public ClienteEntity.Builder withCpf(String cpf) {
      this.cpf = cpf;
      return this;
    }
    public ClienteEntity build() {
      return new ClienteEntity(this);
    }
  }
}
