/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Design;

/**
 *
 * @author USER
 */
import java.util.*;
public class Train_time extends javax.swing.JFrame {

    /**
     * Creates new form Train_time
     */
    public Train_time() {
        initComponents();
    }
    
   /* public class user {
    public String Train;
    public String From;
    public String To;
    public String Time;
    
    public user (String Train, String From, String To,String Time  ){
         this.Time =Time;
         this.From=From;
         this.To=To;
         this.Train=Train;
        }
    }
    public ArrayList ListUsers()
    {
        ArrayList<user> list =new ArrayList<user>(); 
        user u1= new user("Sonar Bangla","Dhaka","Chittagong","7.00");
        user u =new user ("","","","");
        
        
        
        return list;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trainTime = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trainTime.setFont(new java.awt.Font("Sitka Small", 3, 24)); // NOI18N
        trainTime.setForeground(new java.awt.Color(51, 51, 51));
        trainTime.setText("  Train Time");
        trainTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(trainTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 200, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sonar Bangla", "Dhaka", "Chittagong", "7.00"},
                {"Mahanagar Provati", "Dhaka", "Chittagong", "7.45"},
                {"Mahanagar Express", "Dhaka", "Chittagong", "21.00"},
                {"Turna Express", "Dhaka", "Chittagong", "23.30"},
                {"Turna Express", "Chittagong", "Dhaka", "03.00"},
                {"Mahanagar Provati", "Chittagong ", "Dhaka", "15.00"},
                {"Sonar Bangla", "Chittagong", "Dhaka", "17.00"},
                {"Mahanagar Express ", "Chittagong", "Dhaka", "11.00"},
                {"Sundorban Express", "Dhaka", "Khulna", "6.20"},
                {"Chitra", "Dhaka", "Khulna", "19.00"},
                {"Chitra", "Khulna", "Dhaka", "8.40"},
                {"Sundorban Express", "Khulna", "Dhaka", "20.30"},
                {"Parabat Express", "Dhaka", "Sylhet", "6.35"},
                {"Parabat Express", "Sylhet", "Dhaka", "15.00"},
                {"Dhumkatu Express", "Dhaka", "Rajshahi", "6.00"},
                {"Silkcity", "Dhaka", "Rajshahi", "14.40"},
                {"Padma express", "Dhaka", "Rajshahi", "23.10"},
                {"Dhumkatu Express", "Rajshahi", "Dhaka", "23.30"},
                {"Padma Express", "Rajshahi", "Dhaka", "16.00"},
                {"Silkcity ", "Rajshahi", "Dhaka", "7.40"},
                {"Rangpur Express", "Dhaka", "Ranhgpur", "09.00"},
                {"Rangpur Express", "Rangpur ", "Dhaka", "20.20"}
            },
            new String [] {
                "Train Name", "Where From", "Where To", "Time"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 1130, 380));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 160, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
         Homepage.main(new String[0]);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Train_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Train_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Train_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Train_time.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Train_time().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel trainTime;
    // End of variables declaration//GEN-END:variables
}
