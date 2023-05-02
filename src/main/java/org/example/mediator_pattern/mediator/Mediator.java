package org.example.mediator_pattern.mediator;

import org.example.mediator_pattern.component.Component;

//MEDIATOR
public interface Mediator {
    void enviar(Component emisor, String mensaje);
}
