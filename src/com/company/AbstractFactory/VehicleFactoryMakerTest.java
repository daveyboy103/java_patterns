package com.company.AbstractFactory;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleFactoryMakerTest {

    @Test
    void getFactory() {
    }

    @Test
    void shouldReturnVanFactoryWhenRequested() throws ExecutionControl.NotImplementedException {
        var vehicleFactoryMaker = new VehicleFactoryMaker();

        var factory = vehicleFactoryMaker.getFactory("van");

        assertTrue(factory instanceof VanFactory);
    }

    @Test
    void shouldReturnCarFactoryWhenRequested() throws ExecutionControl.NotImplementedException {
        var vehicleFactoryMaker = new VehicleFactoryMaker();

        var factory = vehicleFactoryMaker.getFactory("car");

        assertTrue(factory instanceof CarFactory);
    }

    @Test
    void shouldThrowExceptionForUnknownFactoryType() throws ExecutionControl.NotImplementedException{
        try{
            var vehicleFactoryMaker = new VehicleFactoryMaker();

            vehicleFactoryMaker.getFactory("unknown");
        }
        catch (ExecutionControl.NotImplementedException exception){
            assertTrue(exception.getMessage().equals("Vehicle Type [unknown] not implemented"));
        }
    }
}