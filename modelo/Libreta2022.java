package modelo;

import javax.swing.JOptionPane;

public class Libreta2022 extends Banco
{
    public double saldo;
    public double intereses;

    public Libreta2022(double sal , double inte)
    {
        this.saldo = sal;
        this.intereses = inte;
    }
    public Libreta2022()
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
        double z = (saldo - x);
        saldo = saldo - z -(z * 0.02);

        return saldo;
    }

    public double calcularIntereses()
    {
        intereses = (saldo * 0.08);
        return intereses;
    }
}
