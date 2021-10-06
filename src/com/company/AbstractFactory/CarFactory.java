package com.company.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle build(List<PartsFactory> partsFactories) {
        this.partsFactories = partsFactories;

        if(partsFactories == null){
            this.partsFactories = new ArrayList<>();
            this.partsFactories.add(new CarPartsFactory());
        }else{
            this.partsFactories = partsFactories;
        }

        var ret = new Van();

        for(var partsFactory : this.partsFactories){
            for (var vehiclePart: partsFactory.getParts()) {
                ret.getParts().add(vehiclePart);
            }
        }

        return ret;
    }
}
