package com.company;

import com.company.ej1.Cilindro;
import com.company.ej1.Circulo;
import com.company.ej2.Estudiante;
import com.company.ej2.Persona;
import com.company.ej2.Staff;

public class Main {

    public static void main(String[] args) {
    /*//Ej1
        //Circulo c1 = new Circulo();
        //System.out.println(c1.toString());
        Cilindro cl1 = new Cilindro();
        System.out.println(cl1.toString());
        Cilindro cl2 = new Cilindro(15f,"Verde",20f);
        System.out.println(cl2.toString());*/
     //Ej2
    Estudiante e1 = new Estudiante(22881696,"Said","Rosello","ygossisedd-7542@yopmail.com","Peralta 45",2014,6500f,"Geografia");
    Estudiante e2 = new Estudiante(54546478,"Saltamonte","Aurelia","saliomoti@gmail.com","Salta 1987",2008,5200f,"Abogacia");
    Estudiante e3 = new Estudiante(48941681,"Rocabuena","Paleante","patifiol@gmail.com","Peru 5658",2019,5500f,"Historia");
    Estudiante e4 = new Estudiante(78642318,"Rogelia","Mitofria","rolcanela@#gmail.com","Patronato 1178",2012,5300f,"Matematicas");

    Staff s1 = new Staff(21481745,"Marcelo","Janson","marja@gmail.com","Triunvirato 2164",52000,"Tarde");
    Staff s2 = new Staff(47519721,"Marianela","Pinto","nelita@gmail.com","Posadas 1004",89000,"Mañana");
    Staff s3 = new Staff(65748112,"Fatima","Politano","napolitana@gmail.com","Italia 1938",30000,"Tarde");
    Staff s4 = new Staff(35484515,"Marcelo","Janson","marja@gmail.com","Triunvirato 2164",52000,"Tarde");

        Persona[] alm = new Persona[8];
        alm[0] = e1;    alm[1] = e2;    alm[2] = e3;    alm[3] = e4;
        alm[4] = s1;    alm[5] = s2;    alm[6] = s3;    alm[7] = s4;
    int e=0,s=0;

    for(Persona aux : alm){
        if(aux != null){
            if(aux instanceof Estudiante);e++;
            if(aux instanceof Staff);s++;
        }
    }

        System.out.println("Cant de estudiantes: "+e +"staff: "+s);
    float totIng = 0f;
    for(Persona aux : alm){
        if(aux instanceof Estudiante){
            totIng = totIng+((Estudiante) aux).getCuotaM();
        }
    }
        System.out.println(totIng);
    //EJ3






    }
}
