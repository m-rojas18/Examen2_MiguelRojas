package lab10_miguelrojas;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable {
    
    protected String id;
    protected String primerNombre;
    protected String segundoNombre;
    protected String primerApellido;
    protected String segundoApellido;
    protected String pwd;
    protected int aNacimiento;
    protected int aAfiliacion;
    protected ArrayList<Transaccion> transacciones = new ArrayList();
    
    private static final long serialVersionUID = 222L;

    public Usuario(String id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String pwd, int aNacimiento, int aAfiliacion) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.pwd = pwd;
        this.aNacimiento = aNacimiento;
        this.aAfiliacion = aAfiliacion;
    }
    
    // Mutadores
    // id
    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }
    // primer nombre
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    // segundo nombre
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    // primer apellido
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    // segundo apellido
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    // password
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    // año de nacimiento
    public int getaNacimiento() {
        return aNacimiento;
    }
    public void setaNacimiento(int aNacimiento) {
        this.aNacimiento = aNacimiento;
    }
    // año de afiliación
    public int getaAfiliacion() {
        return aAfiliacion;
    }
    public void setaAfiliacion(int aAfiliacion) {
        this.aAfiliacion = aAfiliacion;
    }
    // transacciones
    public Transaccion getTX(int i) {
        return transacciones.get(i);
    }
    public void addTX(Transaccion TX) {
        transacciones.add(TX);
    }

    @Override
    public String toString() {
        return id;
    }
    
}
