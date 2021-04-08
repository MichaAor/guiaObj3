package com.company.ej3;

public abstract class Figura {
    private String color = "-";

    public Figura(){
    }
    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract float calcArea();
    public abstract float calcPerimetro();
}
