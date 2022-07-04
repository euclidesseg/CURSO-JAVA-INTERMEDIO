
package clases;

import java.util.Scanner;
public class ClaseRetiro extends Cajero{
   
    private double retiro;
        
    public  ClaseRetiro(double retiro) {
        this.retiro = retiro;
    }
        
    public double getRetiro(){
        return retiro;
    }
        
    @Override
    public double getSaldo(){
      saldo = saldo - retiro;
      return saldo;
    }
    @Override
    public String getOperacion(){
        return "\n--------------------------------------" +
               "\n    SU RETIRO FUE DE: " + retiro +
               "\n    SU SALDO ES: " + getSaldo() +
               "\n--------------------------------------" ;
    }
} 
