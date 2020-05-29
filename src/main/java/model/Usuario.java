package model;

import java.util.List;
import java.util.stream.Collectors;

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
        //TODO: this.getPrendasAptas() => [outfits]
        return null;
    }

    public List<Prenda> getPrendasAptas(){
        return this.ropa.stream()
                .filter( prenda -> this.ciudad.clima.temperatura.valor <= prenda.temperaturaMaxima.valor )
                .collect(Collectors.toList());

    }
}
