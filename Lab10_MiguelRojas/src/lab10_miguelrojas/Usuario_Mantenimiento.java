package lab10_miguelrojas;

import java.util.ArrayList;

public class Usuario_Mantenimiento extends Usuario{
    
    
    private ArrayList<ATM> lista_Atm = new ArrayList();

    public Usuario_Mantenimiento(String id_usuario, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String pwd, String aNacimiento, String aAfiliacion) {
        super(id_usuario, primerNombre, segundoNombre, primerApellido, segundoApellido, pwd, aNacimiento, aAfiliacion);
    }

    //Mutadores
    //Lista de ATm
    public ArrayList<ATM> getLista_Atm() {
        return lista_Atm;
    }
    public void setLista_Atm(ArrayList<ATM> lista_Atm) {
        this.lista_Atm = lista_Atm;
    }

    @Override
    public String toString() {
        return "Usuario_Mantenimiento{" + "lista_Atm=" + lista_Atm + '}';
    }   
}