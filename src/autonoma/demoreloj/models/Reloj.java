package autonoma.demoreloj.models;

/**
 * 
 * @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */
public class Reloj {
    private Hora hora;
    private Minuto minutos;
    private Segundo segundos;

    public Reloj(int h, int m, int s) {
        this.hora = new Hora();
        this.hora.setHora(h);
        this.minutos = new Minuto(this.hora); 
        this.minutos.setMinutos(m);

        this.segundos = new Segundo(this.minutos); 
        this.segundos.setSegundos(s);
    }

   
    public void iniciar() {
        hora.start();
        minutos.start();
        segundos.start();
    }

    
    public void detener() {
        segundos.detener();
        minutos.detener();
        hora.detener();
    }

   
  public String getHoraActual() {
    String h = (hora.getHora() < 10) ? "0" + hora.getHora() : "" + hora.getHora();
    String m = (minutos.getMinutos() < 10) ? "0" + minutos.getMinutos() : "" + minutos.getMinutos();
    String s = (segundos.getSegundos() < 10) ? "0" + segundos.getSegundos() : "" + segundos.getSegundos();
    return h + ":" + m + ":" + s;
}

    // Getters y setters

    public Hora getHora() {
        return hora;
    }

    public Minuto getMinutos() {
        return minutos;
    }

    public Segundo getSegundos() {
        return segundos;
    }

 
}
