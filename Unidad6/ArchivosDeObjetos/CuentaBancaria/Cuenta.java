package Unidad6.ArchivosDeObjetos.CuentaBancaria;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Write a description of class Cuenta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cuenta implements Serializable
{
    private int numero;
    private String titular;
    private double saldoInicial;
    private double saldo;
    
    public Cuenta(int numero, String titular, double saldoInicial){
        this.numero = numero;
        this.titular = titular;
        this.saldoInicial = saldoInicial;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void setSaldoInicial(double saldoIncial){
        this.saldoInicial = saldoInicial;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public double getSaldoInicial(){
        return saldoInicial;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double monto){
        if(saldo>=monto){
            saldo = saldo + monto;
        }
    }
    
    public void retirar(double monto){
        if(saldo>=monto){
            saldo = saldo - monto;
        }else{
            JOptionPane.showMessageDialog(null, "NO se puede retirar saldo, fondos insuficientes");
        }
    }
    
    public String toString(){
        return "\nDatos de la cuenta: "+
               "\nNumero " + numero +
               "\nTitular " + titular +
               "\nSaldo incicial" + saldoInicial +
               "\nSaldo " + saldo;
               
    }
}
