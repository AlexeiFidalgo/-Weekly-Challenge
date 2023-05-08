package com.mycompany.lasucesiondefibonacci;

/**
 * @author Alexei
 */
/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class LASUCESIONDEFIBONACCI {

    public static void main(String[] args) {
        int numeroUno=0,numeroDos=1,numeroTres;
      
        for (int i = 0; i < 50; i++) {
            System.out.println(numeroUno);
            System.out.println(numeroDos);
            numeroTres=numeroDos+numeroUno;
            System.out.println(numeroTres);
            numeroUno=numeroTres+numeroDos;
            numeroDos=numeroUno+numeroTres;
        }
    }
}
