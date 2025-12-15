/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author renata
 */
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import model.Usuario;

import java.nio.file.*;
import java.util.*;

public class UsuarioRepository {
    private final Path path = Paths.get("usuarios.json");
    private final Gson gson = new Gson();

    public void salvar(List<Usuario> usuarios) throws Exception {
        Files.writeString(path, gson.toJson(usuarios));
    }

    public List<Usuario> carregar() throws Exception {
        if (!Files.exists(path)) return new ArrayList<>();
        return gson.fromJson(
                Files.readString(path),
                new TypeToken<List<Usuario>>(){}.getType()
        );
    }
}

