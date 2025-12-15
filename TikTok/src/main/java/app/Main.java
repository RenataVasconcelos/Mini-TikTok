/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

/**
 *
 * @author renata
 */
import model.*;
import repository.*;
import service.*;
import util.IdGenerator;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        UsuarioRepository usuarioRepo = new UsuarioRepository();
        VideoRepository videoRepo = new VideoRepository();

        List<Usuario> usuarios = usuarioRepo.carregar();
        List<Video> videos = videoRepo.carregar();

        RelacionamentoService rel = new RelacionamentoService();
        FeedService feedService = new FeedService();
        HashtagService hashtagService = new HashtagService();

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MINI TIKTOK ===");

        Usuario u1 = new Usuario(IdGenerator.gerar(), "alice");
        Usuario u2 = new Usuario(IdGenerator.gerar(), "bob");

        usuarios.add(u1);
        usuarios.add(u2);

        rel.seguir(u1, u2);

        Set<String> tags = Set.of("java", "oop");
        Video v = new Video(IdGenerator.gerar(), u2, "Meu primeiro vídeo", tags);
        v.curtir(u1);

        videos.add(v);
        hashtagService.indexar(v);

        System.out.println("\n--- FEED DA ALICE ---");
        feedService.gerarFeed(u1, rel, videos)
                .forEach(System.out::println);

        System.out.println("\n--- BUSCA #java ---");
        hashtagService.buscar("java")
                .forEach(System.out::println);

        usuarioRepo.salvar(usuarios);
        videoRepo.salvar(videos);
    }
}
