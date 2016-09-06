
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
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CadPaciente = new javax.swing.JMenuItem();
        CadConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        dpContenedor.setBackground(new java.awt.Color(204, 204, 255));

        jButton5.setText("jButton5");

        jButton7.setText("jButton7");

        jButton6.setText("jButton6");

        jButton8.setText("jButton8");

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
                        .addGap(19, 19, 19)
                        .addComponent(jButton7)
                        .addGap(46, 46, 46)
                        .addComponent(jButton5))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton8)
                        .addGap(51, 51, 51)
                        .addComponent(jButton6))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(dpContenedorLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton4))))))
                .addContainerGap(3299, Short.MAX_VALUE))
        );
        dpContenedorLayout.setVerticalGroup(
            dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpContenedorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dpContenedorLayout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(209, 209, 209))
        );
        dpContenedor.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpContenedor.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpContenedor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dpContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {

           public void run() {
               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
            
        });
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables

    private CadPaciente CadPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
