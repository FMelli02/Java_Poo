/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Persona;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();

        p1.crearPersona();
        p1.calcularIMC();
        p1.esMayorDeEdad();
        
        p2.crearPersona();
        p2.calcularIMC();
        p2.esMayorDeEdad();
        
        p3.crearPersona();
        p3.calcularIMC();
        p3.esMayorDeEdad();
        
        p4.crearPersona();
        p4.calcularIMC();
        p4.esMayorDeEdad();
    }
}
