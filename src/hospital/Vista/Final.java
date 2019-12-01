/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital.Vista;

import static hospital.Vista.VistaDatosUsuario.getConection;
import static hospital.Vista.VistaDatosUsuario.telefono;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sala
 */
public class Final extends javax.swing.JInternalFrame {
public static final String URL = "jdbc:mysql://localhost:3306/hospital";
public static final String USERNAME="root";
public static final String PASSWORD="";
public static String  telefono=null; 
public static String id=null;
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
     * Creates new form FinalV
     */
    public Final() {
        initComponents();
        cargarTablac();
        cargarTablac1();
        cargarTablac2();
        cargarTablac3();
        cargarTablac4();
        cargarTablac5();
        cargarTablac6();
        cargarTablac7();
        cargarTablav();
        cargarTablav1();
        cargarTablav2();
        cargarTablav3();
        cargarTablav4();
        cargarTablav5();
        cargarTablav6();
        cargarTablav7();
        cargarTablaTp();
        cargarTablaTv();
        cargarTablaProm();
     }
    
    public void cargarTablac(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Tm.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=1";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tm.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablac1(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             To.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=2";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            To.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablac2(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Tp.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=3";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tp.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    public void cargarTablac3(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Te.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=4";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Te.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablac4(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Tu.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=5";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tu.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    public void cargarTablac6(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Tpri.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=6";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tpri.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablac7(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Tex.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=7";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tex.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    public void cargarTablac5(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Cantidad de pacientes");
             
             Tno.setModel(model);
             String sql="select count(tipo_cita) from persona where tipo_cita=8";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tno.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    
    
    public void cargarTablav(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvm.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=1;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvm.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablav1(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvo.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=2;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvo.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    public void cargarTablav2(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvp.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=3;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvp.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablav3(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tve.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=4;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tve.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablav4(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvu.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=5;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvu.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablav5(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvno.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=6;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvno.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablav6(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvpri.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=7;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvpri.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablav7(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvex.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita and tipo_cita=8;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvex.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablaTp(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Total pacientes");
             
             TPac.setModel(model);
             String sql="select count(tipo_cita) from persona";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            TPac.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablaTv(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             Tvalor.setModel(model);
             String sql=" select sum(valor) as valor  from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            Tvalor.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    public void cargarTablaProm(){
         Connection con=null;
         try{
             con=getConection();
             DefaultTableModel model=new DefaultTableModel();
             model.addColumn("Valor");
             
             TProm.setModel(model);
             String sql="select sum(valor)/count(tipo_cita) as valor from tipos_citas inner join persona where tipos_citas.id_citas=persona.tipo_cita;";
             String[] dato=new String[1];
             Statement st=con.createStatement();
             ResultSet rs=st.executeQuery(sql);
             while(rs.next()){
              dato[0]=rs.getString(1);
              
              

             model.addRow(dato);
             }
            TProm.setModel(model);
         }
         catch (Exception e){
             System.err.println(e);
         } 
        }
    
    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tm = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Tvm = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        To = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tp = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Te = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tpri = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tno = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        Tex = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        Tu = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        Tvex = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        Tvpri = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        Tvu = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        Tve = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        Tvno = new javax.swing.JTable();
        jScrollPane17 = new javax.swing.JScrollPane();
        Tvp = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        Tvo = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        TPac = new javax.swing.JTable();
        jScrollPane19 = new javax.swing.JScrollPane();
        Tvalor = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        TProm = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Tm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane2.setViewportView(Tm);

        jLabel1.setText("Cita Medica");

        jLabel2.setText("Cita Odontologica");

        jLabel3.setText("Cita Prioritaria");

        jLabel4.setText("Urgencias");

        jLabel5.setText("Emergencia");

        jLabel6.setText("Urgencia No Vital");

        jLabel7.setText("Urgencia Prioritaria");

        jLabel8.setText("Consulta Externa");

        Tvm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane11.setViewportView(Tvm);

        To.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane3.setViewportView(To);

        Tp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane4.setViewportView(Tp);

        Te.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane5.setViewportView(Te);

        Tpri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane6.setViewportView(Tpri);

        Tno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane7.setViewportView(Tno);

        Tex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane8.setViewportView(Tex);

        Tu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Cantidad de pacientes"
            }
        ));
        jScrollPane9.setViewportView(Tu);

        Tvex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane12.setViewportView(Tvex);

        Tvpri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane13.setViewportView(Tvpri);

        Tvu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane14.setViewportView(Tvu);

        Tve.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane15.setViewportView(Tve);

        Tvno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane16.setViewportView(Tvno);

        Tvp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane17.setViewportView(Tvp);

        Tvo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Valor"
            }
        ));
        jScrollPane18.setViewportView(Tvo);

        TPac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Total Pacientes"
            }
        ));
        jScrollPane10.setViewportView(TPac);

        Tvalor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Total Valor"
            }
        ));
        jScrollPane19.setViewportView(Tvalor);
        if (Tvalor.getColumnModel().getColumnCount() > 0) {
            Tvalor.getColumnModel().getColumn(0).setResizable(false);
        }

        TProm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Promedio"
            }
        ));
        jScrollPane20.setViewportView(TProm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jLabel7)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(179, 179, 179)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(180, 180, 180)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(166, 166, 166)
                                    .addComponent(jLabel3)))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel6)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(518, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TPac;
    public javax.swing.JTable TProm;
    public javax.swing.JTable Te;
    public javax.swing.JTable Tex;
    public javax.swing.JTable Tm;
    public javax.swing.JTable Tno;
    public javax.swing.JTable To;
    public javax.swing.JTable Tp;
    public javax.swing.JTable Tpri;
    public javax.swing.JTable Tu;
    public javax.swing.JTable Tvalor;
    public javax.swing.JTable Tve;
    public javax.swing.JTable Tvex;
    public javax.swing.JTable Tvm;
    public javax.swing.JTable Tvno;
    public javax.swing.JTable Tvo;
    public javax.swing.JTable Tvp;
    public javax.swing.JTable Tvpri;
    public javax.swing.JTable Tvu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
