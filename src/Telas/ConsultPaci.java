package Telas;

import Model.Paciente;
import dao.DaoPaciente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultPaci extends javax.swing.JInternalFrame {

    /** Creates new form ConsultPaci */
    public ConsultPaci() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtCod = new javax.swing.JTextField();
        TxtNome = new javax.swing.JTextField();
        BtOk = new javax.swing.JButton();
        BtOk2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPaci = new javax.swing.JTable();
        Cancela = new javax.swing.JButton();
        CadPaci = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Paciente");

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        TxtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodActionPerformed(evt);
            }
        });

        TxtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNomeActionPerformed(evt);
            }
        });

        BtOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Ok-icon.png"))); // NOI18N
        BtOk.setText("OK");
        BtOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOkActionPerformed(evt);
            }
        });

        BtOk2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Ok-icon.png"))); // NOI18N
        BtOk2.setText("OK");
        BtOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtOk2ActionPerformed(evt);
            }
        });

        tabelaPaci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "null", "null", "Título 3", "null"
            }
        ));
        jScrollPane1.setViewportView(tabelaPaci);

        Cancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Cancelar.png"))); // NOI18N
        Cancela.setText("Cancelar");
        Cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaActionPerformed(evt);
            }
        });

        CadPaci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/unordered_list.png"))); // NOI18N
        CadPaci.setText("Cad.Paciente");

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Cancelar.png"))); // NOI18N
        btExcluir.setText("Excluir Paciente");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/ID-icon.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/icone_ata_orient_pac_acomp.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CadPaci)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtOk2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtOk)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtOk)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BtOk2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancela)
                    .addComponent(CadPaci, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOk2ActionPerformed
  try{ 
      if (TxtNome.getText().equals(""))
         carregarGrid(BuscarTodos());
      else
          carregarGrid(BuscarTodosPorNome());
          TxtNome.setText("");
  }catch(Exception ex) {
   JOptionPane.showMessageDialog(null, 
                            "Problemas ao tentar carregar paciente "+ex.getMessage());
  }
    }//GEN-LAST:event_BtOk2ActionPerformed

    private void TxtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodActionPerformed

    private void CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaActionPerformed
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_CancelaActionPerformed

    private void TxtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNomeActionPerformed

    private void BtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtOkActionPerformed
      try{ 
      if (TxtCod.getText().equals(""))
         carregarGrid(BuscarTodos());
      else
         carregarGrid(BuscarTodosPorCod());
         TxtCod.setText("");
        }catch(Exception ex) {
         JOptionPane.showMessageDialog(null, 
                            "Problemas ao tentar carregar paciente "+ex.getMessage());
  }
    }//GEN-LAST:event_BtOkActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
      int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo a ser excluido"));
            DaoPaciente daoPaciente = new DaoPaciente();
            try {
                daoPaciente.excluir(cod);
                carregarGrid(BuscarTodos());
                 TxtNome.setText("");
                 TxtCod.setText("");
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro");
            }
        
    }//GEN-LAST:event_btExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtOk;
    private javax.swing.JButton BtOk2;
    private javax.swing.JButton CadPaci;
    private javax.swing.JButton Cancela;
    private javax.swing.JTextField TxtCod;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPaci;
    // End of variables declaration//GEN-END:variables

     private void carregarGrid(DefaultTableModel dtm) throws SQLException, ClassNotFoundException, java.sql.SQLException{
        tabelaPaci.setModel(dtm);
    }
    
    public DefaultTableModel BuscarTodos() throws SQLException, ClassNotFoundException, java.sql.SQLException{  
          
        DefaultTableModel dtm = new DefaultTableModel(){   
        @Override  
        public boolean isCellEditable(int row, int col)   
              {   
                     return false;   
              }   
        };  
                
        dtm.addColumn("Código");
        dtm.addColumn("CPF");  
        dtm.addColumn("Nome");
        dtm.addColumn("Telefone");
          
        DaoPaciente daoPaciente = new DaoPaciente();
        Paciente[] pacientes = daoPaciente.listarTodos();
        for(Paciente c: pacientes) {  
            
            dtm.addRow(new String[]{c.getCodigo()+"",c.getCpf(),
               c.getNome(),c.getTelefone()});
        }  
        daoPaciente.fecharConexao();
        return dtm;   
    }
    
    public DefaultTableModel BuscarTodosPorNome() throws SQLException, ClassNotFoundException, java.sql.SQLException{  
          
        DefaultTableModel dtm = new DefaultTableModel(){   
        @Override  
        public boolean isCellEditable(int row, int col)   
              {   
                     return false;   
              }   
        };  
                
        dtm.addColumn("Código");
        dtm.addColumn("CPF");  
        dtm.addColumn("Nome");
        dtm.addColumn("Telefone");
          
        DaoPaciente daoPaciente = new DaoPaciente();
        Paciente[] pacientes = daoPaciente.listartodosPornome("%"+TxtNome.getText()+"%");
        for(Paciente c: pacientes) {  
            
            dtm.addRow(new String[]{c.getCodigo()+"",c.getCpf(),
               c.getNome(),c.getTelefone()});
        }  
        daoPaciente.fecharConexao();
        return dtm;  
    }
    public DefaultTableModel BuscarTodosPorCod() throws SQLException, ClassNotFoundException, java.sql.SQLException{  
          
        DefaultTableModel dtm = new DefaultTableModel(){   
        @Override  
        public boolean isCellEditable(int row, int col)   
              {   
                     return false;   
              }   
        };  
                
        dtm.addColumn("Código");
        dtm.addColumn("CPF");  
        dtm.addColumn("Nome");
        dtm.addColumn("Telefone");
          
        DaoPaciente daoPaciente = new DaoPaciente();
        Paciente[] pacientes = daoPaciente.listartodosPorCod(TxtCod.getText());
        for(Paciente c: pacientes) {  
            
            dtm.addRow(new String[]{c.getCodigo()+"",c.getCpf(),
               c.getNome(),c.getTelefone()});
        }  
        daoPaciente.fecharConexao();
        return dtm;  
    }

    private static class SQLException extends Exception {

        public SQLException() {
        }
    }
    
}
