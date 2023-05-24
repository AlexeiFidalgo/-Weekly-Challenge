/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.areadeunpoligono;

/**
 * @author Alexei
 */
/*
 * Reto #4
 * ÁREA DE UN POLÍGONO

 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class AREADEUNPOLIGONO {

    public static void main(String[] args) {
      Poligono c=new Cuadrado();
      c.setAltura(2.0);
      c.setBase(2.0);
      calcualarArea(c);
      
      Poligono r=new Rectangulo();
      r.setAltura(5.0);
      r.setBase(3.0);
      calcualarArea(r);
      
      Poligono t=new Triangulo();
      t.setAltura(5.0);
      t.setBase(2.0);
      calcualarArea(t);
      
      
    }
    public static void calcualarArea(Poligono p){
         if (p instanceof Triangulo) {
            System.out.println((p.getBase()*p.getAltura())/2);
        } else{
            System.out.println(p.getBase()*p.getAltura());
        }
    }
  
  
    
}
    
 
    

