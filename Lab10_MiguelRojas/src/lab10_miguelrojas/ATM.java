package lab10_miguelrojas;

public class ATM {

    private String ubicacion;
    private String id_atm;
    private String aFabricacion;
    private String tiempoMantenimiento;

    public ATM(String ubicacion, String id_atm, String aFabricacion, String tiempoMantenimiento) {
        this.ubicacion = ubicacion;
        this.id_atm = id_atm;
        this.aFabricacion = aFabricacion;
        this.tiempoMantenimiento = tiempoMantenimiento;
    }
    
    //Mutadores
    //Ubicacion
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    //Id Atm
    public String getId_atm() {
        return id_atm;
    }
    public void setId_atm(String id_atm) {
        this.id_atm = id_atm;
    }
    //Año de Fabricación
    public String getaFabricacion() {
        return aFabricacion;
    }
    public void setaFabricacion(String aFabricacion) {
        this.aFabricacion = aFabricacion;
    }
    //Tiempo de Mantenimiento
    public String getTiempoMantenimiento() {
        return tiempoMantenimiento;
    }
    public void setTiempoMantenimiento(String tiempoMantenimiento) {
        this.tiempoMantenimiento = tiempoMantenimiento;
    }

    @Override
    public String toString() {
        return ubicacion + "," + id_atm;
    }  
}
