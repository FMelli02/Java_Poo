/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Cadena;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena c1 = new Cadena();
        
        c1.mostrarVocales();
        c1.invertirFrase();
        c1.vecesRepetido();
        c1.compararLongitud();
        c1.unirFrases();
        c1.reemplazar();
        c1.contiene();
    }
}
