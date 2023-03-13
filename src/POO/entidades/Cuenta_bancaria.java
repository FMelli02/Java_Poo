/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Cuenta_bancaria {
    Scanner leer = new Scanner(System.in);
    
    //Atributos
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;
    private int interes;
    private int total;
    private String nombre;
    private String apellido;
    
    //Constructores

    public Cuenta_bancaria() {
    }

    public Cuenta_bancaria(int numeroCuenta, int DNI, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }
    
    //Getter and Setter

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }
    
    //Métodos
    public void cuenta() {
        
        System.out.println("Para ingresar al sistema introduzca los siguientes"
                + " datos:");
        System.out.println("Nombre");
        nombre=leer.next();
        System.out.println("Apellido");
        apellido=leer.next();
        System.out.println("DNI");
        DNI=leer.nextInt();
        System.out.println("Se ha creado correctamente su cuenta. Su número de "
                + "cuenta es:");
        numeroCuenta=(int)(Math.random()*100000+Math.random()*10000+Math.random()*1000
                +Math.random()*100+Math.random()*10);
        System.out.println(numeroCuenta);
}
    
    public void ingresar() {
        System.out.println("¿Cuanta plata quiere ingresar al sistema?");
        int plata=leer.nextInt();
        
        System.out.println("Dinero total en cuenta:");
        total+=plata;
        System.out.println(total);
    }
    
    public void retirar() {
        System.out.println("¿Cuanta plata quiere retirar del sistema?");
        int plata=leer.nextInt();
        
        System.out.println("Dinero total en cuenta:");
        total-=plata;
        System.out.println(total);
    }
    
    public void extraccionRapida() {
        System.out.println("¿Cuanta plata quiere retirar del sistema?");
        int plata=leer.nextInt();
        
        if (plata>total*0.2) {
            System.out.println("Ingrese un monto menor o igual al 20% del total en la cuenta");
        }else{
            total-=plata;
        }
        System.out.println("Dinero total en cuenta:");
        System.out.println(total);
    }
    
    public void consultarSaldo() {
        System.out.println("Dinero total en cuenta:");
        System.out.println(total);
    }
    
    public void consultarDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("DNI: "+DNI);
        System.out.println("Número de cuenta: "+numeroCuenta);
    }
}
