/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Rectángulo {
    //Atributos
    private float base;
    private float altura;
    
    //Constructores
    public Rectángulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public Rectángulo() {
        
    }
    
    //Getter and Setter
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    //Métodos
    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        base=leer.nextFloat();
        System.out.println("Ingrese el valor de la altura");
        altura=leer.nextFloat();
    }
    
    public void superficie() {
        float sup=base*altura;
        System.out.println("El valor de la superficie es: "+sup);
    }
    
    public void perímetro() {
        float per=(base+altura)*2;
        System.out.println("El valor del perímetro es: "+per);
    }
    
    public void dibujo() {
        System.out.println("El dibujo del rectángulo es:");
        
        for (int a = 0; a < altura; a++) {
            for (int b = 0; b < base; b++) {
                if ((a>0 && a<altura-1) && (b>0 && b<base-1)) {
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }
            }
            System.out.println("");
        }
    }
}
