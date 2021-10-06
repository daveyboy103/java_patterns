package com.company.AbstractFactory;

import java.util.List;

public abstract class VehicleFactory {
    public abstract Vehicle build(List<PartsFactory> partsFactories);
}
