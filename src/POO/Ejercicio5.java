/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;
import POO.entidades.Cuenta_bancaria;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cuenta_bancaria c1 = new Cuenta_bancaria();
        
        c1.cuenta();
        int num;
        System.out.println("Presione 1 para ingresar dinero, 2 para retirar dinero, "
                + "3 para extracción rápida, 4 para consultar el saldo, 5 para "
                + "consultar los datos o presione cualquier otro número para salir "
                + "del sistema.");
        do {
            switch (num=leer.nextInt()) {
            case 1:
                c1.ingresar();
                break;
            case 2:
                c1.retirar();
                break;
            case 3:
                c1.extraccionRapida();
                break;
            case 4:
                c1.consultarSaldo();
                break;
            case 5:
                c1.consultarDatos();
                break;
        }
        } while (num>0 && num<6);
        
        
    }
}
