package com.dalvikmx.decoratorpattern.Filing;

public class DoublePorcion extends FilingDecorator {

    private Filing filing;

    public DoublePorcion(Filing filing) {
        this.filing = filing;
    }

    @Override
    public String getDescription() {
        return "Racion doble " + this.filing.getDescription();
    }

    @Override
    public int getKcal() {
        return this.filing.getKcal() * 2;
    }
}
