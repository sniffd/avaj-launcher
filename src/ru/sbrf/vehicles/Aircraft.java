package ru.sbrf.vehicles;

import ru.sbrf.Coordinates;

public abstract class Aircraft {

    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter;

    protected Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    }

    private long nextId() {
        return 0;
    }
}
