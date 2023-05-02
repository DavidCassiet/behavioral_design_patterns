package org.example.memento_pattern;

//ORIGINATOR
public class TextEditor {
    private String texto;

    public TextEditor() {
    }

    public TextEditor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    // Guarda el estado actual dentro de un Memento.
    public Snapshot crearSnapshot() {
        return new Snapshot(this, this.texto);
    }

}
