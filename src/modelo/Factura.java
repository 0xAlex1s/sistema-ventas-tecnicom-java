package modelo;

public class Factura {
    private int idFactura;
    private Cliente cliente;
    private Usuario usuario;  // quien registró la venta
    private String fecha;
    private double total;
    private int estado;

    public Factura() {
        this.idFactura = 0;
        this.cliente = new Cliente();
        this.usuario = new Usuario();
        this.fecha = "";
        this.total = 0.0;
        this.estado = 1;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
