package co.com.delichori.dao;
import co.com.delichori.conexion.Conexion;
import co.com.delichori.model.Pedido;
import co.com.delichori.service.PedidoService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoDao {

    public static void crearPedidoDB(Pedido registro) {

        try (Connection conexion = Conexion.get_connection()) {


            PreparedStatement ps = null;

            try {
                String query = "INSERT INTO pedido(EstadoPedido, CantidadChorizo, CantidadChorizoPicante, ValorTotalPedido, FechaPedido, FechaEntrega) VALUES (?,?,?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setString(1,registro.getEstadoPedido());
                ps.setInt(2, registro.getCantidadProducto());

                /*ps.setString(2,registro.getDescripcionProducto());
                ps.setDouble(3,registro.getPrecio());
                ps.setDouble(4,registro.getCosto());
                ps.setDouble(5, registro.getCantidad());*/

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

    public static void verPedidoDB () {}
    public static void actualizarPedidoDB () {}
    public static void cancelarPedidoDB () {}
}
