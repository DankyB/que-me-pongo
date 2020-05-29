package model;

import java.util.List;

public class Outfit {
    public List<Prenda> top;
    public List<Prenda> bottom;
    public List<Prenda> calzado;
    public List<Prenda> accesorio;

    public void addPrenda(Prenda prenda) {
        Categoria categoria = prenda.getCategoria();

        switch(categoria){
            case PARTE_SUPERIOR:{
                top.add(prenda);
                return;
            }
            case PARTE_INFERIOR:{
                bottom.add(prenda);
                return;
            }
            case CALZADO:{
                calzado.add(prenda);
                return;
            }
            case ACCESORIO:{
                accesorio.add(prenda);
                return;
            }
        }
    }

}
