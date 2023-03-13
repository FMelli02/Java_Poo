/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Date;
import java.util.Scanner;

public class Persona2 {
    Scanner leer= new Scanner(System.in);
    //Atributos
    private String nombre;
    private int anio;
    private int mes;
    private int dia;
    private int anio2, mes2, dia2;
    private Date fechaNacimiento;
    
    //Constructores
    public Persona2() {
    }

    public Persona2(String nombre) {
        this.nombre = nombre;
        
    }
    
    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Métodos
    public void crearPersona() {
        
        System.out.println("Ingrese su nombre");
        nombre=leer.next();
        
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("Año");
        anio=leer.nextInt()-1900;
        System.out.println("Mes");
        mes=leer.nextInt()-1;
        System.out.println("Dia");
        dia=leer.nextInt();
        
        fechaNacimiento=new Date(anio, mes, dia);
    }
    
    public void calcularEdad() {
        Date actual=new Date();
 
        int difAnio=actual.getYear()-anio;
        int difMes;
        int difDia;
        
        if (dia>actual.getDate()) {
            difDia=dia+actual.getDate()+1;
            difMes=actual.getMonth()-mes-1;
        }else if(dia==actual.getDate()){
            difDia=0;
            difMes=actual.getMonth()-mes;
        }else{
            difDia=actual.getDate()-dia;
            difMes=actual.getMonth()-mes;
        }
        
        System.out.println(nombre+" tiene "+difAnio+" años, con "+difMes
                +" meses y "+difDia+" días.");
    }
    
    public void menorQue() {
        System.out.println("Ingrese la nueva fecha de nacimiento");
        System.out.println("Año");
        anio2=leer.nextInt()-1900;
        System.out.println("Mes");
        mes2=leer.nextInt()-1;
        System.out.println("Dia");
        dia2=leer.nextInt();
        
        Date persona2 = new Date(anio2, mes2, dia2);
        
        if (fechaNacimiento.after(persona2)) {
            System.out.println(fechaNacimiento.after(persona2));
        }else{
            System.out.println(fechaNacimiento.after(persona2));
        }
    }
    
    public void mostrarPersona() {
        System.out.println("La nueva persona nació el "+dia2+"/"+(mes2+1)+
                "/"+(anio2+1900));
    }
}
