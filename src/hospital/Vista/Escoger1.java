/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Vista;

/**
 *
 * @author sala
 */
public class Escoger1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Escoger
     */
    public Escoger1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUrgencia = new javax.swing.JButton();
        btnCitaMedica = new javax.swing.JButton();
        btnCitaPrioritaria = new javax.swing.JButton();
        btnCitaOdontolo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnUrgencia.setText("Urgencia");
        btnUrgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUrgenciaActionPerformed(evt);
            }
        });

        btnCitaMedica.setText("Cita médica");
        btnCitaMedica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaMedicaActionPerformed(evt);
            }
        });

        btnCitaPrioritaria.setText("Cita prioritaria");
        btnCitaPrioritaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaPrioritariaActionPerformed(evt);
            }
        });

        btnCitaOdontolo.setText("Cita odontológica");
        btnCitaOdontolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaOdontoloActionPerformed(evt);
            }
        });

        jLabel1.setText("Escoja el tipo de cita");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCitaMedica)
                            .addComponent(btnUrgencia)
                            .addComponent(btnCitaPrioritaria)
                            .addComponent(btnCitaOdontolo))))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnUrgencia)
                .addGap(18, 18, 18)
                .addComponent(btnCitaMedica)
                .addGap(18, 18, 18)
                .addComponent(btnCitaPrioritaria)
                .addGap(18, 18, 18)
                .addComponent(btnCitaOdontolo)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitaMedicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaMedicaActionPerformed
        Asignacion vent=new Asignacion();
     Hospital.Escritorios.add(vent);
     vent.toFront();
     vent.setVisible(true);
     this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnCitaMedicaActionPerformed

    private void btnUrgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUrgenciaActionPerformed
     UrgenciasV vent=new UrgenciasV();
     Hospital.Escritorios.add(vent);
     vent.toFront();
     vent.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnUrgenciaActionPerformed

    private void btnCitaPrioritariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaPrioritariaActionPerformed
        AsignacionCP vent=new AsignacionCP();
     Hospital.Escritorios.add(vent);
     vent.toFront();
     vent.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnCitaPrioritariaActionPerformed

    private void btnCitaOdontoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaOdontoloActionPerformed
       Asignacion2 vent=new Asignacion2();
     Hospital.Escritorios.add(vent);
     vent.toFront();
     vent.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_btnCitaOdontoloActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitaMedica;
    private javax.swing.JButton btnCitaOdontolo;
    private javax.swing.JButton btnCitaPrioritaria;
    private javax.swing.JButton btnUrgencia;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
