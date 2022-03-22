/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Eje01.Entidades;

import java.util.List;
import Eje01.Entidades.Perro;
import java.util.ArrayList;



public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNI;
    private List <Perro> perros;
    
    //private List<Perro> perros;
 //public Persona() {    
    //this.perros = new List();
    
           
  //}

    public Persona() {
    }
    
    
   

    public Persona(String nombre, String apellido, Integer edad, Integer DNI,List<Perro> perros ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
       this.perros = perros;
    }

    public List<Perro> getPerros() {
        return perros;
    }
    
    
    
    

    public void setPerros(List<Perro> perros) {
        this.perros = perros;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

 

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDNI() {
        return DNI;
    }

   

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", perros=" + perros + '}';
    }
    
    
    
    public void Imprimir(ArrayList<Persona> pers){
    
    for(Persona auxp : pers){
    
        System.out.println(auxp);
    
    }
    
    
    
    }
    
    
    
    
    
    
    
    }
