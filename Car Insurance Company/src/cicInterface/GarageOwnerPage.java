/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

/**
 *
 * @author george
 */
public class GarageOwnerPage extends javax.swing.JFrame {

    /**
     * Creates new form GarageOwnerPage
     */
    public GarageOwnerPage() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        GarageInbox_MenuItem = new javax.swing.JMenuItem();
        Outbox_MenuItem = new javax.swing.JMenuItem();
        Claims_MenuItem = new javax.swing.JMenu();
        PendingClaims_MenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Logout_MenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Messages");

        GarageInbox_MenuItem.setText("Inbox");
        GarageInbox_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GarageInbox_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(GarageInbox_MenuItem);

        Outbox_MenuItem.setText("Outbox");
        Outbox_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Outbox_MenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(Outbox_MenuItem);

        jMenuBar1.add(jMenu1);

        Claims_MenuItem.setText("Claims");

        PendingClaims_MenuItem.setText("Pending Claims");
        PendingClaims_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PendingClaims_MenuItemActionPerformed(evt);
            }
        });
        Claims_MenuItem.add(PendingClaims_MenuItem);

        jMenuBar1.add(Claims_MenuItem);

        jMenu2.setText("Logged");

        Logout_MenuItem.setText("Logout");
        Logout_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_MenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(Logout_MenuItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Outbox_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Outbox_MenuItemActionPerformed
        GarageOutboxPage garageOutboxPage=new GarageOutboxPage();
                garageOutboxPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Outbox_MenuItemActionPerformed

    private void GarageInbox_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GarageInbox_MenuItemActionPerformed
        GarageInboxPage garageInboxPage=new GarageInboxPage();
                garageInboxPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_GarageInbox_MenuItemActionPerformed

    private void PendingClaims_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PendingClaims_MenuItemActionPerformed
        PendingClaimsPage pendingPage=new PendingClaimsPage();
                pendingPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_PendingClaims_MenuItemActionPerformed

    private void Logout_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_MenuItemActionPerformed
        LoginPage loginPage=new LoginPage();
                loginPage.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_Logout_MenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(GarageOwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GarageOwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GarageOwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GarageOwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GarageOwnerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Claims_MenuItem;
    private javax.swing.JMenuItem GarageInbox_MenuItem;
    private javax.swing.JMenuItem Logout_MenuItem;
    private javax.swing.JMenuItem Outbox_MenuItem;
    private javax.swing.JMenuItem PendingClaims_MenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
