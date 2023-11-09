package co.com.view;

import java.util.Scanner;

public class MenuCliente {
    public void verProducto() {
        System.out.println("Mostrando información de un producto...");
    }

    public void realizarPedido() {
        System.out.println("Realizando pedido...");
    }


    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        MenuCliente menu =new MenuCliente();




        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de Cliente :\n" );
            System.out.println("1. Ver productos \n");
            System.out.println("2. Realizar pedidos \n");


            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    menu.verProducto();
                    break;
                case 2:
                    menu.realizarPedido();
                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

}
}
