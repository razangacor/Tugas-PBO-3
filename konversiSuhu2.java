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
public class konversiSuhu2 extends konversiSuhu {
    public Integer fahrenheitToReamur(int f){
        r = 4*(f-32)/9;
        System.out.println(f+" fahrenheit = "+r+" reamur");
        
        return r;
    }
}
