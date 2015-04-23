/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

import cicSrc.Application;
import cicSrc.Claim;



/**
 *
 * @author george
 */
public class NewClaimsPage extends javax.swing.JFrame {

    /**
     * Creates new form NewClaimsPage
     */
    public static int pendingClaimsNumber=0;
    public static String[] pendingClaims=new String[10];
    
    public NewClaimsPage() {
        initComponents();
        if (Application.NewClaims>0){
            this.NewClaims_Label.setVisible(true);
            this.ShowClaim_Button.setVisible(true);
            this.NoNewClaims_Label.setVisible(false);
        }
        else {
            this.NewClaims_Label.setVisible(false);
            this.ShowClaim_Button.setVisible(false);
            this.NoNewClaims_Label.setVisible(true);
        
        }
        this.jTable1.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NoNewClaims_Label = new javax.swing.JLabel();
        NewClaims_Label = new javax.swing.JLabel();
        ShowClaim_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToPage_Button = new javax.swing.JButton();
        Proceed_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NoNewClaims_Label.setText("No new claims reported!");

        NewClaims_Label.setText("New claim reported!");

        ShowClaim_Button.setText("Show Claim");
        ShowClaim_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowClaim_ButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Claims", "Name", "Surname", "Location", "Date", "Cost Of Damage", "Move To Pending"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        BackToPage_Button.setText("Back To Page");
        BackToPage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPage_ButtonActionPerformed(evt);
            }
        });

        Proceed_Button.setText("Proceed");
        Proceed_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceed_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ShowClaim_Button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewClaims_Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
                        .addComponent(NoNewClaims_Label)
                        .addGap(66, 66, 66))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 728, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackToPage_Button)
                    .addComponent(Proceed_Button))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewClaims_Label)
                    .addComponent(NoNewClaims_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ShowClaim_Button)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Proceed_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(BackToPage_Button)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowClaim_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowClaim_ButtonActionPerformed
        // TODO add your handling code here:
        ReportClaimPage reportClaim=new ReportClaimPage();
        this.jTable1.setVisible(true);
        int i=reportClaim.first;
        boolean EmptyRowFound=false;
        while (i<reportClaim.last)
        {
            int j=0;
            EmptyRowFound=false;
            while ((j<4)&&(EmptyRowFound==false)){
                if(this.jTable1.getModel().getValueAt(j, 0)==null){
                     jTable1.getModel().setValueAt("Claim" + " " + i, j, 0);
                     jTable1.getModel().setValueAt(reportClaim.newClaim[i].claimantName, j, 1);
                     jTable1.getModel().setValueAt(reportClaim.newClaim[i].claimantSurname, j, 2);
                     jTable1.getModel().setValueAt(reportClaim.newClaim[i].claimantLocation, j, 3);
                     jTable1.getModel().setValueAt(reportClaim.newClaim[i].claimDate, j, 4);
                     jTable1.getModel().setValueAt(reportClaim.newClaim[i].claimCostOfDmg, j, 5);
                     EmptyRowFound=true;
                     
                
        
                }
                else {
                    j++;
                
                }
                
            }
            i++;
            
            
        }
        reportClaim.first=reportClaim.last;
       
    }//GEN-LAST:event_ShowClaim_ButtonActionPerformed

    private void BackToPage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPage_ButtonActionPerformed
        // TODO add your handling code here:
        LoginPage login = new LoginPage();
        if (login.userRole == "EmployeeOfCD")
        {
            EmployeeOfCDPage e = new EmployeeOfCDPage();
            e.setVisible(true);
            this.setVisible(false);
        }
        
        else if (login.userRole == "ClaimHandlerA")
        {
            ClaimHandlerAPage chA = new ClaimHandlerAPage();
            chA.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BackToPage_ButtonActionPerformed

    private void Proceed_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceed_ButtonActionPerformed
        // TODO add your handling code here:
        for (int i=0;i<4;i++){
            Boolean val=(Boolean)this.jTable1.getModel().getValueAt(i, 6);
            if(val){
                PendingClaimsPage pendingPage=new PendingClaimsPage();
                pendingClaims[pendingClaimsNumber]=(String)this.jTable1.getModel().getValueAt(i, 0);
                pendingClaimsNumber++;
                
                
                
                for (int j=0;j<7;j++){
                   jTable1.getModel().setValueAt(null, i, j); 
                
                }
                Application.NewClaims--;
            
            }
        
        
        }
    }//GEN-LAST:event_Proceed_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewClaimsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewClaimsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPage_Button;
    private javax.swing.JLabel NewClaims_Label;
    private javax.swing.JLabel NoNewClaims_Label;
    private javax.swing.JButton Proceed_Button;
    private javax.swing.JButton ShowClaim_Button;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
