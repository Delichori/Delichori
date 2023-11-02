package co.com.delichori.service;

import co.com.delichori.dao.PedidoDao;
import co.com.delichori.model.Pedido;

import java.util.Scanner;

public class PedidoService {
    //Acá se les da forma a los métodos y después se llaman según el caso (cliente o admin)

    static Scanner sc = new Scanner(System.in);

    public static void realizarPedido() {
        System.out.println("Digitar Estado Pedido según: 'CONFIRMADO', 'DESPACHADO', 'FACTURADO', 'PAGADO'.");
        String estadoPedido = sc.nextLine();
        System.out.println("Ingrese cantidad producto");
        









    }

    public void verPedido() {

    }

    public void actualizarPedido() {

    }

    public void cancelarPedido() {

    }

}
