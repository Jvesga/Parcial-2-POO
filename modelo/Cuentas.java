package modelo;

public abstract class Cuentas
{

    public abstract void depositar();

    public abstract double retirar();

    public abstract double calcularIntereses();

    public String toString()
    {
        return("Los intereses son " + calcularIntereses());
    }
}