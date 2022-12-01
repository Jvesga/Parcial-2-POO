package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;
    public DialogoAgregarJugador miDialogoAgregarJugador = null;
    public DialogoIngresarEdad miDialogoIngresarEdad = null;
    public PanelparaImagen miPaneljesus; 
    
    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public VentanaPrincipal()
    {
        //Definición del layout de la ventana
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,370,100);
        this.add(miPanelEntradaDatos);

        miPaneljesus = new PanelparaImagen();
        miPaneljesus.setBounds(400,10,280,400);
        this.add(miPaneljesus);

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,120,370,120);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,250,370,170);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Empresa Automotriz");
        this.setSize(700,470);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Crear Dialogo AgregarVendedor
    public void crearDialogoAgregarJugador()
    {
        miDialogoAgregarJugador = new DialogoAgregarJugador();
    }

    //Crear Dialogo VenderCarro
    public void crearDialogoIngresarEdad()
    {
        miDialogoIngresarEdad = new DialogoIngresarEdad();
    }
}
