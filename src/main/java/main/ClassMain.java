
package main;

import clases.Cajero;
import clases.ClaseRetiro;
import clases.ClaseDeposito;
import clases.consultarDinero;
import java.util.Scanner;

public class ClassMain{
    static Scanner datos =  new Scanner(System.in);
    
    public static void main(String args[]){
      usarCajero();
    }
    
    public static void usarCajero(){
        int respuesta = 1;
        int opcion;
        do{
            do{
               System.out.println("QUE TRENSACCION DESEA REALIZAR");
               System.out.println("      1: CONSULTAR SALDO");
               System.out.println("      2: RETIRAR DINERO");
               System.out.println("      3: DEPOSITAR DINERO");
               System.out.println("      4: SALIR");  
               opcion = datos.nextInt();
            
                switch(opcion){
                    case 1: consultarSaldo();
                        break;
                    case 2: retirarDinero();
                        break;
                    case 3: depositarDinero();
                        break;
                    case 4: 
                        System.out.println("-----------------------------------------------");
                        System.out.println("GRACIAS POR USAR NUESTRO SERVICIO VUELVE PRONTO");
                        System.out.println("-----------------------------------------------");
                        opcion = 4;
                        break;
                    default: System.out.println("POR FAVOR ESCOJE UN APCION VALIDA ");
                        break; 
                }
            }while(opcion < 1 || opcion > 4);
            
            if(opcion == 4){
                respuesta = 0;
            }else{
                System.out.println("DESEA SEGUIR USANDO ESTE CAJERO: " + "\n PRECIONE: " +"\n 1 PARA SI. "  + "\n 0 PARA SALIR");
                respuesta = datos.nextInt();
                if(respuesta == 0){
                    System.out.println("-----------------------------------------------");
                    System.out.println("GRACIAS POR USAR NUESTRO SERVICIO VUELVE PRONTO");
                    System.out.println("-----------------------------------------------");               
                }
            }
        }while(respuesta == 1);    

    }
    /* metodo que me ayudara a retirar el dinero al ser un metodo estatico le pertenece solamente a esta clase
     * usando asi un miembro estarico, sabemos que los miembros estaticos de una clase no solo son las variables,
     * si no tambien los metodos.
    */
    public static void retirarDinero(){
        double dinero;
        System.out.println("CUANTO DINERO DESEA RETIRAR?");
        dinero = datos.nextDouble();
        
        ClaseRetiro retiro = new ClaseRetiro(dinero );
        System.out.println(retiro.getOperacion());
    }
    public static void depositarDinero(){
        double deposito;
        System.out.println("CUANTO DINERO DESEA DEPOSITAR");
        deposito = datos.nextDouble();
        
        ClaseDeposito deposito1 = new ClaseDeposito(deposito);
        System.out.println(deposito1.getOperacion());

    }
    public static void consultarSaldo(){
        consultarDinero consultar = new consultarDinero();
        System.out.println(consultar.getOperacion());
    }
}
