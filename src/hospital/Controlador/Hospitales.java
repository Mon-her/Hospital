/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Controlador;
import hospital.Vista.HospitalV;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author sala
 */
public class Hospitales implements ActionListener {

    HospitalV vista;

    public Hospitales(HospitalV vista) {
        this.vista = vista;

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
