package com.company;

import com.company.ej1.Cilindro;
import com.company.ej1.Circulo;

public class Main {

    public static void main(String[] args) {
    //Ej1
        //Circulo c1 = new Circulo();
        //System.out.println(c1.toString());
        Cilindro cl1 = new Cilindro();
        System.out.println(cl1.toString());
        Cilindro cl2 = new Cilindro(15f,"Verde",20f);
        System.out.println(cl2.toString());

    }
}
