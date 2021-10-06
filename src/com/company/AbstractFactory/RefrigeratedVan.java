package com.company.AbstractFactory;

public class RefrigeratedVan extends Van{
    private final Van baseVan;

    public RefrigeratedVan(Van baseVan) {
        if(baseVan != null)
            this.baseVan = baseVan;
        else
            throw new NullPointerException("baseVan cannot be null");

        super.getParts().add(new FreezerPlant());
    }
}
