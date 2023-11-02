package co.com.delichori.dao;
import co.com.delichori.conexion.Conexion;
import co.com.delichori.model.Cliente;
import co.com.delichori.model.Usuario;
import co.com.delichori.service.UsuarioService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdministradorDao {
    public static void registrarAdministradorDB(Usuario registro){

        try(Connection conexion = Conexion.get_connection()){//Inicia la conexión

            PreparedStatement ps = null; //Sirve para prepara el sql de la DB, preparar sentencia de SQL

            try {

                String query = "INSERT INTO cliente(cedula, nombre, apellido, celular, email, clave)VALUES(?,?,?,?,?,?)";

                ps = conexion.prepareStatement(query);

                ps.setInt(1, registro.getCedula());
                ps.setString(2, registro.getNombre());
                ps.setString(3, registro.getApellido());
                ps.setLong(4, registro.getCelular());
                ps.setString(6, registro.getEmail());
                ps.setString(7, registro.getClave());

                ps.executeUpdate();

                System.out.println("Registro de administrador exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }
        }catch (SQLException e){

            System.out.println(e);

        }finally {
            Conexion.close_connection();
        }
    }
    public static void eliminarAdministradorDB(int idAdministrador){

        try(Connection connect = Conexion.get_connection()){

            PreparedStatement ps = null;

            try {
                String query = "DELETE FROM producto where producto.id = ?";
                ps = connect.prepareStatement(query);
                ps.setInt(1, idAdministrador);
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

    public static void iniciarSesionDB(){



    }
}

