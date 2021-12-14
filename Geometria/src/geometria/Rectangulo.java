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

 /**
 * Clase Resctangulo cuya funcion es la de en base a dos variables, base y altura, nos calcule el area
 * de esta multiplicando ambos valores.
 */
public class Rectangulo implements FiguraGeometrica
{
	/**
	 * Se crean variables de tipo private, las cuales solo pueden ser usadas/consultadas
	 * por esta clase
	 */
	
    private double base;
    private double altura;
    private double areaRectangulo;

    /**
     * Los contructores se construyen con public, para que sean usados por otras clases
     * los get devuelven una variable 
     * los set se contruyen con void, no devuelven nada cuando se les llama
     */
    
    public Rectangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

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

    public double getAreaRectangulo() 
    {
        return areaRectangulo;
    }

    /**
     *  se define la funcion de area del rectangulo, esta no devuelve nada pero 
     *  si guarda el resultado en la variable area rectangulo
     */
    
    @Override
    public void area() 
    {
        areaRectangulo = base * altura;
    }
}