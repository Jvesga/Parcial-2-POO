package controlador;

import modelo.Jugador;
import modelo.Equipo;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener
{
    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;
    private Equipo empresa;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Equipo pEmpresa)
    {
        this.venPrin = pVenPrin;
        this.empresa = pEmpresa;
        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String comando = ae.getActionCommand();

        //Abrir ventana Agregar Jugador
        if(comando.equals("agregarVendedor"))
        {
            venPrin.crearDialogoAgregarJugador();
            this.venPrin.miDialogoAgregarJugador.agregarOyenteBoton(this);
        }

        //Agregar Jugador
        if(comando.equals("agregar"))
        {
            String nombre = venPrin.miDialogoAgregarJugador.getNombreJugador();
            empresa.agregarJugador(new Jugador(nombre));
            venPrin.miPanelEntradaDatos.setJugador(nombre);
            venPrin.miPanelResultados.mostrarResultado("Se ha agreado un nuevo Jugador. \nNombre: " + nombre);
            venPrin.miDialogoAgregarJugador.cerrarDialogoAgregarJugador();
        }

        //Abrir ventana de Ingresar Edad
        if(comando.equals("venderCarro"))
        {
            venPrin.crearDialogoIngresarEdad();
            this.venPrin.miDialogoIngresarEdad.agregarOyenteBoton(this);
        }

        //Ingresar Edad
        if(comando.equals("vender"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexJugador();

            String precio = venPrin.miDialogoIngresarEdad.getEdadJugador();

            Jugador emp = empresa.getJugador(indexVendedor);

            venPrin.miPanelResultados.mostrarResultado("El Jugador: " + emp.getNombre() + " tiene " + precio + " años" );
            venPrin.miDialogoIngresarEdad.cerrarDialogoEdadJugador();
            

        }

        //Calcular el sueldo de un vendedor
        if(comando.equals("calcularSueldo"))
        {
            int indexVendedor = venPrin.miPanelEntradaDatos.getIndexJugador();
            Jugador emple = empresa.getJugador(indexVendedor);
            emple.MarcarGol();
            venPrin.miPanelResultados.mostrarResultado("El jugador " + emple.getNombre() + " marco " + emple.getGol());
        }

        //Liquidar nomina total empresa
        if(comando.equals("liquidarNomina"))
        {
            double valorNomina = empresa.calcularNomina();
            String listaJugadores = "";
            for(int i=0; i<empresa.getNumeroJugadores(); i++)
            {
                listaJugadores = listaJugadores + empresa.getJugador(i).getNombre() + ": " + "\n";
            }
            venPrin.miPanelResultados.mostrarResultado("El valor total de la nómina es." + valorNomina + "\n" + listaJugadores);
        }


        //Salir
        if(comando.equals("salir"))
        {
            System.exit(0);
        }  
    }
}
