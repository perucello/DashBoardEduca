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
        jButtonJDEV = new javax.swing.JButton();
        jButtonAcaoJava = new javax.swing.JButton();
        jButtonAcaoDefinir = new javax.swing.JButton();
        jButtonGoogle1 = new javax.swing.JButton();
        jButtonAcaoDefinir1 = new javax.swing.JButton();
        jButtonGoogle4 = new javax.swing.JButton();
        jButtonGoogle3 = new javax.swing.JButton();
        jButtonJEP = new javax.swing.JButton();
        jButtonJDK = new javax.swing.JButton();
        jButtonJavaTutorial = new javax.swing.JButton();
        jButtonEvEAD = new javax.swing.JButton();
        jButtonCdeskEAD = new javax.swing.JButton();
        jButtonUdemy = new javax.swing.JButton();
        jButtonQODA = new javax.swing.JButton();
        jButtonSoftBlue = new javax.swing.JButton();
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

        jButtonJDEV.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJDEV.setText("JDEV");
        jButtonJDEV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJDEVActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJDEV);
        jButtonJDEV.setBounds(310, 320, 121, 23);

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

        jButtonEvEAD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEvEAD.setText("Evolua EAD");
        jButtonEvEAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEvEADActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonEvEAD);
        jButtonEvEAD.setBounds(310, 170, 121, 23);

        jButtonCdeskEAD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCdeskEAD.setText("CDESK EAD");
        jButtonCdeskEAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCdeskEADActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCdeskEAD);
        jButtonCdeskEAD.setBounds(310, 200, 121, 23);

        jButtonUdemy.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonUdemy.setText("Udemy");
        jButtonUdemy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUdemyActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonUdemy);
        jButtonUdemy.setBounds(310, 230, 121, 23);

        jButtonQODA.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonQODA.setText("QODA");
        jButtonQODA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQODAActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonQODA);
        jButtonQODA.setBounds(310, 260, 121, 23);

        jButtonSoftBlue.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSoftBlue.setText("SoftBlue");
        jButtonSoftBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoftBlueActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSoftBlue);
        jButtonSoftBlue.setBounds(310, 290, 121, 23);

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

    private void jButtonJDEVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJDEVActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.jdevtreinamento.com.br/formacao-java-web-profissional/projeto-java-web.html" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJDEVActionPerformed

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

    private void jButtonEvEADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEvEADActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "http://app.evoluaeducacao.com.br/Login" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonEvEADActionPerformed

    private void jButtonCdeskEADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCdeskEADActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://ava.centraldesk.com.br/home/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonCdeskEADActionPerformed

    private void jButtonUdemyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUdemyActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.udemy.com/home/my-courses/learning/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonUdemyActionPerformed

    private void jButtonQODAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQODAActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://lab.qoda.com.br/user/" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonQODAActionPerformed

    private void jButtonSoftBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoftBlueActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.softblue.com.br/registration/scores" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardWeb.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonSoftBlueActionPerformed

    private void jButtonAzureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzureActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://portal.azure.com/#home" ) ); 
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
    private javax.swing.JButton jButtonCdeskEAD;
    private javax.swing.JButton jButtonEvEAD;
    private javax.swing.JButton jButtonGoogle;
    private javax.swing.JButton jButtonGoogle1;
    private javax.swing.JButton jButtonGoogle3;
    private javax.swing.JButton jButtonGoogle4;
    private javax.swing.JButton jButtonJDEV;
    private javax.swing.JButton jButtonJDK;
    private javax.swing.JButton jButtonJEP;
    private javax.swing.JButton jButtonJavaTutorial;
    private javax.swing.JButton jButtonMicrosoft;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonQODA;
    private javax.swing.JButton jButtonSoftBlue;
    private javax.swing.JButton jButtonUdemy;
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
    jButtonEvEAD.setVisible(!e);
    jButtonCdeskEAD.setVisible(!e);
    jButtonUdemy.setVisible(!e);
    jButtonQODA.setVisible(!e);
    jButtonSoftBlue.setVisible(!e);
    jButtonJDEV.setVisible(!e);
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
    jButtonEvEAD.setVisible(e);
    jButtonCdeskEAD.setVisible(e);
    jButtonUdemy.setVisible(e);
    jButtonQODA.setVisible(e);
    jButtonSoftBlue.setVisible(e);
    jButtonJDEV.setVisible(e);
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
    jButtonEvEAD.setVisible(!e);
    jButtonCdeskEAD.setVisible(!e);
    jButtonUdemy.setVisible(!e);
    jButtonQODA.setVisible(!e);
    jButtonSoftBlue.setVisible(!e);
    jButtonJDEV.setVisible(!e);
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
    jButtonEvEAD.setVisible(e);
    jButtonCdeskEAD.setVisible(e);
    jButtonUdemy.setVisible(e);
    jButtonQODA.setVisible(e);
    jButtonSoftBlue.setVisible(e);
    jButtonJDEV.setVisible(e);
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
    jButtonEvEAD.setVisible(!e);
    jButtonCdeskEAD.setVisible(!e);
    jButtonUdemy.setVisible(!e);
    jButtonQODA.setVisible(!e);
    jButtonSoftBlue.setVisible(!e);
    jButtonJDEV.setVisible(!e);
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
    jButtonEvEAD.setVisible(!e);
    jButtonCdeskEAD.setVisible(!e);
    jButtonUdemy.setVisible(!e);
    jButtonQODA.setVisible(!e);
    jButtonSoftBlue.setVisible(!e);
    jButtonJDEV.setVisible(!e);
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
    jButtonEvEAD.setVisible(!e);
    jButtonCdeskEAD.setVisible(!e);
    jButtonUdemy.setVisible(!e);
    jButtonQODA.setVisible(!e);
    jButtonSoftBlue.setVisible(!e);
    jButtonJDEV.setVisible(!e);
    jButtonJEP.setVisible(!e);
    jButtonJDK.setVisible(!e);
    jButtonJavaTutorial.setVisible(!e);
    jButtonGoogle.setVisible(!e);
    jButtonGoogle1.setVisible(!e);
    jButtonGoogle3.setVisible(e);
    jButtonGoogle4.setVisible(e);
    }
}
