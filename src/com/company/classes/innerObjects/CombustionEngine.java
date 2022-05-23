package com.company.classes.innerObjects;

public class CombustionEngine implements Drive {
    private int engineCapacity;

    public CombustionEngine() {
    }

    public CombustionEngine(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
