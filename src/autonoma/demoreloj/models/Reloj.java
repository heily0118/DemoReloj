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
public class Reloj  {
    private Hora hora;
    private Minuto minutos;
    private Segundo segundos;
    private long timeStamp;

    public Reloj(Hora hora, Minuto minutos, Segundo segundos, long timeStamp) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.timeStamp = timeStamp;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Minuto getMinutos() {
        return minutos;
    }

    public void setMinutos(Minuto minutos) {
        this.minutos = minutos;
    }

    public Segundo getSegundos() {
        return segundos;
    }

    public void setSegundos(Segundo segundos) {
        this.segundos = segundos;
    }



    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
    
 
}
