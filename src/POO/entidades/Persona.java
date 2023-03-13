/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in);
    //Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;
    private double pesoIdeal;
    private int resultado;
    private boolean a;
    
    //Constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    //Métodos
    public void crearPersona() {
        System.out.println("Nombre:");
        nombre=leer.next();
        System.out.println("Edad");
        edad=leer.nextInt();
        System.out.println("Sexo('H' hombre, 'M' mujer, 'O' otro),:");
        sexo=leer.next().toUpperCase();
       
            if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")) {
                
            }else{
                do {
                    System.out.println("El sexo ingresado no es correcto, "
                        + "por favor ingreselo nuevamente.");
                    sexo=leer.next().toUpperCase();
                } while (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O"));
            }
        System.out.println("Peso:");
        peso=leer.nextDouble();
        System.out.println("Altura:");
        altura=leer.nextDouble();
    }
    
    public void calcularIMC() {
        pesoIdeal=peso/(Math.pow(altura, 2));
        if (pesoIdeal<20) {
            resultado=-1;
        }else if(pesoIdeal>20 && pesoIdeal<25){
            resultado=0;
        }else{
            resultado=1;
        }
    }
    
    public void esMayorDeEdad() {
        if (edad>=18) {
            a=true;
        }else{
            a=false;
        }
        System.out.println(a);
    }
}
