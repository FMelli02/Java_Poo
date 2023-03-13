/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import POO.entidades.Operación;

public class Ejercicio3 {
    public static void main(String[] args) {
        Operación o1 = new Operación();
        
        o1.crearOperacion();
        o1.sumar();
        o1.restar();
        o1.multiplicar();
        o1.dividir();
    }
}
