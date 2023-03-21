/*
 * Jesús Rosales Santana
 * 21-03-2023
 * Clase device para la creación de los objetos.
 */

package Smartdevice;

public class Smartdevice {
    //Características que compartirán ambas clases.
    protected String fabricante;
    protected String modelo;
    protected int RAM;
    protected int memoria;
    
    public Smartdevice(){
        //Constructor vacio para la creación de nuevas clases.

    }
    public Smartdevice(String fabricante, String modelo, int RAM, int memoria){//Dando los atributos a las clases.
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.RAM = RAM;
        this.memoria = memoria;
    }



    
}
