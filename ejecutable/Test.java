package ejecutable;

import controlador.Controlador;
import modelo.Jugador;
import modelo.Equipo;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {

        VentanaPrincipal miVentana = new VentanaPrincipal();
        Equipo miEmpresa = new Equipo();
        Controlador miControlador = new Controlador(miVentana, miEmpresa);
    }    
}