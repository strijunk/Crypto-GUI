/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2_pbo;

/**
 *
 * @author ASUS
 */
public class FramNew extends javax.swing.JFrame {

    /**
     * Creates new form FramNew
     */
    public FramNew() {
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

        chipers = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        caesar = new javax.swing.JRadioButton();
        url = new javax.swing.JRadioButton();
        base64 = new javax.swing.JRadioButton();
        xor = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Chipertext Maker");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 200, 39));

        caesar.setBackground(new java.awt.Color(0, 0, 0));
        chipers.add(caesar);
        caesar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        caesar.setForeground(new java.awt.Color(255, 255, 255));
        caesar.setText("Caesar");
        getContentPane().add(caesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        url.setBackground(new java.awt.Color(0, 0, 0));
        chipers.add(url);
        url.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        url.setForeground(new java.awt.Color(255, 255, 255));
        url.setText("URL encoding");
        getContentPane().add(url, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        base64.setBackground(new java.awt.Color(0, 0, 0));
        chipers.add(base64);
        base64.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        base64.setForeground(new java.awt.Color(255, 255, 255));
        base64.setText("Base64");
        getContentPane().add(base64, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        xor.setBackground(new java.awt.Color(0, 0, 0));
        chipers.add(xor);
        xor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        xor.setForeground(new java.awt.Color(255, 255, 255));
        xor.setText("XOR");
        xor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                xorPropertyChange(evt);
            }
        });
        getContentPane().add(xor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Est 2020");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("@Cryptolover All rights reserved");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        next.setFont(new java.awt.Font("Orbitron", 1, 13)); // NOI18N
        next.setText("Next");
        next.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        next.setBorderPainted(false);
        next.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 73, 30));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Alpro PBO\\Tugas2_PBO\\src\\tugas2_pbo\\wallpaper1.jpg")); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(800, 400));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_xorPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_xorPropertyChange

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
            java.util.logging.Logger.getLogger(FramNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton base64;
    private javax.swing.JRadioButton caesar;
    private javax.swing.ButtonGroup chipers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton next;
    private javax.swing.JRadioButton url;
    private javax.swing.JRadioButton xor;
    // End of variables declaration//GEN-END:variables
}
