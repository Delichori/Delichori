package co.com.delichori.model;

import java.time.LocalDate;

public class Pedido {

    private int idPedido;
    private String estadoPedido;
    private int cantidadProducto;
    Producto producto;
    private double valorTotalPedido;
    private LocalDate fechaPedido;
    private LocalDate fechaEntrega;
    Cliente cliente;

    public Pedido() {

    }

    public Pedido(String estadoPedido, int cantidadProducto, Producto producto, double valorTotalPedido, LocalDate fechaPedido, LocalDate fechaEntrega, Cliente cliente) {

        this.estadoPedido = estadoPedido;
        this.cantidadProducto = cantidadProducto;
        this.producto = producto;
        this.valorTotalPedido = valorTotalPedido;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public double getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(double valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

