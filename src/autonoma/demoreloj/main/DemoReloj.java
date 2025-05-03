/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.demoreloj.main;

import autonoma.demoreloj.models.Reloj;

/**
 *
*  @author Heily Yohana Rios Ayala <heilyy.riosa@gmail.com>
 * @since 20250503
 * @version 1.0.0
 */
public class DemoReloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reloj reloj = new Reloj(02,14,00,0);
        
        reloj.start();
    }
    
}
