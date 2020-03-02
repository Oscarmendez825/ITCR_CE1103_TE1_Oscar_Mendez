
package clienteservidor;


import javax.swing.JOptionPane;


public class Client extends javax.swing.JFrame {

    //Creacion de atributos y objetos para llamar a clase usuario
    String Nombre = JOptionPane.showInputDialog("Digite su Nombre: ");//Solicitar el nombre del usuario
    Usuario Nombre1 = new Usuario(Nombre);
    public Client() {
        initComponents();
        cuadropantalla.setEditable(false);//Evitar la edicion del cuadro de mensajes
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cuadropantalla = new javax.swing.JTextArea();
        cuadromensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonenviar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(935, 580));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ServMess(Messenger Service)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 870, 40);

        cuadropantalla.setColumns(20);
        cuadropantalla.setRows(5);
        jScrollPane1.setViewportView(cuadropantalla);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 900, 260);
        getContentPane().add(cuadromensaje);
        cuadromensaje.setBounds(10, 330, 650, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(550, 320, 280, 200);

        botonenviar.setText("SEND");
        botonenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonenviarActionPerformed(evt);
            }
        });
        getContentPane().add(botonenviar);
        botonenviar.setBounds(830, 370, 80, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30413hd.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 940, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonenviarActionPerformed
        
    }//GEN-LAST:event_botonenviarActionPerformed


    public static void main(String args[]) {
 

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonenviar;
    private javax.swing.JTextField cuadromensaje;
    private static javax.swing.JTextArea cuadropantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
