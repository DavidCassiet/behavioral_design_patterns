package org.example.mediator_pattern;

import org.example.mediator_pattern.component.Integrante;
import org.example.mediator_pattern.mediator.GrupoWhatsApp;

public class MediatorPattern {
    public static void mediator() {
        GrupoWhatsApp grupoWhatsApp = new GrupoWhatsApp();

        Integrante juan = new Integrante(grupoWhatsApp, "Juan");
        Integrante carlos = new Integrante(grupoWhatsApp, "Carlos");
        Integrante florencia = new Integrante(grupoWhatsApp, "Florencia");
        Integrante ambar = new Integrante(grupoWhatsApp, "Ambar");

        grupoWhatsApp.agregarIntegrante(juan);
        grupoWhatsApp.agregarIntegrante(carlos);
        grupoWhatsApp.agregarIntegrante(florencia);
        grupoWhatsApp.agregarIntegrante(ambar);

        juan.enviar("Hola gente como estan?");
    }
}
