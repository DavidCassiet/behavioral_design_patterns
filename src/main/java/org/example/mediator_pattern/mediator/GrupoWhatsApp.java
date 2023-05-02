package org.example.mediator_pattern.mediator;

import org.example.mediator_pattern.component.Component;
import org.example.mediator_pattern.component.Integrante;

import java.util.ArrayList;

//MEDIATOR
public class GrupoWhatsApp implements Mediator {
    public ArrayList<Component> integrantes = new ArrayList<>();

    public void agregarIntegrante(Component integrante) {
        this.integrantes.add(integrante);
    }

    @Override
    public void enviar(Component emisor, String mensaje) {
        for (Component integrante : this.integrantes) {
            if (!integrante.equals(emisor)) {
                String emisorNombre = ((Integrante) emisor).getNombre();
                integrante.recibir(emisorNombre, mensaje);
            }
        }
    }
}
