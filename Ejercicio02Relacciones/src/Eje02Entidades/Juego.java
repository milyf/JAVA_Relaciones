/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Eje02Entidades;

import Eje02Servicio.RevolverJugadoresJuego;
import java.util.ArrayList;
import java.util.Scanner;



public class Juego {
    
    private ArrayList<Jugadores> JJ; 
    private Revolver rj;//REVOLVER JUEGO
    private Scanner read;

    public Juego() {
        this.JJ= new ArrayList();
        this.read= new Scanner(System.in).useDelimiter("\n");
    }

    public Juego(ArrayList<Jugadores> jugadoresarray, Revolver rj) {
        this.JJ = jugadoresarray;
        this.rj = rj;
    }

    public ArrayList<Jugadores> getJugadoresarray() {
        return JJ;
    }

    public Revolver getRj() {
        return rj;
    }

    public void setJugadoresarray(ArrayList<Jugadores> jugadoresarray) {
        this.JJ = jugadoresarray;
    }

    public void setRj(Revolver rj) {
        this.rj = rj;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadoresarray=" + JJ + ", rj=" + rj + '}';
    }
    
    
    public void ADDJugador(Jugadores j){ //RELLENA JUEGO CON JUGADORES
    JJ.add(j);
    
    
    }
    
    //METODOS
    //llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
    //jugadores y el revolver para guardarlos en los atributos del juego.
    
    public void LlenarJuego(Revolver r, RevolverJugadoresJuego rjj1){
    this.setRj(r); //RECIBE REVOLVER
    rjj1.Jugador(this);//THIS -> APROVECHA EL METODO PARA RELLENAR EL JUEGO. TRAE EL THIS -> "JUEGO"
    
    
    }
    
    public boolean Ronda(int n){
     /*ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
     //RONDA ES LO QUE HACE CADA JUGADOR
     if (n>=JJ.size() ){
     
     n= n %JJ.size();
     
     
     }
     Jugadores j = JJ.get(n);
     
    j.Disparo(this); 
    j.getMojado();
    boolean x = false;
    if(j.getMojado()==true){
        System.out.println(j.getJugador()+" "+ "se mojo");
       x = true;
    }
    else {  System.out.println(j.getJugador()+" "+ "No se mojo");
        
    x=false;
    
    }
     
     return x;
    
     
    }
   //for(Jugadores jugador :JJ){
   //jugador.Disparo(this); //CHEQUEA SI JUGADOR SE MOJO Y PASA AL SIGUIENTE CHORRO.
       
       
       
   
   //}
     
     
     
     
    
 
    
    
    
    
}
