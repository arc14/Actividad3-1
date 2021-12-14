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
public class Triangulo implements FiguraGeometrica
{
	// Se definen las variables de tipo double que solo pueden ser usadas por esta clase.
	
    private double base;
    private double altura;
    private double areaTriangulo;
    

    // se crean los contructores, estos pueden ser llamados por otras clases
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    // Los get sirven para consultar el valor de la variable que necesitemos y
    // los set sirven para dar valor a la variable que queramos
    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    // se define la funcion de area del triangulo, esta no devuelve nada pero si guarda el resultado en la variable area triangulo
    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}