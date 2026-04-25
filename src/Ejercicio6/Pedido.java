package Ejercicio6;

import java.util.Scanner;

public class Pedido {
    public String nombreCliente;
    public String nombrePlato;
    private double precio;
    private double cantidad;

    public Pedido(){}

    public void ingresarDatos(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingres el nombre del cliente: ");
        this.nombreCliente = sc.nextLine();
        System.out.println("ingrese el nombre del plato: ");
        this.nombrePlato = sc.nextLine();
        System.out.println("Ingrese el precion del plato: ");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad que desea comprar: ");
        this.cantidad = sc.nextDouble();
    }

    public double subtotal(){
        return precio * cantidad;
    }
    public double descuento(){
        if(subtotal()>25){
            return subtotal() * 0.10;
        }
        return 0;
    }
    public double precioFinal(){
        return subtotal() - descuento();
    }

    public void mostrarDatos(){
        System.out.println("------ FACTURA -------");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Plato: " + nombrePlato);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal());
        System.out.println("Descuento: " + descuento());
        System.out.println("Total final: " + precioFinal());

    }
}
