/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_ms;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Hp
 */
public class ReportRoom extends javax.swing.JFrame {

    /**
     * Creates new form ReportRoom
     */
    public ReportRoom() {
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

        jPanel1 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSearch1 = new javax.swing.JButton();
        btnSearch2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(285, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Room Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Viner Hand ITC", 3, 18))); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnSearch)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, -1, 88));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Class ID", "Fees Type", "Fees"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 344, 199));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/save.png"))); // NOI18N
        jButton6.setText("Print");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 403, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Class Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Viner Hand ITC", 3, 18))); // NOI18N

        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/search.png"))); // NOI18N
        btnSearch1.setText("Search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        btnSearch2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/search.png"))); // NOI18N
        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(btnSearch2)
                .addGap(582, 582, 582)
                .addComponent(btnSearch1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch1)
                    .addComponent(btnSearch2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 92, 344, 88));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Grade", "Class Day", "Class Time"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 186, 344, 199));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/save.png"))); // NOI18N
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 403, -1, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setText("Room & Class Reports");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 10, 470, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 770, 10));

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/close Jframe.png"))); // NOI18N
        jButton8.setText("Close");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/Reset.png"))); // NOI18N
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/SBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        

        //Get table to data
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();

            ResultSet rsCheck=st.executeQuery("select * from room ");
            if(rsCheck.next()){

            }
            else{
                //lblTittle.setText("Wrong Room ID.. Please enter correct details!");
                JOptionPane.showMessageDialog(null,"No Data in hear");

            }

            ResultSet rsTableStu=st.executeQuery("select * from room ");

            while(rsTableStu.next()){
                //String no=String.valueOf(rsTable.getInt("id"));
                String roomid= rsTableStu.getString("room_id");
                String classid= rsTableStu.getString("class_id");
                String feeztype= rsTableStu.getString("fezz_type");
                String feez=rsTableStu.getString("feez");
                

                String tbData[]= {roomid,classid,feeztype,feez};
                DefaultTableModel tableModel=(DefaultTableModel)jTable1.getModel();
                tableModel.addRow(tbData);

            }
            con.close();

            //lblTittle.setText("You are going to mark Room No: " +roomid+ " / " +"Month: "+ComboMonth.getSelectedItem()+" / "+ "Year: " +ComboYear.getSelectedItem());
            btnSearch.setVisible(false);
            

        }
        catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Connection Error!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classms","root","");
            JasperDesign jdesDesign = JRXmlLoader.load("src\\class_ms\\reportRoom.jrxml");

            String query = "select * from room";
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);

            jdesDesign.setQuery(updateQuery);

            JasperReport jrepoReport = JasperCompileManager.compileReport(jdesDesign);
            JasperPrint jprint = JasperFillManager.fillReport(jrepoReport, null,con);

            JasperViewer.viewReport(jprint,false);
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classms","root","");
            JasperDesign jdesDesign = JRXmlLoader.load("src\\class_ms\\reportClass.jrxml");

            String query = "select * from class";
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);

            jdesDesign.setQuery(updateQuery);

            JasperReport jrepoReport = JasperCompileManager.compileReport(jdesDesign);
            JasperPrint jprint = JasperFillManager.fillReport(jrepoReport, null,con);

            JasperViewer.viewReport(jprint,false);
            
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        } 
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        
        //Get table to data
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();

            ResultSet rsCheck=st.executeQuery("select * from class ");
            if(rsCheck.next()){

            }
            else{
                //lblTittle.setText("Wrong Room ID.. Please enter correct details!");
                JOptionPane.showMessageDialog(null,"No Data in hear");

            }

            ResultSet rsTableStu=st.executeQuery("select * from class ");

            while(rsTableStu.next()){
                //String no=String.valueOf(rsTable.getInt("id"));
                String classid= rsTableStu.getString("class_id");
                String gradde= rsTableStu.getString("grade");
                String classday= rsTableStu.getString("class_day");
                String classtime=rsTableStu.getString("class_time");
                

                String tbData[]= {classid,gradde,classday,classtime};
                DefaultTableModel tableModel=(DefaultTableModel)jTable2.getModel();
                tableModel.addRow(tbData);

            }
            con.close();

            //lblTittle.setText("You are going to mark Room No: " +roomid+ " / " +"Month: "+ComboMonth.getSelectedItem()+" / "+ "Year: " +ComboYear.getSelectedItem());
            btnSearch1.setVisible(false);
            

        }
        catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Connection Error!");
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        // TODO add your handling code here:
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();

            ResultSet rsCheck=st.executeQuery("select * from class ");
            if(rsCheck.next()){

            }
            else{
                //lblTittle.setText("Wrong Room ID.. Please enter correct details!");
                JOptionPane.showMessageDialog(null,"No Data in hear");

            }

            ResultSet rsTableStu=st.executeQuery("select * from class ");

            while(rsTableStu.next()){
                //String no=String.valueOf(rsTable.getInt("id"));
                String classid= rsTableStu.getString("class_id");
                String grade= rsTableStu.getString("grade");
                String classday= rsTableStu.getString("class_day");
                String classtime=rsTableStu.getString("class_time");
                

                String tbData[]= {classid,grade,classday,classtime};
                DefaultTableModel tableModel=(DefaultTableModel)jTable2.getModel();
                tableModel.addRow(tbData);

            }
            con.close();

            //lblTittle.setText("You are going to mark Room No: " +roomid+ " / " +"Month: "+ComboMonth.getSelectedItem()+" / "+ "Year: " +ComboYear.getSelectedItem());
            btnSearch2.setVisible(false);
            

        }
        catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Connection Error!");
        }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ReportRoom().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(ReportRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
