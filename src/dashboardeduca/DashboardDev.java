/**
EducaCienciaFastCode
For Community
**/
package DashBoardEduca;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DashboardDev extends javax.swing.JFrame {


    public DashboardDev() {
        initComponents();
        configurarFormulario();
        estadoControle(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jButtonAll1 = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButtonCLOSE = new javax.swing.JButton();
        jButtonAcaoDesenv = new javax.swing.JButton();
        jButtonNB8 = new javax.swing.JButton();
        jButtonNB11 = new javax.swing.JButton();
        jButtonSTS = new javax.swing.JButton();
        jButtonECLIPSE = new javax.swing.JButton();
        jButtonINTELLIJ = new javax.swing.JButton();
        jButtonVS2019 = new javax.swing.JButton();
        jButtonVS2017 = new javax.swing.JButton();
        jButtonVSCODE = new javax.swing.JButton();
        jButtonSUBLIME = new javax.swing.JButton();
        jButtonNOTEPAD = new javax.swing.JButton();
        jButtonSpyder = new javax.swing.JButton();
        jButtonATOM = new javax.swing.JButton();
        jButtonPOSTMAN = new javax.swing.JButton();
        jButtonAcaoBD = new javax.swing.JButton();
        jButtonWAMP = new javax.swing.JButton();
        jButtonMYSQL = new javax.swing.JButton();
        jButtonSQL = new javax.swing.JButton();
        jButtonAcaoALG = new javax.swing.JButton();
        jButtonVSALG = new javax.swing.JButton();
        jButtonAcaoMAP = new javax.swing.JButton();
        jButtonXMIND = new javax.swing.JButton();
        jButtonAcaoCHAT = new javax.swing.JButton();
        jButtonZOOM = new javax.swing.JButton();
        jButtonTEAMS = new javax.swing.JButton();
        jButtonDiscord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/Educaciencia - 200p.jpg"))); // NOI18N
        desktopPane.add(jLabel2);
        jLabel2.setBounds(10, 10, 200, 95);

        jButtonAll1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAll1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/all1-3.png"))); // NOI18N
        jButtonAll1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAll1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAll1);
        jButtonAll1.setBounds(360, 20, 80, 83);

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

        jButtonAcaoDesenv.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoDesenv.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoDesenv.setText("Dev");
        jButtonAcaoDesenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoDesenvActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoDesenv);
        jButtonAcaoDesenv.setBounds(30, 130, 220, 31);

        jButtonNB8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNB8.setText("Netbeans 8.2");
        jButtonNB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNB8ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonNB8);
        jButtonNB8.setBounds(70, 170, 140, 23);

        jButtonNB11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNB11.setText("Netbeans 11");
        jButtonNB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNB11ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonNB11);
        jButtonNB11.setBounds(70, 200, 140, 23);

        jButtonSTS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSTS.setText("STS Java ");
        jButtonSTS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSTSActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSTS);
        jButtonSTS.setBounds(70, 230, 140, 23);

        jButtonECLIPSE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonECLIPSE.setText("Eclipse");
        jButtonECLIPSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonECLIPSEActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonECLIPSE);
        jButtonECLIPSE.setBounds(70, 260, 140, 23);

        jButtonINTELLIJ.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonINTELLIJ.setText("Intellij IDEA");
        jButtonINTELLIJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonINTELLIJActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonINTELLIJ);
        jButtonINTELLIJ.setBounds(70, 290, 140, 23);

        jButtonVS2019.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVS2019.setText("VisualStudio 2019");
        jButtonVS2019.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVS2019ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonVS2019);
        jButtonVS2019.setBounds(70, 320, 140, 23);

        jButtonVS2017.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVS2017.setText("VisualStudio 2017");
        jButtonVS2017.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVS2017ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonVS2017);
        jButtonVS2017.setBounds(70, 350, 140, 23);

        jButtonVSCODE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVSCODE.setText("VSCode");
        jButtonVSCODE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVSCODEActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonVSCODE);
        jButtonVSCODE.setBounds(70, 380, 140, 23);

        jButtonSUBLIME.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSUBLIME.setText("Sublime");
        jButtonSUBLIME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSUBLIMEActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSUBLIME);
        jButtonSUBLIME.setBounds(70, 410, 140, 23);

        jButtonNOTEPAD.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonNOTEPAD.setText("Notepad++");
        jButtonNOTEPAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNOTEPADActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonNOTEPAD);
        jButtonNOTEPAD.setBounds(70, 440, 140, 23);

        jButtonSpyder.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSpyder.setText("Spyder");
        jButtonSpyder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpyderActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSpyder);
        jButtonSpyder.setBounds(70, 470, 140, 23);

        jButtonATOM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonATOM.setText("Atom");
        jButtonATOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonATOMActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonATOM);
        jButtonATOM.setBounds(70, 500, 140, 23);

        jButtonPOSTMAN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonPOSTMAN.setText("Postman");
        jButtonPOSTMAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPOSTMANActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonPOSTMAN);
        jButtonPOSTMAN.setBounds(70, 530, 140, 23);

        jButtonAcaoBD.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoBD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoBD.setText("Banco de Dados");
        jButtonAcaoBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoBDActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoBD);
        jButtonAcaoBD.setBounds(280, 130, 190, 31);

        jButtonWAMP.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonWAMP.setText("WampServer");
        jButtonWAMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWAMPActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonWAMP);
        jButtonWAMP.setBounds(310, 170, 121, 23);

        jButtonMYSQL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMYSQL.setText("Mysql 8");
        jButtonMYSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMYSQLActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMYSQL);
        jButtonMYSQL.setBounds(310, 200, 120, 23);

        jButtonSQL.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonSQL.setText("SqlServer 2014");
        jButtonSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSQLActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonSQL);
        jButtonSQL.setBounds(310, 230, 121, 23);

        jButtonAcaoALG.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoALG.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoALG.setText("Algoritmos");
        jButtonAcaoALG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoALGActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoALG);
        jButtonAcaoALG.setBounds(500, 130, 150, 31);

        jButtonVSALG.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonVSALG.setText("Visualg");
        jButtonVSALG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVSALGActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonVSALG);
        jButtonVSALG.setBounds(540, 170, 75, 23);

        jButtonAcaoMAP.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoMAP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoMAP.setText("Mapa Mental");
        jButtonAcaoMAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoMAPActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoMAP);
        jButtonAcaoMAP.setBounds(680, 130, 190, 31);

        jButtonXMIND.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonXMIND.setText("Xmind");
        jButtonXMIND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXMINDActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonXMIND);
        jButtonXMIND.setBounds(730, 170, 90, 23);

        jButtonAcaoCHAT.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcaoCHAT.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcaoCHAT.setText("Chat e Conferência");
        jButtonAcaoCHAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoCHATActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcaoCHAT);
        jButtonAcaoCHAT.setBounds(900, 130, 230, 31);

        jButtonZOOM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonZOOM.setText("Zoom");
        jButtonZOOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZOOMActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonZOOM);
        jButtonZOOM.setBounds(970, 170, 100, 23);

        jButtonTEAMS.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonTEAMS.setText("Teams");
        jButtonTEAMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTEAMSActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonTEAMS);
        jButtonTEAMS.setBounds(970, 200, 100, 23);

        jButtonDiscord.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonDiscord.setText("Discord");
        jButtonDiscord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiscordActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonDiscord);
        jButtonDiscord.setBounds(970, 230, 100, 23);

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

    private void jButtonAll1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAll1ActionPerformed
        estadoControleAll(true);
    }//GEN-LAST:event_jButtonAll1ActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        estadoControle(true);
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLOSEActionPerformed
        DashboardInicial inicial = new DashboardInicial();
        inicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCLOSEActionPerformed

    private void jButtonAcaoDesenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoDesenvActionPerformed
        estadoControleDev(true);
    }//GEN-LAST:event_jButtonAcaoDesenvActionPerformed

    private void jButtonNB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNB8ActionPerformed
        String file = "C:/Program Files/NetBeans 8.2/bin/netbeans64.exe"; //Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Netbeans 8!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonNB8ActionPerformed

    private void jButtonNB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNB11ActionPerformed
        String file = "C:/Program Files/NetBeans-11.0/netbeans/bin/netbeans64.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Netbeans 11!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonNB11ActionPerformed

    private void jButtonSTSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSTSActionPerformed
        String file = "C:/Users/Usuario/Documents/Perucello SSD/STS Springboot/spring-tool-suite-3.9.10.RELEASE-e4.13.0-win32-x86_64/sts-bundle/sts-3.9.10.RELEASE/STS.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Spring STS!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSTSActionPerformed

    private void jButtonECLIPSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonECLIPSEActionPerformed
        String file = "C:/Users/Usuario/eclipse/jee-2020-03/eclipse/eclipse.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Eclipse!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonECLIPSEActionPerformed

    private void jButtonINTELLIJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonINTELLIJActionPerformed
        String file = "C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2019.3.4/bin/idea64.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Intellij Idea!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonINTELLIJActionPerformed

    private void jButtonVS2019ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVS2019ActionPerformed
        String file = "C:/Program Files (x86)/Microsoft Visual Studio/2019/Professional/Common7/IDE/devenv.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Visual Studio 2019!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVS2019ActionPerformed

    private void jButtonVS2017ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVS2017ActionPerformed
        String file = "C:/Program Files (x86)/Microsoft Visual Studio/2017/Community/Common7/IDE/devenv.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Visual Studio 2017!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVS2017ActionPerformed

    private void jButtonVSCODEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVSCODEActionPerformed
        String file = "C:/Users/Usuario/AppData/Local/Programs/Microsoft VS Code/code.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar VSCode!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_jButtonVSCODEActionPerformed

    private void jButtonSUBLIMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSUBLIMEActionPerformed
        String file = "C:/Program Files/Sublime Text 3/sublime_text.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Sublime!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSUBLIMEActionPerformed

    private void jButtonNOTEPADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNOTEPADActionPerformed
        String file = "C:/Program Files/Notepad++/notepad++.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Notepad++ !", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonNOTEPADActionPerformed

    private void jButtonSpyderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpyderActionPerformed
        String file = "C:/ProgramData/Microsoft/Windows/Start Menu/Programs/Anaconda3 (64-bit)/Spyder.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Spyder 3.8!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSpyderActionPerformed

    private void jButtonATOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonATOMActionPerformed
        String file = "C:/Users/Usuario/AppData/Local/atom/app-1.46.0/atom.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Atom!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonATOMActionPerformed

    private void jButtonPOSTMANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPOSTMANActionPerformed
        String file = "C:/Users/Usuario/AppData/Local/Postman/Postman.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Postman!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonPOSTMANActionPerformed

    private void jButtonAcaoBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoBDActionPerformed
        estadoControleBD(true);
    }//GEN-LAST:event_jButtonAcaoBDActionPerformed

    private void jButtonWAMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWAMPActionPerformed
        String file = "C:/renan/AppDesktop/src/appdesktop/bat/wamp.bat";//nesse caso para o wamp haverá necessidade de gerar um arquivo bat para incluir no caminho como no exemplo de rota
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar WampServer!", "Banco de Dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonWAMPActionPerformed

    private void jButtonMYSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMYSQLActionPerformed
        String file = "C:/Program Files/MySQL/MySQL Workbench 8.0 CE/MySQLWorkbench.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Mysql Workbench 8!", "Banco de Dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMYSQLActionPerformed

    private void jButtonSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSQLActionPerformed
        String file = "C:/Program Files (x86)/Microsoft SQL Server/120/Tools/Binn/ManagementStudio/Ssms.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Banco de Dados", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Sql Management 2014!", "Banco de Dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSQLActionPerformed

    private void jButtonAcaoALGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoALGActionPerformed
        estadoControleAlg(true);
    }//GEN-LAST:event_jButtonAcaoALGActionPerformed

    private void jButtonVSALGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVSALGActionPerformed
        String file = "C:/Users/Usuario/Documents/Algoritmo/programa estudo/VisuAlg/visualg25.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Algoritmos", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Visualg!", "Algoritmos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonVSALGActionPerformed

    private void jButtonAcaoMAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoMAPActionPerformed
        estadoControleMap(true);
    }//GEN-LAST:event_jButtonAcaoMAPActionPerformed

    private void jButtonXMINDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXMINDActionPerformed
        String file = "C:/Program Files/XMind ZEN/XMind ZEN.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Mapa Mental", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Zen Xmind", "Mapa Mental", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonXMINDActionPerformed

    private void jButtonAcaoCHATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoCHATActionPerformed
        estadoControleChat(true);
    }//GEN-LAST:event_jButtonAcaoCHATActionPerformed

    private void jButtonZOOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZOOMActionPerformed
        String file = "C:/Users/Usuario/AppData/Roaming/Zoom/bin/Zoom.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Chat e Conferência", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Zoom !", "Chat e Conferência", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonZOOMActionPerformed

    private void jButtonTEAMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTEAMSActionPerformed
        String file = "C:/Users/Usuario/AppData/Local/Microsoft/Teams/Update.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Chat e Conferência", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Teams Microsoft !", "Chat e Conferência", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonTEAMSActionPerformed

    private void jButtonDiscordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiscordActionPerformed
        String file = "C:/Users/Usuario/AppData/Local/Discord/Update.exe --processStart Discord.exe";//Incluir aqui a rota do arquivo exe como no exemplo
        try {
            Runtime.getRuntime().exec(file);
            //JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!", "Desenvolvimento", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(DashboardDev.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Spyder 3.8!", "Desenvolvimento", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDiscordActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardDev().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButtonATOM;
    private javax.swing.JButton jButtonAcaoALG;
    private javax.swing.JButton jButtonAcaoBD;
    private javax.swing.JButton jButtonAcaoCHAT;
    private javax.swing.JButton jButtonAcaoDesenv;
    private javax.swing.JButton jButtonAcaoMAP;
    private javax.swing.JButton jButtonAll1;
    private javax.swing.JButton jButtonCLOSE;
    private javax.swing.JButton jButtonDiscord;
    private javax.swing.JButton jButtonECLIPSE;
    private javax.swing.JButton jButtonINTELLIJ;
    private javax.swing.JButton jButtonMYSQL;
    private javax.swing.JButton jButtonNB11;
    private javax.swing.JButton jButtonNB8;
    private javax.swing.JButton jButtonNOTEPAD;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JButton jButtonPOSTMAN;
    private javax.swing.JButton jButtonSQL;
    private javax.swing.JButton jButtonSTS;
    private javax.swing.JButton jButtonSUBLIME;
    private javax.swing.JButton jButtonSpyder;
    private javax.swing.JButton jButtonTEAMS;
    private javax.swing.JButton jButtonVS2017;
    private javax.swing.JButton jButtonVS2019;
    private javax.swing.JButton jButtonVSALG;
    private javax.swing.JButton jButtonVSCODE;
    private javax.swing.JButton jButtonWAMP;
    private javax.swing.JButton jButtonXMIND;
    private javax.swing.JButton jButtonZOOM;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

    
    
private void configurarFormulario(){
    this.setTitle("EducaCiência FastCode - Files"); //titulo
    this.setResizable(false);
    this.setLocationRelativeTo(null);
}


private void estadoControleAll(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(e);
    jButtonNB11.setVisible(e);
    jButtonSTS.setVisible(e);
    jButtonECLIPSE.setVisible(e);
    jButtonINTELLIJ.setVisible(e);
    jButtonVS2017.setVisible(e);
    jButtonVS2019.setVisible(e);
    jButtonVSCODE.setVisible(e);
    jButtonSUBLIME.setVisible(e);
    jButtonNOTEPAD.setVisible(e);
    jButtonSpyder.setVisible(e);
    jButtonATOM.setVisible(e);
    jButtonPOSTMAN.setVisible(e);
    jButtonSQL.setVisible(e);
    jButtonMYSQL.setVisible(e);
    jButtonWAMP.setVisible(e);
    jButtonVSALG.setVisible(e);
    jButtonXMIND.setVisible(e);
    jButtonTEAMS.setVisible(e);
    jButtonZOOM.setVisible(e);
    jButtonDiscord.setVisible(e);
    }

private void estadoControle(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(!e);
    jButtonNB11.setVisible(!e);
    jButtonSTS.setVisible(!e);
    jButtonECLIPSE.setVisible(!e);
    jButtonINTELLIJ.setVisible(!e);
    jButtonVS2017.setVisible(!e);
    jButtonVS2019.setVisible(!e);
    jButtonVSCODE.setVisible(!e);
    jButtonSUBLIME.setVisible(!e);
    jButtonNOTEPAD.setVisible(!e);
    jButtonSpyder.setVisible(!e);
    jButtonATOM.setVisible(!e);
    jButtonPOSTMAN.setVisible(!e);
    jButtonSQL.setVisible(!e);
    jButtonMYSQL.setVisible(!e);
    jButtonWAMP.setVisible(!e);
    jButtonVSALG.setVisible(!e);
    jButtonXMIND.setVisible(!e);
    jButtonTEAMS.setVisible(!e);
    jButtonZOOM.setVisible(!e);
    jButtonDiscord.setVisible(!e);
    }


private void estadoControleDev(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(e);
    jButtonNB11.setVisible(e);
    jButtonSTS.setVisible(e);
    jButtonECLIPSE.setVisible(e);
    jButtonINTELLIJ.setVisible(e);
    jButtonVS2017.setVisible(e);
    jButtonVS2019.setVisible(e);
    jButtonVSCODE.setVisible(e);
    jButtonSUBLIME.setVisible(e);
    jButtonNOTEPAD.setVisible(e);
    jButtonSpyder.setVisible(e);
    jButtonATOM.setVisible(e);
    jButtonPOSTMAN.setVisible(e);
    jButtonSQL.setVisible(!e);
    jButtonMYSQL.setVisible(!e);
    jButtonWAMP.setVisible(!e);
    jButtonVSALG.setVisible(!e);
    jButtonXMIND.setVisible(!e);
    jButtonTEAMS.setVisible(!e);
    jButtonZOOM.setVisible(!e);
    jButtonDiscord.setVisible(!e);
    }
private void estadoControleBD(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(!e);
    jButtonNB11.setVisible(!e);
    jButtonSTS.setVisible(!e);
    jButtonECLIPSE.setVisible(!e);
    jButtonINTELLIJ.setVisible(!e);
    jButtonVS2017.setVisible(!e);
    jButtonVS2019.setVisible(!e);
    jButtonVSCODE.setVisible(!e);
    jButtonSUBLIME.setVisible(!e);
    jButtonNOTEPAD.setVisible(!e);
    jButtonSpyder.setVisible(!e);
    jButtonATOM.setVisible(!e);
    jButtonPOSTMAN.setVisible(!e);
    jButtonSQL.setVisible(e);
    jButtonMYSQL.setVisible(e);
    jButtonWAMP.setVisible(e);
    jButtonVSALG.setVisible(!e);
    jButtonXMIND.setVisible(!e);
    jButtonTEAMS.setVisible(!e);
    jButtonZOOM.setVisible(!e);
    jButtonDiscord.setVisible(!e);
    }

private void estadoControleAlg(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(!e);
    jButtonNB11.setVisible(!e);
    jButtonSTS.setVisible(!e);
    jButtonECLIPSE.setVisible(!e);
    jButtonINTELLIJ.setVisible(!e);
    jButtonVS2017.setVisible(!e);
    jButtonVS2019.setVisible(!e);
    jButtonVSCODE.setVisible(!e);
    jButtonSUBLIME.setVisible(!e);
    jButtonNOTEPAD.setVisible(!e);
    jButtonSpyder.setVisible(!e);
    jButtonATOM.setVisible(!e);
    jButtonPOSTMAN.setVisible(!e);
    jButtonSQL.setVisible(!e);
    jButtonMYSQL.setVisible(!e);
    jButtonWAMP.setVisible(!e);
    jButtonVSALG.setVisible(e);
    jButtonXMIND.setVisible(!e);
    jButtonTEAMS.setVisible(!e);
    jButtonZOOM.setVisible(!e);
    jButtonDiscord.setVisible(!e);
    }

private void estadoControleMap(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(!e);
    jButtonNB11.setVisible(!e);
    jButtonSTS.setVisible(!e);
    jButtonECLIPSE.setVisible(!e);
    jButtonINTELLIJ.setVisible(!e);
    jButtonVS2017.setVisible(!e);
    jButtonVS2019.setVisible(!e);
    jButtonVSCODE.setVisible(!e);
    jButtonSUBLIME.setVisible(!e);
    jButtonNOTEPAD.setVisible(!e);
    jButtonSpyder.setVisible(!e);
    jButtonATOM.setVisible(!e);
    jButtonPOSTMAN.setVisible(!e);
    jButtonSQL.setVisible(!e);
    jButtonMYSQL.setVisible(!e);
    jButtonWAMP.setVisible(!e);
    jButtonVSALG.setVisible(!e);
    jButtonXMIND.setVisible(e);
    jButtonTEAMS.setVisible(!e);
    jButtonZOOM.setVisible(!e);
    jButtonDiscord.setVisible(!e);
    }

private void estadoControleChat(boolean e){
    jButtonAcaoDesenv.setEnabled(e);
    jButtonAcaoBD.setEnabled(e);
    jButtonAcaoALG.setEnabled(e);
    jButtonAcaoMAP.setEnabled(e);
    jButtonAcaoCHAT.setEnabled(e);
    
    jButtonNB8.setVisible(!e);
    jButtonNB11.setVisible(!e);
    jButtonSTS.setVisible(!e);
    jButtonECLIPSE.setVisible(!e);
    jButtonINTELLIJ.setVisible(!e);
    jButtonVS2017.setVisible(!e);
    jButtonVS2019.setVisible(!e);
    jButtonVSCODE.setVisible(!e);
    jButtonSUBLIME.setVisible(!e);
    jButtonNOTEPAD.setVisible(!e);
    jButtonSpyder.setVisible(!e);
    jButtonATOM.setVisible(!e);
    jButtonPOSTMAN.setVisible(!e);
    jButtonSQL.setVisible(!e);
    jButtonMYSQL.setVisible(!e);
    jButtonWAMP.setVisible(!e);
    jButtonVSALG.setVisible(!e);
    jButtonXMIND.setVisible(!e);
    jButtonTEAMS.setVisible(e);
    jButtonZOOM.setVisible(e);
    jButtonDiscord.setVisible(e);
    }


}
