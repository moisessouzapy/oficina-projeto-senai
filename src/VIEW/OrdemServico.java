/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DTO.Pessoa;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junio
 */
public class OrdemServico extends javax.swing.JFrame {

    /**
     * Creates new form OrdemServico
     */
    public OrdemServico() {
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
        lblApagar = new javax.swing.JButton();
        lblConcluir = new javax.swing.JButton();
        lblConcluidos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordens de Serviço");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Ordens de Serviço");

        lblApagar.setBackground(new java.awt.Color(51, 0, 255));
        lblApagar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblApagar.setForeground(new java.awt.Color(255, 255, 255));
        lblApagar.setText("Deletar");
        lblApagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblApagarActionPerformed(evt);
            }
        });

        lblConcluir.setBackground(new java.awt.Color(51, 0, 255));
        lblConcluir.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblConcluir.setForeground(new java.awt.Color(255, 255, 255));
        lblConcluir.setText("Concluir");
        lblConcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblConcluirActionPerformed(evt);
            }
        });

        lblConcluidos.setBackground(new java.awt.Color(51, 0, 255));
        lblConcluidos.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblConcluidos.setForeground(new java.awt.Color(255, 255, 255));
        lblConcluidos.setText("Ver Concluidas");
        lblConcluidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblConcluidosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 0, 255));
        jButton5.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Voltar");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cpf do Cliente", "Cpf do Mecânico", "Valor", "Serviço"
            }
        ));
        tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblApagar)
                        .addGap(18, 18, 18)
                        .addComponent(lblConcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblConcluidos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblApagar)
                            .addComponent(lblConcluir)
                            .addComponent(lblConcluidos))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TelaGerente g2 = new TelaGerente();
        g2.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
atualizarTabela();        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaAncestorAdded

    private void lblApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblApagarActionPerformed
DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        Object id = dtmTabela.getValueAt(tabela.getSelectedRow(), 0);
        try {
            Connection con;
            PreparedStatement st;
            tabela.getModel();
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "delete from tbordem where id= (?)";
            PreparedStatement pstn = con.prepareStatement(sql);
            pstn.setObject(1, id);
            pstn.execute();
            pstn.close();
            JOptionPane.showMessageDialog(null,"Deletado");
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_lblApagarActionPerformed

    private void lblConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblConcluirActionPerformed
DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        Object id = dtmTabela.getValueAt(tabela.getSelectedRow(), 0);
        try {
            Connection con;
            PreparedStatement st;
            tabela.getModel();
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "insert into tbconcluidos(cpfCliente,cpfMecanico,valor,servico) select cpfCliente_,cpfMecanico_,valor,servico from tbordem where id= (?)";
            PreparedStatement pstn = con.prepareStatement(sql);
            pstn.setObject(1, id);
            pstn.execute();
            pstn.close();
            atualizarTabela();
            String sql1 = "delete from tbordem where id= (?)";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setObject(1, id);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null,"Concluido");
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_lblConcluirActionPerformed

    private void lblConcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblConcluidosActionPerformed
        ServicoConcluidoGerente sc = new ServicoConcluidoGerente();
        sc.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblConcluidosActionPerformed
 public void atualizarTabela() {
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        List<Pessoa> lista = new ArrayList();
        dtmTabela.setRowCount(0);
        try {
            Connection con;
            PreparedStatement st;
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "select * from tbordem";
            st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            lista.clear();
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setID(rs.getInt("ID"));
                pessoa.setCpf_Cliente(rs.getString("cpfCliente_"));
                pessoa.setCpf_Mecanico(rs.getString("cpfMecanico_"));
                pessoa.setValor(rs.getString("valor"));
                pessoa.setServicos(rs.getString("servico"));
                lista.add(pessoa);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
       
        Pessoa pessoa = new Pessoa();
        for(Pessoa p:lista){
        Object[] dados = {p.getID(),p.getCpf_Cliente(),p.getCpf_Mecanico(),p.getValor(),p.getServicos()};
        dtmTabela.addRow(dados);
        }
        
}
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
            java.util.logging.Logger.getLogger(OrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdemServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdemServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lblApagar;
    private javax.swing.JButton lblConcluidos;
    private javax.swing.JButton lblConcluir;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}