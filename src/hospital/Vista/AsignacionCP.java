/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.Vista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sala
 */
public class AsignacionCP extends javax.swing.JInternalFrame{
public static final String URL = "jdbc:mysql://localhost:3306/hospital";
public static final String USERNAME="root";
public static final String PASSWORD="";
public static String  telefono=null; 
PreparedStatement ps;
ResultSet rs;
public static Connection getConection(){
    Connection con=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con=(Connection) DriverManager.getConnection(URL , USERNAME, PASSWORD);
    } catch (Exception e){
        System.out.println(e.getMessage());
    }
    return con;
    }
    /**
     * Creates new form Asignacion1
     */
public void asignar(){
    Connection con=null;
    try{
        con=getConection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("Select id from medico");
        cbxMedico.removeAllItems();
        while(rs.next()){
        cbxMedico.addItem(rs.getString(1));     
        }
}
catch(Exception e){
    
            }
    
}
public void cargarTabla(String id){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Nombre");
             model.addColumn("Apellido");
             tabla.setModel(model);
             String sql="SELECT * FROM medico where id="+id;
             String[] dato=new String[2];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              dato[1]=rs.getString(2);

             model.addRow(dato);
             }
            tabla.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
public void llenarCita(){
     com.mysql.jdbc.Connection con=null;
        try {
            con= (com.mysql.jdbc.Connection)getConection();
            ps= con.prepareStatement("UPDATE persona SET tipo_cita=3 WHERE telefono="+telefono);
             int res=ps.executeUpdate();
           
            if (res>0){
                JOptionPane.showMessageDialog(null, "Puede pasar a su cita");
            }
            else {
                JOptionPane.showMessageDialog(null,"Error"); 
            }
            
            con.close();
        }
         catch (Exception e){
             System.err.println(e);
         }
    
         } 
        

    public AsignacionCP() {
        initComponents();
        asignar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxMedico = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnConfirmarMedico = new javax.swing.JButton();

        cbxMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxMedicoMouseClicked(evt);
            }
        });
        cbxMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicoActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla);

        btnConfirmarMedico.setText("Confirmar");
        btnConfirmarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnConfirmarMedico)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(cbxMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmarMedico)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicoActionPerformed
       
    }//GEN-LAST:event_cbxMedicoActionPerformed

    private void cbxMedicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMedicoMouseClicked
        cargarTabla(cbxMedico.getSelectedItem().toString()); 
    }//GEN-LAST:event_cbxMedicoMouseClicked

    private void btnConfirmarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarMedicoActionPerformed
    llenarCita();
    }//GEN-LAST:event_btnConfirmarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnConfirmarMedico;
    public javax.swing.JComboBox cbxMedico;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
