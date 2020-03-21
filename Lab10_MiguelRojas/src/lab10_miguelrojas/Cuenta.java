package lab10_miguelrojas;

import java.io.Serializable;

public class Cuenta implements Serializable {
    
    private String num_cuenta;
    private int saldo;
    private String id_usuario;
    
    private static final long serialVersionUID = 555L;

    public Cuenta(String num_cuenta, int saldo, String id_usuario) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.id_usuario = id_usuario;
    }

    // Mutadores
    // número de cuenta
    public String getNum_cuenta() {
        return num_cuenta;
    }
    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }
    // saldo
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    // id del usuario propietario
    public String getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return num_cuenta;
    }
    
}
