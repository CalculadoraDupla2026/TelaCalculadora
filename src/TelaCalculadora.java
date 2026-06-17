public class TelaCalculadora extends javax.swing.JFrame {
public TelaCalculadora() {

        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnsomar = new javax.swing.JButton();
        btnsubtrair = new javax.swing.JButton();
        btnmultiplicar = new javax.swing.JButton();
        btndividir = new javax.swing.JButton();
        txtresultado = new javax.swing.JTextField();
        txtprimeiro = new javax.swing.JTextField();
        txtsegundo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnsomar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsomar.setText("Somar");
        btnsomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsomarActionPerformed(evt);
            }
        });

        btnsubtrair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsubtrair.setText("Subtrair");
        btnsubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubtrairActionPerformed(evt);
            }
        });

        btnmultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnmultiplicar.setText("Multiplicar");
        btnmultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiplicarActionPerformed(evt);
            }
        });

        btndividir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btndividir.setText("Dividir");
        btndividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndividirActionPerformed(evt);
            }
        });

        txtresultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnsomar)
                        .addGap(18, 18, 18)
                        .addComponent(btnsubtrair)
                        .addGap(27, 27, 27)
                        .addComponent(btnmultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btndividir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(txtprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtprimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsegundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsomar)
                    .addComponent(btnsubtrair)
                    .addComponent(btnmultiplicar)
                    .addComponent(btndividir))
                .addGap(53, 53, 53)
                .addComponent(txtresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsomarActionPerformed
double numero1 = Double.parseDouble(txtprimeiro.getText());
double numero2 = Double.parseDouble(txtsegundo.getText());
double resultado = numero1 + numero2;
txtresultado.setText(String.valueOf(resultado));                                 
        
               
    
    }//GEN-LAST:event_btnsomarActionPerformed

    private void btnsubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubtrairActionPerformed
            
    }//GEN-LAST:event_btnsubtrairActionPerformed

    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultadoActionPerformed

    }//GEN-LAST:event_txtresultadoActionPerformed

    private void btnmultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiplicarActionPerformed
        
    }//GEN-LAST:event_btnmultiplicarActionPerformed

    private void btndividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndividirActionPerformed
        
    }//GEN-LAST:event_btndividirActionPerformed

    
    public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> {
        new TelaCalculadora().setVisible(true);
    });


}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndividir;
    private javax.swing.JButton btnmultiplicar;
    private javax.swing.JButton btnsomar;
    private javax.swing.JButton btnsubtrair;
    private javax.swing.JTextField txtprimeiro;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txtsegundo;
    // End of variables declaration//GEN-END:variables
}