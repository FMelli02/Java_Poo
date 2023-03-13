/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Raices {
    Scanner leer = new Scanner(System.in);
    private float a, b, c;
    private double discriminante;

    public Raices() {
    }
    
    
    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public void valores() {
        System.out.println("Ingrese el valor de a");
        a=leer.nextFloat();
        System.out.println("Ingrese el valor de b");
        b=leer.nextFloat();
        System.out.println("Ingrese el valor de c");
        c=leer.nextFloat();
    }
    
    public void getDiscriminante() {
        discriminante=(Math.pow(b, 2))-(4*a*c);
    }
    
    public void tieneRaices() {
        boolean x=true;
        System.out.println("Tiene 2 soluciones");
        if (discriminante>0) {
            System.out.println(x);
        }
    }
    
    public void tieneRaiz() {
        boolean x=true;
        System.out.println("Tiene 1 solución");
        if (discriminante==0) {
            System.out.println(x);
        }
    }
    
    public void obtenerRaices() {
        if (discriminante>0) {
            float x1=(float) (-b+(Math.sqrt(discriminante))/(2*a));
            System.out.println("X1= "+x1);
            float x2=(float) (-b-(Math.sqrt(discriminante))/(2*a));
            System.out.println("X2= "+x2);
        }
    }
    
    public void obtenerRaiz() {
        if (discriminante==0) {
            float x12=(-b/(2*a));
            System.out.println("X1,2= "+x12);
        }
    }
    
    public void calcular() {
        valores();
        tieneRaices();
        tieneRaiz();
        if (discriminante>0) {
            obtenerRaices();
        }else if(discriminante==0){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones reales");
        }
    }
}
