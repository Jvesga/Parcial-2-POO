package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
 
    public JButton btHallar;
    public JButton btBorrar;
    public JButton btSalir;

   

   
    public PanelOperaciones()
    {
        
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        
        btHallar = new JButton("Consignar");
        btHallar.setBounds(30,40,100,40);
        this.add(btHallar);
        btHallar.setActionCommand("Consignar");

        // crear y agregar boton borrar
        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(150,40,100,40);
        this.add(btBorrar);
        btBorrar.setActionCommand("Borrar");

        // crear y agregar boton salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(270,40,100,40);
        this.add(btSalir);
        btSalir.setActionCommand("Salir");

        //Borde y titulo al panel 
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.black);
        this.setBorder(borde);

    }
}