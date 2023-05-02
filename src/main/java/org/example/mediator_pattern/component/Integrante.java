package org.example.mediator_pattern.component;

import org.example.mediator_pattern.mediator.Mediator;

public class Integrante implements Component {
    protected Mediator grupo;
    private final String nombre;

    public Integrante(Mediator grupo, String nombre) {
        this.grupo = grupo;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(this + " mandando el mensaje: " + mensaje);
        this.grupo.enviar(this, mensaje);
    }

    @Override
    public void recibir(String emisor, String mensaje) {
        System.out.println("Soy " + this + " recibiendo el mensaje de " + emisor + ": " + mensaje);
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
