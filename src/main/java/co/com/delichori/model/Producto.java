package co.com.delichori.model;

public class Producto {

    private int idProducto;
    private String nombreProducto;
    private String descripcionProducto;
    private double precioCostoProducto;
    private double precioVentaProducto;
    private double gananciaProducto;
    private double existenciaProducto;

    private int opc;


//PREGUNTARLE A JOHA DONDE SE HACE LA FÓRMULA DE LA GANANCIA

    public Producto() {

    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioCostoProducto() {
        return precioCostoProducto;
    }

    public void setPrecioCostoProducto(double precioCostoProducto) {
        this.precioCostoProducto = precioCostoProducto;
    }

    public double getPrecioVentaProducto() {
        return precioVentaProducto;
    }

    public void setPrecioVentaProducto(double precioVentaProducto) {
        this.precioVentaProducto = precioVentaProducto;
    }

    public double getGananciaProducto() {
        return gananciaProducto;
    }

    public void setGananciaProducto(double gananciaProducto) {
        this.gananciaProducto = gananciaProducto;
    }

    public double getExistenciaProducto() {
        return existenciaProducto;
    }

    public void setExistenciaProducto(double existenciaProducto) {
        this.existenciaProducto = existenciaProducto;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

}


