/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author sony
 */
public class Principal2 extends javax.swing.JFrame {

    /**
     * Creates new form Principal2
     */
    public Principal2() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSueldoBase = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroHijos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBonificacion = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Bonificacion Por Hijos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sueldo Base");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));
        jPanel1.add(txtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Numero de Hijos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        jPanel1.add(txtNumeroHijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Monto de La Bonificacion :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Total a Pagar :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));
        jPanel1.add(txtBonificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 130, 30));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 130, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 600, 10));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
     String res1,res2;
     int bonif,total,nhijos,sueldob;
        
     sueldob= Integer.parseInt(txtSueldoBase.getText());   
     nhijos= Integer.parseInt(txtNumeroHijos.getText()); 
     
     bonif=80000*nhijos;
     total=sueldob+bonif;
     
     res1=String.valueOf(bonif); 
     res2=String.valueOf(total); 
     
     txtBonificacion.setText(res1);
     txtTotal.setText(res2);
             
     
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
     
    txtSueldoBase.setText("");
    txtNumeroHijos.setText("");
    txtBonificacion.setText("");
    txtTotal.setText("");

    txtSueldoBase.requestFocusInWindow();
    
    
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBonificacion;
    private javax.swing.JTextField txtNumeroHijos;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
