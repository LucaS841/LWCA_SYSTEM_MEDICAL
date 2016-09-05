package Telas;

import Model.Consulta;
import dao.DaoConsulta;
import dao.DaoPaciente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultAgenda extends javax.swing.JInternalFrame {

    public ConsultAgenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableConsult = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        TxtData = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Agenda");

        jLabel1.setText("Data:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TableConsult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TableConsult);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/Cancelar.png"))); // NOI18N
        jButton2.setText("Excluir Consulta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            TxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDataActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Telas/unordered_list.png"))); // NOI18N
        jButton3.setText("Listar Todas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(48, 48, 48)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(TxtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
         if(TxtData.getText().equals("")){
           JOptionPane.showMessageDialog(null, 
                            "Digite uma data para pesquisar");
         }else{
          carregarGrid(BuscarTodosPorData());
          TxtData.setText("");
         } 
        }catch(Exception ex) {
         JOptionPane.showMessageDialog(null, 
                            "Problemas ao tentar carregar paciente "+ex.getMessage());
  }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo a ser excluido"));
            DaoConsulta daoConsulta = new DaoConsulta();
            try {
                daoConsulta.excluir(cod);
                carregarGrid(BuscarTodos());
                JOptionPane.showMessageDialog(null, "Registro excluído com sucesso");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Problemas ao excluir registro");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TxtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDataActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            carregarGrid(BuscarTodos());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultAgenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConsultAgenda.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(ConsultAgenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableConsult;
    private javax.swing.JFormattedTextField TxtData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void carregarGrid(DefaultTableModel dtm) throws ConsultAgenda.SQLException, ClassNotFoundException, java.sql.SQLException{
        TableConsult.setModel(dtm);
    }
    
    public DefaultTableModel BuscarTodos() throws ConsultAgenda.SQLException, ClassNotFoundException, java.sql.SQLException{  
          
        DefaultTableModel dtm = new DefaultTableModel(){   
        @Override  
        public boolean isCellEditable(int row, int col)   
              {   
                     return false;   
              }   
        };  
                
        dtm.addColumn("Código");
        dtm.addColumn("Paciente");  
        dtm.addColumn("Hora");
        dtm.addColumn("Data");
          
        DaoConsulta daoConsulta = new DaoConsulta();
        Consulta[] consulta = daoConsulta.listarTodos();
        for(Consulta c: consulta) {  
            
            dtm.addRow(new String[]{c.getCodigo()+"",c.getPaciente(),
               c.getHora(),c.getData()});
        }  
        daoConsulta.fecharConexao();
        return dtm;  
    }
    
    public DefaultTableModel BuscarTodosPorData() throws ConsultAgenda.SQLException, ClassNotFoundException, java.sql.SQLException{  
          
        DefaultTableModel dtm = new DefaultTableModel(){   
        @Override  
        public boolean isCellEditable(int row, int col)   
              {   
                     return false;   
              }   
        };  
                
        dtm.addColumn("Código");
        dtm.addColumn("Paciente");  
        dtm.addColumn("Hora");
          
        DaoConsulta daoConsulta = new DaoConsulta();
        Consulta[] consulta = daoConsulta.listarTodosporData(TxtData.getText());
        for(Consulta c: consulta) {  
            
            dtm.addRow(new String[]{c.getCodigo()+"",c.getPaciente(),
               c.getHora()});
        }  
        daoConsulta.fecharConexao();
        return dtm;  
    }

    private static class SQLException extends Exception {

        public SQLException() {
        }
    }
}
