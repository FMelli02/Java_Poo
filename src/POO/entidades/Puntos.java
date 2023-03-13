/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Puntos {
    Scanner leer = new Scanner(System.in);
    private float x1, x2, y1, y2;

    public Puntos() {
    }

    public Puntos(float x1, float x2, float y1, float y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos() {
        System.out.println("Ingrese las coordenadas del P1");
        System.out.println("x1");
        x1=leer.nextFloat();
        System.out.println("y1");
        y1=leer.nextFloat();
        System.out.println("Ingrese las coordenadas del P2");
        System.out.println("x2");
        x2=leer.nextFloat();
        System.out.println("y2");
        y2=leer.nextFloat();
    }
    
    public void calcularDistancia() {
        float distancia;
        distancia=(float) Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
        System.out.println("La distancia entre los dos puntos es "+distancia);
    }    
}
