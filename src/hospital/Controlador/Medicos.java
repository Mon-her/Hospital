package hospital.Controlador;

import hospital.MedicoL;
import hospital.Vista.MedicoV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Medicos implements ActionListener{

    private MedicoV Vista;

    public Medicos(final MedicoV Vista) {
        this.Vista = Vista;
        //Agrego la acción de escucha para cada botón.
        this.Vista.btnRegistrar.addActionListener(this);

        //Asigno la actividad que va a desarrollar cada botón.
        this.Vista.btnRegistrar.setActionCommand("Registrar");
       
        }

    public Medicos() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    

    public void registrar() {
        MedicoL t = new MedicoL();
        int d = Integer.parseInt(Vista.txtDocumento.getText());
        t.setDocumento(d);
        t.setNombre(Vista.txtNombre.getText());
        t.setApellido(Vista.txtApellido.getText());
        System.gc();
    

    }


}
