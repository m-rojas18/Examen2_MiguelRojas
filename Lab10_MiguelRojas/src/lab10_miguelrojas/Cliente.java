package lab10_miguelrojas;

import java.util.ArrayList;

public class Cliente extends Usuario {
    
    public ArrayList<Cuenta> cuentas = new ArrayList();
    
    private static final long serialVersionUID = 333L;

    public Cliente(String id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String pwd, int aNacimiento, int aAfiliacion) {
        super(id, primerNombre, segundoNombre, primerApellido, segundoApellido, pwd, aNacimiento, aAfiliacion);
    }
    
    // Mutadores
    // cuentas
    public Cuenta getCuenta(int i) {
        return cuentas.get(i);
    }
    public void addCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }
    
}
