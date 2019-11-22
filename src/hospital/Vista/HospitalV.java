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
public class HospitalV extends javax.swing.JFrame {

    /**
     * Creates new form Hospital
     */
    public HospitalV() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        Escritorios = new javax.swing.JDesktopPane();
        scrollPaneTabla = new javax.swing.JScrollPane();
        tablaMuestra = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Medicos = new javax.swing.JMenu();
        Asig = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Persona = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaMuestra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaneTabla.setViewportView(tablaMuestra);

        Escritorios.setLayer(scrollPaneTabla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritoriosLayout = new javax.swing.GroupLayout(Escritorios);
        Escritorios.setLayout(EscritoriosLayout);
        EscritoriosLayout.setHorizontalGroup(
            EscritoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        EscritoriosLayout.setVerticalGroup(
            EscritoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritoriosLayout.createSequentialGroup()
                .addContainerGap(380, Short.MAX_VALUE)
                .addComponent(scrollPaneTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        Escritorio.setLayer(Escritorios, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Escritorios)
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorios, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Medicos.setText("Medicos");
        Medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicosActionPerformed(evt);
            }
        });

        Asig.setText("Asignacion ");
        Asig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsigActionPerformed(evt);
            }
        });
        Medicos.add(Asig);

        jMenuBar1.add(Medicos);

        jMenu1.setText("Persona");

        Persona.setText("Registrar persona");
        Persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonaActionPerformed(evt);
            }
        });
        jMenu1.add(Persona);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicosActionPerformed
    
    }//GEN-LAST:event_MedicosActionPerformed

    private void AsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsigActionPerformed
      MedicoV ventana=new MedicoV();
      Escritorio.add(ventana);
      ventana.show();
    }//GEN-LAST:event_AsigActionPerformed

    private void PersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonaActionPerformed
        PersonaVista vent=new PersonaVista();
        Escritorio.add(vent);
        vent.show();
    }//GEN-LAST:event_PersonaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HospitalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Asig;
    private javax.swing.JDesktopPane Escritorio;
    public static javax.swing.JDesktopPane Escritorios;
    private javax.swing.JMenu Medicos;
    private javax.swing.JMenuItem Persona;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane scrollPaneTabla;
    public static javax.swing.JTable tablaMuestra;
    // End of variables declaration//GEN-END:variables
}
