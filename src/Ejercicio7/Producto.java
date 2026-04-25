package Ejercicio7;

import java.util.Scanner;

public class Producto {
    public String codigoUnitario;
    public String nombreComercial;
    public String categoria;
    private double precioUnitario;
    private int stockDisponible;
    private int stockMinimo;

    public Producto() {
    }

    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el codigo del producto: ");
        this.codigoUnitario = sc.nextLine();
        System.out.println("Ingrese el nombre del producto: ");
        this.nombreComercial = sc.nextLine();
        System.out.println("Ingrese el nombre de la categoria: ");
        this.categoria = sc.nextLine();
        System.out.println("Ingrese el valor unitario: ");
        this.setPrecioUnitario(sc.nextDouble());
        System.out.println("Ingres el stock disponible: ");
        this.setStockDisponible(sc.nextInt());
        System.out.println("Ingrese el stock minimo: ");
        this.setStockMinimo(sc.nextInt());
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario <= 0) {
            System.out.println("Error. valor no valido");
        } else {
            this.precioUnitario = precioUnitario;
        }
    }

    public void setStockDisponible(int stockDisponible) {
        if (stockDisponible < 0) {
            System.out.println("Error. valor no valido");
        } else {
            this.stockDisponible = stockDisponible;
        }
    }

    public void setStockMinimo(int stockMinimo) {
        if (stockMinimo < 0) {
            System.out.println("Error. valor no valido");
        } else {
            this.stockMinimo = stockMinimo;
        }
    }

    public double calcularValorTotal() {
        return this.precioUnitario * this.stockDisponible;
    }

    public String evaluarEstado() {
        if (this.stockDisponible == 0) {
            return "Producto agotado";
        } else if (this.stockDisponible < this.stockMinimo) {
            return "Requiere reposicion";
        } else {
            return "Stock suficiente";
        }
    }

    public void mostrarDatos() {
        System.out.println("--- DATOS DEL PRODUCTO ---");
        System.out.println("Codigo: " + this.codigoUnitario);
        System.out.println("Nombre: " + this.nombreComercial);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Precio unitario: " + this.precioUnitario);
        System.out.println("Stock disponible: " + this.stockDisponible);
        System.out.println("Stock minimo: " + this.stockMinimo);
        System.out.println("Valor total del inventario: " + this.calcularValorTotal());
        System.out.println("Estado del stock: " + this.evaluarEstado());
    }
}