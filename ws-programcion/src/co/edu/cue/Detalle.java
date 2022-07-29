package co.edu.cue;

public class Detalle {
    private Objeto objeto;
    private int Unidadesprestada;
    private double subtotal;

    public Detalle() {
    }

    public Detalle(Objeto objeto, int unidadesprestada) {
        this.objeto = objeto;
       if (objeto.getUnidadesDisp()>unidadesprestada){
           Unidadesprestada = unidadesprestada;
       }
        this.subtotal = objeto.getPrecio()*unidadesprestada;
    }

    public Objeto getObjeto() {
        return objeto;
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }

    public double getUnidadesprestada() {
        return Unidadesprestada;
    }

    public void setUnidadesprestada(int unidadesprestada) {
        Unidadesprestada = unidadesprestada;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }
}
