package com.company.ej3;

public class Cuadrado extends Rectangulo{

    public Cuadrado() {}

    /**
     * @param color
     * @param lado  inicializo la base y altura, atributos de rectangulo, pasandole
     *              un solo parametro. De esta forma me aseguro que el cuadrado, tenga
     *              la misma longitud en sus lados.
     */
    public Cuadrado(String color, float lado) {
        super(color, lado, lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "base=" + this.getAncho() +
                ", altura=" + this.getAlto() +
                ", color='" + this.getColor() + '\'' +
                '}';
    }
}
