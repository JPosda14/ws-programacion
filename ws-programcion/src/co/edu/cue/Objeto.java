package co.edu.cue;

public class Objeto  {
    private String codigo;
    private String nombre;
    private int unidadesDisp;
    private String estado;
    private double precio;

    public Objeto() {
    }

    public Objeto(String codigo, String nombre, int unidadesDisp, String estado, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadesDisp = unidadesDisp;
        this.estado = estado;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesDisp() {
        return unidadesDisp;
    }

    public void setUnidadesDisp(int unidadesDisp) {
        this.unidadesDisp = unidadesDisp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
