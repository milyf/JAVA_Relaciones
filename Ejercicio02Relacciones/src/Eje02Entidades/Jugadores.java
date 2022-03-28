/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos: 
8
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Eje02Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public class Jugadores {
    
    private Integer ID;
    private String Jugador;
    private Boolean Mojado;
    

    public Jugadores() {
    }

    public Integer getID() {
        return ID;
    }

    public String getJugador() {
        return Jugador;
    }

    public Boolean getMojado() {
        return Mojado;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setJugador(String Jugador) {
        this.Jugador = Jugador;
    }

    public void setMojado(Boolean Mojado) {
        this.Mojado = Mojado;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "ID=" + ID + ", Jugador=" + Jugador + ", Mojado=" + Mojado + '}';
    }
    
    //METODOS
    
   /* disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
    
    
    
    public void Disparo(Juego j){
    //j.getRj();
    Revolver r = j.getRj(); //ME REFIERO COMO R AL REVOLVER DEL JUEGO j.

    if (r.Mojar()==true){ //SETEA EL ATRIBUTO MOJADO, Y MUESTRA SI EL JUGADOR SE MOJO O NO.
    this.Mojado=true;
    
    }
    else{
    this.Mojado=false;
    }
    
    r.SiguienteChorro();
    
    
    
    }
    
    
    
    
    
    
}
