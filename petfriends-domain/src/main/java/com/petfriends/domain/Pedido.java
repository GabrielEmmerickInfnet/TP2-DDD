package com.petfriends.domain;

import java.util.List;

public class Pedido {
    private Long id;
    private List<Produto> produtos;

    public Pedido(Long id, List<Produto> produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    public Long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Pedido{id=" + id + ", produtos=" + produtos + "}";
    }
}
