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
public class Circulo implements FiguraGeometrica 
{
	
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;

    // Se definen los metodos contructores get y set
    // Los get sirven para obtener el valor de la variable que necesitemos y
    // los set sirven para dar valor a la variable que queramos
    
    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    public double getAreaRadio() 
    {
        return areaRadio;
    }

    // funcion que realiza el area matematicamente
    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
