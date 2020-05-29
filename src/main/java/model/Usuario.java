package model;

import java.util.List;

public class Usuario {
    private String nombre;
    private Ciudad ciudad;
    private List<Prenda> ropa;


    public Usuario(String nombre, Ciudad ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public void addRopa(Prenda prenda) {
        this.ropa.add(prenda);
    }

    public List<Outfit> generarSugerencias(){
        //TODO: (ropa,{ciudad:clima}) => [outfits]
        return null;
    }
}
