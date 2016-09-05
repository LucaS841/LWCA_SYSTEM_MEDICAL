package Telas;

import Model.Consulta;
import Model.Paciente;
import dao.DaoConsulta;
import dao.DaoPaciente;
import javax.swing.JOptionPane;

public class CadConsulta extends javax.swing.JInternalFrame {

    
    public CadConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFormHora = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        jTextPaciente = new javax.swing.JTextField();
        jFormData = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TextCod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Consulta");

        jLabel1.setText("Horário:");

        jLabel2.setText("Data:");

        try {
            jFormHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormHoraActionPerformed(evt);
            }
        });

        jLabel3.setText("Paciente:");

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/salvar_32.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jTextPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPacienteActionPerformed(evt);
            }
        });

        try {
            jFormData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormData.setText("   /   /    ");
        jFormData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormDataActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/alterar.png"))); // NOI18N
        jButton1.setText("Alterar Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Código: ");

        TextCod.setEditable(false);
        TextCod.setText("NOVO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(286, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFormData, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(34, 34, 34)
                                .addComponent(jFormHora, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jFormHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormHoraActionPerformed

    private void jTextPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPacienteActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
         Consulta consulta = new Consulta();     
        if (jTextPaciente.getText().equals("")){
            JOptionPane.showMessageDialog(null, 
                    "O campo nome é obrigatório");
        }else if (jFormData.getText().equals("")){
            JOptionPane.showMessageDialog(null, 
                    "O campo Data é obrigatório");
        }else if (jFormHora.getText().equals("")){
            JOptionPane.showMessageDialog(null, 
                    "O campo Hora é obrigatório");            
        }else{
           if (TextCod.getText().equals("NOVO")){
              try{
                    consulta.setPaciente(jTextPaciente.getText());
                    consulta.setHora(jFormHora.getText());
                    consulta.setData(jFormData.getText());
                    DaoConsulta daoconsulta = new DaoConsulta();
                    daoconsulta.salvar(consulta);
                    daoconsulta.fecharConexao();
                    limpar();
                    JOptionPane.showMessageDialog(null, 
                            "Contato criado com sucesso!");
              }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, 
                            "Problemas ao tentar salvar contato "+ex.getMessage());
              }  
            }else{
              try{
                    consulta.setCodigo(new Integer(TextCod.getText()));
                    consulta.setPaciente(jTextPaciente.getText());
                    consulta.setHora(jFormHora.getText());
                    consulta.setData(jFormData.getText());
                    
                    DaoConsulta daoconsulta = new DaoConsulta();
                    daoconsulta.alterar(consulta);
                    daoconsulta.fecharConexao();
                    limpar();
                    JOptionPane.showMessageDialog(null, 
                            "Contato alterado com sucesso!");
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, 
                            "Problemas ao tentar alterar contato "+ex.getMessage());
                }              
           }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo a ser alterado"));
        try{
                DaoConsulta daoConsulta = new DaoConsulta();
                Consulta consulta = 
                        daoConsulta.buscarPorId(codigo);
                TextCod.setText(consulta.getCodigo()+"");
                jFormData.setText(consulta.getData());
                jFormHora.setText(consulta.getHora());
                jTextPaciente.setText(consulta.getPaciente());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, 
                        "Problema ao carregar contato"+ex.getMessage());
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jFormDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCod;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormData;
    private javax.swing.JFormattedTextField jFormHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextPaciente;
    // End of variables declaration//GEN-END:variables

    public void limpar(){
        
        TextCod.setText("NOVO");
        jTextPaciente.setText("");
        jFormData.setText("");
        jFormHora.setText("");
        
    }
    
}
