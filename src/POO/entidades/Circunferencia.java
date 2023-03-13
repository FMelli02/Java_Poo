/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

public class Circunferencia {
    /*Atributos*/
    private double radio;
    
    /*Constructores*/
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    /*Getter and Setter*/
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /*Metodos*/
    public void Area(double radio){
        System.out.println("El Area de la circunferencia es:");
        double Area = 3.1416*Math.pow(radio, 2);
        System.out.println(Area);
        
    }
    
    public void Perimetro(double radio){
        System.out.println("EL Perímetro de la circunferencia es:");
        double per = 2*3.1416*radio;
        System.out.println(per);        
        
    }
    
}
