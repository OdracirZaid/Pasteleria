package pasteleria.logica;

public class Pedido {
    private int idCliente;
    private String tipoProducto;
    private String fechaPedido;
    private String observaciones;
    
    private Cliente referenciaPedido;

    public Pedido() {
    }

    public Pedido(int idCliente, String tipoProducto, String fechaPedido, String observaciones, Cliente referenciaPedido) {
        this.idCliente = idCliente;
        this.tipoProducto = tipoProducto;
        this.fechaPedido = fechaPedido;
        this.observaciones = observaciones;
        this.referenciaPedido = referenciaPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Cliente getReferenciaPedido() {
        return referenciaPedido;
    }

    public void setReferenciaPedido(Cliente referenciaPedido) {
        this.referenciaPedido = referenciaPedido;
    }

    
    
}
