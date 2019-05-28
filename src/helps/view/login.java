
package helps.view;

import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    String login, senha, lembrar, sobre;
    
    public login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TLoginEmail = new javax.swing.JTextField();
        TLoginSenha = new javax.swing.JTextField();
        LLogin = new javax.swing.JLabel();
        LSenha = new javax.swing.JLabel();
        BEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BCadastraragora = new javax.swing.JButton();
        BSobre = new javax.swing.JButton();
        LIcone = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 255));
        setIconImages(null);

        TLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TLoginSenhaActionPerformed(evt);
            }
        });

        LLogin.setText("E-mail:");

        LSenha.setText("Senha:");

        BEntrar.setText("Entrar");
        BEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Não possui cadastro?");

        BCadastraragora.setText("Cadastrar Agora");
        BCadastraragora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastraragoraActionPerformed(evt);
            }
        });

        BSobre.setText("Sobre nós");
        BSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSobreActionPerformed(evt);
            }
        });

        LIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helps/icon/RQG4Ufm.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BSobre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(BEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(BCadastraragora, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LSenha, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TLoginEmail)
                                    .addComponent(TLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(LIcone)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LIcone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TLoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LLogin))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LSenha))
                .addGap(18, 18, 18)
                .addComponent(BEntrar)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCadastraragora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BSobre)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BCadastraragoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastraragoraActionPerformed
        cadastro cd = new cadastro();
        cd.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_BCadastraragoraActionPerformed

    private void BEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarActionPerformed
      
        if(TLoginEmail.getText().equals("") || TLoginSenha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Login ou Senha inválido.", "Invalido !", JOptionPane.ERROR_MESSAGE);
        
        
        
        
        escolha es = new escolha();
        es.setVisible(true);
        dispose(); 
        // Verificar dados existentes.
        }
    }//GEN-LAST:event_BEntrarActionPerformed

    private void BSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSobreActionPerformed
    sobre = "Alunos = Gabriel, Lucas, Richard, Zeka." + "\n" + "Turma = Info_17" + "\n" + "Escola = Cedup" + "\n" + "2019";
    JOptionPane.showMessageDialog(null, sobre);
    }//GEN-LAST:event_BSobreActionPerformed

    private void TLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TLoginSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TLoginSenhaActionPerformed
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCadastraragora;
    private javax.swing.JButton BEntrar;
    private javax.swing.JButton BSobre;
    private javax.swing.JLabel LIcone;
    private javax.swing.JLabel LLogin;
    private javax.swing.JLabel LSenha;
    private javax.swing.JTextField TLoginEmail;
    private javax.swing.JTextField TLoginSenha;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
