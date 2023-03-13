/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Cadena {
    Scanner leer = new Scanner(System.in);
    //Atributos
    private String frase;
    private int longitud;
    
    //Constructores

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }
    
    //Getter and Setter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    //Métodos
    public void mostrarVocales() {
        System.out.println("Ingrese una palabra o frase:");
        frase=leer.next();
        longitud=frase.length();
        
        int cont=0;
        for (int i = 0; i < frase.length(); i++) {
            if ((frase.charAt(i)=='a') || (frase.charAt(i)=='e') || (frase.charAt(i)=='i') || (frase.charAt(i)=='o') || (frase.charAt(i)=='u')) {
                cont++;
            }
        }
        System.out.println("La cantidad de vocales que tiene es: "+cont);
    }
    
    public void invertirFrase() {
        String cadenaInvertida="";
        for (int i = frase.length()-1; i >= 0 ; i--) {
            cadenaInvertida=cadenaInvertida+frase.charAt(i);
        }
        System.out.println(cadenaInvertida);
        System.out.println("");
    }
    
    public void vecesRepetido() {
        int posicion, cont=0;
        
        System.out.println("Ingrese un carácter:");
        String caracter=leer.next();
        
        posicion=frase.indexOf(caracter);
        while (posicion!=-1) {
            cont++;
            posicion=frase.indexOf(caracter, posicion+1);
        }
        System.out.println("El carácter `"+caracter+"` se encuentra "
                + "en la frase "+cont+" veces.");
    }
    
    public void compararLongitud() {
        System.out.println("Ingrese una frase:");
        String frase2=leer.next();
        
        System.out.println("La frase ingresada anteriormente contiene "
                +frase.length()+" letras mientras que ésta nueva frase contiene "
                        +frase2.length()+" letras.");
    }
    
    public void unirFrases() {
        System.out.println("Ingrese una frase:");
        String frase2=leer.next();
        
        System.out.println(frase+frase2);
    }
    
    public void reemplazar() {
        System.out.println("Ingrese el carácter por el que quiere cambiar"
                + " las letras `a´");
        String caracter=leer.next();
        System.out.println(frase.replace("a",caracter));
    }
    
    public void contiene() {
        boolean verdad=true;
        
        System.out.println("Ingrese un carácter para ver si la frase lo contiene");
        String caracter=leer.next();
        
        System.out.println(frase.contains(caracter));
        
    }
}
