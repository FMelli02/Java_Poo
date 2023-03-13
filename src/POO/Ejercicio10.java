/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        double[] A=new double[50];
        double[] B=new double[20];
        
        System.out.println("Arreglo A");
        for (int i = 0; i < 50; i++) {
            A[i]=(int)(Math.random()*100);
            System.out.println("["+A[i]+"]");
        }
        
        System.out.println("----------------------");
        System.out.println("Arreglo A ordenado de menor a mayor");
        Arrays.sort(A);
        for (int i = 0; i < 50; i++) {
            System.out.println("["+A[i]+"]");
        }
        
        System.out.println("-----------------------");
        System.out.println("Arreglo B");
        System.arraycopy(A, 0, B, 0, 10);
        for (int i = 10; i < 20; i++) {
            B[i]=0.5;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("["+B[i]+"]");
        }
    }
}
