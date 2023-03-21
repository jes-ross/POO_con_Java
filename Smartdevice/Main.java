/*
 * Jesús Rosales Santana
 * 21-03-2023
 * Creación de objetos en java SmartPhone y SmartWacht desde SmartDevice.
 */


package Smartdevice;//Paquete de donde procede.

public class Main {//Clase main para llamar a los objetos.

    public static void main(String[] args) {//Metodo main.

        Smartphone samsung = new Smartphone("Samsung", "Galaxy Note", 12, 64);
        samsung.camara = true;//Decidimos el boolean del atributo.
        
    

        Smartwacth xiaomi = new Smartwacth("Xiaomi", "Redmi", 4, 16);
        xiaomi.llamadas = true;
        //Imprime por pantalla los resultados de Samsung.
        System.out.println(samsung.fabricante);
        System.out.println(samsung.modelo);
        System.out.println(samsung.RAM);
        System.out.println(samsung.memoria);
        System.out.println(samsung.camara);
        //Imprime por pantalla los resultados de Xiaomi.
        System.out.println(xiaomi.fabricante);
        System.out.println(xiaomi.modelo);
        System.out.println(xiaomi.RAM);
        System.out.println(xiaomi.memoria);
        System.out.println(xiaomi.llamadas);
        

        
    }

    

    
    
    
    
    
    
}
