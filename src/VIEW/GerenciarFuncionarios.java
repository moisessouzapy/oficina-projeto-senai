/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import DTO.Funcionario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/*import DAO.Conexao;*/
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author junio
 */
public class GerenciarFuncionarios extends javax.swing.JFrame {
    public GerenciarFuncionarios() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFuncionario = new javax.swing.JTextField();
        lblCargo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblSenha = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lblCpf = new javax.swing.JTextField();
        lblAdicionar = new javax.swing.JButton();
        lblEditar = new javax.swing.JButton();
        lblDeletar = new javax.swing.JButton();
        lblLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Funcionários");
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Sistema de Gerenciamento de Funcionários");

        lblVoltar.setBackground(new java.awt.Color(51, 0, 255));
        lblVoltar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblVoltar.setForeground(new java.awt.Color(255, 255, 255));
        lblVoltar.setText("Voltar");
        lblVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblVoltarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Funcionário");

        jLabel3.setText("Cargo do Funcionário");

        lblFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblFuncionarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha");

        jLabel5.setText("CPF");

        lblAdicionar.setBackground(new java.awt.Color(51, 0, 255));
        lblAdicionar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        lblAdicionar.setText("Adicionar");
        lblAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblAdicionarActionPerformed(evt);
            }
        });

        lblEditar.setBackground(new java.awt.Color(51, 0, 255));
        lblEditar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblEditar.setForeground(new java.awt.Color(255, 255, 255));
        lblEditar.setText("Editar");
        lblEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEditarActionPerformed(evt);
            }
        });

        lblDeletar.setBackground(new java.awt.Color(51, 0, 255));
        lblDeletar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblDeletar.setForeground(new java.awt.Color(255, 255, 255));
        lblDeletar.setText("Deletar");
        lblDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDeletarActionPerformed(evt);
            }
        });

        lblLimpar.setBackground(new java.awt.Color(51, 0, 255));
        lblLimpar.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        lblLimpar.setForeground(new java.awt.Color(255, 255, 255));
        lblLimpar.setText("Limpar Campos");
        lblLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLimparActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Cargo", "Senha", "Cpf"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                tabelaAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFuncionario)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVoltar)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lblAdicionar)
                        .addGap(18, 18, 18)
                        .addComponent(lblEditar)
                        .addGap(16, 16, 16)
                        .addComponent(lblDeletar)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblSenha)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblLimpar))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblVoltar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAdicionar)
                        .addComponent(lblEditar)
                        .addComponent(lblDeletar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblVoltarActionPerformed
TelaGerente gerente = new TelaGerente();
            gerente.setVisible(true);
            dispose();
    }//GEN-LAST:event_lblVoltarActionPerformed

    private void lblDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDeletarActionPerformed
          
DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        Object id = dtmTabela.getValueAt(tabela.getSelectedRow(), 0);
        try {
            Connection con;
            PreparedStatement st;
            tabela.getModel();
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "delete from tbfuncionario where id= (?)";
            PreparedStatement pstn = con.prepareStatement(sql);
            pstn.setObject(1, id);
            pstn.execute();
            pstn.close();
            JOptionPane.showMessageDialog(null,"Deletado");
            atualizarTabela();
            lblFuncionario.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_lblDeletarActionPerformed

    private void lblAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblAdicionarActionPerformed
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        try {
            Connection con;
            Statement st;
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            st = con.createStatement();
            st.executeUpdate("insert into tbfuncionario(nome,cargo,senha,cpf) values('" + lblFuncionario.getText() + "','" + lblCargo.getText() + "','" + lblSenha.getText() + "','"+ lblCpf.getText()+"')");
            JOptionPane.showMessageDialog(null,"Inseridos");
            limparCampos();
            lblFuncionario.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        atualizarTabela();
        
    }//GEN-LAST:event_lblAdicionarActionPerformed

    private void lblFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblFuncionarioActionPerformed
        
    }//GEN-LAST:event_lblFuncionarioActionPerformed

    private void limparCampos(){
            lblFuncionario.setText("");
            lblCargo.setText("");
            lblSenha.setText("");
            lblCpf.setText("");
            lblFuncionario.requestFocus();
    }
    private void lblLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLimparActionPerformed
            limparCampos();
    }//GEN-LAST:event_lblLimparActionPerformed

    private void lblEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEditarActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            int selectedRowIndex = tabela.getSelectedRow();
            Connection conn;
            PreparedStatement pstm;
            tabela.getModel();
            conn = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = " UPDATE tbfuncionario SET nome = ?, cargo = ?, senha = ?, cpf = ? WHERE ID = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, lblFuncionario.getText());
            pstm.setString(2, lblCargo.getText());
            pstm.setString(3, lblSenha.getText());
            pstm.setString(4, lblCpf.getText());
            pstm.setString(5, model.getValueAt(selectedRowIndex, 0).toString());
            JOptionPane.showMessageDialog(null, "Atualizado");
            pstm.execute();
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }         // TODO add your handling code here:
    }//GEN-LAST:event_lblEditarActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
        atualizarTabela();

    }//GEN-LAST:event_tabelaAncestorAdded

    private void tabelaAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaAncestorMoved

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
    
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        int selectedRowIndex = tabela.getSelectedRow();
        
        lblFuncionario.setText(dtmTabela.getValueAt(selectedRowIndex, 1).toString());
        lblCargo.setText(dtmTabela.getValueAt(selectedRowIndex, 2).toString());
        lblSenha.setText(dtmTabela.getValueAt(selectedRowIndex, 3).toString());
        lblCpf.setText(dtmTabela.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_tabelaMouseClicked

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
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciarFuncionarios().setVisible(true);
            }
        });
    }
    
    public void atualizarTabela() {
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        List<Funcionario> lista = new ArrayList();
        dtmTabela.setRowCount(0);
        try {
            Connection con;
            PreparedStatement st;
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "select * from tbfuncionario";
            st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            lista.clear();
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                funcionario.setID(rs.getInt("ID"));
                funcionario.setNome(rs.getString("nome"));
                funcionario.setCargo(rs.getString("cargo"));
                funcionario.setSenha(rs.getString("senha"));
                funcionario.setCpf(rs.getString("cpf"));
                lista.add(funcionario);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
       
        Funcionario funcionario = new Funcionario();
        for(Funcionario f:lista){
        Object[] dados = {f.getID(),f.getNome(),f.getCargo(),f.getSenha(),f.getCpf()};
        dtmTabela.addRow(dados);
        }
        
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lblAdicionar;
    private javax.swing.JTextField lblCargo;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JButton lblDeletar;
    private javax.swing.JButton lblEditar;
    private javax.swing.JTextField lblFuncionario;
    private javax.swing.JButton lblLimpar;
    private javax.swing.JPasswordField lblSenha;
    private javax.swing.JButton lblVoltar;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
