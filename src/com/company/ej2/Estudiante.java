package com.company.ej2;

public class Estudiante extends Persona {
        private int anioIng;
        private float cuotaM;
        private String carrera;

        public Estudiante(){}
        public Estudiante(int dni,String nombre,String apellido,String email,String direccion,
                            int anioIng,float cuotaM,String carrera){
            super(dni,nombre,apellido,email,direccion);
            this.anioIng=anioIng;
            this.cuotaM=cuotaM;
            this.carrera=carrera;
        }

    public int getAnioIng() {
        return this.anioIng;
    }
    public void setAnioIng(int anioIng) {
        this.anioIng = anioIng;
    }

    public float getCuotaM() {
        return this.cuotaM;
    }
    public void setCuotaM(float cuotaM) {
        this.cuotaM = cuotaM;
    }

    public String getCarrera() {
        return this.carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "anioIng=" + this.anioIng +
                ", cuotaM=" + this.cuotaM +
                ", carrera='" + this.carrera + '\'' +
                '}';
    }
}
