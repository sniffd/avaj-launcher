package ru.sbrf.vehicles.impl;

import ru.sbrf.Coordinates;
import ru.sbrf.vehicles.Aircraft;
import ru.sbrf.vehicles.Flyable;
import ru.sbrf.weather.WeatherTower;

public class JetPlane extends Aircraft implements Flyable {

    private WeatherTower weatherTower;

    JetPlane(String name, Coordinates coordinates) {
        super(name, coordinates);
    }

    @Override
    public void updateConditions() {

    }

    @Override
    public void registerTower(WeatherTower weatherTower) {

    }
}
