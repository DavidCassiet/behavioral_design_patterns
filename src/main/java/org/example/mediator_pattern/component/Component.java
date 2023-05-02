package org.example.mediator_pattern.component;

public interface Component {
    void enviar(String mensaje);
    void recibir(String emisor, String mensaje);
}
