
package Telas;

import javax.swing.JFrame;

public class MainUsuario extends javax.swing.JFrame {

    public MainUsuario() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpContenedor = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadPaciente = new javax.swing.JMenuItem();
        CadConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        dpContenedor.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/sdassss.png"))); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton8.setText("jButton8");

        jButton7.setText("jButton7");

        jButton4.setText("jButton4");

        jButton2.setText("jButton2");

        jButton1.setText("Cadastrar Paciente");

        jButton3.setText("jButton3");

        javax.swing.GroupLayout dpContenedorLayout = new javax.swing.GroupLayout(dpContenedor);
        dpContenedor.setLayout(dpContenedorLayout);
        dpContenedorLayout.setHorizontalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dpContenedorLayout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton7))
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1449, Short.MAX_VALUE))
        );
        dpContenedorLayout.setVerticalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dpContenedorLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton3))))
                        .addGap(18, 18, 18)
                        .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dpContenedor.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(dpContenedor);
        dpContenedor.setBounds(-1, 0, 2270, 510);

        jMenu1.setText("Cadastrar");

        CadPaciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        CadPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/icone_ata_orient_pac_acomp.png"))); // NOI18N
        CadPaciente.setText("Paciente");
        CadPaciente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CadPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(CadPaciente);

        CadConsulta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        CadConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/search.png"))); // NOI18N
        CadConsulta.setText("Consulta");
        CadConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        CadConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(CadConsulta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultar");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/schedule.png"))); // NOI18N
        jMenuItem4.setText("Agenda");
        jMenuItem4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/icone_ata_orient_pac_acomp.png"))); // NOI18N
        jMenuItem3.setText("Paciente");
        jMenuItem3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadPacienteActionPerformed
       CadPaciente cadcadastra = new CadPaciente();
       this.dpContenedor.add(cadcadastra);
       cadcadastra.show();
    }//GEN-LAST:event_CadPacienteActionPerformed

    private void CadConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadConsultaActionPerformed
        CadConsulta cadconsulta = new CadConsulta();
         this.dpContenedor.add(cadconsulta);
         cadconsulta.show();
    }//GEN-LAST:event_CadConsultaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       ConsultAgenda consultagenda = new ConsultAgenda();
         this.dpContenedor.add(consultagenda);
         consultagenda.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ConsultPaci consultpaciente = new ConsultPaci();
         this.dpContenedor.add(consultpaciente);
         consultpaciente.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        //java.awt.EventQueue.invokeLater(new Runnable() {

           
            
        //});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadConsulta;
    private javax.swing.JMenuItem CadPaciente;
    private javax.swing.JDesktopPane dpContenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private CadPaciente CadPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
