/*
 * Jesús Rosales Santana
 * 21-03-2023
 * Objeto Smartphone con sus caracteristicas.
 */


package Smartdevice;

public class Smartphone extends Smartdevice {//Herencia de caracteristicas.

    boolean camara;
    public Smartphone(){

    }
    public Smartphone(String fabricante, String modelo, int RAM, int memoria){//Los atributos del movil y su própia caracteristica que en este caso es si tienen cámara o no.
        super(fabricante, modelo, RAM, memoria);
        this.camara = camara;
        
    }
    
}
