/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demoreloj.models;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */
public class Hora extends Thread {
    private int hora;

    public Hora() {
        this.hora = 0;
    }

    public void incrementar() {
        hora++;
        if (hora >= 24) {
            hora = 0;
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3600 * 1000);
                incrementar();
            } catch (InterruptedException e) {
              
                break;
            }
        }
    }

    public void detener() {
        this.interrupt();  
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    
}
