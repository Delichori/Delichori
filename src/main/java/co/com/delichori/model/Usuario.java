package co.com.delichori.model;

public class Usuario {
    //ATRIBUTOS
    private int cedula;
    private String nombre;
    private String apellido;
    private long celular;
    private String email;
    private String clave;


    //CONSTRUCTOR
    public Usuario(){

    }

    public Usuario(int cedula, String nombre, String apellido, long celular, String email,String clave){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.celular=celular;
        this.email=email;
        this.clave=clave;

    }



    //GETTERS AND SETTERS
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

}
