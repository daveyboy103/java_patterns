package com.company.AbstractFactory;

import jdk.jshell.spi.ExecutionControl;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarPartsFactoryTest {

    @Test
    void shouldGetCorrectParts() throws ExecutionControl.NotImplementedException {
        var factoryMaker = new VehicleFactoryMaker();
        var carfactory = new CarPartsFactory();

        var carParts = carfactory.getParts();

        assertTrue(carParts.size() == 4);
        assertTrue(() -> {
            var results = new ArrayList<Boolean>();
            for (var part: carParts) {
                if(part.getName().equals("Steering Wheel")){
                    results.add(true);
                }
                if(part.getName().equals("Windscreen")){
                    results.add(true);
                }
                if(part.getName().equals("Wheel")){
                    results.add(true);
                }
                if(part.getName().equals("Engine")){
                    results.add(true);
                }
            }

            return (results.size() == 4);
        });
    }


}