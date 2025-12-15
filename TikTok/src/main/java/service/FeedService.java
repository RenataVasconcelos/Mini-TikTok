/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author renata
 */
import model.Usuario;
import model.Video;

import java.time.LocalDateTime;
import java.util.*;

public class FeedService {

    public List<Video> gerarFeed(
            Usuario usuario,
            RelacionamentoService rel,
            List<Video> videos
    ) {
        Set<Usuario> seguindo = rel.getSeguindo(usuario);

        return videos.stream()
                .filter(v -> seguindo.contains(v.getAutor()))
                .sorted(
                        Comparator.comparing(
                                (Video v) -> LocalDateTime.parse(v.getDataPublicacao())
                        ).reversed()
                )
                .toList();
    }
}


