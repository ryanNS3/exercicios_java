/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tela;

import  java.sql.*;
import dal.ModuloConexao;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author CT Desenvolvimento
 */
public class Cadastro extends javax.swing.JInternalFrame {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
        conexao = ModuloConexao.conector();
        
    }
    
    
    private void consultar(){
        String sql = "SELECT * FROM contato WHERE id = ? ";
        
        try{
            pst = conexao.prepareCall(sql);
            pst.setString(1, txtId.getText());
            rs=pst.executeQuery();
            
            if( rs.next()){
            txtNome.setText(rs.getString(2));
            txtEmail.setText(rs.getString(3));
            txtCelular.setText(rs.getString(4));
            txtMes.setText(rs.getString(5));
            
            } else{
                
                // programar o metodo incluindo o else que será
                // executado  caso o sistema não encontre um usuário
                // espeificado na tabela
                JOptionPane.showMessageDialog(null, "usuário não cadastrado", "erro", HEIGHT);
                // as linhas abaixo limpam os campos do formulários
                txtNome.setText(rs.getString(null));
                txtEmail.setText(rs.getString(null));
                txtCelular.setText(rs.getString(null));
                txtMes.setText(rs.getString(null));
                
            }
           
        }
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ocorreu algum erro", HEIGHT);
        }
        
        
    }
    
    private void adicionar(){
        String sql = "INSERT INTO contato (nome,celular,email,mes) VALUES(?,?,?,?)";
        try{
            if (txtCelular.getText().isBlank() || txtEmail.getText().isBlank() || txtNome.getText().isBlank() || txtMes.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "digite todos ");
            }
            else{
                     pst = conexao.prepareStatement(sql);
           pst.setString(1, txtNome.getText());
           pst.setString(2, txtCelular.getText());
           pst.setString(3, txtEmail.getText());
            pst.setString(4, txtMes.getText());
           int adicionar =  pst.executeUpdate();
           
           if (adicionar > 0){
               JOptionPane.showMessageDialog(null, "usuário adicionado", "sucesso", HEIGHT);
               // limpar formulário
               txtNome.setText(null);
               txtEmail.setText(null);
               txtCelular.setText(null);
               txtMes.setText(null);
             
               
           }
                
            }
           
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "e", "Erro", HEIGHT);
        }
    }
    
    private void alterar(){
            String sql = "UPDATE contato SET nome=?,celular=?,email=?,mes=? WHERE id=?";
            try{
                pst=conexao.prepareStatement(sql);
                pst.setString(1, txtNome.getText());
                pst.setString(2, txtCelular.getText());
                pst.setString(3, txtEmail.getText());
                pst.setString(4, txtMes.getText());
                
                int adicionar = pst.executeUpdate();
                
                if (adicionar > 0){
                    JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso", "sucesso", HEIGHT);
                    txtNome.setText(null);
                    txtEmail.setText(null);
                    txtCelular.setText(null);
                    txtMes.setText(null);
                }
            
            }
            
            catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e, "Erro", HEIGHT);
            }
    }
    
    private void excluir(){
     int confirmar = JOptionPane.showConfirmDialog(null, "tem certeza que deseja apagar este campo?", "confirmar", WIDTH);
    
    
    if (confirmar == JOptionPane.YES_OPTION){
        String sql = "DELETE  FROM contato WHERE id=? ";
        
        try{
                pst=conexao.prepareStatement(sql);
             
                pst.setString(1, txtId.getText());
                
                int adicionar = pst.executeUpdate();
                
                if (adicionar > 0){
                    JOptionPane.showMessageDialog(null, "Usuário deletado com sucesso", "sucesso", HEIGHT);
                    txtNome.setText(null);
                    txtEmail.setText(null);
                    txtCelular.setText(null);
                    txtMes.setText(null);
                }
            
            }
            
            catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e, "Erro", HEIGHT);
            }
    }
    
    
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
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        visualizar = new javax.swing.JButton();
        adicionar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de contatos");

        jLabel2.setText("ID");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jLabel4.setText("Celular");

        jLabel5.setText("Email");

        jLabel6.setText("Mes aniversário");

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        visualizar.setText("visualizar");
        visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarActionPerformed(evt);
            }
        });

        adicionar.setText("Adicionar");
        adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail))))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(adicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(excluir)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adicionar)
                    .addComponent(editar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizar)
                    .addComponent(excluir))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_editarActionPerformed

    private void adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarActionPerformed
        // TODO add your handling code here:
        adicionar();
    }//GEN-LAST:event_adicionarActionPerformed

    private void visualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarActionPerformed
        // TODO add your handling code here:
        consultar();
    }//GEN-LAST:event_visualizarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        excluir();
    }//GEN-LAST:event_excluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionar;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    private javax.swing.JButton visualizar;
    // End of variables declaration//GEN-END:variables
}
