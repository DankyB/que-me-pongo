package model;

import model.clima.Magnitud;

public class Prenda {
    private TipoPrenda tipoPrenda;
    private Material material;
    private Color colorPrimario;
    private Color colorSecundario;
	private Trama trama;
    public Magnitud temperaturaMaxima;

    public Prenda(TipoPrenda tipoPrenda, Material material, Color colorPrimario, Color colorSecundario, Trama trama, Magnitud temperaturaMaxima) {
        this.tipoPrenda = tipoPrenda;
        this.material = material;
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.trama = trama;
        this.temperaturaMaxima = temperaturaMaxima;
    }

    public Categoria getCategoria() {
        return this.tipoPrenda.getCategoria();
    }
}
