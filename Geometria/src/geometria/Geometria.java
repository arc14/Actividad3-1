/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */

//---------------------------
// Clase cuya finalidad es la de llamar a los metodos creados en la otras clases, darles un valor(s)
// retomar la salidad que devuelven esas clases y mostrar por pantalla el resultados que nos devuelve.
//---------------------------
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
      // @Se llama a la clase cuadrado dando el valor 10 y con get obtenemos el valor area.        
        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.area();
        System.out.println("Área del cuadrado de lado 10: " + 
                cuadrado.getareaCuadrado());
      //Se llama a la clase circulo dando el valor 200 y con get obtenemos el valor area.
        Circulo circulo = new Circulo(200);
        circulo.area();
        System.out.println("Área del círculo de radio 200: " + 
                circulo.getAreaRadio());
      //Se llama a la clase rectangulo dandole dos valores, 100 y 20, y con get obtenemos el valor area.
        Rectangulo rectangulo = new Rectangulo(100, 20);
        rectangulo.area();
        System.out.println("Área del rectángulo de base 100 y altura 20: " + 
                rectangulo.getAreaRectangulo());
      //Se llama a la clase triangulo ddandole dos valores, 5 y 10, y con get obtenemos el valor area.
        Triangulo triangulo = new Triangulo(5, 10);
        triangulo.area();
        System.out.println("Área del triángulo de base 5 y altura 10: " + 
                triangulo.getareaTriangulo());        
    }   
    
}
