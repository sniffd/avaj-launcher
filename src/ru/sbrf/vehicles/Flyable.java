package ru.sbrf.vehicles;

import ru.sbrf.weather.WeatherTower;

public interface Flyable {
    void updateConditions();
    void registerTower(WeatherTower weatherTower);
}
