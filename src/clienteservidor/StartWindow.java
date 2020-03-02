
package clienteservidor;




public class StartWindow extends javax.swing.JFrame {


    public StartWindow() {
        setTitle("ServMess");
        initComponents();
        instructionsbox.setEditable(false);//restringir editar las instrucciones
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructionsbox = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Orbitron", 1, 12)); // NOI18N
        jButton1.setText("Get Started");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(728, 409, 117, 49);

        jLabel1.setFont(new java.awt.Font("Orbitron", 0, 14)); // NOI18N
        jLabel1.setText("ServMess is an instant messaging app with which you can talk to other users");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 417, 635, 41);

        instructionsbox.setBackground(new java.awt.Color(153, 153, 153));
        instructionsbox.setColumns(20);
        instructionsbox.setFont(new java.awt.Font("Orbitron", 0, 12)); // NOI18N
        instructionsbox.setRows(5);
        instructionsbox.setText("\t\t\n\t\tInstructions:\n\n1. Press the start button\n\n2. Enter your name and then the ip of the server you want to \n    connect to (if you are going to run everything \n    from the same PC, type ip 127.0.0.1\n\n3. Enter your messages in the lower box of your screen.\n\n4. To send the message press the send button or press Enter\n\n5. Enjoy your experience");
        jScrollPane1.setViewportView(instructionsbox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(210, 190, 482, 190);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 10, 300, 193);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -10, 890, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);//Cerrar esta ventana
        new ClientExec().setVisible(true);//Abrir la ventana del cliente
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea instructionsbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
