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
import java.util.*;

public class RelacionamentoService {

    private Map<Usuario, Set<Usuario>> seguidores = new HashMap<>();

    public void seguir(Usuario seguidor, Usuario seguido) {
        seguidores
                .computeIfAbsent(seguido, u -> new HashSet<>())
                .add(seguidor);
    }

    public Set<Usuario> getSeguindo(Usuario usuario) {
        Set<Usuario> seguindo = new HashSet<>();
        for (Map.Entry<Usuario, Set<Usuario>> entry : seguidores.entrySet()) {
            if (entry.getValue().contains(usuario)) {
                seguindo.add(entry.getKey());
            }
        }
        return seguindo;
    }
}

