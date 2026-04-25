package Ejercicio2;

import java.util.Scanner;

public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    //constructor
    public Producto(){}

    //metodos
    public void ingresarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.nextLine();
        System.out.println("Ingrese el precio del producto: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad que desea comprar: ");
        this.cantidad = sc.nextInt();
    }

    public void calcularTotal(){
        double total = precio * cantidad;
        System.out.println("El total de la compra es: " + total);
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del producto: " + nombre);
        System.out.println("Precio del producto: " + precio);
        System.out.println("Cantidad del producto: " + cantidad);
    }
}
