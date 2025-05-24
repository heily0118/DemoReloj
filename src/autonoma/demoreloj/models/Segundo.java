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
  

    public Segundo(Minuto minuto) {
        this.minuto = minuto;
        this.segundos = 0;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                segundos++;
                if (segundos >= 60) {
                    segundos = 0;
                    minuto.incrementar();
                }
            } catch (InterruptedException e) {
               
                break;
            }
        }
    }

     public void detener() {
        this.interrupt();  
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Minuto getMinuto() {
        return minuto;
    }

    public void setMinuto(Minuto minuto) {
        this.minuto = minuto;
    }


    
}

