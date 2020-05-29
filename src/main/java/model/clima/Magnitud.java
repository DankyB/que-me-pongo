package model.clima;

public class Magnitud {
    //TODO: handle unit conversion?

    public String unidad;
    public double valor;

    public Magnitud(double valor, String unidad){
        this.unidad = unidad;
        this.valor = valor;
    }
}
