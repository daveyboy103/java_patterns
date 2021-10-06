package com.company.AbstractFactory;

import jdk.jshell.spi.ExecutionControl;

public class PartsFactoryMaker extends AbstractPartsFactory{

    @Override
    public PartsFactory getPartsFactory(String vehicleType) throws ExecutionControl.NotImplementedException {

        if(vehicleType.toUpperCase().equals("VAN")){
            return new VanPartsFactory();
        }

        throw new ExecutionControl.NotImplementedException(String.format("Vehicle Type [{0}] not implemented", vehicleType));
    }
}
