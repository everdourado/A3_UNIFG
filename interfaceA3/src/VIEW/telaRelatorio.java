/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VIEW;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MODELS.relatorioModel;
import REPOSITORY.relatorioRepository;
import java.sql.SQLException;
import java.util.List;

public class telaRelatorio extends javax.swing.JInternalFrame {


    public telaRelatorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrenda = new javax.swing.JTextField();
        txtgasto = new javax.swing.JTextField();
        btnCadastrarConta = new javax.swing.JButton();
        btnExcluirConta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtmes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaRela = new javax.swing.JTable();
        btnDadosRela = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Renda");

        jLabel2.setText("Gasto");

        btnCadastrarConta.setText("Cadastrar");
        btnCadastrarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarContaActionPerformed(evt);
            }
        });

        btnExcluirConta.setText("Excluir");
        btnExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirContaActionPerformed(evt);
            }
        });

        jLabel3.setText("Mês");

        tabelaRela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Renda", "Gasto", "Mês"
            }
        ));
        jScrollPane1.setViewportView(tabelaRela);

        btnDadosRela.setText("Carregar dados");
        btnDadosRela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosRelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtrenda, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtgasto, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDadosRela)
                        .addGap(31, 31, 31)
                        .addComponent(btnExcluirConta)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtgasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarConta)
                    .addComponent(btnExcluirConta)
                    .addComponent(btnDadosRela))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarContaActionPerformed
       String renda = txtrenda.getText();
       String gasto = txtgasto.getText();
       String mes = txtmes.getText();
       
       relatorioModel relatorio = new relatorioModel(renda,gasto,mes);
       
       relatorioRepository repository = new relatorioRepository();
       
       repository.CreateRelatorio(relatorio);
       
       txtrenda.setText("");
        txtgasto.setText("");
        txtmes.setText("");
    }//GEN-LAST:event_btnCadastrarContaActionPerformed

    private void btnExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirContaActionPerformed
         if(tabelaRela.getSelectedRow() != -1){
        
DefaultTableModel dtmRela = (DefaultTableModel) tabelaRela.getModel();
dtmRela.removeRow(tabelaRela.getSelectedRow());
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um produto pra excluir.");
        }
    }//GEN-LAST:event_btnExcluirContaActionPerformed

    private void btnDadosRelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDadosRelaActionPerformed
         try {
            relatorioRepository relaRepositorio = new relatorioRepository();
           List<relatorioModel> listaconta = relaRepositorio.readAllRelatorio();
            DefaultTableModel tabelaRela
                    = (DefaultTableModel) this.tabelaRela.getModel();
            tabelaRela.setNumRows(0);
            for (relatorioModel relatorioModel : listaconta) {
                Object[] novoProduto = new Object[]{
                    relatorioModel.getRenda(), relatorioModel.getGasto(), relatorioModel.getMes()
                };
                tabelaRela.addRow(novoProduto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro");
        }

    }//GEN-LAST:event_btnDadosRelaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarConta;
    private javax.swing.JButton btnDadosRela;
    private javax.swing.JButton btnExcluirConta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaRela;
    private javax.swing.JTextField txtgasto;
    private javax.swing.JTextField txtmes;
    private javax.swing.JTextField txtrenda;
    // End of variables declaration//GEN-END:variables
}
