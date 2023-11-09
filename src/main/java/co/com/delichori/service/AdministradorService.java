package co.com.delichori.service;

import co.com.delichori.dao.AdministradorDao;
import co.com.delichori.dao.ProductoDao;
import co.com.delichori.model.Administrador;
import co.com.view.MenuAdministrador;

import java.util.Scanner;

public class AdministradorService{

    static Scanner sc = new Scanner(System.in);

    public static void registrarAdministrador() {

        //SOLICITANDO LOS DATOS PARA EL REGISTRO

        System.out.println("Ingrese el número de cédula: ");
        int cedula = sc.nextInt();
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Ingrese email: ");
        String email = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String clave = sc.nextLine();

        //ASIGNAR LOS DATOS INGRESADOS A LAS VARIABLES:

        Administrador registro = new Administrador();
        registro.setCedulaAdministrador(cedula);
        registro.setNombreAdministrador(nombre);
        registro.setApellidoAdministrador(apellido);
        registro.setEmail(email);
        registro.setClave(clave);

        //MANDAR LO QUE SE SETEA ARRIBA (REGISTRO) A ADMINISTRADORDAO

        AdministradorDao.registrarAdministradorDB(registro);

    }

    public static void iniciarSesion() {

        AdministradorDao.iniciarSesionDB();

    }

    public static void eliminarAministrador() {

        System.out.println("Indique la cédula del administrador que desea eliminar");
        int cedulaAdministrador = sc.nextInt();
        AdministradorDao.eliminarAdministradorDB(cedulaAdministrador); //Manda a administradordao el id que se recibe aquí

    }
}