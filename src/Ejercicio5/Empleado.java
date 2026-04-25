package Ejercicio5;

import java.util.Scanner;

public class Empleado {
    public String nombre;
    private double horasTrabajao;
    private double pagoPorHoras;

    public Empleado(){}

    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingres el nombre: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese las horas de trabajo: ");
        this.horasTrabajao = sc.nextDouble();
        System.out.println("Ingrese el pago por hora: ");
        this.pagoPorHoras = sc.nextDouble();
    }

    public double horasExtra(){
        double horasExtras = 0;
        if (horasTrabajao > 60){
            return horasTrabajao - 60;
        }
        return 0;
    }

    public double sueldoBase(){
        double horasNormales = horasTrabajao;
        if (horasTrabajao > 60){
            horasNormales = horasTrabajao - horasExtra();
        }

        return horasNormales * pagoPorHoras;

    }
    public double bono(){
        return horasExtra() * pagoPorHoras;
    }
    public double sueldoFinal(){
        return sueldoBase() + bono();

    }

    public void mostrarDatos(){
        System.out.println("------- REPORTE EMPLEADO -------");
        System.out.println("Nombre: " + nombre);
        System.out.println("Sueldo base: " + sueldoBase());
        System.out.println("Bono: " + bono());
        System.out.println("Sueldo final: " + sueldoFinal());
    }
}
