package com.dalvikmx.decoratorpattern.Bread;

public class LowFatButter extends BreadDecorator {

    private Bread bread;

    public LowFatButter(Bread bread) {
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return this.bread.getDescription().concat(" con Margarina");
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 5;
    }
}


