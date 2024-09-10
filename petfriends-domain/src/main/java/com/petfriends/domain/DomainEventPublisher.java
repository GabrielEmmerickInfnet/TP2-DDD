package com.petfriends.domain;

public class DomainEventPublisher {

    public static void publish(PedidoRegistradoEvent event) {
        // teste de publicação do evento
        System.out.println("Publicando evento de domínio: " + event);
    }
}
