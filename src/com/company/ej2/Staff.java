package com.company.ej2;

public class Staff extends Persona{
    private float salario;
    private String turno;

    public Staff(){}
    public Staff(int dni, String nombre, String apellido, String email, String direccion, float salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return this.turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
