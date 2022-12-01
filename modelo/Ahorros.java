package modelo;

import javax.swing.JOptionPane;

public class Ahorros extends Banco
{
    public double saldo;
    public double intereses;

    public Ahorros(double sal , double inte)
    {
        this.saldo = sal;
        this.intereses = inte;
    }
    public Ahorros()
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