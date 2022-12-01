package vista;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbJugador;
    private JLabel lbEquipo;

    private static JComboBox cbJugador;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta empleados
        lbEquipo = new JLabel("Equipo Real Tapitas ", JLabel.RIGHT);
        lbEquipo.setFont(new Font("arial",Font.BOLD, 20));
        lbEquipo.setBounds(40,10,250,60);
        this.add(lbEquipo);

        lbJugador = new JLabel("Jugadores: ", JLabel.RIGHT);
        lbJugador.setFont(new Font("arial",Font.BOLD, 15));
        lbJugador.setBounds(0,70,100,20);
        this.add(lbJugador);

        //Crear y agregar combo lista Empleados
        cbJugador = new JComboBox();
        cbJugador.setBounds(100,70,260,20);
        this.add(cbJugador);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    //Metodos de acceso
    public static String getJugador()
    {
        return (String) cbJugador.getSelectedItem();
    }

    public int getIndexJugador()
    {
        return cbJugador.getSelectedIndex();
    }

    public void setJugador(String emp)
    {
        cbJugador.addItem(emp);
    }
}
