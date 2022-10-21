package Unidad2.Cuenta;


/**
 * Write a description of class Cuenta here.
 *
 * @author (Leonardo Contreras Martinez)
 * @version (a version number or a date)
 */
public class Cuenta
{
    private int numeroCuenta;
    private String titular;
    private double saldo;
    
    public Cuenta(int numeroCuenta, String titular, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void depositar(double monto){
        saldo +=monto;
    }
    
    public boolean retirar(double monto){
        if(saldo > monto){
            saldo = saldo - monto;
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return "Numero de cuenta " + numeroCuenta + " Titular " + titular + " Saldo de la cuenta " + saldo;
    }
}
