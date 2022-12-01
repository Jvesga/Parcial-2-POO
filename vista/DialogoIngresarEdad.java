package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class DialogoIngresarEdad extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbEdad;
    private JLabel lbNombreJugador;
    private JTextField tfEdad;
    private JButton btDarEdad;

    //----------------------
    // Metodos
    //----------------------
    public DialogoIngresarEdad()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        String nombre = vista.PanelEntradaDatos.getJugador();
        lbNombreJugador = new JLabel("Jugador: " + nombre);
        lbNombreJugador.setFont(new Font("Comic sans",Font.BOLD,15));
        lbNombreJugador.setForeground(Color.black);
        lbNombreJugador.setBounds(100,15,240,20);
        this.add(lbNombreJugador);

        lbEdad = new JLabel("Edad: ");
        lbEdad.setFont(new Font("Comic sans",Font.BOLD,13));
        lbEdad.setBounds(90,65,140,20);
        this.add(lbEdad);

        tfEdad = new JTextField();
        tfEdad.setBounds(140,65,100, 25);
        this.add(tfEdad);

        btDarEdad = new JButton("Agregar");
        btDarEdad.setBounds(20,140,260,25);
        btDarEdad.setActionCommand("vender");
        this.add(btDarEdad);

        //Caracteristicas de la ventana
        this.setTitle("Edad Jugador");
        this.setSize(300,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getEdadJugador()
    {
        return tfEdad.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btDarEdad.addActionListener(pAL);
    }

    public void cerrarDialogoEdadJugador()
    {
        this.dispose();
    }

}
