package co.com.view;

import co.com.delichori.model.Pedido;
import co.com.delichori.service.PedidoService;
import co.com.delichori.service.ProductoService;

import java.util.Scanner;

public class MenuCliente {

    static Scanner sc = new Scanner(System.in);

    public static void menuCliente(){

        System.out.println("Presione 1 para ver el menu: ");
        int init = sc.nextInt();

        while (init != 0 ){
            System.out.println("Menú Cliente : +" +
                    "\n1. Ver productos " +
                    "\n2. Realizar pedido  " +
                    "\n3. Ver pedido" +
                    "\n5. Salir");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ver productos:");
                    ProductoService.verProducto();
                    break;
                case 2:
                    System.out.println("Realizar pedido");
                    PedidoService.realizarPedido();
                    break;
                case 3:
                    System.out.println("Ver pedido");
                    PedidoService.verPedido();
                case 0:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor seleccione una opción válida.");
                    break;
            }
        }
    }
}

