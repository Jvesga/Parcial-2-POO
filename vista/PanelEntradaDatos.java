package vista;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
        //---------------------------
    // Atributos 
    //---------------------------
    private JLabel lbTitulo;
    private JLabel lbSaldo;
    private JLabel lbIntereses;
    private JLabel lbRetirar;
    private JLabel lbAgregarSaldo;
    public JComboBox cbCuenta;
    private static javax.swing.JTextField tfAgregarSaldo;
    private static javax.swing.JTextField tfRetirarSaldo;

    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelEntradaDatos()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.red);

        lbTitulo = new JLabel("BANCO DAVIPOO", JLabel.CENTER);
        lbTitulo.setFont(new Font("Arial",Font.BOLD,20));
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setBounds(0,30,300,30);
        this.add(lbTitulo);

        lbSaldo= new JLabel("Saldo: ");
        lbSaldo.setForeground(Color.WHITE);
        lbSaldo.setBounds(60,50,250,50);
        this.add(lbSaldo);
        
        lbIntereses = new JLabel("Intereses: ");
        lbIntereses.setForeground(Color.WHITE);
        lbIntereses.setBounds(60,85,480,30);
        this.add(lbIntereses);

        lbAgregarSaldo = new JLabel("Depositar: ");
        lbAgregarSaldo.setForeground(Color.WHITE);
        lbAgregarSaldo.setBounds(60,115,480,30);
        this.add(lbAgregarSaldo);

        lbRetirar = new JLabel("Retirar: ");
        lbRetirar.setForeground(Color.WHITE);
        lbRetirar.setBounds(60,145,480,30);
        this.add(lbRetirar);


        tfAgregarSaldo = new JTextField();
        tfAgregarSaldo.setForeground(Color.BLACK);
        tfAgregarSaldo.setBounds(150,115,190,25);
        this.add(tfAgregarSaldo);

        tfRetirarSaldo= new JTextField();
        tfRetirarSaldo.setForeground(Color.BLACK);
        tfRetirarSaldo.setBounds(150,145,190,25);
        this.add(tfRetirarSaldo);
        
    
        cbCuenta = new JComboBox<>();
        cbCuenta.setBounds(300,40,150,20);
        this.add(cbCuenta);

        cbCuenta.addItem("Corriente");
        cbCuenta.addItem("Ahorros");
        cbCuenta.addItem("Libreta2022");

        //Borde y titulo
         TitledBorder borde = BorderFactory.createTitledBorder("Datos de cuenta");
         borde.setTitleColor(Color.BLACK);
         this.setBorder(borde);
 
    }

    //Metodos de acceso a la información
    public static String getTfsaldo()
    {
        return tfAgregarSaldo.getText();
    }

    public static String getTfRetiro()
    {
        return tfRetirarSaldo.getText();
    }
    //Metodo para borrar las cajas de texto
    public static void borrar()
    {
        tfAgregarSaldo.setText("");
        tfRetirarSaldo.setText("");
        PanelResultados.taResultado.setText("");
    }

}
