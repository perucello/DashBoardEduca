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

public class DashboardPlayList extends javax.swing.JFrame {


    public DashboardPlayList() {
        initComponents();
        configurarFormulario();
        estadoControle(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jButtonCLOSE = new javax.swing.JButton();
        jButtonAcaoCanal = new javax.swing.JButton();
        jButtonSouJava = new javax.swing.JButton();
        jButtonAzurePratica = new javax.swing.JButton();
        jButtonCVideo = new javax.swing.JButton();
        jButtonSysAdmin = new javax.swing.JButton();
        jButtonJdev = new javax.swing.JButton();
        jButtonCodeJava = new javax.swing.JButton();
        jButtonJavaPlug = new javax.swing.JButton();
        jButtonLoiane = new javax.swing.JButton();
        jButtonDevCode = new javax.swing.JButton();
        jButtonDotnet = new javax.swing.JButton();
        jButtonIMasters = new javax.swing.JButton();
        jButtonBalta = new javax.swing.JButton();
        jButtonDevbr = new javax.swing.JButton();
        jButton1CNight = new javax.swing.JButton();
        jButtonExplorando = new javax.swing.JButton();
        jButtonEduca = new javax.swing.JButton();
        jButtonSQLPassion = new javax.swing.JButton();
        jButtonJulio = new javax.swing.JButton();
        jButtonDevPleno = new javax.swing.JButton();
        jButtonEduardoPires = new javax.swing.JButton();
        jButtonDBAPro = new javax.swing.JButton();
        jButtonAzureDevops = new javax.swing.JButton();
        jButtonBaseT = new javax.swing.JButton();
        jButtonNerdzao = new javax.swing.JButton();
        jButtonCAfeJava = new javax.swing.JButton();
        jButtonAlura = new javax.swing.JButton();
        jButtonHVasconcelos = new javax.swing.JButton();
        jButtonBozon = new javax.swing.JButton();
        jButtonVStudio = new javax.swing.JButton();
        jButtonMicrosDev = new javax.swing.JButton();
        jButtonJava = new javax.swing.JButton();
        jButtonCafeCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/Educaciencia - 200p.jpg"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(10, 10, 200, 95);

        jButtonCLOSE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCLOSE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/exit.png"))); // NOI18N
        jButtonCLOSE.setText("SAIR");
        jButtonCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLOSEActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCLOSE);
        jButtonCLOSE.setBounds(960, 20, 170, 80);

        jButtonAcaoCanal.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoCanal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoCanal.setText("Canal de Tecnologia");
        jButtonAcaoCanal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoCanalActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoCanal);
        jButtonAcaoCanal.setBounds(40, 150, 220, 31);

