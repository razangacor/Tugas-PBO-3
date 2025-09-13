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
public class konversiSuhu {
    int c,f,r;
    
    public Integer celciousToFahrenheit(int c){
        f =  (9*c/5)+ 32;
        System.out.println(c+" celcius = "+f+" fahrenheit");
        return f;
    }
    
    public Integer celciousToReamur(int c){
        r =  4*c/5;
        System.out.println(c+" celcius = "+r+" reamur");
        return r;
    }
    
}
