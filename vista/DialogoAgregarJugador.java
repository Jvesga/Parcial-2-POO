package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

import java.awt.Font;

public class DialogoAgregarJugador extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreJugador;
    private JTextField tfNombreJugador;
    private JButton btAgregarJugador;

    //----------------------
    // Metodos
    //----------------------
    public DialogoAgregarJugador()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreJugador = new JLabel("Jugador: ");
        lbNombreJugador.setFont(new Font("Comic sans",Font.BOLD,15));
        lbNombreJugador.setBounds(10,50,140,20);
        this.add(lbNombreJugador);

        tfNombreJugador = new JTextField();
        tfNombreJugador.setBounds(150,50,100, 25);
        this.add(tfNombreJugador);

        btAgregarJugador = new JButton("Agregar");
        btAgregarJugador.setBounds(20,140,260,25);
        btAgregarJugador.setActionCommand("agregar");
        this.add(btAgregarJugador);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Jugador");
        this.setSize(300,230);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreJugador()
    {
        return tfNombreJugador.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarJugador.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarJugador()
    {
        this.dispose();
    }
}
