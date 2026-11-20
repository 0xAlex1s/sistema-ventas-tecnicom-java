package modelo;

public class Inventario {

    private int idInventario;
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    private int igv;
    private int idCategoria;
    private int estado;
    
    public Inventario(){
     this.idInventario = 0;
     this.nombre = "";
     this.cantidad = 0;
     this.precio = 0.0;
     this.descripcion = "";
     this.igv = 0;
     this.idCategoria = 0;
     this.estado = 0;
    }

    public Inventario(int idInventario, String nombre, int cantidad, double precio, String descripcion, int igv, int idCategoria, int estado) {
        this.idInventario = idInventario;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.igv = igv;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIgv() {
        return igv;
    }

    public void setIgv(int igv) {
        this.igv = igv;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
   
}
