/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua (la
posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán
aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Eje02Entidades;


public class Revolver {
    
    private Integer XDispara;
    private Integer XPosicion;

    public Revolver() {
    }

    public Revolver(Integer XDispara, Integer XPosicion) {
        this.XDispara = XDispara;
        this.XPosicion = XPosicion;
    }

    public Integer getXDispara() {
        return XDispara;
    }

    public Integer getXPosicion() {
        return XPosicion;
    }

    public void setXDispara(Integer XDispara) {
        this.XDispara = XDispara;
    }

    public void setXPosicion(Integer XPosicion) {
        this.XPosicion = XPosicion;
    }

    @Override
    public String toString() {
        return "Revolver{" + "XDispara=" + XDispara + ", XPosicion=" + XPosicion + '}';
    }
   
    //METODOS
    
   public void Llenarrevolver(){

   int M = 10,N = 0;
    
    int numero = (int) Math.floor(Math.random()*(M-N)+1);
    this.setXDispara(numero);
    int numero2 = (int) Math.floor(Math.random()*(M-N)+1);
    this.setXPosicion(numero2);
    
      System.out.println(this.getXDispara());
     System.out.println(this.getXPosicion());
    
    }
   
   public boolean Mojar(){  //CAMBIO EL ARGUMENTO, VACIO, Y PONGO THIS EN SU LUGAR.

   boolean x =false;
   if (this.getXDispara()==(this.getXPosicion())) {
       x=true;
   } 
   else{  
          x=false; 
   }
   
  
   
   return x;
   
   }
   
   public void SiguienteChorro(){
      // Integer SiguienteD =0;
      
if(this.XDispara>0 & this.XDispara<10){
     this.XDispara += 1;} //LE SUMO UNO AL VALOR DE XDISPARA
else{
    this.XDispara=1; //LA INICIALIZO CUANDO LLEGA AL MAX 10, Y VUELVE A EMPEZAR DE CERO

}
     //SiguienteP= r3.XPosicion +1; NO SE MODIFICA PORQUE ES LA POSICION DONDE SE ENCUENTRA LA BALA
     
       //System.out.println(SiguienteD);
      // System.out.println(this.XPosicion);
     
   
   }
   
   public void Posiciones(){
   
       System.out.println("Las posiciones del revolver son: ");
       System.out.println(this.toString());
   
   
   
   
   
   }
   
  
}
