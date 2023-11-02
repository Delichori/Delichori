package co.com.delichori.dao;
import co.com.delichori.conexion.Conexion;
import co.com.delichori.model.Cliente;
import co.com.delichori.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDao {

    public static void registrarUsuarioDB(Usuario registro){

        try(Connection conexion = Conexion.get_connection()){//Inicia la conexión

            PreparedStatement ps = null; //Sirve para prepara el sql de la DB, preparar sentencia de SQL

            try {

                String query = "INSERT INTO cliente(cedula, nombre, apellido, celular, direccion, email, clave)VALUES(?,?,?,?,?,?,?)";

                ps = conexion.prepareStatement(query);

                Cliente registroCliente = new Cliente();

                ps.setInt(1, registro.getCedula());
                ps.setString(2, registro.getNombre());
                ps.setString(3, registro.getApellido());
                ps.setLong(4, registro.getCelular());
                ps.setString(5, registroCliente.getDireccion());
                ps.setString(6, registro.getEmail());
                ps.setString(7, registro.getClave());

                ps.executeUpdate(); //Insert, delete y update

                System.out.println("Registro de usuario exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){

            System.out.println(e);

        }finally { //Sin importar si el try falla o no el finally se ejecuta
            Conexion.close_connection();
        }
    }
    public static void eliminarUsuarioDB(int idCliente){

        try(Connection connect = Conexion.get_connection()){

            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM cliente where cliente.id = ?";
                ps = connect.prepareStatement(query);
                ps.setInt(1, idCliente);
                ps.executeUpdate();
                System.out.println("El registro ha sido eliminado correctamente");
            }catch (SQLException e){
                System.out.println("No se eliminó el registro");
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }finally {
            Conexion.close_connection();
        }
    }
    public static void iniciarSesionDB(Usuario email){

    }
}

