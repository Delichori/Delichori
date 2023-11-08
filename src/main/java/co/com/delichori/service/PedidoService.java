package co.com.delichori.service;

import co.com.delichori.dao.PedidoDao;
import co.com.delichori.dao.ProductoDao;
import co.com.delichori.model.Pedido;
import co.com.delichori.model.Producto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PedidoService {
    //Acá se les da forma a los métodos y después se llaman a los que pertenezcan al admin

    static Scanner sc = new Scanner(System.in);

    public static void realizarPedido() {

        System.out.println("Digitar por favor su número de cédula");
        int cedulaCliente = sc.nextInt();
        sc.skip("\n");

        System.out.println("Por favor digitar su nombre");
        String nombreCliente = sc.nextLine();

        System.out.println("por favor digitar sus apellidos");
        String apellidoCliente = sc.nextLine();

        System.out.println("Por favor ingrese Dirección de entrega");
        String direccionCliente = sc.nextLine();

        //producto producto no se implementa solo se llama y se imprime

        System.out.println("Digíte Id del producto: 1. CHORIZO TRADICIONAL,  2. CHORIZO PICANTE");
        int idProducto = sc.nextInt();

        System.out.println("Ingrese cantidad producto");
        int cantidad = sc.nextInt();

        System.out.println("La fecha actual es:");
        LocalDateTime fechaActual = LocalDateTime.now();
        System.out.println(fechaActual);

        // hace falta valor pedido

        //PARA EL DAO --->System.out.println("SU PEDIDO SERÁ ENTREGADO EN LOS SIGUIENTES TRES DÍAS CALENDARIO");

        Pedido registro = new Pedido();
        registro.setCedulaCliente(cedulaCliente);
        registro.setNombreCliente(nombreCliente);
        registro.setApellidoCliente(apellidoCliente);
        registro.setDireccionCliente(direccionCliente);
        registro.setCantidadProducto(cantidad);
        registro.setFechaPedido(LocalDate.from(fechaActual));

        PedidoDao.crearPedidoDB(registro);

    }

    public static void verPedido() {

        PedidoDao.verPedidoDB();


    }

    public static void actualizarPedido() {
        System.out.println("Indique para modificar: 1.Estado Pedido ");
        int opc = sc.nextInt();
        sc.skip("\n");

        int id;

        Pedido update= new Pedido();

        switch (opc){
            case 1:
                System.out.println("Actualizar Estado Pedido");
                System.out.println("Ingrese el nuevo Estado del pedido: 'CONFIRMADO', 'DESPACHADO', 'PAGADO'. ");
                String estado = sc.nextLine();
                System.out.println("Indique el id del pedido a actualizar: ");
                id = sc.nextInt();
                opc = 1;
                update.setOpc(opc);
                update.setEstadoPedido(estado);
                update.setIdPedido(id);
                PedidoDao.actualizarPedidoDB(update);
                break;

           default:
                System.out.println("Seleccione una opción válida");
        }
    }


    public static void cancelarPedido() {

        System.out.println("Indique el id del pedido a cancelar: ");
        int idPedido = sc.nextInt();
        ProductoDao.eliminarProductoDB(idPedido);

    }

    /*public  static void CalcularValorPedido() {

        double precioVentaProducto = ProductoService.crearProducto(precioVentaProducto);
        int cantidadProducto;

        //double valorPedido = precioVentaProducto*cantidadProducto;


        /*double precioVentaProducto = producto.getPrecioVentaProducto();
        int cantidadProducto = getCantidadProducto();

    }*/



}
