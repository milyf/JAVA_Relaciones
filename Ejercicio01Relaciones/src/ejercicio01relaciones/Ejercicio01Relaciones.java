/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package ejercicio01relaciones;

import Eje01.Entidades.Perro;
import Eje01.Entidades.Persona;
import Eje01.Servicio.PersonaPerroServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Ejercicio01Relaciones {

    private static Scanner read = new Scanner(System.in).useDelimiter("\n"); //PORQUE ACA?
    private static PersonaPerroServicio pp1 = new PersonaPerroServicio();
    
    public static void main(String[] args) {
       
        
        
        Persona p1 = new Persona();
        
        Perro p2 = new Perro();
        
       ArrayList<Persona> personas = new ArrayList(); 
       ArrayList<Perro> perros = new ArrayList();
       int cont = 0;
       
       do{ 
          perros.add(pp1.CrearPerro());
           System.out.println(perros);
          // p1.setPerros(perros);
          personas.add(pp1.CrearPersona((List) perros.clone()));//CLONE -> CREA OTRA LISTA IDENTICA EN OTRA UBICACION DE LA MEMORIA
           System.out.println(personas);
          cont+= 1;
        perros.clear(); //CLEAR -> BORRA TODOS LOS ELEMENTOS DE LA LISTA ORIGINAL
       } while(cont<2);
        
       
       p1.Imprimir(personas); //MUESTRA INFORMACION DEL PERRO Y LA PERSONA
    
    
    
    
    }
    
    
      
        
    }
    

