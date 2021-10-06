package com.company.AbstractFactory;

import jdk.jshell.spi.ExecutionControl;

public class VehicleFactoryMaker extends AbstractVehicleFactory{

    @Override
    public VehicleFactory getFactory(String vehicleType) throws ExecutionControl.NotImplementedException {

        if(vehicleType.toUpperCase().equals("VAN")){
            return new VanFactory();
        }

        if(vehicleType.toUpperCase().equals("CAR")){
            return new CarFactory();
        }

        throw new ExecutionControl.NotImplementedException(String.format("Vehicle Type [%s] not implemented", vehicleType));
    }
}
