package co.com.delichori.model;

import java.time.LocalDate;

public class Factura {
    //ATRIBUTOS
    private int id_factura;
    private LocalDate fecha_factura;



    Pedido pedido=new Pedido();


    //CONSTRUCTOR VACIO
    public Factura() {

    }
    public  Factura(int id_factura,LocalDate fecha_factura){
        this.id_factura=id_factura;
        this.fecha_factura=fecha_factura;
    }


    //GETTERS AND SETTERS
    public int getId_factura() {

        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public LocalDate getFecha_factura() {
        return fecha_factura;
    }

    public void setFecha_factura(LocalDate fecha_factura) {
        this.fecha_factura = fecha_factura;
    }
}
