/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.esunnumeroprimo;

/**
 * @author Alexei
 */
/*
 * Reto #3
 * ¿ES UN NÚMERO PRIMO?
 *
 * Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */
public class ESUNNUMEROPRIMO {

    public static void main(String[] args) {
        
        for (int i = 1; i < 101; i++) {
            if(!((i)%2==0 ||(i)%3==0||(i)%5==0)|| i==2||i==3||i==5){
            System.out.println(i);}
        }
        
    }
}
