/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Cafetera;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera c1 = new Cafetera();
        
        System.out.println("Comandos de la cafetera");
        System.out.println("1. Para llenar la cafetera");
        System.out.println("2. Para servir una taza");
        System.out.println("3. Para vaciar la cafetera");
        System.out.println("4. Para agregar café");
        
        int num;
        
        do {
            switch (num=leer.nextInt()) {
            case 1:
                c1.llenarCafetera();
                break;
            case 2:
                c1.servirTaza();
                break;
            case 3:
                c1.vaciarCafetera();
                break;
            case 4:
                c1.agregarCafe();
                break;
            }
        } while (num>0 && num<6);
        
    }
}
