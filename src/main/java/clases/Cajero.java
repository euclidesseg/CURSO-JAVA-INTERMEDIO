
package clases;
 
public abstract class Cajero {
    
    protected static double saldo = 500;

    public double getSaldo(){
        return saldo;
    }
    
    public abstract String getOperacion();
}
