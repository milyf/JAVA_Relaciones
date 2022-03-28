/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eje02Servicio;

import Eje02Entidades.Juego;
import Eje02Entidades.Jugadores;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RevolverJugadoresJuego {
  
      public void Jugador(Juego jj){ //NO SIGNIFICA QUE TRAE EL JUEGO, SINO QUE ESPERA QUE LA VARIABLE ENTRE PARENTESIS SEA UN JUEGO.
    Scanner read = new Scanner(System.in).useDelimiter("\n");
  
    int cant=0,cont=0;
   do{System.out.println("Ingrese cantidad de jugadores, min 2 y max 6");
        cant = read.nextInt();
        
   }while(cant<2 & cant>6);
    
        
   
    for (int i=0;i<cant;i++){
    Jugadores j1 = new Jugadores();//RESETEA EL OBJETO JUGADOR CADA VEZ QUE DA UNA VUELTA
    cont+=1;
    j1.setID(cont);
    j1.setJugador("Jugador"+cont);
    j1.setMojado(false); //TODAS LAS PERSONAS EMPIEZAN SIN MOJARSE.
    jj.ADDJugador(j1); //AGREGO LA PERSONA AL METODO ADD DE JUEGO. 
   
    
    }
    
      }  
    
    
    
       }
    
    
    
    
    
    
    

