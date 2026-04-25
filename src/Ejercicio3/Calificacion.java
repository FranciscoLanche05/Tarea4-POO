package Ejercicio3;

import java.util.Scanner;

public class Calificacion {
    public String nombre;
    private double nota1,nota2,nota3;

    public Calificacion(){}

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese la primera nota: ");
        this.nota1 = sc.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        this.nota2 = sc.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        this.nota3 = sc.nextDouble();
    }

    public double calcularPromedio(){
        return (nota1 + nota2 + nota3)/3;
    }

    public void mostrarInformacion(){
        System.out.println("Informacion del estudiante");
        System.out.println("==========================");
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio final: " + calcularPromedio());
        if(calcularPromedio() < 7 ){
            System.out.println("Estado: Reprbado");
        }else{
            System.out.println("Estado : Aprobado");
        }
    }

}
