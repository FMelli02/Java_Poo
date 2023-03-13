/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Movil {
    Scanner leer = new Scanner(System.in);
    private String marca, modelo;
    private int precio, memoriaRam, almacenamiento;
    private final int[] codigo;

    public Movil() {
        this.codigo = new int[7];
    }

    public Movil(String marca, String modelo, int precio, int memoriaRam, int almacenamiento) {
        this.codigo = new int[7];
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void cargarCelular() {
        System.out.println("Ingrese los datos de su celular");
        System.out.println("Marca");
        marca=leer.next();
        System.out.println("Modelo");
        modelo=leer.next();
        System.out.println("Precio");
        precio=leer.nextInt();
        System.out.println("Memoria RAM");
        memoriaRam=leer.nextInt();
        System.out.println("Almacenamiento");
        almacenamiento=leer.nextInt();
    }
    
    public void ingresarCodigo() {
        System.out.println("Ingrese el código de 7 dígitos número por número");
        for (int i = 0; i < 7; i++) {
            codigo[i]=leer.nextInt();
        }
    }
}
