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


public class DashboardFiles extends javax.swing.JFrame {

    @SuppressWarnings("empty-statement")
    public DashboardFiles() {
        initComponents();
        setIconImage();
        configurarFormulario();
        estadocontroleClear(true);;

    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jButtonAcao = new javax.swing.JButton();
        jButtonMyDoc = new javax.swing.JButton();
        jButtonGith = new javax.swing.JButton();
        jButtonAcao2 = new javax.swing.JButton();
        jButtonAcao6 = new javax.swing.JButton();
        jButtonMyDoc19 = new javax.swing.JButton();
        jButtonAcao3 = new javax.swing.JButton();
        jButtonMyDoc7 = new javax.swing.JButton();
        jButtonAcao4 = new javax.swing.JButton();
        jButtonMyDoc11 = new javax.swing.JButton();
        jButtonAll = new javax.swing.JButton();
        jButtonOK = new javax.swing.JButton();
        jButtonCLOSE = new javax.swing.JButton();
        jButtonMyDoc4 = new javax.swing.JButton();
        jButtonMyDoc1 = new javax.swing.JButton();
        jButtonMyDoc3 = new javax.swing.JButton();
        jButtonMyDoc5 = new javax.swing.JButton();
        jButtonMyDoc2 = new javax.swing.JButton();
        jButtonMyDoc20 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButtonMyDoc23 = new javax.swing.JButton();
        jButtonMyDoc24 = new javax.swing.JButton();
        jButtonMyDoc25 = new javax.swing.JButton();
        jButtonMyDoc26 = new javax.swing.JButton();
        jButtonMyDoc21 = new javax.swing.JButton();
        jButtonMyDoc6 = new javax.swing.JButton();
        jButtonMyDoc9 = new javax.swing.JButton();
        jButtonMyDoc10 = new javax.swing.JButton();
        jButtonMyDoc8 = new javax.swing.JButton();
        jButtonAcao5 = new javax.swing.JButton();
        jButtonMyDoc12 = new javax.swing.JButton();
        jButtonMyDoc13 = new javax.swing.JButton();
        jButtonMyDoc14 = new javax.swing.JButton();
        jButtonMyDoc15 = new javax.swing.JButton();
        jButtonMyDoc16 = new javax.swing.JButton();
        jButtonMyDoc17 = new javax.swing.JButton();
        jButtonMyDoc18 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DashBoardEduca/Educaciencia - 200p.jpg"))); // NOI18N
        desktopPane.add(jLabel1);
        jLabel1.setBounds(10, 10, 200, 95);

        jButtonAcao.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcao.setText("Botao 1");
        jButtonAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcaoActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcao);
        jButtonAcao.setBounds(30, 120, 220, 31);

        jButtonMyDoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc.setText("MyDoc");
        jButtonMyDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDocActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc);
        jButtonMyDoc.setBounds(70, 160, 140, 23);

        jButtonGith.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonGith.setText("GithDesktop");
        jButtonGith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGithActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonGith);
        jButtonGith.setBounds(70, 550, 140, 23);

        jButtonAcao2.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcao2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcao2.setText("Botao 2");
        jButtonAcao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcao2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcao2);
        jButtonAcao2.setBounds(280, 120, 190, 31);

        jButtonAcao6.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcao6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcao6.setText("Botao 6");
        jButtonAcao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcao6ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcao6);
        jButtonAcao6.setBounds(30, 270, 220, 31);

        jButtonMyDoc19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc19.setText("MyDoc19");
        jButtonMyDoc19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc19ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc19);
        jButtonMyDoc19.setBounds(70, 310, 140, 23);

        jButtonAcao3.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcao3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcao3.setText("Botao 3");
        jButtonAcao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcao3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcao3);
        jButtonAcao3.setBounds(500, 120, 150, 31);

        jButtonMyDoc7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc7.setText("MyDoc7");
        jButtonMyDoc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc7ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc7);
        jButtonMyDoc7.setBounds(510, 190, 110, 23);

        jButtonAcao4.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcao4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcao4.setText("Botao 4");
        jButtonAcao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcao4ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcao4);
        jButtonAcao4.setBounds(680, 120, 220, 31);

        jButtonMyDoc11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc11.setText("MyDoc11");
        jButtonMyDoc11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc11ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc11);
        jButtonMyDoc11.setBounds(700, 190, 130, 23);

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

        jButtonMyDoc4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc4.setText("MyDoc4");
        jButtonMyDoc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc4ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc4);
        jButtonMyDoc4.setBounds(310, 190, 121, 23);

        jButtonMyDoc1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc1.setText("MyDoc1");
        jButtonMyDoc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc1);
        jButtonMyDoc1.setBounds(70, 190, 140, 23);

        jButtonMyDoc3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc3.setText("MyDoc3");
        jButtonMyDoc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc3ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc3);
        jButtonMyDoc3.setBounds(310, 160, 121, 23);

        jButtonMyDoc5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc5.setText("MyDoc5");
        jButtonMyDoc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc5ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc5);
        jButtonMyDoc5.setBounds(310, 220, 121, 23);

        jButtonMyDoc2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc2.setText("MyDoc2");
        jButtonMyDoc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc2ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc2);
        jButtonMyDoc2.setBounds(70, 220, 140, 23);

        jButtonMyDoc20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc20.setText("MyDoc20");
        jButtonMyDoc20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc20ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc20);
        jButtonMyDoc20.setBounds(70, 340, 140, 23);

        jButton22.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton22.setText("MyDoc22");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton22);
        jButton22.setBounds(70, 400, 140, 23);

        jButtonMyDoc23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc23.setText("MyDoc23");
        jButtonMyDoc23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc23ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc23);
        jButtonMyDoc23.setBounds(70, 430, 140, 23);

        jButtonMyDoc24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc24.setText("MyDoc24");
        jButtonMyDoc24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc24ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc24);
        jButtonMyDoc24.setBounds(70, 460, 140, 23);

        jButtonMyDoc25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc25.setText("MyDoc25");
        jButtonMyDoc25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc25ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc25);
        jButtonMyDoc25.setBounds(70, 490, 140, 23);

        jButtonMyDoc26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc26.setText("MyDoc26");
        jButtonMyDoc26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc26ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc26);
        jButtonMyDoc26.setBounds(70, 520, 140, 23);

        jButtonMyDoc21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc21.setText("MyDoc21");
        jButtonMyDoc21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc21ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc21);
        jButtonMyDoc21.setBounds(70, 370, 140, 23);

        jButtonMyDoc6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc6.setText("MyDoc6");
        jButtonMyDoc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc6ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc6);
        jButtonMyDoc6.setBounds(510, 160, 110, 23);

        jButtonMyDoc9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc9.setText("MyDoc9");
        jButtonMyDoc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc9ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc9);
        jButtonMyDoc9.setBounds(510, 250, 110, 23);

        jButtonMyDoc10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc10.setText("MyDoc10");
        jButtonMyDoc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc10ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc10);
        jButtonMyDoc10.setBounds(700, 160, 130, 23);

        jButtonMyDoc8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc8.setText("MyDoc8");
        jButtonMyDoc8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc8ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc8);
        jButtonMyDoc8.setBounds(510, 220, 110, 23);

        jButtonAcao5.setBackground(new java.awt.Color(204, 255, 204));
        jButtonAcao5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonAcao5.setText("Botao 5");
        jButtonAcao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcao5ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonAcao5);
        jButtonAcao5.setBounds(930, 120, 190, 31);

        jButtonMyDoc12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc12.setText("MyDoc12");
        jButtonMyDoc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc12ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc12);
        jButtonMyDoc12.setBounds(960, 160, 130, 23);

        jButtonMyDoc13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc13.setText("MyDoc13");
        jButtonMyDoc13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc13ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc13);
        jButtonMyDoc13.setBounds(960, 190, 130, 23);

        jButtonMyDoc14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc14.setText("MyDoc14");
        jButtonMyDoc14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc14ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc14);
        jButtonMyDoc14.setBounds(960, 220, 130, 23);

        jButtonMyDoc15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc15.setText("MyDoc15");
        jButtonMyDoc15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc15ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc15);
        jButtonMyDoc15.setBounds(960, 250, 130, 23);

        jButtonMyDoc16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc16.setText("MyDoc16");
        jButtonMyDoc16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc16ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc16);
        jButtonMyDoc16.setBounds(960, 280, 130, 23);

        jButtonMyDoc17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc17.setText("MyDoc17");
        jButtonMyDoc17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc17ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc17);
        jButtonMyDoc17.setBounds(960, 310, 130, 23);

        jButtonMyDoc18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButtonMyDoc18.setText("MyDoc18");
        jButtonMyDoc18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMyDoc18ActionPerformed(evt);
            }
        });
        desktopPane.add(jButtonMyDoc18);
        jButtonMyDoc18.setBounds(960, 340, 130, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcaoActionPerformed
        estadocontroleEduca(true);
    }//GEN-LAST:event_jButtonAcaoActionPerformed

    private void jButtonMyDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDocActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo !", "EducaCiência FastCode", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDocActionPerformed

    private void jButtonGithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGithActionPerformed
    }//GEN-LAST:event_jButtonGithActionPerformed

    private void jButtonAcao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcao2ActionPerformed
        estadocontroleSysC(true);
    }//GEN-LAST:event_jButtonAcao2ActionPerformed

    private void jButtonAcao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcao6ActionPerformed
        estadocontroleEvolua(true);
    }//GEN-LAST:event_jButtonAcao6ActionPerformed

    private void jButtonMyDoc19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc19ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc19ActionPerformed

    private void jButtonAcao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcao3ActionPerformed
        estadocontroleProg(true);
    }//GEN-LAST:event_jButtonAcao3ActionPerformed

    private void jButtonMyDoc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc7ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Programas FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc7ActionPerformed

    private void jButtonAcao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcao4ActionPerformed
        estadocontroleJudo(true);
    }//GEN-LAST:event_jButtonAcao4ActionPerformed

    private void jButtonMyDoc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc11ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Projeto Social", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc11ActionPerformed

    private void jButtonAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAllActionPerformed
        estadoControleAll(true);
    }//GEN-LAST:event_jButtonAllActionPerformed

    private void jButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOKActionPerformed
        estadocontroleClear(true);
    }//GEN-LAST:event_jButtonOKActionPerformed

    private void jButtonCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLOSEActionPerformed
        DashboardInicial inicial = new DashboardInicial();
        inicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCLOSEActionPerformed

    private void jButtonMyDoc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc4ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "SysConecte Sistemas Inteligentes", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc4ActionPerformed

    private void jButtonMyDoc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc1ActionPerformed
        
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "EducaCiência FastCode", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc1ActionPerformed

    private void jButtonMyDoc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc3ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException e) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "SysConecte Sistemas Inteligentes", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc3ActionPerformed

    private void jButtonMyDoc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc5ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException e) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "SysConecte Sistemas Inteligentes", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc5ActionPerformed

    private void jButtonMyDoc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc2ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException e) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "EducaCiência FastCode", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc2ActionPerformed

    private void jButtonMyDoc20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc20ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc20ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButtonMyDoc23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc23ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButtonMyDoc23ActionPerformed

    private void jButtonMyDoc24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc24ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButtonMyDoc24ActionPerformed

    private void jButtonMyDoc25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc25ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButtonMyDoc25ActionPerformed

    private void jButtonMyDoc26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc26ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
 
    }//GEN-LAST:event_jButtonMyDoc26ActionPerformed

    private void jButtonMyDoc21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc21ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Evolua Sumaré", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc21ActionPerformed

    private void jButtonMyDoc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc6ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Programas FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc6ActionPerformed

    private void jButtonMyDoc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc9ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Programas FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc9ActionPerformed

    private void jButtonMyDoc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc10ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Projeto Social", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc10ActionPerformed

    private void jButtonMyDoc8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc8ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Programas FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc8ActionPerformed

    private void jButtonAcao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcao5ActionPerformed
        estadocontroleAtalhos(true);
    }//GEN-LAST:event_jButtonAcao5ActionPerformed

    private void jButtonMyDoc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc12ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc12ActionPerformed

    private void jButtonMyDoc13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc13ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc13ActionPerformed

    private void jButtonMyDoc14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc14ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc14ActionPerformed

    private void jButtonMyDoc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc15ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc15ActionPerformed

    private void jButtonMyDoc16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc16ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc16ActionPerformed

    private void jButtonMyDoc17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc17ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc17ActionPerformed

    private void jButtonMyDoc18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMyDoc18ActionPerformed
        String file = "explorer C:\\Users\\Usuario\\Documents\\"; //nesse momento incluir a rota da pasta a abrir, neste caso, deixei todas as rotas para o Meus Documentos
        try {
            Runtime.getRuntime().exec(file);
        } catch (IOException ex) {
            Logger.getLogger(DashboardFiles.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ocorreu falha ao carregar Arquivo!", "Atalhos FP", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButtonMyDoc18ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DashboardFiles().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButtonAcao;
    private javax.swing.JButton jButtonAcao2;
    private javax.swing.JButton jButtonAcao3;
    private javax.swing.JButton jButtonAcao4;
    private javax.swing.JButton jButtonAcao5;
    private javax.swing.JButton jButtonAcao6;
    private javax.swing.JButton jButtonAll;
    private javax.swing.JButton jButtonCLOSE;
    private javax.swing.JButton jButtonGith;
    private javax.swing.JButton jButtonMyDoc;
    private javax.swing.JButton jButtonMyDoc1;
    private javax.swing.JButton jButtonMyDoc10;
    private javax.swing.JButton jButtonMyDoc11;
    private javax.swing.JButton jButtonMyDoc12;
    private javax.swing.JButton jButtonMyDoc13;
    private javax.swing.JButton jButtonMyDoc14;
    private javax.swing.JButton jButtonMyDoc15;
    private javax.swing.JButton jButtonMyDoc16;
    private javax.swing.JButton jButtonMyDoc17;
    private javax.swing.JButton jButtonMyDoc18;
    private javax.swing.JButton jButtonMyDoc19;
    private javax.swing.JButton jButtonMyDoc2;
    private javax.swing.JButton jButtonMyDoc20;
    private javax.swing.JButton jButtonMyDoc21;
    private javax.swing.JButton jButtonMyDoc23;
    private javax.swing.JButton jButtonMyDoc24;
    private javax.swing.JButton jButtonMyDoc25;
    private javax.swing.JButton jButtonMyDoc26;
    private javax.swing.JButton jButtonMyDoc3;
    private javax.swing.JButton jButtonMyDoc4;
    private javax.swing.JButton jButtonMyDoc5;
    private javax.swing.JButton jButtonMyDoc6;
    private javax.swing.JButton jButtonMyDoc7;
    private javax.swing.JButton jButtonMyDoc8;
    private javax.swing.JButton jButtonMyDoc9;
    private javax.swing.JButton jButtonOK;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

        
    private void setIconImage(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icodev.png")));
        
    }
private void configurarFormulario(){
    this.setTitle("EducaCiência FastCode - Developer"); //titulo
    this.setResizable(false);
    this.setLocationRelativeTo(null);
}

private void estadoControleAll(boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(e);
    jButtonMyDoc1.setEnabled(e);
    jButtonMyDoc2.setEnabled(e);

    jButtonMyDoc3.setEnabled(e);
    jButtonMyDoc4.setEnabled(e);
    jButtonMyDoc5.setEnabled(e);

    jButtonMyDoc6.setEnabled(e);
    jButtonMyDoc7.setEnabled(e);
    jButtonMyDoc8.setEnabled(e);
    jButtonMyDoc9.setEnabled(e);

    jButtonMyDoc10.setEnabled(e);
    jButtonMyDoc11.setEnabled(e);

    jButtonMyDoc12.setEnabled(e);
    jButtonMyDoc13.setEnabled(e);
    jButtonMyDoc14.setEnabled(e);
    jButtonMyDoc15.setEnabled(e);
    jButtonMyDoc16.setEnabled(e);
    jButtonMyDoc17.setEnabled(e);
    jButtonMyDoc18.setEnabled(e);

    jButtonMyDoc19.setEnabled(e);
    jButtonMyDoc20.setEnabled(e);
    jButtonMyDoc21.setEnabled(e);
    jButton22.setEnabled(e);
    jButtonMyDoc23.setEnabled(e);
    jButtonMyDoc24.setEnabled(e);
    jButtonMyDoc25.setEnabled(e);
    jButtonMyDoc26.setEnabled(e);
    }
    
private void estadocontroleClear (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(!e);
    jButtonMyDoc1.setEnabled(!e);
    jButtonMyDoc2.setEnabled(!e);

    jButtonMyDoc3.setEnabled(!e);
    jButtonMyDoc4.setEnabled(!e);
    jButtonMyDoc5.setEnabled(!e);

    jButtonMyDoc6.setEnabled(!e);
    jButtonMyDoc7.setEnabled(!e);
    jButtonMyDoc8.setEnabled(!e);
    jButtonMyDoc9.setEnabled(!e);

    jButtonMyDoc10.setEnabled(!e);
    jButtonMyDoc11.setEnabled(!e);

    jButtonMyDoc12.setEnabled(!e);
    jButtonMyDoc13.setEnabled(!e);
    jButtonMyDoc14.setEnabled(!e);
    jButtonMyDoc15.setEnabled(!e);
    jButtonMyDoc16.setEnabled(!e);
    jButtonMyDoc17.setEnabled(!e);
    jButtonMyDoc18.setEnabled(!e);

    jButtonMyDoc19.setEnabled(!e);
    jButtonMyDoc20.setEnabled(!e);
    jButtonMyDoc21.setEnabled(!e);
    jButton22.setEnabled(!e);
    jButtonMyDoc23.setEnabled(!e);
    jButtonMyDoc24.setEnabled(!e);
    jButtonMyDoc25.setEnabled(!e);
    jButtonMyDoc26.setEnabled(!e);
    }

    
private void estadocontroleEduca (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(e);
    jButtonMyDoc1.setEnabled(e);
    jButtonMyDoc2.setEnabled(e);

    jButtonMyDoc3.setEnabled(!e);
    jButtonMyDoc4.setEnabled(!e);
    jButtonMyDoc5.setEnabled(!e);

    jButtonMyDoc6.setEnabled(!e);
    jButtonMyDoc7.setEnabled(!e);
    jButtonMyDoc8.setEnabled(!e);
    jButtonMyDoc9.setEnabled(!e);

    jButtonMyDoc10.setEnabled(!e);
    jButtonMyDoc11.setEnabled(!e);

    jButtonMyDoc12.setEnabled(!e);
    jButtonMyDoc13.setEnabled(!e);
    jButtonMyDoc14.setEnabled(!e);
    jButtonMyDoc15.setEnabled(!e);
    jButtonMyDoc16.setEnabled(!e);
    jButtonMyDoc17.setEnabled(!e);
    jButtonMyDoc18.setEnabled(!e);

    jButtonMyDoc19.setEnabled(!e);
    jButtonMyDoc20.setEnabled(!e);
    jButtonMyDoc21.setEnabled(!e);
    jButton22.setEnabled(!e);
    jButtonMyDoc23.setEnabled(!e);
    jButtonMyDoc24.setEnabled(!e);
    jButtonMyDoc25.setEnabled(!e);
    jButtonMyDoc26.setEnabled(!e);
    }

    
private void estadocontroleSysC (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(!e);
    jButtonMyDoc1.setEnabled(!e);
    jButtonMyDoc2.setEnabled(!e);

    jButtonMyDoc3.setEnabled(e);
    jButtonMyDoc4.setEnabled(e);
    jButtonMyDoc5.setEnabled(e);

    jButtonMyDoc6.setEnabled(!e);
    jButtonMyDoc7.setEnabled(!e);
    jButtonMyDoc8.setEnabled(!e);
    jButtonMyDoc9.setEnabled(!e);

    jButtonMyDoc10.setEnabled(!e);
    jButtonMyDoc11.setEnabled(!e);

    jButtonMyDoc12.setEnabled(!e);
    jButtonMyDoc13.setEnabled(!e);
    jButtonMyDoc14.setEnabled(!e);
    jButtonMyDoc15.setEnabled(!e);
    jButtonMyDoc16.setEnabled(!e);
    jButtonMyDoc17.setEnabled(!e);
    jButtonMyDoc18.setEnabled(!e);

    jButtonMyDoc19.setEnabled(!e);
    jButtonMyDoc20.setEnabled(!e);
    jButtonMyDoc21.setEnabled(!e);
    jButton22.setEnabled(!e);
    jButtonMyDoc23.setEnabled(!e);
    jButtonMyDoc24.setEnabled(!e);
    jButtonMyDoc25.setEnabled(!e);
    jButtonMyDoc26.setEnabled(!e);
    }

    
private void estadocontroleProg (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(!e);
    jButtonMyDoc1.setEnabled(!e);
    jButtonMyDoc2.setEnabled(!e);

    jButtonMyDoc3.setEnabled(!e);
    jButtonMyDoc4.setEnabled(!e);
    jButtonMyDoc5.setEnabled(!e);

    jButtonMyDoc6.setEnabled(e);
    jButtonMyDoc7.setEnabled(e);
    jButtonMyDoc8.setEnabled(e);
    jButtonMyDoc9.setEnabled(e);

    jButtonMyDoc10.setEnabled(!e);
    jButtonMyDoc11.setEnabled(!e);

    jButtonMyDoc12.setEnabled(!e);
    jButtonMyDoc13.setEnabled(!e);
    jButtonMyDoc14.setEnabled(!e);
    jButtonMyDoc15.setEnabled(!e);
    jButtonMyDoc16.setEnabled(!e);
    jButtonMyDoc17.setEnabled(!e);
    jButtonMyDoc18.setEnabled(!e);

    jButtonMyDoc19.setEnabled(!e);
    jButtonMyDoc20.setEnabled(!e);
    jButtonMyDoc21.setEnabled(!e);
    jButton22.setEnabled(!e);
    jButtonMyDoc23.setEnabled(!e);
    jButtonMyDoc24.setEnabled(!e);
    jButtonMyDoc25.setEnabled(!e);
    jButtonMyDoc26.setEnabled(!e);
    }

    
private void estadocontroleJudo (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(!e);
    jButtonMyDoc1.setEnabled(!e);
    jButtonMyDoc2.setEnabled(!e);

    jButtonMyDoc3.setEnabled(!e);
    jButtonMyDoc4.setEnabled(!e);
    jButtonMyDoc5.setEnabled(!e);

    jButtonMyDoc6.setEnabled(!e);
    jButtonMyDoc7.setEnabled(!e);
    jButtonMyDoc8.setEnabled(!e);
    jButtonMyDoc9.setEnabled(!e);

    jButtonMyDoc10.setEnabled(e);
    jButtonMyDoc11.setEnabled(e);

    jButtonMyDoc12.setEnabled(!e);
    jButtonMyDoc13.setEnabled(!e);
    jButtonMyDoc14.setEnabled(!e);
    jButtonMyDoc15.setEnabled(!e);
    jButtonMyDoc16.setEnabled(!e);
    jButtonMyDoc17.setEnabled(!e);
    jButtonMyDoc18.setEnabled(!e);

    jButtonMyDoc19.setEnabled(!e);
    jButtonMyDoc20.setEnabled(!e);
    jButtonMyDoc21.setEnabled(!e);
    jButton22.setEnabled(!e);
    jButtonMyDoc23.setEnabled(!e);
    jButtonMyDoc24.setEnabled(!e);
    jButtonMyDoc25.setEnabled(!e);
    jButtonMyDoc26.setEnabled(!e);
    }

    
private void estadocontroleAtalhos (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(!e);
    jButtonMyDoc1.setEnabled(!e);
    jButtonMyDoc2.setEnabled(!e);

    jButtonMyDoc3.setEnabled(!e);
    jButtonMyDoc4.setEnabled(!e);
    jButtonMyDoc5.setEnabled(!e);

    jButtonMyDoc6.setEnabled(!e);
    jButtonMyDoc7.setEnabled(!e);
    jButtonMyDoc8.setEnabled(!e);
    jButtonMyDoc9.setEnabled(!e);

    jButtonMyDoc10.setEnabled(!e);
    jButtonMyDoc11.setEnabled(!e);

    jButtonMyDoc12.setEnabled(e);
    jButtonMyDoc13.setEnabled(e);
    jButtonMyDoc14.setEnabled(e);
    jButtonMyDoc15.setEnabled(e);
    jButtonMyDoc16.setEnabled(e);
    jButtonMyDoc17.setEnabled(e);
    jButtonMyDoc18.setEnabled(e);

    jButtonMyDoc19.setEnabled(!e);
    jButtonMyDoc20.setEnabled(!e);
    jButtonMyDoc21.setEnabled(!e);
    jButton22.setEnabled(!e);
    jButtonMyDoc23.setEnabled(!e);
    jButtonMyDoc24.setEnabled(!e);
    jButtonMyDoc25.setEnabled(!e);
    jButtonMyDoc26.setEnabled(!e);
    }

    
private void estadocontroleEvolua (boolean e){
    jButtonAcao.setEnabled(e);
    jButtonAcao6.setEnabled(e);
    jButtonAcao2.setEnabled(e);
    jButtonAcao3.setEnabled(e);
    jButtonAcao4.setEnabled(e);
    
    jButtonMyDoc.setEnabled(!e);
    jButtonMyDoc1.setEnabled(!e);
    jButtonMyDoc2.setEnabled(!e);

    jButtonMyDoc3.setEnabled(!e);
    jButtonMyDoc4.setEnabled(!e);
    jButtonMyDoc5.setEnabled(!e);

    jButtonMyDoc6.setEnabled(!e);
    jButtonMyDoc7.setEnabled(!e);
    jButtonMyDoc8.setEnabled(!e);
    jButtonMyDoc9.setEnabled(!e);

    jButtonMyDoc10.setEnabled(!e);
    jButtonMyDoc11.setEnabled(!e);

    jButtonMyDoc12.setEnabled(!e);
    jButtonMyDoc13.setEnabled(!e);
    jButtonMyDoc14.setEnabled(!e);
    jButtonMyDoc15.setEnabled(!e);
    jButtonMyDoc16.setEnabled(!e);
    jButtonMyDoc17.setEnabled(!e);
    jButtonMyDoc18.setEnabled(!e);

    jButtonMyDoc19.setEnabled(e);
    jButtonMyDoc20.setEnabled(e);
    jButtonMyDoc21.setEnabled(e);
    jButton22.setEnabled(e);
    jButtonMyDoc23.setEnabled(e);
    jButtonMyDoc24.setEnabled(e);
    jButtonMyDoc25.setEnabled(e);
    jButtonMyDoc26.setEnabled(e);
    }


}
