package uniandes.dpoo.swing.interfaz.agregar;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelEditarRestaurante extends JPanel
{
    /**
     * El campo para que el usuario ingrese el nombre del restaurante
     */
    private JTextField txtNombre;

    /**
     * Un selector (JComboBox) para que el usuario seleccione la calificación (1 a 5) del restaurante
     */
    private JComboBox<String> cbbCalificacion;

    /**
     * Un selector (JComboBox) para que el usuario indique si ya visitó el restaurante o no
     */
    private JComboBox<String> cbbVisitado;

    public PanelEditarRestaurante( )
    {
        // Crea el campo para el nombre con una etiqueta al frente
        // TODO completar
    	JLabel nombre = new JLabel("Nombre");
        txtNombre = new JTextField();
        // Crea el selector para la calificación con una etiqueta al frente
        // TODO completar
        JLabel calificacion = new JLabel("Calificación");
        String[] cs = { "1", "2", "3", "4", "5" };
        cbbCalificacion = new JComboBox<>(cs);
        // Crea el selector para indicar si ya ha sido visitado, con una etiqueta al frente
        // TODO completar
        JLabel visitado = new JLabel("Visitado");
        String[] vs = { "Si", "No" };
        cbbVisitado = new JComboBox<>(vs);
        // Agregar todos los elementos al panel
        // TODO completar
        add(nombre);
        add(txtNombre);
        add(calificacion);
        add(cbbCalificacion);
        add(visitado);
        add(cbbVisitado);
        

    }

    /**
     * Indica si en el selector se seleccionó la opción que dice que el restaurante fue visitado
     * @return
     */
    public boolean getVisitado( )
    {
        // TODO completar
        return false;
    }

    /**
     * Indica la calificación marcada en el selector
     * @return
     */
    public int getCalificacion( )
    {
        String calif = ( String )cbbCalificacion.getSelectedItem( );
        return Integer.parseInt( calif );
    }

    /**
     * Indica el nombre digitado para el restaurante
     * @return
     */
    public String getNombre( )
    {
        // TODO completar
        return txtNombre.getText();
    }
}
