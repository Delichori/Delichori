package co.com.delichori.dao;
import co.com.delichori.conexion.Conexion;
import co.com.delichori.model.Pedido;
import co.com.delichori.model.Producto;
import co.com.delichori.service.PedidoService;

import java.sql.*;

public class PedidoDao {

    public static void crearPedidoDB(Pedido registro) {

        try (Connection conexion = Conexion.get_connection()) {

            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO pedido(EstadoPedido, CantidadProducto, FechaPedido, FechaEntrega) VALUES (?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setString(1,registro.getEstadoPedido());
                ps.setInt(2, registro.getCantidadProducto());
                ps.setDate(3, Date.valueOf(registro.getFechaPedido()));
                ps.setDate(4, Date.valueOf(registro.getFechaEntrega()));

                ps.executeUpdate();

                System.out.println("Registro de pedido exitoso ");

            }catch  (SQLException e){
                System.out.println(e);
            }


        }catch (SQLException e){
            System.out.println(e);
        }finally {
            Conexion.close_connection();
        }

    }

    public static void verPedidoDB() {

        PreparedStatement ps= null;
        ResultSet rs =null;

        try(Connection connect = Conexion.get_connection()){
            String query = "SELECT * FROM pedido";

            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();


            while (rs.next()){
                System.out.println("\n");
                System.out.println("Id producto: "+ rs.getInt("idProducto"));
                System.out.println("Estado del Pedido: " + rs.getString("EstadoPedido"));
                System.out.println("Cantidad del producto: " + rs.getInt("CantidadProducto"));
                System.out.println("Descripcion del producto: " + rs.getString("descripcion"));
                System.out.println("Precio del producto: " + rs.getDouble("precio"));
                System.out.println("Costo del producto: " + rs.getDouble("costo"));


            }

        }catch (SQLException e){

            System.out.println("No se recuperaron registros ");
            System.out.println(e);
        }finally {
            Conexion.close_connection();
        }

    }


    public static void actualizarPedidoDB (Pedido update) {








    }
    public static void cancelarPedidoDB (int idPedido) {



    }



    public static void valorTotalPedido(){
        PreparedStatement ps= null;
        ResultSet rs =null;

        try(Connection connect = Conexion.get_connection()){

            String query = "SELECT * FROM producto";


            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){

                Producto producto = new Producto();

                System.out.println("\n");
                System.out.println("Precio venta del producto: " + rs.getDouble("precio"));

                /*double gananciaProducto = ganancia.getPrecioVentaProducto() - ganancia.getPrecioCostoProducto();
                ganancia.setGananciaProducto(gananciaProducto);*/

                /*double precioVentaProducto = ProductoService.crearProducto(precioVentaProducto);
                int cantidadProducto;

                double valorPedido = precioVentaProducto*cantidadProducto;

                double precioVentaProducto = producto.getPrecioVentaProducto();
                int cantidadProducto = getCantidadProducto();*/



            }
        }catch (SQLException e){
            System.out.println("No se recuperaron registros ");
            System.out.println(e);
        }finally {
            Conexion.close_connection();
        }
    }
}