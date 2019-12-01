package hospital.Controlador;

import hospital.PersonaL;
import hospital.Vista.PersonaVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Personas implements ActionListener{

    private PersonaVista Vista;

    public Personas(final PersonaVista Vista) {
        this.Vista = Vista;
        //Agrego la acción de escucha para cada botón.
        this.Vista.btnRegistrar.addActionListener(this);

        //Asigno la actividad que va a desarrollar cada botón.
        this.Vista.btnRegistrar.setActionCommand("Registrar");
       
        }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

    public void registrar() {
        PersonaL t = new PersonaL();
        int d = Integer.parseInt(Vista.txtTelefono.getText());
        t.setTelefono(d);
        t.setNombre(Vista.txtNombre.getText());
        t.setApellido(Vista.txtApellido.getText());
        t.setDireccion(Vista.txtDireccion.getText());
        System.gc();
    

    }


}
