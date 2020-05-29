package model;

import model.Clima.Clima;
import model.Clima.ClimaService;

import java.util.List;
import java.util.Map;

public class Ciudad {
    private String nombre;
    private Clima clima;
    private ClimaService climaService;

    public void Ciudad(String nombre){
        this.nombre = nombre;
    }

    public void setClimaService(ClimaService newService){
        this.climaService = newService;
    }

    public void getClima(){
        List<Map<String, Object>> data = this.climaService.getWeather(this.nombre);
        //TODO: parse data and store in <<Clima>>
    }

}
