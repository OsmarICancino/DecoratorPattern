package com.dalvikmx.decoratorpattern.Bread;

public class Oil extends BreadDecorator {

    private Bread bread;

    public Oil(Bread bread) {
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return this.bread.getDescription().concat(" con aceite");
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 60;
    }
}



