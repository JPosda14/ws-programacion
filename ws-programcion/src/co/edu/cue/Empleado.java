package co.edu.cue;

public class Empleado {

    private String Code;
    private String nombre;
    private String Correo;
    private int Añosant;

    public Empleado() {
    }

    public Empleado(String code, String nombre, String correo, int añosant) {
        Code = code;
        this.nombre = nombre;
        Correo = correo;
        Añosant = añosant;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public int getAñosant() {
        return Añosant;
    }

    public void setAñosant(int añosant) {
        Añosant = añosant;
    }
}
