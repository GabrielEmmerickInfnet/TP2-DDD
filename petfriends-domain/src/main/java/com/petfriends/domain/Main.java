package com.petfriends.domain;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Criar 
        Produto produto1 = new Produto(1L, "Ração para Cães");
        Produto produto2 = new Produto(2L, "Shampoo para Gatos");

        // registrar o pedido e publicar o evento
        PedidoService pedidoService = new PedidoService();
        pedidoService.registrarNovoPedido(1001L, Arrays.asList(produto1, produto2));
    }
}
