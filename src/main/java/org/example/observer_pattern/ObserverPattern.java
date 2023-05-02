package org.example.observer_pattern;

public class ObserverPattern {
    public static void observer() {
        Libreria objLibreria = new Libreria();
        Libreria objLibreria1 = new Libreria();

        Suscriptor objSuscriptor1 = new Suscriptor(objLibreria);
        Suscriptor objSuscriptor2 = new Suscriptor(objLibreria);
        Suscriptor objSuscriptor3 = new Suscriptor(objLibreria1);

        objLibreria.agregar(objSuscriptor1);
        objLibreria.agregar(objSuscriptor2);
        objLibreria1.agregar(objSuscriptor3);

        objLibreria.agregarLibro("Cuentos para Franco: Coleccion completa.");
        objLibreria1.agregarLibro("Codigo Limpio.");
    }
}
