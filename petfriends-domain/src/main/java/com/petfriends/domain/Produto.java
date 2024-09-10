package com.petfriends.domain;

public class Produto {
    private Long id;
    private String nome;

    public Produto(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{id=" + id + ", nome='" + nome + "'}";
    }
}
