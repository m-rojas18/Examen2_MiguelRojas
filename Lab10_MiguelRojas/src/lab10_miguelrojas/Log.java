package lab10_miguelrojas;

public class Log {
 
    private String primerNombre;
    private String descripcion;
    private String fechaHora;

    public Log(String primerNombre, String descripcion, String fechaHora) {
        this.primerNombre = primerNombre;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }
    
    // primerNombre
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
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
    
}
