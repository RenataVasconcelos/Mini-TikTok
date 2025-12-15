/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author renata
 */
import model.Usuario;
import model.Video;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VideoTest {

    @Test
    void naoPermiteCurtidaDuplicada() {
        Usuario u = new Usuario("1", "ana");
        Video v = new Video("1", u, "teste", Set.of("x"));

        v.curtir(u);
        v.curtir(u);

        assertEquals(1, v.getCurtidas());
    }
}


