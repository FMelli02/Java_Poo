/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO.entidades;

import java.util.Scanner;

public class Curso {
    Scanner leer = new Scanner(System.in);
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioPorHora;
    private final String[] alumnos;

    public Curso() {
        this.alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora) {
        this.alumnos = new String[5];
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }
    
    public void cargarAlumnos() {
        System.out.println("Ingrese los alumnos que asisten al curso");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno "+(i+1));
            alumnos[i]=leer.next();
        }
    }
    
    public void crearCurso() {
        System.out.println("Nombre del curso");
        nombreCurso=leer.next();
        System.out.println("Cantidad de horas por día");
        cantidadHorasPorDia=leer.nextInt();
        System.out.println("Cantidad de días por semana");
        cantidadDiasPorSemana=leer.nextInt();
        System.out.println("Turno(Mañana o Tarde)");
        turno=leer.next();
        System.out.println("Precio por hora");
        precioPorHora=leer.nextInt();
        cargarAlumnos();
    }
    
    public void calcularGananciaSemanal() {
        int ganancia;
        ganancia=precioPorHora*cantidadHorasPorDia*cantidadDiasPorSemana*5;
        System.out.println("La ganancia por semana es de $"+ganancia);
    }
}
