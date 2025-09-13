/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demokonversisuhu;

/**
 *
 * @author Vivobook
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        konversiSuhu suhu1 = new konversiSuhu();
        
       suhu1.celciousToFahrenheit(31);
       suhu1.celciousToReamur(31);
        
        konversiSuhu2 suhu2 = new konversiSuhu2();
        suhu2.fahrenheitToReamur(100);
        
    }
    
}
