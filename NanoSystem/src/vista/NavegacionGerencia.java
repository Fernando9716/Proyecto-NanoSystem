/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author alega
 */
public class NavegacionGerencia extends javax.swing.JFrame {

    /**
     * Creates new form NavegacionGerenca
     */
    public NavegacionGerencia() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        agregarBoton1 = new javax.swing.JButton();
        agregarBoton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        dateChooserPanel1 = new datechooser.beans.DateChooserPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/capital.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/efectivo.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        agregarBoton1.setBackground(new java.awt.Color(51, 51, 51));
        agregarBoton1.setFont(new java.awt.Font("Eras Light ITC", 0, 14)); // NOI18N
        agregarBoton1.setForeground(new java.awt.Color(0, 0, 0));
        agregarBoton1.setText("EMPLEADOS");
        agregarBoton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        agregarBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBoton1ActionPerformed(evt);
            }
        });
        jPanel1.add(agregarBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 200, 40));

        agregarBoton2.setBackground(new java.awt.Color(51, 51, 51));
        agregarBoton2.setFont(new java.awt.Font("Eras Light ITC", 0, 14)); // NOI18N
        agregarBoton2.setForeground(new java.awt.Color(0, 0, 0));
        agregarBoton2.setText("INVENTARIO");
        agregarBoton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        agregarBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBoton2ActionPerformed(evt);
            }
        });
        jPanel1.add(agregarBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 200, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Eras Light ITC", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menuprincipal.png"))); // NOI18N
        jButton1.setText("   Menú Principal");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 3, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 180, 50));
        jPanel1.add(dateChooserPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBoton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EmpleadoVista e = new EmpleadoVista();
        e.setVisible(true);
    }//GEN-LAST:event_agregarBoton1ActionPerformed

    private void agregarBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBoton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Inventario i = new Inventario();
        i.setVisible(true);
    }//GEN-LAST:event_agregarBoton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        VistaPrincipal vp = new VistaPrincipal();
        vp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NavegacionGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NavegacionGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NavegacionGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NavegacionGerencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NavegacionGerencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBoton1;
    private javax.swing.JButton agregarBoton2;
    private datechooser.beans.DateChooserPanel dateChooserPanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
