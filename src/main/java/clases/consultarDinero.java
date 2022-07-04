
package clases;

public class consultarDinero extends Cajero{

  
    @Override
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public String getOperacion() {
       return "\n--------------------------------------" +
               "\n    SU SALDO ES: " + saldo +
               "\n--------------------------------------" ;
    }
    
}
