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
public class Cuadrado implements FiguraGeometrica
{
	// Se creat las variables de tipo double y privatizadas para que solo las pueda usar esta clase
    private double lado;
    private double areaCuadrado;

    
    // se inicializa el metodo cuadrado
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    // Se crean los metodos contructores get y set
    // Los get sirven para obtener el valor de la variable que necesitemos y
    // los set sirven para dar valor a la variable que queramos
    // estos pueden ser llamadas desde otras clases
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    
    //se define la funcion area la cual obtiene el resultado multiplicando la variable lado por si misma.
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}