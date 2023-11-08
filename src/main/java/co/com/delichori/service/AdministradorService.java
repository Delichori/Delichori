package co.com.delichori.service;

import co.com.delichori.dao.AdministradorDao;
import co.com.delichori.model.Administrador;

import java.util.Scanner;

public abstract class AdministradorService implements UtilAdministrador {

    static Scanner sc = new Scanner(System.in);

    public void registrarAdministrador() {

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

    public void iniciarSesion() {

        Administrador registro = new Administrador();

        System.out.println("Ingrese su email: ");
        String email = sc.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String clave = sc.nextLine();

        if (email.equals(registro.getEmail()) && clave.equals(registro.getClave())) {
            System.out.println("Bienvenido");
        } else {
            System.out.println("Credenciales no válidas");
        }
    }

    public void eliminarAministrador() {

        System.out.println("Indique la cédula del administrador que desea eliminar");
        int cedulaAdministrador = sc.nextInt();
        AdministradorDao.eliminarAdministradorDB(cedulaAdministrador); //Manda a administradordao el id que se recibe aquí

    }
}