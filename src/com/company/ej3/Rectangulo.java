package com.company.ej3;

public class Rectangulo extends Figura{
    private float ancho;
    private float alto;

    public Rectangulo(String color,float ancho, float alto) {
        super(color);
        this.ancho = ancho;
        this.alto = alto;
    }
    public Rectangulo() {
    }

    public float getAncho() {
        return ancho;
    }
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }
    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float calcPerimetro (){
        return ((2*this.ancho) + (2*this.alto));

    }

    public float calcArea (){
        return this.ancho*this.alto;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}
