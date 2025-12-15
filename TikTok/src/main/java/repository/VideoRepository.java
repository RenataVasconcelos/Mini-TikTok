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
import model.Video;

import java.nio.file.*;
import java.util.*;

public class VideoRepository {

    private final Path path = Paths.get("videos.json");
    private final Gson gson = new Gson();

    public void salvar(List<Video> videos) throws Exception {
        Files.writeString(path, gson.toJson(videos));
    }

    public List<Video> carregar() throws Exception {
        if (!Files.exists(path)) return new ArrayList<>();

        return gson.fromJson(
                Files.readString(path),
                new TypeToken<List<Video>>(){}.getType()
        );
    }
}


