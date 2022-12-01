package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class PanelparaImagen extends JPanel {


    private JLabel lbImagen;
    private ImageIcon iImagen;

    public PanelparaImagen()
    {
//Creación y adición de imagen al panel
        iImagen = new ImageIcon(getClass().getResource("/vista/jesus.jpeg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,80,80);
        this.add(lbImagen);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Furbol");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

}