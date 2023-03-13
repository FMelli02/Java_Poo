/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Libro;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Libro l1 = new Libro();
        
        System.out.println("Cargue los datos del libro:");
        System.out.println("Título:");
        l1.titulo=leer.next();
        System.out.println("ISBN:");
        l1.ISBN=leer.nextInt();
        System.out.println("Autor:");
        l1.autor=leer.next();
        System.out.println("Número de páginas:");
        l1.numPaginas=leer.nextInt();
        
        System.out.println("Libro: "+l1.titulo);
        System.out.println("ISBN: #"+l1.ISBN);
        System.out.println("Autor: "+l1.autor);
        System.out.println("Número de páginas: "+l1.numPaginas);
        
    }
}