        jButtonSouJava.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSouJava.setText("Sou Java");
        jButtonSouJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSouJavaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSouJava);
        jButtonSouJava.setBounds(430, 420, 140, 23);

        jButtonAzurePratica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAzurePratica.setText("Azure na Prática");
        jButtonAzurePratica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzurePraticaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAzurePratica);
        jButtonAzurePratica.setBounds(430, 210, 140, 23);

        jButtonCVideo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCVideo.setText("Curso em Vídeo");
        jButtonCVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCVideoActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCVideo);
        jButtonCVideo.setBounds(430, 240, 140, 23);

        jButtonSysAdmin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSysAdmin.setText("Papo de SysAdmin");
        jButtonSysAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSysAdminActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSysAdmin);
        jButtonSysAdmin.setBounds(430, 270, 140, 23);

        jButtonJdev.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJdev.setText("JDEV");
        jButtonJdev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJdevActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJdev);
        jButtonJdev.setBounds(430, 300, 140, 23);

        jButtonCodeJava.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCodeJava.setText("Code Java");
        jButtonCodeJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCodeJavaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCodeJava);
        jButtonCodeJava.setBounds(430, 330, 140, 23);

        jButtonJavaPlug.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJavaPlug.setText("Java Plugados");
        jButtonJavaPlug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJavaPlugActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJavaPlug);
        jButtonJavaPlug.setBounds(430, 360, 140, 23);

        jButtonLoiane.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonLoiane.setText("Loiane Groner");
        jButtonLoiane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoianeActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonLoiane);
        jButtonLoiane.setBounds(430, 390, 140, 23);

        jButtonDevCode.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDevCode.setText("DevCode");
        jButtonDevCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevCodeActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonDevCode);
        jButtonDevCode.setBounds(250, 420, 140, 23);

        jButtonDotnet.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDotnet.setText("DotNet");
        jButtonDotnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotnetActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonDotnet);
        jButtonDotnet.setBounds(250, 390, 140, 23);

        jButtonIMasters.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonIMasters.setText("iMasters");
        jButtonIMasters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIMastersActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonIMasters);
        jButtonIMasters.setBounds(250, 360, 140, 23);

        jButtonBalta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBalta.setText("Balta");
        jButtonBalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaltaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonBalta);
        jButtonBalta.setBounds(250, 330, 140, 23);

        jButtonDevbr.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDevbr.setText("Developers BR");
        jButtonDevbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevbrActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonDevbr);
        jButtonDevbr.setBounds(250, 300, 140, 23);

        jButton1CNight.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1CNight.setText("Coding Night");
        jButton1CNight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CNightActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1CNight);
        jButton1CNight.setBounds(250, 270, 140, 23);

        jButtonExplorando.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonExplorando.setText("Explorando TI");
        jButtonExplorando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplorandoActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonExplorando);
        jButtonExplorando.setBounds(250, 240, 140, 23);

        jButtonEduca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEduca.setText("EducaCiência");
        jButtonEduca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEducaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonEduca);
        jButtonEduca.setBounds(250, 210, 140, 23);

        jButtonSQLPassion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSQLPassion.setText("SQL Passion");
        jButtonSQLPassion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSQLPassionActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSQLPassion);
        jButtonSQLPassion.setBounds(610, 420, 140, 23);

        jButtonJulio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJulio.setText("Julio Arruda");
        jButtonJulio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJulioActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJulio);
        jButtonJulio.setBounds(610, 390, 140, 23);

        jButtonDevPleno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDevPleno.setText("DevPleno");
        jButtonDevPleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevPlenoActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonDevPleno);
        jButtonDevPleno.setBounds(610, 360, 140, 23);

        jButtonEduardoPires.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonEduardoPires.setText("Eduardo Pires");
        jButtonEduardoPires.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEduardoPiresActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonEduardoPires);
        jButtonEduardoPires.setBounds(610, 330, 140, 23);

        jButtonDBAPro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDBAPro.setText("DBA Pro");
        jButtonDBAPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDBAProActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonDBAPro);
        jButtonDBAPro.setBounds(610, 300, 140, 23);

        jButtonAzureDevops.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAzureDevops.setText("Azure DevOps");
        jButtonAzureDevops.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzureDevopsActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAzureDevops);
        jButtonAzureDevops.setBounds(610, 270, 140, 23);

        jButtonBaseT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBaseT.setText("Base Treinamento");
        jButtonBaseT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaseTActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonBaseT);
        jButtonBaseT.setBounds(610, 240, 140, 23);

        jButtonNerdzao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNerdzao.setText("NerdZão");
        jButtonNerdzao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNerdzaoActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonNerdzao);
        jButtonNerdzao.setBounds(610, 210, 140, 23);

        jButtonCAfeJava.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCAfeJava.setText("Café com Java");
        jButtonCAfeJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCAfeJavaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCAfeJava);
        jButtonCAfeJava.setBounds(780, 420, 140, 23);

        jButtonAlura.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonAlura.setText("Alura");
        jButtonAlura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAluraActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAlura);
        jButtonAlura.setBounds(780, 390, 140, 23);

        jButtonHVasconcelos.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonHVasconcelos.setText("Hugo Vasconcelos");
        jButtonHVasconcelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHVasconcelosActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonHVasconcelos);
        jButtonHVasconcelos.setBounds(780, 360, 140, 23);

        jButtonBozon.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonBozon.setText("Bózon");
        jButtonBozon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBozonActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonBozon);
        jButtonBozon.setBounds(780, 330, 140, 23);

        jButtonVStudio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVStudio.setText("Visual Studio");
        jButtonVStudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVStudioActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonVStudio);
        jButtonVStudio.setBounds(780, 300, 140, 23);

        jButtonMicrosDev.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMicrosDev.setText("Microsoft Dev");
        jButtonMicrosDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMicrosDevActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMicrosDev);
        jButtonMicrosDev.setBounds(780, 270, 140, 23);

        jButtonJava.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonJava.setText("Java");
        jButtonJava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJavaActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonJava);
        jButtonJava.setBounds(780, 240, 140, 23);

        jButtonCafeCode.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonCafeCode.setText("Café Code");
        jButtonCafeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCafeCodeActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonCafeCode);
        jButtonCafeCode.setBounds(780, 210, 140, 23);

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

    private void jButtonCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLOSEActionPerformed
        DashboardInicial inicial = new DashboardInicial();
        inicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCLOSEActionPerformed

    private void jButtonAcaoCanalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoCanalActionPerformed
        estadoControleAll(true);
    }//GEN-LAST:event_jButtonAcaoCanalActionPerformed

    private void jButtonSouJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSouJavaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCH0qj1HFZ9jy0w87YfMSA7w/playlists" ) ); //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonSouJavaActionPerformed

    private void jButtonAzurePraticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzurePraticaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCdDXR2L48ZIfnHea207zoZw/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonAzurePraticaActionPerformed

    private void jButtonCVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCVideoActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/cursosemvideo/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonCVideoActionPerformed

    private void jButtonSysAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSysAdminActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCaBckZSXp7bE92yMlaQTlww/playlists" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonSysAdminActionPerformed

    private void jButtonJdevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJdevActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/alexegidio/playlists" ) ); 
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJdevActionPerformed

    private void jButtonCodeJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCodeJavaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/codejavanet/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonCodeJavaActionPerformed

    private void jButtonJavaPlugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJavaPlugActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UC_8SElusYdENzVw1Fsk0Nbg/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJavaPlugActionPerformed

    private void jButtonLoianeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoianeActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/Loianeg/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonLoianeActionPerformed

    private void jButtonDevCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevCodeActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/DevCodela/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonDevCodeActionPerformed

    private void jButtonDotnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotnetActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCIahKJr2Q50Sprk5ztPGnVg/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonDotnetActionPerformed

    private void jButtonIMastersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIMastersActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/imasters/playlists" ) );  //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonIMastersActionPerformed

    private void jButtonBaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaltaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCgnACLvM9O5lfm9ZBh_d3cg/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonBaltaActionPerformed

    private void jButtonDevbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevbrActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCGhSrtP0-1qq0XPbnMpi2kQ/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonDevbrActionPerformed

    private void jButton1CNightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CNightActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCLoVnmvp0fYn-BCK7yKTxUQ/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButton1CNightActionPerformed

    private void jButtonExplorandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplorandoActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCL7ViK9WY3uc-gKA8Pm9n_Q/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonExplorandoActionPerformed

    private void jButtonEducaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEducaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/playlist?list=PLG_driR73c6OGrAJxXQD0xj677LU_zfGM" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        }  
    }//GEN-LAST:event_jButtonEducaActionPerformed

    private void jButtonSQLPassionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSQLPassionActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/SQLpassion/videos" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonSQLPassionActionPerformed

    private void jButtonJulioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJulioActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/julioarrudac/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJulioActionPerformed

    private void jButtonDevPlenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevPlenoActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UC07JWf9A0B1scApbS1Te7Ww/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonDevPlenoActionPerformed

    private void jButtonEduardoPiresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEduardoPiresActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/headfox/videos" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonEduardoPiresActionPerformed

    private void jButtonDBAProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDBAProActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UC3Db4xY70lk3aZoUIgA2uKQ/videos" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonDBAProActionPerformed

    private void jButtonAzureDevopsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzureDevopsActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UC_QhmUDhKhUKKTC6aJr7n2g/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonAzureDevopsActionPerformed

    private void jButtonBaseTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaseTActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UChtQo7lCpB424Ze3N3VxUkA/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonBaseTActionPerformed

    private void jButtonNerdzaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNerdzaoActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCEaM9-M1O8_CW3kGQBA0P4w/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonNerdzaoActionPerformed

    private void jButtonCAfeJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCAfeJavaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/cafecomjava/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonCAfeJavaActionPerformed

    private void jButtonAluraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAluraActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/aluracursosonline/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonAluraActionPerformed

    private void jButtonHVasconcelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHVasconcelosActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/tutoriais01/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonHVasconcelosActionPerformed

    private void jButtonBozonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBozonActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/bosontreinamentos/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonBozonActionPerformed

    private void jButtonVStudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVStudioActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/VisualStudio/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonVStudioActionPerformed

    private void jButtonMicrosDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMicrosDevActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCsMica-v34Irf9KVTh6xx-g/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonMicrosDevActionPerformed

    private void jButtonJavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJavaActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/user/java/playlists" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonJavaActionPerformed

    private void jButtonCafeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCafeCodeActionPerformed
        try { 
            try { 
                java.awt.Desktop.getDesktop().browse( new java.net.URI( "https://www.youtube.com/channel/UCOmCMtVHyRdWHatT2Q_2bcg/videos" ) );   //link do canal ou playlist que deseja adicionar - deixando esta ja como default
            } catch (URISyntaxException ex) { 
                Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
            } 
            } catch (IOException ex) { 
            Logger.getLogger(DashboardPlayList.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }//GEN-LAST:event_jButtonCafeCodeActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardPlayList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardPlayList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton1CNight;
    private javax.swing.JButton jButtonAcaoCanal;
    private javax.swing.JButton jButtonAlura;
    private javax.swing.JButton jButtonAzureDevops;
    private javax.swing.JButton jButtonAzurePratica;
    private javax.swing.JButton jButtonBalta;
    private javax.swing.JButton jButtonBaseT;
    private javax.swing.JButton jButtonBozon;
    private javax.swing.JButton jButtonCAfeJava;
    private javax.swing.JButton jButtonCLOSE;
    private javax.swing.JButton jButtonCVideo;
    private javax.swing.JButton jButtonCafeCode;
    private javax.swing.JButton jButtonCodeJava;
    private javax.swing.JButton jButtonDBAPro;
    private javax.swing.JButton jButtonDevCode;
    private javax.swing.JButton jButtonDevPleno;
    private javax.swing.JButton jButtonDevbr;
    private javax.swing.JButton jButtonDotnet;
    private javax.swing.JButton jButtonEduardoPires;
    private javax.swing.JButton jButtonEduca;
    private javax.swing.JButton jButtonExplorando;
    private javax.swing.JButton jButtonHVasconcelos;
    private javax.swing.JButton jButtonIMasters;
    private javax.swing.JButton jButtonJava;
    private javax.swing.JButton jButtonJavaPlug;
    private javax.swing.JButton jButtonJdev;
    private javax.swing.JButton jButtonJulio;
    private javax.swing.JButton jButtonLoiane;
    private javax.swing.JButton jButtonMicrosDev;
    private javax.swing.JButton jButtonNerdzao;
    private javax.swing.JButton jButtonSQLPassion;
    private javax.swing.JButton jButtonSouJava;
    private javax.swing.JButton jButtonSysAdmin;
    private javax.swing.JButton jButtonVStudio;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
    
private void configurarFormulario(){
    this.setTitle("EducaCiência FastCode - Web"); //titulo
    this.setResizable(false);
    this.setLocationRelativeTo(null);
}

private void estadoControle(boolean e){
    jButtonAcaoCanal.setEnabled(e);
    
    jButtonEduca.setEnabled(!e);
    jButtonExplorando.setEnabled(!e);
    jButton1CNight.setEnabled(!e);
    jButtonDevbr.setEnabled(!e);
    jButtonBalta.setEnabled(!e);
    jButtonIMasters.setEnabled(!e);
    jButtonDotnet.setEnabled(!e);
    jButtonDevCode.setEnabled(!e);
    jButtonAzurePratica.setEnabled(!e);
    jButtonCVideo.setEnabled(!e);
    jButtonSysAdmin.setEnabled(!e);
    jButtonJdev.setEnabled(!e);
    jButtonCodeJava.setEnabled(!e);
    jButtonJavaPlug.setEnabled(!e);
    jButtonLoiane.setEnabled(!e);
    jButtonSouJava.setEnabled(!e);
    jButtonNerdzao.setEnabled(!e);
    jButtonBaseT.setEnabled(!e);
    jButtonAzureDevops.setEnabled(!e);
    jButtonDBAPro.setEnabled(!e);
    jButtonEduardoPires.setEnabled(!e);
    jButtonDevPleno.setEnabled(!e);
    jButtonJulio.setEnabled(!e);
    jButtonSQLPassion.setEnabled(!e);
    jButtonCafeCode.setEnabled(!e);
    jButtonJava.setEnabled(!e);
    jButtonMicrosDev.setEnabled(!e);
    jButtonVStudio.setEnabled(!e);
    jButtonBozon.setEnabled(!e);
    jButtonHVasconcelos.setEnabled(!e);
    jButtonAlura.setEnabled(!e);
    jButtonCAfeJava.setEnabled(!e);
    }

private void estadoControleAll(boolean e){
    jButtonAcaoCanal.setEnabled(e);
    
    jButtonEduca.setEnabled(e);
    jButtonExplorando.setEnabled(e);
    jButton1CNight.setEnabled(e);
    jButtonDevbr.setEnabled(e);
    jButtonBalta.setEnabled(e);
    jButtonIMasters.setEnabled(e);
    jButtonDotnet.setEnabled(e);
    jButtonDevCode.setEnabled(e);
    jButtonAzurePratica.setEnabled(e);
    jButtonCVideo.setEnabled(e);
    jButtonSysAdmin.setEnabled(e);
    jButtonJdev.setEnabled(e);
    jButtonCodeJava.setEnabled(e);
    jButtonJavaPlug.setEnabled(e);
    jButtonLoiane.setEnabled(e);
    jButtonSouJava.setEnabled(e);
    jButtonNerdzao.setEnabled(e);
    jButtonBaseT.setEnabled(e);
    jButtonAzureDevops.setEnabled(e);
    jButtonDBAPro.setEnabled(e);
    jButtonEduardoPires.setEnabled(e);
    jButtonDevPleno.setEnabled(e);
    jButtonJulio.setEnabled(e);
    jButtonSQLPassion.setEnabled(e);
    jButtonCafeCode.setEnabled(e);
    jButtonJava.setEnabled(e);
    jButtonMicrosDev.setEnabled(e);
    jButtonVStudio.setEnabled(e);
    jButtonBozon.setEnabled(e);
    jButtonHVasconcelos.setEnabled(e);
    jButtonAlura.setEnabled(e);
    jButtonCAfeJava.setEnabled(e);
    }

}
