package model.clima;

public class Clima {
    public Magnitud temperatura;
    public Magnitud probabilidadPrecipitaciones;

    public void Clima(Magnitud temperatura, Magnitud precipitaciones){
        this.temperatura = temperatura;
        this.probabilidadPrecipitaciones = precipitaciones;
    }

    public void setTemperatura(Magnitud temperatura){
        this.temperatura = temperatura;
    }

    public void setProbabilidadPrecipitaciones(Magnitud probabilidadPrecipitaciones) {
        this.probabilidadPrecipitaciones = probabilidadPrecipitaciones;
    }
}
