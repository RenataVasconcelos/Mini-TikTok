/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author renata
 */
import model.Video;
import java.util.*;

public class HashtagService {

    private Map<String, List<Video>> indice = new HashMap<>();

    public void indexar(Video video) {
        for (String tag : video.getHashtags()) {
            indice
                    .computeIfAbsent(tag.toLowerCase(), t -> new ArrayList<>())
                    .add(video);
        }
    }

    public List<Video> buscar(String tag) {
        return indice.getOrDefault(tag.toLowerCase(), List.of());
    }
}

