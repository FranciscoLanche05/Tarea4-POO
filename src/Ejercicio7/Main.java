package Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Producto producto1 = new Producto();

        int op = 0;
        do {
            System.out.println("\n----- SISTEMA DE INVENTARIO -----");
            System.out.println("1.Ingresar producto");
            System.out.println("2.Actualizar producto");
            System.out.println("3.Mostar datos");
            System.out.println("4.Salir");
            System.out.println("Seleccione una opcion: ");
            op = sc.nextInt();

            if (op == 1) {
                producto1.ingresarDatos();
            } else if (op == 2) {
                System.out.println("Ingrese el nuevo precio unitario: ");
                producto1.setPrecioUnitario(sc.nextDouble());
                System.out.println("Ingrese el nuevo stock disponible: ");
                producto1.setStockDisponible(sc.nextInt());
            } else if (op == 3) {
                producto1.mostrarDatos();
            }
        } while (op != 4);

        System.out.println("Saliendo del sistema");
    }
}