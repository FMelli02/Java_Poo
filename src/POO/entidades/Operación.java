/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Operación {
    //Atributos
    private float numero1;
    private float numero2;
    
    //Constructores
    public Operación(int numero1, int numero2) {    
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operación() {
    }
    
    //Getter and Setter
    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {    
        this.numero2 = numero2;
    }

    //Métodos
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        numero1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        numero2=leer.nextInt();
    }
    
    public void sumar() {
        float suma=numero1+numero2;
        System.out.println("El resultado de la suma es: "+suma);
    }
    
    public void restar() {
        float resta=numero1-numero2;
        System.out.println("El resultado de la resta es: "+resta);
    }
    
    public void multiplicar() {
        float mult=numero1*numero2;
        if (mult==0) {
            System.out.println("Error");
        }else {
            System.out.println("El resultado de la multiplicación es: "+mult);
        }
    }
    
    public void dividir() {
        
        if (numero1==0 || numero2==0) {
            System.out.println("Error");
        }else {
            float div=(numero1/numero2);
            System.out.println("El resultado de la división es: "+div);
        }
    }
}
