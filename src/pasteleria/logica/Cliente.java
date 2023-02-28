package pasteleria.logica;


public class Cliente {
    private int idCliente;
    private String nombre;
    private String direcion;
    private String celular;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String direcion, String celular) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direcion = direcion;
        this.celular = celular;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
