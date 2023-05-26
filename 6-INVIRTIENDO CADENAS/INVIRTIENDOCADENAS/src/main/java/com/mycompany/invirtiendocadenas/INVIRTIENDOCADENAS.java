
package com.mycompany.invirtiendocadenas;

/**
 * @author Alexei
 */
/*
 * Reto #6
 * INVIRTIENDO CADENAS
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class INVIRTIENDOCADENAS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       System.out.println(invertircadena("Hello World!")); 
        
    }
    public static String invertircadena(String cadena){
    char cadenaArray[] = cadena.toCharArray();
    char candenaRevertida[] = new char[cadenaArray.length];
    int j =0;
        for (int i = cadenaArray.length; i > 0 ; i--) {
            candenaRevertida[j]= cadenaArray[i-1];
            j++; 
        }
        String cadenaLista = String.copyValueOf(candenaRevertida);
        return cadenaLista;
    } 
    
}
