package lab10_miguelrojas;

public class Cuenta {
    
    private String num_cuenta;
    private int saldo;
    private String id_usuario;

    public Cuenta(String num_cuenta, int saldo, String id_usuario) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
        this.id_usuario = id_usuario;
    }

    //Mutadores
    //Numero de Cuenta
    public String getNum_cuenta() {
        return num_cuenta;
    }
    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }
    //Saldo
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    //Id de Usuario
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "num_cuenta=" + num_cuenta + ", saldo=" + saldo + ", id_usuario=" + id_usuario + '}';
    }
    
}
