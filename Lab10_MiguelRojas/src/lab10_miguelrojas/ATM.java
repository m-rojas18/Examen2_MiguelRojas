package lab10_miguelrojas;

import java.io.Serializable;

public class ATM implements Serializable {
    
    private String ubicacion;
    private String id;
    private int aFabricacion;
    private int tiempoMantenimiento; // meses
    private int saldo;
    
    private static final long serialVersionUID = 111L;

    public ATM(String ubicacion, String id, int aFabricacion, int tiempoMantenimiento) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.aFabricacion = aFabricacion;
        this.tiempoMantenimiento = tiempoMantenimiento;
        saldo = 10000;
    }
    
    // Mutadores
    // ubicación
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    // id
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    // año de fabricación
    public int getaFabricacion() {
        return aFabricacion;
    }
    public void setaFabricacion(int aFabricacion) {
        this.aFabricacion = aFabricacion;
    }
    // tiempo de mantenimiento
    public int getTiempoMantenimiento() {
        return tiempoMantenimiento;
    }
    public void setTiempoMantenimiento(int tiempoMantenimiento) {
        this.tiempoMantenimiento = tiempoMantenimiento;
    }
    // saldo
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return ubicacion + ", " + id;
    }
    
}
