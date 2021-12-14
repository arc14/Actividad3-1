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
* Clase Circulo cuya funcion es la de en base a una variable radio, nos calcule el area
* de esta.
*/
public class Circulo implements FiguraGeometrica 
{

	/** Se definen los metodos contructores get y set
	* Los get sirven para obtener el valor de la variable que necesitemos y
	* los set sirven para dar valor a la variable que queramos
	*/
	
    private double radio;
    private double areaRadio;
    static final double pi = 3.1415;
    
    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    /**
     * Se usa radio como variable
     * @return devuelve el valor radio
     */
    
    public double getRadio() 
    {
        return radio;
    }

    /**
     * Se le da el valor para obtener el area
     * @param radio recibe el valor radio
     */
    
    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    /**
     * Devuelve el resultado de la operacion
     * @return devuelve area radio
     */
    
    public double getAreaRadio() 
    {
        return areaRadio;
    }

    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
    }    
}
