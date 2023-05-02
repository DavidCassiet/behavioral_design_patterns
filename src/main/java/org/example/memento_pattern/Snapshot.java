package org.example.memento_pattern;

//MEMENTO
public class Snapshot {
    private final TextEditor editor;
    private final String texto;

    protected Snapshot(TextEditor editor, String texto) {
        this.editor = editor;
        this.texto = texto;
    }

    public void restore() {
        editor.setTexto(texto);
    }
}
