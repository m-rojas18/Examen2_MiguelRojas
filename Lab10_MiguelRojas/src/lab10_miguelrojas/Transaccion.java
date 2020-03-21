package lab10_miguelrojas;

public class Transaccion {
    
    private String numero_cuenta;
    private String descripcion;
    private String fecha;
    private String id_usuario;

    private static final long serialVersionUID = 666L;

    public Transaccion(String numero_cuenta, String descripcion, String fecha, String id_usuario) {
        this.numero_cuenta = numero_cuenta;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.id_usuario = id_usuario;
    }

    // número de cuenta
    public String getNumero_cuenta() {
        return numero_cuenta;
    }
    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }
    // descripción
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    // fecha
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    // id usuario
    public String getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    
}
