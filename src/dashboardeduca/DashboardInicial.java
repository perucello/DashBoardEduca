/**
EducaCienciaFastCode
For Community
**/
package DashBoardEduca;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DashboardInicial extends javax.swing.JFrame {

    public DashboardInicial() {
        initComponents();
        setIconImage();
        configurarFormulario();
        
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButtonAcaoEduca = new javax.swing.JButton();
        jButtonGith = new javax.swing.JButton();
        jButtonCLOSE = new javax.swing.JButton();
        jButtonAcaoEduca1 = new javax.swing.JButton();
        jButtonAcaoEduca2 = new javax.swing.JButton();
        jButtonAcaoEduca3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/Educaciencia - 200p.jpg"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(50, 10, 200, 95);

        jButtonAcaoEduca.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoEduca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoEduca.setText("Dashboard Dev");
        jButtonAcaoEduca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoEducaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoEduca);
        jButtonAcaoEduca.setBounds(50, 160, 210, 30);

        jButtonGith.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGith.setText("GithDesktop");
        jButtonGith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGithActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGith);
        jButtonGith.setBounds(70, 550, 140, 23);

        jButtonCLOSE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/exit.png"))); // NOI18N
        jButtonCLOSE.setText("SAIR");
        jButtonCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLOSEActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCLOSE);
        jButtonCLOSE.setBounds(80, 440, 150, 50);

        jButtonAcaoEduca1.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoEduca1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoEduca1.setText("Dashboard Files");
        jButtonAcaoEduca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoEduca1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoEduca1);
        jButtonAcaoEduca1.setBounds(50, 210, 210, 30);

        jButtonAcaoEduca2.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoEduca2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoEduca2.setText("Dashboard Links");
        jButtonAcaoEduca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoEduca2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoEduca2);
        jButtonAcaoEduca2.setBounds(50, 260, 210, 30);

        jButtonAcaoEduca3.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoEduca3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoEduca3.setText("Dashboard Youtube");
        jButtonAcaoEduca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoEduca3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoEduca3);
        jButtonAcaoEduca3.setBounds(50, 310, 210, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcaoEducaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoEducaActionPerformed
        DashboardDev files = new DashboardDev();
        files.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonAcaoEducaActionPerformed

    private void jButtonGithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGithActionPerformed
        String file = "explorer C:/Users/Usuario/AppData/Local/GitHubDesktop/GitHubDesktop.exe";
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardInicial.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Gith !", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonGithActionPerformed

    private void jButtonCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLOSEActionPerformed
        JOptionPane.showMessageDialog(null, "Confirme para encerrar !", "Dashboard EducaCiência", JOptionPane.YES_OPTION);
        dispose();
    }//GEN-LAST:event_jButtonCLOSEActionPerformed

    private void jButtonAcaoEduca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoEduca1ActionPerformed
        DashboardFiles dev = new DashboardFiles();
        dev.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAcaoEduca1ActionPerformed

    private void jButtonAcaoEduca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoEduca2ActionPerformed
        DashboardWeb web = new DashboardWeb();
        web.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAcaoEduca2ActionPerformed

    private void jButtonAcaoEduca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoEduca3ActionPerformed
        DashboardPlayList list = new DashboardPlayList();
        list.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAcaoEduca3ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardInicial().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonAcaoEduca;
    private javax.swing.JButton jButtonAcaoEduca1;
    private javax.swing.JButton jButtonAcaoEduca2;
    private javax.swing.JButton jButtonAcaoEduca3;
    private javax.swing.JButton jButtonCLOSE;
    private javax.swing.JButton jButtonGith;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

        
    private void setIconImage(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icodev.png")));
        
    }
private void configurarFormulario(){
    this.setTitle("EducaCiência"); //titulo
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    }

}
