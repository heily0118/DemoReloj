package autonoma.demoreloj.models;

/**
 *
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.>
 * @since 20250503
 * @version 1.0.0
 */
public class Segundo extends Thread {
    private int segundos;
    private Minuto minuto;
    private volatile boolean running = true;  

    public Segundo(Minuto minuto) {
        this.minuto = minuto;
        this.segundos = 0;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
                segundos++;
                if (segundos >= 60) {
                    segundos = 0;
                    minuto.incrementar();
                }
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
}
