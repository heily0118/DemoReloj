package autonoma.demoreloj.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */
public class Minuto extends Thread {
    private int minutos;
    private Hora hora; 
    private volatile boolean running = true;

    public Minuto(Hora hora) {
        this.hora = hora;
        this.minutos = 0;
    }

    /**
     * Incrementa los minutos y si llega a 60, reinicia y avisa a la hora.
     */
    public void incrementar() {
        minutos++;
        if (minutos >= 60) {
            minutos = 0;
            hora.incrementar();
        }
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(60 * 1000); 
                incrementar();
            } catch (InterruptedException e) {
                running = false;
                break;
            }
        }
    }

    public void detener() {
        running = false;
        this.interrupt();
    }

    public int getMinutos() {
        return minutos;
    }
    
    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }
}
