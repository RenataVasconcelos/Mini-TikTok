/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renata
 */
public class Comentario {

    private String id;
    private Usuario autor;
    private String texto;
    private String data;

    public Comentario(String id, Usuario autor, String texto) {
        this.id = id;
        this.autor = autor;
        this.texto = texto;
        this.data = java.time.LocalDateTime.now().toString();
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return autor + ": " + texto;
    }
}

