package com.company.ej1;

public class Circulo {
    private float radio = 1.0f;
    private String color = "ROJO";

    public Circulo(){}
    public Circulo(float radio,String color){
        this.radio = radio;
        this.color = color;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return this.radio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }

    public float calcArea(){
       return (float) (Math.PI * Math.pow((double)this.radio,2));
    }

    @Override
    public String toString(){
        return "Circulo=[Radio= "+this.radio+"//Color= "+this.color+"//Area= "+this.calcArea();
    }

}
