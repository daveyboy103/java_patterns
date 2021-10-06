package com.company.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class CarPartsFactory extends PartsFactory {
    @Override
    public List<VehiclePart> getParts() {
        var ret = new ArrayList<VehiclePart>();
        ret.add(new SteeringWheel());
        ret.add(new Windscreen());
        ret.add(new Wheel());
        ret.add(new Engine());

        return ret;
    }
}
