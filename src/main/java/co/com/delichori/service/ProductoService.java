package co.com.delichori.service;

import co.com.delichori.dao.ProductoDao;
import co.com.delichori.model.Producto;

import java.util.Scanner;

public class ProductoService {
     static Scanner sc = new Scanner(System.in);


    public  static void crearProducto(){
        System.out.println("Ingrese el nombre del producto: " );
        String nombre = sc.nextLine();
        System.out.println("Ingrese la descripcion del producto: ");
        String descripcion =sc. nextLine();
        System.out.println("Ingrese el precio del producto: ");
        double precio =sc.nextDouble();
        System.out.println("Ingrese el costo del producto: ");
        double costo =sc.nextDouble();
        System.out.println("Ingrese la cantidad de producto: ");
        double cantidad =sc.nextDouble();

        //Aquí se asignan los datos ingresados a las variables

        Producto registro = new Producto();
        registro.setNombreProducto(nombre);
        registro.setDescripcionProducto(descripcion);
        registro.setPrecioVentaProducto(precio);
        registro.setPrecioCostoProducto(costo);
        registro.setExistenciaProducto(cantidad);

        ProductoDao.crearProductoDB(registro);
    }
    public static  void verProducto(){

        ProductoDao.verProductoDB();

    }

    public  static  void actualizarProducto(){


        System.out.println("Indique para modificar: 1.Nombre 2.Descripción 3. Precio 4. Costo 5. Cantidad");
        int opc = sc.nextInt();
        sc.skip("\n");

        int id;

        Producto update = new Producto(); //Instancia producto


        switch (opc){
            case 1:
                System.out.println("Modificar nombre");
                System.out.println("Ingrese el nuevo valor");
                String nombre = sc.nextLine();
                System.out.println("Indique el id del producto a actualizar: ");
                id = sc.nextInt();
                opc = 1;
                update.setOpc(opc);
                update.setNombreProducto(nombre);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 2:
                System.out.println("Modificar descripción");
                System.out.println("Ingrese el nuevo valor");
                String descripcion = sc.nextLine();
                System.out.println("Indique el id del producto a actualizar: ");
                id = sc.nextInt();
                opc = 2;
                update.setOpc(opc);
                update.setDescripcionProducto(descripcion);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 3:
                System.out.println("Modificar precio");
                System.out.println("Ingrese el nuevo valor");
                double precio = sc.nextDouble();
                System.out.println("Indique el id del producto a actualizar: ");
                id = sc.nextInt();
                opc = 3;
                update.setOpc(opc);
                update.setPrecioVentaProducto(precio);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 4:
                System.out.println("Modificar costo");
                System.out.println("Ingrese el nuevo valor");
                double costo = sc.nextDouble();
                System.out.println("Indique el id del producto a actualizar: ");
                id = sc.nextInt();
                opc = 4;
                update.setOpc(opc);
                update.setPrecioCostoProducto(costo);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;

            case 5:
                System.out.println("Modificar cantidad");
                System.out.println("Ingrese el nuevo valor");
                double cantidad= sc.nextDouble();
                System.out.println("Indique el id del producto a actualizar: ");
                id = sc.nextInt();
                opc = 5;
                update.setOpc(opc);
                update.setExistenciaProducto(cantidad);
                update.setIdProducto(id);
                ProductoDao.modificarProductoDB(update);
                break;

            default:
                System.out.println("Seleccione suna opción válida");
        }
    }

    public  static  void eliminarProducto(){

        System.out.println("Indique el id del producto a borrar: ");
        int idProducto = sc.nextInt();
        ProductoDao.eliminarProductoDB(idProducto); //Manda a producto dao el id que se recibe aquí

    }



}
