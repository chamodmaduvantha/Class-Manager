/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class_ms;


import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Hp
 */
public class RoomAdd extends javax.swing.JFrame {

    /**
     * Creates new form RoomAdd
     */
    public RoomAdd() {
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

        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRoomid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFeez = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboFeesType = new javax.swing.JComboBox();
        txtClassId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 640, 10));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setText("Add Room");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Room ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 167, -1, -1));

        txtRoomid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtRoomid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomidActionPerformed(evt);
            }
        });
        getContentPane().add(txtRoomid, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 164, 262, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/add.png"))); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 411, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/close Jframe.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 411, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Class ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 208, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Feez");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 305, -1, -1));

        txtFeez.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtFeez, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 302, 192, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Feez Type");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 261, -1, -1));

        ComboFeesType.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ComboFeesType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Daily", "Monthly" }));
        getContentPane().add(ComboFeesType, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 258, 192, -1));

        txtClassId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClassId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClassIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtClassId, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 205, 262, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/class_ms/SBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoomidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
                String roomid =txtRoomid.getText();
                String classid =txtClassId.getText();
                String feezType =ComboFeesType.getSelectedItem().toString();
                String feez =txtFeez.getText();
                
               try{
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                ResultSet rsRoomid=st.executeQuery("select * from class where class_id='"+classid+"'");
               
                if(rsRoomid.next())
                {
                PreparedStatement ps=con.prepareStatement("insert into room value(?,?,?,?)");
                ps.setString(1, roomid);
                ps.setString(2, classid);
                ps.setString(3, feezType);
                ps.setString(4, feez);
                
                ps.executeUpdate();
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Successfully Update");
                this.setVisible(false);
                new RoomAdd().setVisible(true);
                }
                
                else{
                 JFrame jf=new JFrame();
                 jf.setAlwaysOnTop(true);
                 JOptionPane.showMessageDialog(jf,"Class ID is Invalied");
                }
                   
               }
               catch(Exception e)
               {
                 JFrame jf=new JFrame();
                 jf.setAlwaysOnTop(true);
                 JOptionPane.showConfirmDialog(jf,e);
               }
                
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtClassIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClassIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClassIdActionPerformed

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
            java.util.logging.Logger.getLogger(RoomAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboFeesType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtClassId;
    private javax.swing.JTextField txtFeez;
    private javax.swing.JTextField txtRoomid;
    // End of variables declaration//GEN-END:variables
}
