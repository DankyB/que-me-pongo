package model.clima;

import java.util.*;

public class MockWeatherAPI implements ClimaService {

    public final List<Map<String, Object>> getWeather(String ciudad){
        return Arrays.asList(new HashMap<String, Object>(){{
            put("DateTime", "2019-05-03T01:00:00-03:00");
            put("PrecipitationProbability", Math.random());
            put("Temperature", new HashMap<String, Object>(){{
                put("Value", Math.random()*20+5);
                put("Unit", "°C");
            }});
        }});
    }
}
