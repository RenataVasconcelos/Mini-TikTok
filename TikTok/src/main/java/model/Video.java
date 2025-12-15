/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author renata
 */
import java.util.*;

public class Video {
    private String id;
    private Usuario autor;
    private String descricao;
    private Set<String> hashtags;
    private String dataPublicacao;

    private Set<Usuario> curtidas = new HashSet<>();
    private List<Comentario> comentarios = new ArrayList<>();
    private int views = 0;

    public Video(String id, Usuario autor, String descricao, Set<String> hashtags) {
        this.id = id;
        this.autor = autor;
        this.descricao = descricao;
        this.hashtags = hashtags;
        this.dataPublicacao = java.time.LocalDateTime.now().toString();
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public Set<String> getHashtags() {
        return hashtags;
    }

    public void curtir(Usuario usuario) {
        curtidas.add(usuario);
    }

    public int getCurtidas() {
        return curtidas.size();
    }

    @Override
    public String toString() {
        return autor + " | " + descricao +
               " | ❤️ " + curtidas.size() +
               " | 👁 " + views;
    }
}


