/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classesbancortr.Conta;
import classesbancortr.*;
import javax.swing.JOptionPane;

/**
 *
 * @author roger
 */
public class TelaBancoRTR extends javax.swing.JFrame {

    ContaCorrenteSimples clienteSimples = null;
    ContaCorrenteComLimite clienteLimite = null;
    ContaPoupanca clientePoupanca = null;

    /**
     * Creates new form TelaBancoRTR
     */
    public TelaBancoRTR() {
        initComponents();

        jTextField1Saldo.setEnabled(false);
        jTextFieldValor.setEnabled(false);
        jButtonDepositar.setEnabled(false);
        jButtonSacar.setEnabled(false);
        jButtonTransferir.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jTextFieldAgencia = new javax.swing.JTextField();
        jTextFieldConta = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonDepositar = new javax.swing.JButton();
        jButtonSacar = new javax.swing.JButton();
        jButtonTransferir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTipoDeConta = new javax.swing.JTextField();
        jTextFieldMes = new javax.swing.JTextField();
        jTextFieldAno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1Saldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSaidaTransferência = new javax.swing.JTextArea();
        jButtonCriarConta = new javax.swing.JButton();
        jButtonLimparCampos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banco RTR S/A");

        jLabel1.setText("Informações e Transações realizadas");

        jLabel2.setText("Data de Abertura");

        jLabel3.setText("Nome");

        jLabel4.setText("CPF/CNPF");

        jLabel5.setText("Agência");

        jLabel6.setText("Conta");

        jButtonDepositar.setText("Depositar");
        jButtonDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositarActionPerformed(evt);
            }
        });

        jButtonSacar.setText("Sacar");
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });

        jButtonTransferir.setText("Transferir");
        jButtonTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransferirActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor");

        jLabel8.setText("Tipo de Conta");

        jLabel9.setText("Dados da Transferência");

        jLabel10.setText("Saldo");

        jTextAreaSaidaTransferência.setColumns(20);
        jTextAreaSaidaTransferência.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSaidaTransferência);

        jButtonCriarConta.setText("Criar Conta");
        jButtonCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarContaActionPerformed(evt);
            }
        });

        jButtonLimparCampos.setText("Limpar Campos");
        jButtonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jButtonDepositar)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeCompleto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldTipoDeConta, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCriarConta))
                            .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonSacar)
                                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(jButtonTransferir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                        .addComponent(jButtonLimparCampos)))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTipoDeConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCriarConta))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1Saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDepositar)
                    .addComponent(jButtonSacar)
                    .addComponent(jButtonTransferir)
                    .addComponent(jButtonLimparCampos))
                .addGap(21, 21, 21)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarContaActionPerformed
        try {
            clientePoupanca = new ContaPoupanca(30, 04, 2020, "Barnabé do Sítio",
                    "123456789-14", "1234", "12.345-4", "Conta Poupança");
            clienteLimite = new ContaCorrenteComLimite(
                    Integer.parseInt(jTextFieldDia.getText()),
                    Integer.parseInt(jTextFieldMes.getText()),
                    Integer.parseInt(jTextFieldAno.getText()),
                    jTextFieldNomeCompleto.getText(),
                    jTextFieldCPF.getText(),
                    jTextFieldAgencia.getText(),
                    jTextFieldConta.getText(),
                    jTextFieldTipoDeConta.getText());

            jTextField1Saldo.setText("R$ " + clienteLimite.getSaldo());

            jTextFieldDia.setEnabled(false);
            jTextFieldMes.setEnabled(false);
            jTextFieldAno.setEnabled(false);
            jTextFieldNomeCompleto.setEnabled(false);
            jTextFieldCPF.setEnabled(false);
            jTextFieldAgencia.setEnabled(false);
            jTextFieldConta.setEnabled(false);
            jTextFieldTipoDeConta.setEnabled(false);

            jTextFieldValor.setEnabled(true);
            jButtonDepositar.setEnabled(true);
            jButtonSacar.setEnabled(true);
            jButtonTransferir.setEnabled(true);

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonCriarContaActionPerformed

    private void jButtonDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositarActionPerformed
        try {
            clienteLimite.depositar(Float.parseFloat(jTextFieldValor.getText()));
            jTextField1Saldo.setText("R$ " + clienteLimite.getSaldo());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }


    }//GEN-LAST:event_jButtonDepositarActionPerformed

    private void jButtonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparCamposActionPerformed
        jTextFieldDia.setText("");
        jTextFieldMes.setText("");
        jTextFieldAno.setText("");
        jTextFieldNomeCompleto.setText("");
        jTextFieldCPF.setText("");
        jTextFieldAgencia.setText("");
        jTextFieldConta.setText("");
        jTextField1Saldo.setText("");
        jTextFieldTipoDeConta.setText("");
        jTextFieldValor.setText("");
        jTextAreaSaidaTransferência.setText("");

        jTextFieldDia.setEnabled(true);
        jTextFieldMes.setEnabled(true);
        jTextFieldAno.setEnabled(true);
        jTextFieldNomeCompleto.setEnabled(true);
        jTextFieldCPF.setEnabled(true);
        jTextFieldAgencia.setEnabled(true);
        jTextFieldConta.setEnabled(true);
        jTextFieldTipoDeConta.setEnabled(true);
    }//GEN-LAST:event_jButtonLimparCamposActionPerformed

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed
        try {
            clienteLimite.sacar(Float.parseFloat(jTextFieldValor.getText()));
            jTextField1Saldo.setText("R$ " + clienteLimite.getSaldo());
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonSacarActionPerformed

    private void jButtonTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransferirActionPerformed

        try {            
            jTextAreaSaidaTransferência.setText("Dados da Transferência na Conta Destinatária \n"
                    + "Valor Transferido --> R$ " +  clienteLimite.transferir(clientePoupanca,
                            Float.parseFloat(jTextFieldValor.getText()))
                    + "\n" +  clientePoupanca.toString());
            jTextField1Saldo.setText("R$ " + clienteLimite.getSaldo());
           

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
    }//GEN-LAST:event_jButtonTransferirActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBancoRTR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBancoRTR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBancoRTR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBancoRTR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBancoRTR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriarConta;
    private javax.swing.JButton jButtonDepositar;
    private javax.swing.JButton jButtonLimparCampos;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JButton jButtonTransferir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSaidaTransferência;
    private javax.swing.JTextField jTextField1Saldo;
    private javax.swing.JTextField jTextFieldAgencia;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldConta;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldMes;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    private javax.swing.JTextField jTextFieldTipoDeConta;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
