package co.edu.cue;

public class Objeto  {
    private double codigo;
    private String nombre;
    private int unidadesDisp;
    private boolean estado;
    private double precio;

    public Objeto() {
    }

    public Objeto(double codigo, String nombre, boolean estado, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.unidadesDisp = unidadesDisp;
        this.estado = estado;
        this.precio = precio;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
