package modelo;

public abstract class Banco
{

    public abstract void depositar();

    public abstract double retirar();

    public abstract double calcularIntereses();

    public String toString()
    {
        return("Los intereses son " + calcularIntereses());
    }
}