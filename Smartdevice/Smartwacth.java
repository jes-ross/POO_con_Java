/*
 * Jesús Rosales Santana
 * 21-03-2023
 * Objeto Smartwacht con sus caracteristicas.
 */

package Smartdevice;

public class Smartwacth extends Smartdevice{//Herencia de características.

     
    boolean llamadas;
    public Smartwacth(){

    }
    public Smartwacth(String fabricante, String modelo, int RAM, int memoria){//Caracteristicas del Smartwacht y su caracteristica que en este caso es si puede hacer llamadas o no.
        super(fabricante, modelo, RAM, memoria);
        this.llamadas = llamadas;
        
    }
    
}
