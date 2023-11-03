package co.com.delichori.service;

import co.com.delichori.dao.PedidoDao;
import co.com.delichori.model.Pedido;
import co.com.delichori.model.Producto;

import java.time.LocalDate;
import java.util.Scanner;

public class PedidoService {
    //Acá se les da forma a los métodos y después se llaman según el caso (cliente o admin)

    static Scanner sc = new Scanner(System.in);

    public static void realizarPedido() {
        System.out.println("Digitar Estado Pedido según: 'CONFIRMADO', 'DESPACHADO', 'FACTURADO', 'PAGADO'.");
        String estado = sc.nextLine();
        System.out.println("Ingrese cantidad producto");
        int cantidad = sc.nextInt();
        sc.skip("\n");
        System.out.println("Ingrese Fecha Actual");
        LocalDate fecha = LocalDate.parse(sc.nextLine());
        System.out.println("Ingrese Fecha Entrega");
        LocalDate fechaEntrega = LocalDate.parse(sc.nextLine());


        Pedido registro = new Pedido();
        registro.setEstadoPedido(estado);
        registro.setCantidadProducto(cantidad);
        registro.setFechaPedido(fecha);
        registro.setFechaEntrega(fechaEntrega);

        PedidoDao.crearPedidoDB(registro);

    }
    //producto producto no se implementa solo se llama y se imprime
    public static void verPedido() {


    }

    public static void actualizarPedido() {

    }

    public static void cancelarPedido() {

    }

    /*public  static void CalcularValorPedido() {

        double precioVentaProducto = ProductoService.crearProducto(precioVentaProducto);
        int cantidadProducto;

        //double valorPedido = precioVentaProducto*cantidadProducto;


        /*double precioVentaProducto = producto.getPrecioVentaProducto();
        int cantidadProducto = getCantidadProducto();

    }*/



}
