package com.company.AbstractFactory;

import jdk.jshell.spi.ExecutionControl;

public abstract class AbstractVehicleFactory
{
    public abstract VehicleFactory getFactory(String vehicleType) throws ExecutionControl.NotImplementedException;
}


