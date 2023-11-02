package co.com.delichori.service;
import co.com.delichori.dao.AdministradorDao;
import co.com.delichori.dao.ClienteDao;
import co.com.delichori.dao.ProductoDao;
import co.com.delichori.model.Cliente;
import co.com.delichori.model.Usuario;

import java.util.Scanner;

public abstract class UsuarioService implements UtilUser {

    static Scanner sc = new Scanner(System.in);
    public void registrarUsuario(){

        //SOLICITANDO LOS DATOS PARA EL REGISTRO

        System.out.println("Ingrese su número de cédula: " );
        int cedula = sc.nextInt();
        System.out.println("Ingrese su nombre: " );
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido =sc.nextLine();
        System.out.println("Ingrese su número de celular: ");
        int celular =sc.nextInt();
        System.out.println("Ingrese su dirección: ");
        String direccion =sc.nextLine();
        System.out.println("Ingrese su email: ");
        String email =sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String clave =sc.nextLine();

        //ASIGNAR LOS DATOS INGRESADOS A LAS VARIABLES:

        Usuario registro = new Usuario();
        Cliente registroCliente = new Cliente();
        registro.setCedula(cedula);
        registro.setNombre(nombre);
        registro.setApellido(apellido);
        registro.setCelular(celular);
        registroCliente.setDireccion(direccion);
        registro.setEmail(email);

        registro.setClave(clave);

        //MANDAR LO QUE SE SETEA ARRIBA (REGISTRO) A CLIENTEDAO

        ClienteDao.registrarUsuarioDB(registro);

    }

    public void eliminarUsuario(){

        System.out.println("Indique el id del usuario que desea eliminar");
        int idCliente = sc.nextInt();
        ClienteDao.eliminarUsuarioDB(idCliente); //Manda a clientedao el id que se recibe aquí

    }

    public void iniciarSesion(){

        Usuario registro = new Usuario();

        System.out.println("Ingrese el email registrado: ");
        String email =sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String clave =sc.nextLine();

        if(email.equals(registro.getEmail())  && clave.equals(registro.getClave())){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Credenciales no válidas");
        }
    }
    public void registrarAdministrador(){

        //SOLICITANDO LOS DATOS PARA EL REGISTRO

        System.out.println("Ingrese el número de cédula: " );
        int cedula = sc.nextInt();
        System.out.println("Ingrese el nombre: " );
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido =sc.nextLine();
        System.out.println("Ingrese el número de celular: ");
        int celular =sc.nextInt();
        System.out.println("Ingrese el email: ");
        String email =sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String clave =sc.nextLine();

        //ASIGNAR LOS DATOS INGRESADOS A LAS VARIABLES:

        Usuario registro = new Usuario();
        registro.setCedula(cedula);
        registro.setNombre(nombre);
        registro.setApellido(apellido);
        registro.setCelular(celular);
        registro.setEmail(email);
        registro.setClave(clave);

        //MANDAR LO QUE SE SETEA ARRIBA (REGISTRO) A ADMINISTRADORDAO

        AdministradorDao.registrarAdministradorDB(registro);
    }

    public void eliminarAministrador(){

        System.out.println("Indique el id del administrador que desea eliminar");
        int idAdministrador = sc.nextInt();
        ClienteDao.eliminarUsuarioDB(idAdministrador); //Manda a administradordao el id que se recibe aquí

    }

}
