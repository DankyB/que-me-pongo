package model.clima;

import java.util.List;
import java.util.Map;

public interface ClimaService {

    List<Map<String, Object>> getWeather(String name);

}
