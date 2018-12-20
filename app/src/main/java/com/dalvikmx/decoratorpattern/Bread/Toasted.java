package com.dalvikmx.decoratorpattern.Bread;

public class Toasted extends BreadDecorator {

    private Bread bread;

    public Toasted(Bread bread) {
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return this.bread.getDescription().concat(" Tostado");
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 0;
    }
}

