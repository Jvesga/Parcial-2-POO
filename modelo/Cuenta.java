package modelo;

import java.util.ArrayList;

public class Equipo
{
    //----------------------zz
    // Constantes
    //----------------------
    public final static int NUMERO_EMPLEADOS = 3;

    //----------------------
    // Atributos
    //----------------------

    //private Empleado[] empleados;
    private ArrayList jugadores;

    //----------------------
    // Metodos
    //----------------------
    public Equipo()
    {
        //empleados = new Empleado[NUMERO_EMPLEADOS];
        jugadores = new ArrayList();
    }

    public void agregarJugador(Jugador emp)
    {
        jugadores.add(emp);
    }

    public double calcularNomina()
    {
        double totalnomina = 0;
        for(int i=0; i<jugadores.size();i++)
        {
            Jugador temp = (Jugador) jugadores.get(i);
        }
        return totalnomina;
    }

    public Jugador getJugador(int i)
    {
        return (Jugador) jugadores.get(i);
    }

    public int getNumeroJugadores()
    {
        return jugadores.size();
    }
}