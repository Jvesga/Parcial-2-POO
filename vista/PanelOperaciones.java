package vista;

import java.awt.Color;
import java.awt.Font;
import static java.awt.Font.BOLD;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
        //----------------------
    //Atributos
    //----------------------
    public JButton btAgregarSaldo;
    public JButton btRetirarSaldo;
    public JButton btBorrar;
    public JButton btSalir;

    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.gray);
        
        //Creación y adicion de los botones
        btAgregarSaldo = new JButton("Crear libro");
        btAgregarSaldo.setBounds(5,22,100,40);
        btAgregarSaldo.setActionCommand("crearLibro");
        this.add(btAgregarSaldo);

        btRetirarSaldo = new JButton("Crear Coleccion");
        btRetirarSaldo.setBounds(110,22,100,40);
        btRetirarSaldo.setActionCommand("crearColeccion");
        this.add(btRetirarSaldo);

        btBorrar = new JButton("Borrar");
        btBorrar.setBounds(320,22,100,40);
        btBorrar.setActionCommand("borrar");
        this.add(btBorrar);
        
        btSalir = new JButton("Salir");
        btSalir.setBounds(425,22,100,40);
        btSalir.setActionCommand("salir");
        this.add(btSalir);
        
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }

}
