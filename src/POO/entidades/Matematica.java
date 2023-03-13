/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

public class Matematica {
    //Atributos
    private int num1;
    private int num2;
    
    //Constructores

    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //Getter and Setter

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
        System.out.println(num1);
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
        System.out.println(num2);
    }
    
    //Métodos
    public void devolverMayor() {
        if (num1>num2) {
            System.out.println("El número mayor es: "+num1);
        }else{
            System.out.println("El número mayor es: "+num2);
        }
    }
    
    public void calcularPotencia() {
        if (num1>num2) {
            System.out.println("La potencia de "+num1+"^"+num2+" es "+(int) (Math.pow(num1,num2)));
        }else{
            System.out.println("La potencia de "+num2+"^"+num1+" es "+(int) (Math.pow(num2,num1)));
        }
    }
    
    public void calcularRaiz() {
        if (num1<num2) {
            System.out.println("La raiz cuadrada de "+num1+" es "+Math.sqrt(num1));
        }else{
            System.out.println("La raiz cuadrada de "+num2+" es "+Math.sqrt(num2));
        }
    }
}
