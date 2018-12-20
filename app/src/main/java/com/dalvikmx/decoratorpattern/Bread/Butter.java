package com.dalvikmx.decoratorpattern.Bread;

public class Butter extends BreadDecorator {

    private Bread bread;

    public Butter(Bread bread) {
        this.bread = bread;
    }


    @Override
    public String getDescription() {
        return this.bread.getDescription().concat(" con Mantequilla");
    }

    @Override
    public int getKcal() {
        return this.bread.getKcal() + 80;
    }
}

