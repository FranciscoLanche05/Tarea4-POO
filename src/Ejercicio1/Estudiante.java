package Ejercicio1;

import java.util.Scanner;

public class Estudiante {

    public String nombre;
    public String carrera;
    public int edad;

    public Estudiante(){}

    public Estudiante(String nombre,String carrera,int edad ){
        this.nombre = nombre;
        this.carrera = carrera;
        this.edad = edad;
    }

    //Registrar datos
    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los siguientes datos del estudiante: ");
        System.out.println("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Carrera: ");
        this.carrera = sc.nextLine();
        System.out.println("Edad: ");
        this.edad = sc.nextInt();
    }

    //Mostrar datos
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Edad: " + edad);
    }

}
