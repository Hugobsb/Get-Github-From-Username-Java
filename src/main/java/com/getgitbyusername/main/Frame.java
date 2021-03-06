/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getgitbyusername.main;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author HUGOBASTOSDASILVABEN
 */
public class Frame extends javax.swing.JFrame {

    /**
     * Creates new form Frame
     */
    
    ConnectionFactory connection;
    
    public Frame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsernameTip = new javax.swing.JLabel();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPicture = new javax.swing.JLabel();
        jLabelPublicRepositories = new javax.swing.JLabel();
        jLabelFollowers = new javax.swing.JLabel();
        jLabelFollowing = new javax.swing.JLabel();
        jLabelHireable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GetGitByUsername");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setName("GetGitByUsername"); // NOI18N

        jLabelUsernameTip.setText("Username");

        jTextFieldSearch.setToolTipText("Username");
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jButtonOk.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonOk.setText("ok");
        jButtonOk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOkMouseClicked(evt);
            }
        });

        jLabelUsername.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText("Username");

        jLabelPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelPublicRepositories.setText("Public Repositories: ");

        jLabelFollowers.setText("Followers: ");

        jLabelFollowing.setText("Following: ");

        jLabelHireable.setText("Hireable: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelUsername)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch)
                        .addGap(10, 10, 10)
                        .addComponent(jButtonOk)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHireable)
                            .addComponent(jLabelPublicRepositories)
                            .addComponent(jLabelFollowers)
                            .addComponent(jLabelFollowing)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelUsernameTip))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelUsernameTip)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabelUsername)
                .addGap(18, 18, 18)
                .addComponent(jLabelPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabelPublicRepositories)
                .addGap(10, 10, 10)
                .addComponent(jLabelFollowers)
                .addGap(10, 10, 10)
                .addComponent(jLabelFollowing)
                .addGap(10, 10, 10)
                .addComponent(jLabelHireable)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jTextFieldSearch.getAccessibleContext().setAccessibleName("jTextFieldUsername");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOkMouseClicked
        handleUserSearch();
    }//GEN-LAST:event_jButtonOkMouseClicked

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
       if (evt.getKeyCode() == 10) handleUserSearch();
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void handleUserSearch() {
        connection = new ConnectionFactory(jTextFieldSearch.getText());
        
        try {
            URL url = new URL((String) connection.getObject().get("avatar_url"));
            Image image = ImageIO.read(url);
            jLabelPicture.setIcon(new ImageIcon(image));
        } catch (MalformedURLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jLabelUsername.setText(connection.getObject().getString("login"));
        jLabelPublicRepositories.setText("Public Repositories: "+connection.getObject().get("public_repos"));
        jLabelFollowers.setText("Followers: "+connection.getObject().get("followers"));
        jLabelFollowing.setText("Following: "+connection.getObject().get("following"));
        jLabelHireable.setText("Hireable: "+connection.getObject().get("hireable"));
    }
    
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
                System.out.println(info.getName());
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelFollowers;
    private javax.swing.JLabel jLabelFollowing;
    private javax.swing.JLabel jLabelHireable;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPublicRepositories;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelUsernameTip;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
