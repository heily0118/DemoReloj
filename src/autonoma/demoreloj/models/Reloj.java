/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demoreloj.models;


/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250503
 * @version 1.0.0
 */
public class Reloj extends Thread {
    private int hora;
    private int minutos;
    private int segundos;
    private long timeStamp;

    public Reloj(int hora, int minutos, int segundos,long timeStamp) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.timeStamp= timeStamp;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
    
        
   @Override
    public void run(){
            while (true) {
          try {
              Thread.sleep(1000); 
          } catch (InterruptedException e) {
              System.out.println("El reloj fue interrumpido.");
              break; 
          }

          segundos++;
          if (segundos >= 60) {
              segundos = 0;
              minutos++;
          }

          if (minutos >= 60) {
              minutos = 0;
              hora++;
          }

          if (hora >= 24) {
              hora = 0;
          }

          
          timeStamp = (hora * 3600 + minutos * 60 + segundos) * 1000L;

        
         System.out.println("Hora actual: " + hora + ":" + minutos + ":" + segundos);
      }

    }
    
}
