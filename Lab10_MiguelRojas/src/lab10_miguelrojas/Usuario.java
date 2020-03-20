package lab10_miguelrojas;

public class Usuario {
    
    private String id_usuario;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String pwd;
    private String aNacimiento;
    private String aAfiliacion;

    public Usuario(String id_usuario, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String pwd, String aNacimiento, String aAfiliacion) {
        this.id_usuario = id_usuario;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.pwd = pwd;
        this.aNacimiento = aNacimiento;
        this.aAfiliacion = aAfiliacion;
    }
    //Mutadores
    //Usuario
    public String getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }
    //Primer Nombre
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    //Segundo Nombre
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    //Primer Apellido
    public String getPrimerApellido() {
        return primerApellido;
    }
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    //Segundo Apellido
    public String getSegundoApellido() {
        return segundoApellido;
    }
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    //Password
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    //Ano Nacimiento
    public String getaNacimiento() {
        return aNacimiento;
    }
    public void setaNacimiento(String aNacimiento) {
        this.aNacimiento = aNacimiento;
    }
    //Año Afiliacion
    public String getaAfiliacion() {
        return aAfiliacion;
    }
    public void setaAfiliacion(String aAfiliacion) {
        this.aAfiliacion = aAfiliacion;
    }

    @Override
    public String toString() {
        return id_usuario;
    }   
}
