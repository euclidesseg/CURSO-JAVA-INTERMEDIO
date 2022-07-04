
package clases;

public class ClaseDeposito extends Cajero{
    
    protected double deposito;
    
    public ClaseDeposito(double deposito){
        this.deposito = deposito;
    }
    public double getDeposito(){
        return deposito;
    }
    @Override
    public double getSaldo() {
        saldo = saldo + deposito;
        return saldo;
    }  
    @Override
    public String getOperacion(){
        return "\n--------------------------------------" +
               "\n    SU DEPOSITO FUE DE: " + deposito +
               "\n    SU SALDO ES: " + getSaldo() +
               "\n--------------------------------------" ;
    }
    }
