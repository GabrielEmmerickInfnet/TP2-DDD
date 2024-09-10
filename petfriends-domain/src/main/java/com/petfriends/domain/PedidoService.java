package com.petfriends.domain;

import java.util.List;

public class PedidoService {

    public void registrarNovoPedido(Long id, List<Produto> produtos) {
        Pedido pedido = new Pedido(id, produtos);
        System.out.println("Pedido registrado: " + pedido);

        PedidoRegistradoEvent event = new PedidoRegistradoEvent(pedido);
        DomainEventPublisher.publish(event);
    }
}
