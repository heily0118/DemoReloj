/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.demoreloj.main;

import autonoma.demoreloj.models.Reloj;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@autonoma.edu.co>
 * @since 20250503
 * @version 1.0.0
 */
public class DemoReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
      Reloj reloj = new Reloj(2,34,12);
      reloj.getHora().start();
      reloj.getMinutos().start();
      reloj.getSegundos().start();

      while (true) {
          System.out.println("Hora actual : " + reloj.getHoraActual());
          Thread.sleep(1000);  
      }
  }

    
}
