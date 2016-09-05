package Telas;

import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btcancelar = new javax.swing.JButton();
        btacessar = new javax.swing.JButton();
        login = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(1, 2, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setName("tela"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(300, 400));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btcancelar.setBackground(new java.awt.Color(51, 51, 51));
        btcancelar.setForeground(new java.awt.Color(255, 255, 255));
        btcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/S.png"))); // NOI18N
        btcancelar.setText("Sair");
        btcancelar.setBorderPainted(false);
        btcancelar.setContentAreaFilled(false);
        btcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 120, 40));

        btacessar.setBackground(new java.awt.Color(102, 102, 102));
        btacessar.setForeground(new java.awt.Color(255, 255, 255));
        btacessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/35px-GreenCheckmark.png"))); // NOI18N
        btacessar.setText("Acessar");
        btacessar.setBorderPainted(false);
        btacessar.setContentAreaFilled(false);
        btacessar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btacessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btacessarActionPerformed(evt);
            }
        });
        btacessar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        getContentPane().add(btacessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        login.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 20));

        senha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        getContentPane().add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/sdassss.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -40, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Digite seu usuario e senha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Seja Bem-vindo ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 200, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuário:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 60, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/FUNDO.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 400, 290));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/texture-wallpaper-background-screen-saver.jpg"))); // NOI18N
        fundo.setText("jLabel1");
        fundo.setAutoscrolls(true);
        fundo.setDoubleBuffered(true);
        fundo.setFocusCycleRoot(true);
        fundo.setFocusTraversalPolicyProvider(true);
        fundo.setOpaque(true);
        fundo.setPreferredSize(new java.awt.Dimension(300, 400));
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 900, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        // TODO add your handling code here:
    }//GEN-LAST:event_Enter

    private void btacessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btacessarActionPerformed
        if(login.getText().equals("Ronaldo") || (senha.getText().equals("123"))){
            JOptionPane.showMessageDialog(null,"Acesso permitido");
            new MainUsuario().setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Acesso negado");
        }
    }//GEN-LAST:event_btacessarActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btcancelarActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed
   
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btacessar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}