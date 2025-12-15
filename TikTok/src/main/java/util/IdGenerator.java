/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author renata
 */
import java.util.UUID;

public class IdGenerator {
    public static String gerar() {
        return UUID.randomUUID().toString();
    }
}

