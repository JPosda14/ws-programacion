package co.edu.cue;

public class Prestamo {
    private String Codigo;

    private Empleado servicioempleao;
    private Cliente cliente;
    private double valorprestamo;
    private Detalle detalle[];


    public Prestamo() {
    }

    public Prestamo(String codigo,  Empleado servicioempleao, Cliente cliente, double valorprestamo, Detalle detalle[]) {
        Codigo = codigo;
        this.servicioempleao = servicioempleao;
        this.cliente = cliente;
        this.valorprestamo = valorprestamo;
        this.detalle = detalle;

    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public Empleado getServicioempleao() {
        return servicioempleao;
    }

    public void setServicioempleao(Empleado servicioempleao) {
        this.servicioempleao = servicioempleao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorprestamo() {
        return valorprestamo;
    }

    public void setValorprestamo(double valorprestamo) {
        this.valorprestamo = valorprestamo;
    }

    public Detalle[] getDetalle() {
        return detalle;
    }

    public void setDetalle(Detalle[] detalle) {
        this.detalle = detalle;
    }
}

