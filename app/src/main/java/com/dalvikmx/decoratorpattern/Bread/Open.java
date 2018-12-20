package com.dalvikmx.decoratorpattern.Bread;

public class Open extends BreadDecorator {

    private Bread bread;

    public Open(Bread bread) {
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return this.bread.getDescription().concat(" Abierto");
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() / 2;
    }
}
