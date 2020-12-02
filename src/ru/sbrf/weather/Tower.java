package ru.sbrf.weather;

import ru.sbrf.vehicles.Flyable;

public abstract class Tower {
    private Flyable observers;

    public void register(Flyable flyable) {

    }

    public void unregister(Flyable flyable) {

    }

    protected void conditionsChanged() {

    }
}
