package co.com.delichori.model;

public class Cliente {
    private int idCliente;
    private String direccion;

    public Cliente(){
    }
    public Cliente(int idCliente,String direccion){
        this.idCliente=idCliente;
        this.direccion=direccion;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
