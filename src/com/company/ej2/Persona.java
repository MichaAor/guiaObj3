package com.company.ej2;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;

    public Persona(){}
    public Persona(int dni,String nombre,String apellido,String email,String direccion){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.direccion=direccion;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
