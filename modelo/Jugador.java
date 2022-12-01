package modelo;

import java.util.ArrayList;

public class Jugador
{
    //----------------------
    // Atributos
    //----------------------

    private String nombre;
    private ArrayList ventas;
    private int Gol;

    //----------------------
    // Metodos
    //----------------------


    public Jugador(String pNombre)
    {
        this.nombre = pNombre;
        this.ventas = new ArrayList();
        this.Gol = 0;
    }

    public int getGol()
    {
        return this.Gol;
    }

    public void setGol(int pGol)
    {
        this.Gol = pGol;
    }


    public void MarcarGol()
    {
    setGol(getGol()+5);

    }

    public String getNombre()
    {
        return nombre;
    }

}