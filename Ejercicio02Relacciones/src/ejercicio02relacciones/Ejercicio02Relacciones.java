/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02relacciones;

import Eje02Entidades.Juego;
import Eje02Entidades.Jugadores;
import Eje02Entidades.Revolver;
import Eje02Servicio.RevolverJugadoresJuego;


public class Ejercicio02Relacciones {

    
    public static void main(String[] args) {
        
    //LAS INICIALIZO A LOS OBJETOS
  Revolver r1 = new Revolver();
  Jugadores j = new Jugadores();
  Juego j2 = new Juego();  
 
  RevolverJugadoresJuego RJJ = new RevolverJugadoresJuego();     
        
   //MUESTRO INFORMACION DEL REVOLVER POR PANTALLA     
       
   
   r1.Llenarrevolver();
   r1.Mojar();
   System.out.println(r1.Mojar());//EL UNICO QUE NO ES VOID, BOLEEAN
   //r1.SiguienteChorro();
   r1.Posiciones();
   
   //MUESTRO METODOS DE SERVICIO
   
   j2.LlenarJuego(r1,RJJ);
     System.out.println(j2.getJugadoresarray());
 
   //INFORMACION DEL JUEGO
   //RJJ.Jugador(j2);
   
   
//for(int i=0; i<10;i++){ //BUCLE PARA VERIFICAR TRUE OR FALSE DEL ARMA
 // j.Disparo(j2);
  // System.out.println(j.getMojado()); //EL ARMA TIENE 10 POSICIONES
    
//}   
   boolean continuar= true;
   int m=0;
   boolean save=false;
   while(continuar){
       save=j2.Ronda(m);
       m+=1;
   if(save==true){
       continuar=false;
   
  }
   
   
   }
   
   
      
    }
    
}
