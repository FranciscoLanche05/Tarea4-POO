package Ejercicio4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cliente {

    public String nombre;
    private double consumo;
    private double costoKW;

    public Cliente(){}


    public void datos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el consumo de luz: ");
        this.consumo = sc.nextDouble();
        System.out.println("Ingrese el costo por KW: ");
        this.costoKW = sc.nextDouble();
    }

    public double calcularSubtotal(){

        return  consumo* costoKW;
    }
    public double calcularIva(){
        return calcularSubtotal()* 0.15;
    }
    public double calcularTotal(){
        return calcularSubtotal() + calcularIva();
    }

    public void factura(){
        System.out.println("----- PLANILLA DE LUZ -----");
        System.out.println("Cliente: " + nombre);
        System.out.println("Subtotal: " + calcularSubtotal());
        System.out.println("IVA: " + calcularIva());
        System.out.println("Total a pagar: " + calcularTotal());
    }
}
