/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aspectratiodeunaimagen;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * @author Alexei
 */

/*
 * Reto #5
 * ASPECT RATIO DE UNA IMAGEN
 * Enunciado: Crea un programa que se encargue de calcular el aspect ratio de una imagen a partir de una url.
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una imagen de 1920*1080px.

 */
public class ASPECTRATIODEUNAIMAGEN {

    public static void main(String[] args) {
        String url = "https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png";
        String aspectRatio = calcularAspectRatioImagen(url);
        
        System.out.println("Aspect Ratio: " + aspectRatio);
    }
    
    public static String calcularAspectRatioImagen(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            BufferedImage image = ImageIO.read(url);
            
            int width = image.getWidth();
            int height = image.getHeight();
            int mcd = calcularMCD(width, height);
             int aspectWidth = width / mcd;
             int aspectHeight = height / mcd;
        
            
            return aspectWidth + ":" +aspectHeight;
        } catch (IOException e) {
            return "no se pudo calcular";
        }
    }
    
    public static int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMCD(b, a % b);
        }}
}
