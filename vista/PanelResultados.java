package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{
        //---------------------------
    // Atributos 
    //---------------------------
    public static JTextArea taResultado;
    private JScrollPane spResultado;

    //---------------------------
    // Metodos
    //---------------------------

    //Metodo constructor
    public PanelResultados()
    {
        //Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.RED);

        //Creacion y edicion del area de texto
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(9,15,512,130);
        this.add(spResultado);

        //Borde y titulo
        TitledBorder borde = BorderFactory.createTitledBorder("Datos Resultados");
        borde.setTitleColor(Color.BLACK);
        this.setBorder(borde);
        
    }
    //Borrar
    public void borrar()
    {
        taResultado.setText("");
    }
    
    //Mostrar resultado
    public static void mostrarResultado(String texto)
    {
        taResultado.append(texto);
    }

    public void borrarTa()
    {
        taResultado.setText("");
    }
    public static void mostrarResultados(String string) {
    }

}
