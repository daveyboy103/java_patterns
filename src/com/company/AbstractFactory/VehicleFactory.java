package com.company.AbstractFactory;

import java.util.AbstractList;
import java.util.List;

public abstract class VehicleFactory {
    protected List<PartsFactory> partsFactories;

    public abstract Vehicle build(List<PartsFactory> partsFactories);
}
