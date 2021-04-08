package com.company.ej3;

public class Circulo extends Figura{
    private float radio = 1.0f;


    public Circulo(){}
    public Circulo(String color,float radio){
        super(color);
        this.radio = radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    public float getRadio() {
        return this.radio;
    }

    @Override
    public float calcPerimetro() {
        return (float) (2 * Math.PI * this.radio);
    }

    public float calcArea(){
        return (float) (Math.PI * Math.pow((double)this.radio,2));
    }

    @Override
    public String toString(){
        return "Circulo=[Radio= "+this.radio+"//Color= "+super.getColor()+"//Area= "+this.calcArea();
    }
}
