package com.company.ej1;

public class Cilindro extends Circulo{
        private float altura = 1.0f;

        public Cilindro(){}
        public Cilindro(Float radio,String color,float altura){
            super(radio,color);
            this.altura = altura;
        }

        public float calcVol(){
            return (float)Math.PI*this.getRadio()*this.altura;
        }
        @Override
        public float calcArea(){
            return (float)(2*Math.PI*getRadio()*altura)+(2*super.calcArea());
        }

        @Override
        public String toString(){
            return "CILINDRO=[RADIO= "+this.getRadio()+"//ALTURA= "+this.altura+"//AREA DE BASE= "+this.calcArea()+
                    "//VOLUMEN= "+this.calcVol();
        }
}
