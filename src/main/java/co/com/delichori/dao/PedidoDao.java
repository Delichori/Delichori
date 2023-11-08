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
                String query = "INSERT INTO pedido(cedulaCliente, nombreCliente, apellidoCliente, direccionCliente, cantidadProducto, fechaPedido, valorTotalPedido) VALUES (?,?,?,?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setInt(1, registro.getCedulaCliente());
                ps.setString(2, registro.getNombreCliente());
                ps.setString(3, registro.getApellidoCliente());
                ps.setString(4, registro.getDireccionCliente());
                ps.setInt(5, registro.getCantidadProducto());
                ps.setDate(6, Date.valueOf(registro.getFechaPedido()));
                ps.setDouble(7, registro.getValorTotalPedido());

                ps.executeUpdate();

                System.out.println("Registro de pedido exitoso ");

            } catch (SQLException e) {
                System.out.println(e);
            }


        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            Conexion.close_connection();
        }

    }

    public static void verPedidoDB(int idPedido) {

        PreparedStatement ps = null;
        ResultSet rs = null;

        try (Connection connect = Conexion.get_connection()) {
            String query = "SELECT FROM pedido where pedido.idPedido = ?";

            ps = connect.prepareStatement(query);
            rs = ps.executeQuery();


            while (rs.next()) {
                System.out.println("\n");
                System.out.println("Id pedido: " + rs.getInt("idPedido"));
                System.out.println("Estado del Pedido: " + rs.getString("EstadoPedido"));
                System.out.println("Cédula Cliente: " + rs.getInt("cedulaCliente"));
                System.out.println("Nombre Cliente: " + rs.getString("nombreCliente"));
                System.out.println("Apellido Cliente: " + rs.getString("apellidoCliente"));
                System.out.println("Direccion Cliente: " + rs.getString("direccionCliente"));
                System.out.println("Cantidad del producto: " + rs.getInt("CantidadProducto"));
                System.out.println("Fecha Actual: " + rs.getDate("fechaPedido"));
                System.out.println("SU PEDIDO SERÁ ENTREGADO EN LOS SIGUIENTES TRES DÍAS CALENDARIO");
                System.out.println("Valor Total Pedido: " + rs.getDouble("valorTotalPedido"));


            }

        } catch (SQLException e) {

            System.out.println("No se recuperaron registros ");
            System.out.println(e);
        } finally {
            Conexion.close_connection();
        }

    }


    public static void actualizarPedidoDB(Pedido update) {


    }

    public static void cancelarPedidoDB(int idPedido) {


    }
}



