package lab10_miguelrojas;

import java.io.Serializable;

public class Transaccion implements Serializable {
    
    private String numero_cuenta;
    private String descripcion;
    private String fechaHora;
    private int id;

    private static final long serialVersionUID = 666L;

    public Transaccion(String numero_cuenta, String descripcion, String fechaHora, int id) {
        this.numero_cuenta = numero_cuenta;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.id = id;
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
    // fecha y hora
    public String getFechaHora() {
        return fechaHora;
    }
    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    // id
    public int getId() {
        return id;
    }
    public void setId(int id_usuario) {
        this.id = id_usuario;
    }
    
}
