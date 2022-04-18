/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
public class VerOrcamentos extends javax.swing.JFrame {

    /**
     * Creates new form VerOrcamentos
     */
    public VerOrcamentos() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ver Orçamento");
        setResizable(false);

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jButton1.setText("Voltar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 24)); // NOI18N
        jLabel1.setText("Ver Orçamentos");

        jButton2.setBackground(new java.awt.Color(255, 204, 51));
        jButton2.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jButton2.setText("Deletar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cpf do Cliente", "Cpf do Mecânico", "Valor R$", "Serviços"
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

        jButton3.setBackground(new java.awt.Color(255, 204, 51));
        jButton3.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jButton3.setText("Transformar em ordem de serviço");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(jButton1)
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton2)
                        .addGap(63, 63, 63)
                        .addComponent(jButton3)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaRecepcionista voltar1 = new TelaRecepcionista();
            voltar1.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        Object id = dtmTabela.getValueAt(tabela.getSelectedRow(), 0);
        try {
            Connection con;
            PreparedStatement st;
            tabela.getModel();
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "delete from tborcamentos where id= (?)";
            PreparedStatement pstn = con.prepareStatement(sql);
            pstn.setObject(1, id);
            pstn.execute();
            pstn.close();
            JOptionPane.showMessageDialog(null,"Deletado");
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaAncestorAdded
atualizarTabela();
    }//GEN-LAST:event_tabelaAncestorAdded

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        Object id = dtmTabela.getValueAt(tabela.getSelectedRow(), 0);
        try {
            Connection con;
            PreparedStatement st;
            tabela.getModel();
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "insert into tbordem(cpfCliente_,cpfMecanico_,valor,servico) select cpf_Cliente,cpf_Mecanico,valor,servicos from tborcamentos where id= (?)";
            PreparedStatement pstn = con.prepareStatement(sql);
            pstn.setObject(1, id);
            pstn.execute();
            pstn.close();
            atualizarTabela();
            String sql1 = "delete from tborcamentos where id= (?)";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setObject(1, id);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null,"Transformado em ordem de serviço");
            atualizarTabela();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed
public void atualizarTabela() {
        DefaultTableModel dtmTabela = (DefaultTableModel) tabela.getModel();
        List<Pessoa> lista = new ArrayList();
        dtmTabela.setRowCount(0);
        try {
            Connection con;
            PreparedStatement st;
            con = DriverManager.getConnection("jdbc:sqlite:banco/banco_oficina.db");
            String sql = "select * from tborcamentos";
            st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            lista.clear();
            while(rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setID(rs.getInt("ID"));
                pessoa.setCpf_Cliente(rs.getString("cpf_Cliente"));
                pessoa.setCpf_Mecanico(rs.getString("cpf_Mecanico"));
                pessoa.setValor(rs.getString("valor"));
                pessoa.setServicos(rs.getString("servicos"));
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
            java.util.logging.Logger.getLogger(VerOrcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerOrcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerOrcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerOrcamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerOrcamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
