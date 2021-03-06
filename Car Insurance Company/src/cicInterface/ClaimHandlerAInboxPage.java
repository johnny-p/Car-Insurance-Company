/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicInterface;

import cicSrc.Application;

/**
 *
 * @author george
 */
public class ClaimHandlerAInboxPage extends javax.swing.JFrame {

    /**
     * Creates new form ClaimHandlerAInbox
     */
    public ClaimHandlerAInboxPage() {
        initComponents();
        if (Application.MessageToClaimHandlerA>0){
            this.NewMessage_Label.setVisible(true);
            this.ReadMessage_Button.setVisible(true);
            this.NoNewMessages_Label.setVisible(false);
        }
        else{
            this.NewMessage_Label.setVisible(false);
            this.ReadMessage_Button.setVisible(false);
            this.NoNewMessages_Label.setVisible(true);
        
        }
        this.From_Label.setVisible(false);
        this.SenderRole_TextField.setVisible(false);
        this.SenderName_TextField.setVisible(false);
        this.ReceivedMessage_TextArea.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ReceivedMessage_TextArea = new javax.swing.JTextField();
        ReadMessage_Button = new javax.swing.JButton();
        NoNewMessages_Label = new javax.swing.JLabel();
        NewMessage_Label = new javax.swing.JLabel();
        SenderName_TextField = new javax.swing.JTextField();
        From_Label = new javax.swing.JLabel();
        BackToPage_Button = new javax.swing.JButton();
        SenderRole_TextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Inbox");

        ReceivedMessage_TextArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReceivedMessage_TextAreaActionPerformed(evt);
            }
        });

        ReadMessage_Button.setText("Read Message");
        ReadMessage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReadMessage_ButtonActionPerformed(evt);
            }
        });

        NoNewMessages_Label.setForeground(new java.awt.Color(255, 0, 0));
        NoNewMessages_Label.setText("There are no new messages!");

        NewMessage_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NewMessage_Label.setText("You have a new message!");

        SenderName_TextField.setText("jTextField1");

        From_Label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        From_Label.setText("From");

        BackToPage_Button.setText("Back To Page");
        BackToPage_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToPage_ButtonActionPerformed(evt);
            }
        });

        SenderRole_TextField.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BackToPage_Button)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NewMessage_Label)
                                    .addGap(39, 39, 39)
                                    .addComponent(NoNewMessages_Label))
                                .addComponent(jLabel1)
                                .addComponent(ReceivedMessage_TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ReadMessage_Button)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(From_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SenderRole_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SenderName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewMessage_Label)
                    .addComponent(NoNewMessages_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReadMessage_Button)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenderRole_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(From_Label)
                    .addComponent(SenderName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ReceivedMessage_TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(BackToPage_Button)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReceivedMessage_TextAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReceivedMessage_TextAreaActionPerformed
       
    }//GEN-LAST:event_ReceivedMessage_TextAreaActionPerformed

    private void ReadMessage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReadMessage_ButtonActionPerformed
        

        if (Application.MessageFromClaimant>0){
            ClaimantOutboxPage claimantOutbox=new ClaimantOutboxPage();
            this.SenderRole_TextField.setText("Claimant");
            this.SenderName_TextField.setText(claimantOutbox.claimantName);//change after CustomerRecordsPage
            this.ReceivedMessage_TextArea.setText(claimantOutbox.claimantMessage);
            Application.MessageFromClaimant--;
            Application.MessageToClaimHandlerA--;

        }
        else if(Application.MessageFromFinanceDeptEmployee>0) {
            FinanceDeptEmployeeOutboxPage financeOutbox=new FinanceDeptEmployeeOutboxPage();
            this.SenderRole_TextField.setText("FinanceDeptEmployee");
            this.SenderName_TextField.setText(financeOutbox.financeDeptEmployeeName);//change after CustomerRecordsPage
            this.ReceivedMessage_TextArea.setText(financeOutbox.financeDeptEmployeeMessage);
            Application.MessageFromFinanceDeptEmployee--;
            Application.MessageToClaimHandlerA--;

        }
        else if(Application.MessageFromGarage>0) {
            GarageOutboxPage garageOutbox=new GarageOutboxPage();
            this.SenderRole_TextField.setText("Garage Owner");
            this.SenderName_TextField.setText(garageOutbox.garageOwnerName);//change after CustomerRecordsPage
            this.ReceivedMessage_TextArea.setText(garageOutbox.garageOwnerMessage);
            Application.MessageFromGarage--;
            Application.MessageToClaimHandlerA--;
        }
        this.From_Label.setVisible(true);
        this.SenderRole_TextField.setVisible(true);
        this.SenderName_TextField.setVisible(true);
        this.ReceivedMessage_TextArea.setVisible(true);

    }//GEN-LAST:event_ReadMessage_ButtonActionPerformed

    private void BackToPage_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToPage_ButtonActionPerformed
        ClaimHandlerAPage chAPage=new ClaimHandlerAPage();
        chAPage.setVisible(true);

        this.dispose();

    }//GEN-LAST:event_BackToPage_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ClaimHandlerAInboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaimHandlerAInboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaimHandlerAInboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaimHandlerAInboxPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClaimHandlerAInboxPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToPage_Button;
    private javax.swing.JLabel From_Label;
    private javax.swing.JLabel NewMessage_Label;
    private javax.swing.JLabel NoNewMessages_Label;
    private javax.swing.JButton ReadMessage_Button;
    private javax.swing.JTextField ReceivedMessage_TextArea;
    private javax.swing.JTextField SenderName_TextField;
    private javax.swing.JTextField SenderRole_TextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
