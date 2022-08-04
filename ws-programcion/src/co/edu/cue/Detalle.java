package co.edu.cue;

public class Detalle {
    private Objeto objeto;
    private int Unidadesprestada;
    private double subtotal;

    private int diasolicitao;

    private int diastrans;




    public Detalle() {
    }

    public Detalle(Objeto objeto, int unidadesprestada, int diasolicitao, int UnidadesDisp) {
        this.diasolicitao = diasolicitao;
       // this.diastrans = diastrans;
        this.objeto = objeto;
        this.Unidadesprestada = unidadesprestada;
        this.subtotal = objeto.getPrecio() * unidadesprestada;
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

    public int getDiasolicitao() {
        return diasolicitao;
    }

    public void setDiasolicitao(int diasolicitao) {
        this.diasolicitao = diasolicitao;
    }

    public int getDiastrans() {
        return diastrans;
    }

    public void setDiastrans(int diastrans) {
        this.diastrans = diastrans;
    }
}
