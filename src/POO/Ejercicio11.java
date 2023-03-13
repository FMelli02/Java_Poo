/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int anio, mes, dia;
        System.out.println("Ingrese el año:");
        anio=leer.nextInt();
        System.out.println("Ingrese el mes:");
        mes=leer.nextInt();
        System.out.println("Ingrese el dia:");
        dia=leer.nextInt();
        
        Date fecha = new Date(anio, mes, dia);
        System.out.println(fecha);
        
        Date fechaActual = new Date();
        System.out.println("Fecha Actual");
        System.out.println(fechaActual);
        
        int anioActual=fechaActual.getYear();
        int diferencia=anio-anioActual;
        
        System.out.println("------------------");
        System.out.println("La diferencia de años es: "+diferencia);
        
        
    }
}
