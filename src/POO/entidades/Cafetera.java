/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Cafetera {
    Scanner leer = new Scanner(System.in);
    
    //Atributos
    private int capacidadMaxima;
    private int cantidadActual;
    
    //Constructores

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //Getter and Setter

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    //Métodos
    public void llenarCafetera() {
        capacidadMaxima=10000;
        cantidadActual=capacidadMaxima;
        System.out.println("La cafetera se ha llenado y contiene "+capacidadMaxima+
                " mL.");
    }
    
    public void servirTaza() {
        System.out.println("Ingrese el tamaño de la taza");
        int tamaño=leer.nextInt();
        if (cantidadActual<tamaño) {
            int totalTaza= tamaño-cantidadActual;
            int cantidad=tamaño-totalTaza;
            System.out.println("La taza no se ha llenado completamente");
            System.out.println("El contenido de la taza se ha quedado en "
            +cantidad+" mL");
        }else{
            cantidadActual-=tamaño;
            System.out.println("El café se ha realizado correctamente");
        }
    }
    
    public void vaciarCafetera() {
        cantidadActual=0;
        System.out.println("La cafetera se ha vaciado correctamente. "
                + "Contenido actual "+cantidadActual+" mL");
    }
    
    public void agregarCafe() {
        System.out.println("Ingrese a la cafetera la cantidad de café deseada");
        int cant=leer.nextInt();
        System.out.println("Cantidad añadida a la cafetera: "+cant+" cdas.");
    }
}
