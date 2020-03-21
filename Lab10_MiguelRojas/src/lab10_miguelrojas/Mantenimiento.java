package lab10_miguelrojas;

import java.util.ArrayList;

public class Mantenimiento extends Usuario {
    
    private ArrayList<ATM> ATMs = new ArrayList();
    
    private static final long serialVersionUID = 444L;

    public Mantenimiento(String id_usuario, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String pwd, int aNacimiento, int aAfiliacion) {
        super(id_usuario, primerNombre, segundoNombre, primerApellido, segundoApellido, pwd, aNacimiento, aAfiliacion);
    }

    // Mutadores
    // ATMS
    public ATM getATM(int i) {
        return ATMs.get(i);
    }
    public void addATM(ATM atm) {
        ATMs.add(atm);
    }

    public ArrayList<ATM> getATMs() {
        return ATMs;
    }
    
    

    @Override
    public String toString() {
        return "Usuario_Mantenimiento{" + "lista_Atm=" + ATMs + '}';
    }
    
}