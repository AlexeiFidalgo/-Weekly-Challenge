package com.mycompany.esunanagrama;



import java.util.Arrays;


/**
 * @author Alexei
 */

/*
 * Reto #1
 * ¿ES UN ANAGRAMA?
 * Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

public class ESUNANAGRAMA {

  public static void main(String[] args) {
      System.out.println(esAnagrama("casa", "asac"));
}
 public static boolean esAnagrama(String palabraUno, String palabraDos) {
    char[] palabraUnoArray = palabraUno.toCharArray();
    char[] palabraDosArray = palabraDos.toCharArray();
    Arrays.sort(palabraUnoArray);
    Arrays.sort(palabraDosArray);
     if (palabraUno.equals(palabraDos)) {
         return false;
     }else{
    return Arrays.equals(palabraUnoArray, palabraDosArray);
     }
     }
}