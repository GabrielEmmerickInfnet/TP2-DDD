package com.petfriends.domain;

public class PedidoRegistradoEvent extends DomainEvent {
    private Pedido pedido;

    public PedidoRegistradoEvent(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    @Override
    public String toString() {
        return "PedidoRegistradoEvent{pedido=" + pedido + "}";
    }

    @Override
    public String getEventDetails() {
        return "Pedido registrado com ID: " + pedido.getId();
    }
}
