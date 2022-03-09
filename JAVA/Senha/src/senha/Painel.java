
package senha;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Painel extends javax.swing.JFrame {
    List<Senha> listaSenhas;
    int numero;
    public Painel() {
        initComponents();
        numero = 0;
        listaSenhas = new ArrayList<>();
        
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CampoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comum = new javax.swing.JButton();
        rapido = new javax.swing.JButton();
        prioritario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        caixa1 = new javax.swing.JButton();
        caixa2 = new javax.swing.JButton();
        caixa3 = new javax.swing.JButton();
        caixa4 = new javax.swing.JButton();
        CampoSenha = new javax.swing.JLabel();
        CampoCaixa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Para clientes:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Para caixas:");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Escolha seu tipo de atendimento");

        CampoCliente.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel4.setText("Sua senha é:");

        comum.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        comum.setText("Comum");
        comum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comumActionPerformed(evt);
            }
        });

        rapido.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        rapido.setText("Rápido");
        rapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rapidoActionPerformed(evt);
            }
        });

        prioritario.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        prioritario.setText("Prioritário");
        prioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioritarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(comum)
                                .addGap(18, 18, 18)
                                .addComponent(rapido)
                                .addGap(18, 18, 18)
                                .addComponent(prioritario))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(CampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comum)
                    .addComponent(rapido)
                    .addComponent(prioritario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        caixa1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        caixa1.setText("Caixa 1");
        caixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa1ActionPerformed(evt);
            }
        });

        caixa2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        caixa2.setText("Caixa 2");
        caixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa2ActionPerformed(evt);
            }
        });

        caixa3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        caixa3.setText("Caixa 3");
        caixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa3ActionPerformed(evt);
            }
        });

        caixa4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        caixa4.setText("Caixa 4");
        caixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixa1)
                    .addComponent(caixa3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caixa2)
                    .addComponent(caixa4))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa1)
                    .addComponent(caixa2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caixa3)
                    .addComponent(caixa4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CampoSenha.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        CampoSenha.setText("CAIXA ");

        CampoCaixa.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        CampoCaixa.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(CampoCaixa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoSenha)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(CampoCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comumActionPerformed
        numero++;
        Senha senha = new Senha("C-", numero);
        listaSenhas.add(senha);
        CampoCliente.setText(senha.getTipo() + String.valueOf(senha.getNumero()));
        
    }//GEN-LAST:event_comumActionPerformed

    private void caixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa1ActionPerformed
          
       Iterator<Senha> itr = listaSenhas.iterator();                       
        while( itr.hasNext() ){    
            Senha chama = itr.next();
            if ("P-".equals(chama.getTipo())){
                itr.remove();    
                CampoCaixa.setText(chama.getTipo() + String.valueOf(chama.getNumero()));                 
                CampoSenha.setText("CAIXA 1");                               
         break;     
        }        
        }                           
    }//GEN-LAST:event_caixa1ActionPerformed

    private void caixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa2ActionPerformed
        Iterator<Senha> itr = listaSenhas.iterator();       
        while (itr.hasNext()){         
            Senha chama = itr.next();
            if ("R-".equals(chama.getTipo())){
            itr.remove();
            CampoCaixa.setText(chama.getTipo() + String.valueOf(chama.getNumero()));
            CampoSenha.setText("CAIXA 2");       
        break;  
        }    
        }
    }//GEN-LAST:event_caixa2ActionPerformed

    private void rapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rapidoActionPerformed
        numero++;
        Senha senha = new Senha("R-", numero);
        listaSenhas.add(senha);
        CampoCliente.setText(senha.getTipo() + String.valueOf(senha.getNumero()));
    }//GEN-LAST:event_rapidoActionPerformed

    private void prioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioritarioActionPerformed
        numero++;
        Senha senha = new Senha("P-", numero);
        listaSenhas.add(senha);
        CampoCliente.setText(senha.getTipo() + String.valueOf(senha.getNumero()));
    }//GEN-LAST:event_prioritarioActionPerformed

    private void caixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa3ActionPerformed
        Iterator<Senha> itr = listaSenhas.iterator();
        while (itr.hasNext()){
            Senha chama = itr.next();
            if ("R-".equals(chama.getTipo())){
            itr.remove();
            CampoCaixa.setText(chama.getTipo() + String.valueOf(chama.getNumero()));
            CampoSenha.setText("CAIXA 3");      
        break; 
    }         
    }//GEN-LAST:event_caixa3ActionPerformed
    }
    private void caixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixa4ActionPerformed
        Iterator<Senha> itr = listaSenhas.iterator();
        while (itr.hasNext()){
            Senha chama = itr.next();
            if ("C-".equals(chama.getTipo())){
            itr.remove();
            CampoCaixa.setText(chama.getTipo() + String.valueOf(chama.getNumero()));
            CampoSenha.setText("CAIXA 4");
        break;
    }                            
    }//GEN-LAST:event_caixa4ActionPerformed
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
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Painel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CampoCaixa;
    private javax.swing.JTextField CampoCliente;
    private javax.swing.JLabel CampoSenha;
    private javax.swing.JButton caixa1;
    private javax.swing.JButton caixa2;
    private javax.swing.JButton caixa3;
    private javax.swing.JButton caixa4;
    private javax.swing.JButton comum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton prioritario;
    private javax.swing.JButton rapido;
    // End of variables declaration//GEN-END:variables
}
