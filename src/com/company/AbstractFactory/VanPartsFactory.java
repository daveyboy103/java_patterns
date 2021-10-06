package com.company.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class VanPartsFactory extends PartsFactory {
    @Override
    public List<VehiclePart> getParts() {
        var ret = new ArrayList<VehiclePart>();
        ret.add(new SteeringWheel());
        ret.add(new Windscreen());

        return ret;
    }
}
