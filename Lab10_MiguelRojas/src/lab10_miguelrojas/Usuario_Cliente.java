package lab10_miguelrojas;

public class Usuario_Cliente extends Usuario{
    
    private Cuenta cuenta = new Cuenta();

    public Usuario_Cliente(String id_usuario, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String pwd, String aNacimiento, String aAfiliacion) {
        super(id_usuario, primerNombre, segundoNombre, primerApellido, segundoApellido, pwd, aNacimiento, aAfiliacion);
    }
    
    //Mutadores
    //Cuenta
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
}
