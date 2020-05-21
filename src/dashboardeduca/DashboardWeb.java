/**
EducaCienciaFastCode
For Community
**/
package DashBoardEduca;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DashboardWeb extends javax.swing.JFrame {


    public DashboardWeb() {
        initComponents();
        configurarFormulario();
        estadoControle(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jButtonAll = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButtonCLOSE = new javax.swing.JButton();
        jButtonAcaoWeb = new javax.swing.JButton();
        jButtonAcaoCursos = new javax.swing.JButton();
        jButtonGoogle10 = new javax.swing.JButton();
        jButtonAcaoJava = new javax.swing.JButton();
        jButtonAcaoDefinir = new javax.swing.JButton();
        jButtonGoogle1 = new javax.swing.JButton();
        jButtonAcaoDefinir1 = new javax.swing.JButton();
        jButtonGoogle4 = new javax.swing.JButton();
        jButtonGoogle3 = new javax.swing.JButton();
        jButtonJEP = new javax.swing.JButton();
        jButtonJDK = new javax.swing.JButton();
        jButtonJavaTutorial = new javax.swing.JButton();
        jButtonGoogle5 = new javax.swing.JButton();
        jButtonGoogle6 = new javax.swing.JButton();
        jButtonGoogle7 = new javax.swing.JButton();
        jButtonGoogle8 = new javax.swing.JButton();
        jButtonGoogle9 = new javax.swing.JButton();
        jButtonAzure = new javax.swing.JButton();
        jButtonMicrosoft = new javax.swing.JButton();
        jButtonGoogle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/Educaciencia - 200p.jpg"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(10, 10, 200, 95);

        jButtonAll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/all1-3.png"))); // NOI18N
        jButtonAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAllActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAll);
        jButtonAll.setBounds(360, 20, 80, 83);

        jButtonOK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/clearfilter.png"))); // NOI18N
        jButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonOK);
        jButtonOK.setBounds(480, 20, 210, 80);

        jButtonCLOSE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/exit.png"))); // NOI18N
        jButtonCLOSE.setText("SAIR");
        jButtonCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLOSEActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCLOSE);
        jButtonCLOSE.setBounds(730, 20, 170, 80);

        jButtonAcaoWeb.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoWeb.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoWeb.setText("WebDev");
        jButtonAcaoWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoWebActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoWeb);
        jButtonAcaoWeb.setBounds(30, 130, 220, 31);

        jButtonAcaoCursos.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoCursos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoCursos.setText("CursosOnline");
        jButtonAcaoCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoCursosActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoCursos);
        jButtonAcaoCursos.setBounds(280, 130, 190, 31);

        jButtonGoogle10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle10.setText("Google10");
        jButtonGoogle10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle10ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle10);
        jButtonGoogle10.setBounds(310, 320, 121, 23);

        jButtonAcaoJava.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoJava.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoJava.setText("Java");
        jButtonAcaoJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoJavaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoJava);
        jButtonAcaoJava.setBounds(500, 130, 150, 31);

        jButtonAcaoDefinir.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoDefinir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoDefinir.setText("A Definir");
        jButtonAcaoDefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoDefinirActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoDefinir);
        jButtonAcaoDefinir.setBounds(680, 130, 190, 31);

        jButtonGoogle1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle1.setText("Google1");
        jButtonGoogle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle1);
        jButtonGoogle1.setBounds(730, 200, 90, 23);

        jButtonAcaoDefinir1.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoDefinir1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoDefinir1.setText("A Definir");
        jButtonAcaoDefinir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoDefinir1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoDefinir1);
        jButtonAcaoDefinir1.setBounds(900, 130, 230, 31);

        jButtonGoogle4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle4.setText("Google 4");
        jButtonGoogle4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle4ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle4);
        jButtonGoogle4.setBounds(970, 200, 100, 23);

        jButtonGoogle3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle3.setText("Google3");
        jButtonGoogle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle3);
        jButtonGoogle3.setBounds(970, 170, 100, 23);

        jButtonJEP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJEP.setText("JEP");
        jButtonJEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJEPActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJEP);
        jButtonJEP.setBounds(540, 170, 80, 23);

        jButtonJDK.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJDK.setText("JDK");
        jButtonJDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJDKActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJDK);
        jButtonJDK.setBounds(540, 200, 80, 23);

        jButtonJavaTutorial.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJavaTutorial.setText("Tutorial");
        jButtonJavaTutorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJavaTutorialActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJavaTutorial);
        jButtonJavaTutorial.setBounds(540, 230, 80, 23);

        jButtonGoogle5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle5.setText("Google5");
        jButtonGoogle5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle5ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle5);
        jButtonGoogle5.setBounds(310, 170, 121, 23);

        jButtonGoogle6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle6.setText("Google6");
        jButtonGoogle6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle6ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle6);
        jButtonGoogle6.setBounds(310, 200, 121, 23);

        jButtonGoogle7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle7.setText("Google7");
        jButtonGoogle7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle7ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle7);
        jButtonGoogle7.setBounds(310, 230, 121, 23);

        jButtonGoogle8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle8.setText("Google8");
        jButtonGoogle8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle8ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle8);
        jButtonGoogle8.setBounds(310, 260, 121, 23);

        jButtonGoogle9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle9.setText("Google9");
        jButtonGoogle9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogle9ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle9);
        jButtonGoogle9.setBounds(310, 290, 121, 23);

        jButtonAzure.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAzure.setText("Azure");
        jButtonAzure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzureActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAzure);
        jButtonAzure.setBounds(70, 170, 140, 23);

        jButtonMicrosoft.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMicrosoft.setText("Microsoft");
        jButtonMicrosoft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMicrosoftActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMicrosoft);
        jButtonMicrosoft.setBounds(70, 200, 140, 23);

        jButtonGoogle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGoogle.setText("google");
        jButtonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogleActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGoogle);
        jButtonGoogle.setBounds(730, 170, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1189, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllActionPerformed
        estadoControleAll(true);
    }//GEN-LAST:event_jButtonAllActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        estadoControle(true);
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLOSEActionPerformed
        DashboardInicial inicial = new DashboardInicial();
        inicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCLOSEActionPerformed

    private void jButtonAcaoWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoWebActionPerformed
        estadoControleWeb(true);
    }//GEN-LAST:event_jButtonAcaoWebActionPerformed

    private void jButtonAcaoCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoCursosActionPerformed
        estadoControleCursos(true);
    }//GEN-LAST:event_jButtonAcaoCursosActionPerformed

    private void jButtonGoogle10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle10ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogle10ActionPerformed

    private void jButtonAcaoJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoJavaActionPerformed
        estadoControleJava(true);
    }//GEN-LAST:event_jButtonAcaoJavaActionPerformed

    private void jButtonAcaoDefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoDefinirActionPerformed
        estadoControleSysC(true);
    }//GEN-LAST:event_jButtonAcaoDefinirActionPerformed

    private void jButtonGoogle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle1ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        }         
    }//GEN-LAST:event_jButtonGoogle1ActionPerformed

    private void jButtonAcaoDefinir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoDefinir1ActionPerformed
        estadoControleEvolua(true);
    }//GEN-LAST:event_jButtonAcaoDefinir1ActionPerformed

    private void jButtonGoogle4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle4ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        }         
    }//GEN-LAST:event_jButtonGoogle4ActionPerformed

    private void jButtonGoogle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle3ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogle3ActionPerformed

    private void jButtonJEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJEPActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://openjdk.java.net/jeps/0" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJEPActionPerformed

    private void jButtonJDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJDKActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://openjdk.java.net/projects/jdk/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJDKActionPerformed

    private void jButtonJavaTutorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJavaTutorialActionPerformed
                try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://docs.oracle.com/javase/tutorial/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJavaTutorialActionPerformed

    private void jButtonGoogle6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle6ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); //digite o link do curso online aqui
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogle6ActionPerformed

    private void jButtonGoogle7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle7ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); //digite o link do curso online aqui
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogle7ActionPerformed

    private void jButtonGoogle8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle8ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); //digite o link do curso online aqui
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogle8ActionPerformed

    private void jButtonGoogle9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle9ActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); //digite o link do curso online aqui
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogle9ActionPerformed

    private void jButtonAzureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzureActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://portal.azure.com/#home" ) ); //digite o link do curso online aqui
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonAzureActionPerformed

    private void jButtonMicrosoftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMicrosoftActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://account.microsoft.com/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonMicrosoftActionPerformed

    private void jButtonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogleActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonGoogleActionPerformed

    private void jButtonGoogle5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogle5ActionPerformed
        try {
            try {
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.google.com.br/" ) );//digite o link do curso online aqui
            } catch (URISyntaxException ex) {
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonGoogle5ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardWeb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardWeb().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonAcaoCursos;
    private javax.swing.JButton jButtonAcaoDefinir;
    private javax.swing.JButton jButtonAcaoDefinir1;
    private javax.swing.JButton jButtonAcaoJava;
    private javax.swing.JButton jButtonAcaoWeb;
    private javax.swing.JButton jButtonAll;
    private javax.swing.JButton jButtonAzure;
    private javax.swing.JButton jButtonCLOSE;
    private javax.swing.JButton jButtonGoogle;
    private javax.swing.JButton jButtonGoogle1;
    private javax.swing.JButton jButtonGoogle10;
    private javax.swing.JButton jButtonGoogle3;
    private javax.swing.JButton jButtonGoogle4;
    private javax.swing.JButton jButtonGoogle5;
    private javax.swing.JButton jButtonGoogle6;
    private javax.swing.JButton jButtonGoogle7;
    private javax.swing.JButton jButtonGoogle8;
    private javax.swing.JButton jButtonGoogle9;
    private javax.swing.JButton jButtonJDK;
    private javax.swing.JButton jButtonJEP;
    private javax.swing.JButton jButtonJavaTutorial;
    private javax.swing.JButton jButtonMicrosoft;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
    
private void configurarFormulario(){
    this.setTitle("EducaCiência FastCode - Web"); //titulo
    this.setResizable(false);
    this.setLocationRelativeTo(null);
}

private void estadoControle(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  
    
    jButtonAzure.setVisible(!e);
    jButtonMicrosoft.setVisible(!e);
    jButtonGoogle5.setVisible(!e);
    jButtonGoogle6.setVisible(!e);
    jButtonGoogle7.setVisible(!e);
    jButtonGoogle8.setVisible(!e);
    jButtonGoogle9.setVisible(!e);
    jButtonGoogle10.setVisible(!e);
    jButtonJEP.setVisible(!e);
    jButtonJDK.setVisible(!e);
    jButtonJavaTutorial.setVisible(!e);
    jButtonGoogle.setVisible(!e);
    jButtonGoogle1.setVisible(!e);
    jButtonGoogle3.setVisible(!e);
    jButtonGoogle4.setVisible(!e);
}

private void estadoControleAll(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  

    jButtonAzure.setVisible(e);
    jButtonMicrosoft.setVisible(e);
    jButtonGoogle5.setVisible(e);
    jButtonGoogle6.setVisible(e);
    jButtonGoogle7.setVisible(e);
    jButtonGoogle8.setVisible(e);
    jButtonGoogle9.setVisible(e);
    jButtonGoogle10.setVisible(e);
    jButtonJEP.setVisible(e);
    jButtonJDK.setVisible(e);
    jButtonJavaTutorial.setVisible(e);
    jButtonGoogle.setVisible(e);
    jButtonGoogle1.setVisible(e);
    jButtonGoogle3.setVisible(e);
    jButtonGoogle4.setVisible(e);
    }

private void estadoControleWeb(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  
    
    jButtonAzure.setVisible(e);
    jButtonMicrosoft.setVisible(e);
    jButtonGoogle5.setVisible(!e);
    jButtonGoogle6.setVisible(!e);
    jButtonGoogle7.setVisible(!e);
    jButtonGoogle8.setVisible(!e);
    jButtonGoogle9.setVisible(!e);
    jButtonGoogle10.setVisible(!e);
    jButtonJEP.setVisible(!e);
    jButtonJDK.setVisible(!e);
    jButtonJavaTutorial.setVisible(!e);
    jButtonGoogle.setVisible(!e);
    jButtonGoogle1.setVisible(!e);
    jButtonGoogle3.setVisible(!e);
    jButtonGoogle4.setVisible(!e);
    }

private void estadoControleCursos(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  
    
    jButtonAzure.setVisible(!e);
    jButtonMicrosoft.setVisible(!e);
    jButtonGoogle5.setVisible(e);
    jButtonGoogle6.setVisible(e);
    jButtonGoogle7.setVisible(e);
    jButtonGoogle8.setVisible(e);
    jButtonGoogle9.setVisible(e);
    jButtonGoogle10.setVisible(e);
    jButtonJEP.setVisible(!e);
    jButtonJDK.setVisible(!e);
    jButtonJavaTutorial.setVisible(!e);
    jButtonGoogle.setVisible(!e);
    jButtonGoogle1.setVisible(!e);
    jButtonGoogle3.setVisible(!e);
    jButtonGoogle4.setVisible(!e);
    }

private void estadoControleJava(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  
    
    jButtonAzure.setVisible(!e);
    jButtonMicrosoft.setVisible(!e);
    jButtonGoogle5.setVisible(!e);
    jButtonGoogle6.setVisible(!e);
    jButtonGoogle7.setVisible(!e);
    jButtonGoogle8.setVisible(!e);
    jButtonGoogle9.setVisible(!e);
    jButtonGoogle10.setVisible(!e);
    jButtonJEP.setVisible(e);
    jButtonJDK.setVisible(e);
    jButtonJavaTutorial.setVisible(e);
    jButtonGoogle.setVisible(!e);
    jButtonGoogle1.setVisible(!e);
    jButtonGoogle3.setVisible(!e);
    jButtonGoogle4.setVisible(!e);
    }

private void estadoControleSysC(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  
    
    jButtonAzure.setVisible(!e);
    jButtonMicrosoft.setVisible(!e);
    jButtonGoogle5.setVisible(!e);
    jButtonGoogle6.setVisible(!e);
    jButtonGoogle7.setVisible(!e);
    jButtonGoogle8.setVisible(!e);
    jButtonGoogle9.setVisible(!e);
    jButtonGoogle10.setVisible(!e);
    jButtonJEP.setVisible(!e);
    jButtonJDK.setVisible(!e);
    jButtonJavaTutorial.setVisible(!e);
    jButtonGoogle.setVisible(e);
    jButtonGoogle1.setVisible(e);
    jButtonGoogle3.setVisible(!e);
    jButtonGoogle4.setVisible(!e);
    }

private void estadoControleEvolua(boolean e){
    jButtonAcaoWeb.setEnabled(e);
    jButtonAcaoCursos.setEnabled(e);
    jButtonAcaoJava.setEnabled(e);
    jButtonAcaoDefinir.setEnabled(e);
    jButtonAcaoDefinir1.setEnabled(e);  
    
    jButtonAzure.setVisible(!e);
    jButtonMicrosoft.setVisible(!e);
    jButtonGoogle5.setVisible(!e);
    jButtonGoogle6.setVisible(!e);
    jButtonGoogle7.setVisible(!e);
    jButtonGoogle8.setVisible(!e);
    jButtonGoogle9.setVisible(!e);
    jButtonGoogle10.setVisible(!e);
    jButtonJEP.setVisible(!e);
    jButtonJDK.setVisible(!e);
    jButtonJavaTutorial.setVisible(!e);
    jButtonGoogle.setVisible(!e);
    jButtonGoogle1.setVisible(!e);
    jButtonGoogle3.setVisible(e);
    jButtonGoogle4.setVisible(e);
    }
}
