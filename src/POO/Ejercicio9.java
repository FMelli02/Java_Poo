/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Matematica;

public class Ejercicio9 {
    public static void main(String[] args) {
        Matematica m1=new Matematica();
        
        m1.setNum1((int) (Math.random() * 10));
        m1.setNum2((int) (Math.random() * 10));
        
        m1.devolverMayor();
        m1.calcularPotencia();
        m1.calcularRaiz();
    }
}
