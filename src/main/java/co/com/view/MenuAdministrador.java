package co.com.view;

import java.util.Scanner;

public class MenuAdministrador {
    static Scanner sc = new Scanner(System.in);


    public void iniciarSesion() {

        System.out.println("Iniciando sesión como administrador...");
    }

    public void cerrarSesion() {
        System.out.println("Cerrando sesión...");
    }

    public void registrarAdministrador() {
        System.out.println("Registrando un nuevo administrador...");
    }

    public void eliminarAdministrador() {
        System.out.println("Eliminando un administrador...");
    }

    public void crearProducto() {
        System.out.println("Creando un nuevo producto...");
    }

    public void verProducto() {
        System.out.println("Mostrando información de un producto...");
    }

    public void actualizarProducto() {
        System.out.println("Actualizando información de un producto...");
    }

    public void eliminarProducto() {
        System.out.println("Eliminando un producto...");
    }

    public void verGananciaProducto() {
        System.out.println("Mostrando ganancia de un producto...");
    }

    public void verPedido() {
        System.out.println("Mostrando información de un pedido...");
    }

    public void actualizarPedido() {
        System.out.println("Actualizando un pedido...");
    }

    public void cancelarPedido() {
        System.out.println("Cancelando un pedido...");
    }

    public static void main(String[] args) {
        MenuAdministrador menu = new MenuAdministrador();
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de Administrador :\n" );
            System.out.println("1. Iniciar Sesión \n");
            System.out.println("2. Cerrar Sesión \n");
            System.out.println("3. Registrar Administrador \n");
            System.out.println("4. Eliminar Administrador \n");
            System.out.println("5. Crear Producto \n");
            System.out.println("6. Ver Producto \n");
            System.out.println("7. Actualizar Producto \n");
            System.out.println("8. Eliminar Producto \n");
            System.out.println("9. Ver Ganancia de Producto \n");
            System.out.println("10. Ver Pedido \n");
            System.out.println("11. Actualizar Pedido \n");
            System.out.println("12. Cancelar Pedido \n");
            System.out.println("0. Salir \n");

            int opc = scanner.nextInt();

            switch (opc) {
                case 1:
                    menu.iniciarSesion();
                    break;
                case 2:
                    menu.cerrarSesion();
                    break;
                case 3:
                    menu.registrarAdministrador();
                    break;
                case 4:
                    menu.eliminarAdministrador();
                    break;
                case 5:
                    menu.crearProducto();
                    break;
                case 6:
                    menu.verProducto();
                    break;
                case 7:
                    menu.actualizarProducto();
                    break;
                case 8:
                    menu.eliminarProducto();
                    break;
                case 9:
                    menu.verGananciaProducto();
                    break;
                case 10:
                    menu.verPedido();
                    break;
                case 11:
                    menu.actualizarPedido();
                    break;
                case 12:
                    menu.cancelarPedido();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }
}
}

