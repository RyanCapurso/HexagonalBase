package com.ryanCapurso.sistema.domain;

import java.util.Date;
import java.util.UUID;

public class Cliente {



    private UUID id;
    private String nome;
    private String telefone;
    private String cpf;

  public Cliente(Builder builder) {
    this.id = builder.id;
    this.nome = builder.nome;
    this.telefone = builder.telefone;
    this.cpf = builder.cpf;
  }
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
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
  public Cliente(String nome, String telefone, String cpf) {
    this.nome = nome;
    this.telefone = telefone;
    this.cpf = cpf;
  }
  public static class Builder {

    private UUID id;
    private String nome;
    private String telefone;
    private String cpf;

    public Builder() {
    }

    public Builder withId(UUID id) {
      this.id = id;
      return this;
    }

    public Builder withNome(String nome) {
      this.nome = nome;
      return this;
    }
    public Builder withTelefone(String telefone) {
      this.telefone = telefone;
      return this;
    }
    public Builder withCpf(String cpf) {
      this.cpf = cpf;
      return this;
    }


    public Cliente build() {
      return new Cliente(this);
    }
  }
}
