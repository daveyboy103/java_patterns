package com.company.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle
{
    private String name;
    private List<VehiclePart> parts = new ArrayList<VehiclePart>();;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VehiclePart> getParts() {
        return parts;
    }
}
