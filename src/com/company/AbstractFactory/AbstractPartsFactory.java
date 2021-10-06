package com.company.AbstractFactory;

import jdk.jshell.spi.ExecutionControl;

public abstract class AbstractPartsFactory {

    public abstract PartsFactory getPartsFactory(String vehicleType) throws ExecutionControl.NotImplementedException;
}
