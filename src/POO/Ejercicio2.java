/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Circunferencia;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        double rad=leer.nextDouble();
        Circunferencia C1 = new Circunferencia(rad);
        
        C1.Area(rad);
        C1.Perimetro(rad);
    }
}
