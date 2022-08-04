package co.edu.cue;

import java.util.List;

public class Prestamo {
    private String Codigo;

    private Empleado servicioempleado;
    private Cliente cliente;
    private double valorprestamo;
    private List<Detalle> detalles;


    public Prestamo() {
    }

    public Prestamo(String codigo,  Empleado servicioempleado, Cliente cliente, double valorprestamo, List<Detalle> detalles) {
        Codigo = codigo;
        this.servicioempleado = servicioempleado;
        this.cliente = cliente;
        this.valorprestamo = valorprestamo;
        this.detalles = detalles;

    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public Empleado getServicioempleao() {
        return servicioempleado;
    }

    public void setServicioempleao(Empleado servicioempleao) {
        this.servicioempleado = servicioempleao;
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

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "Codigo='" + Codigo + '\'' +
                ", servicioempleado=" + servicioempleado +
                ", cliente=" + cliente +
                ", valorprestamo=" + valorprestamo +
                ", detalles=" + detalles +
                '}';
    }
}

