package modelo;

import javax.swing.JOptionPane;

public class Corriente extends Banco
{
    public double saldo;
    public double intereses;

    public Corriente(double sal , double inte)
    {
        this.saldo = sal;
        this.intereses = inte;
    }
    public Corriente()
    {
        this.saldo = 0;
        this.intereses = 0;
    }

    public void depositar()
    {
        JOptionPane.showInputDialog("Ingrese el saldo que desea consignar: ");

    }
    public double retirar()
    {
        double x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo que desea retirar: "));
        saldo = saldo - x;

        return saldo;
    }

    public double calcularIntereses()
    {
        intereses = (saldo * 0.04);
        return intereses;
    }    
}
