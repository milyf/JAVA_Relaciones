/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package Eje01.Servicio;

import Eje01.Entidades.Perro;
import Eje01.Entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonaPerroServicio {
     private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Perro CrearPerro(){
        Perro pservicio = new Perro();
        System.out.println("Ingrese perro en el sistema");
        System.out.println("Nombre");
        
        pservicio.setNombre(read.next());
        System.out.println("Raza");
        
        pservicio.setRaza(read.next());
        System.out.println("Edad");
        
        pservicio.setEdad(read.nextInt());
        
        System.out.println("Tamaño");
        pservicio.setTamano(read.nextInt());
        return pservicio;
  
    
    }   
    
    public Persona CrearPersona(List perros){
    Persona personservicio = new Persona();
    System.out.println("Ingrese el dueño del perro");
        System.out.println("Nombre");
        
       personservicio.setNombre(read.next());
        System.out.println("Apellido");
        
     personservicio.setApellido(read.next());
        System.out.println("Edad");
        
       personservicio.setEdad(read.nextInt());
        
       System.out.println("DNI");
      personservicio.setDNI(read.nextInt());
      
      personservicio.setPerros(perros);
      
      
     
        return personservicio;
    }
    
  
    //public Persona Asignar(List<Perro> perr){
        
        
      
    //
       // Persona personservicio2 = new Persona();
      //  Perro pp2 = new Perro();
    
   // personservicio2.setPerros(perr);
    
 // return personservicio2;
    
    //}
    
    
}
