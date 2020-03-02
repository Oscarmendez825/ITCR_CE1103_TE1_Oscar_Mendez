
package clienteservidor;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ClientExec extends javax.swing.JFrame {
    
    //Creacion de atributos y objetos para llamar a clase usuario
    String Nombre = JOptionPane.showInputDialog("Por Favor Digite su nombre");//Solicitar el nombre del usuario
    Usuario Nombre1 = new Usuario(Nombre);

    Cliente client;

    public ClientExec() {
        setTitle("SERVMESS");//Ponerle nombre a la ventana de chat
        initComponents();
        client = new Cliente(cuadropantalla);//pasar el parametro del cuadropantalla a la clase Client
        Thread thread = new Thread(client);//hacer un hilo nuevo
        thread.start();//iniciar el hilo
        
        cuadropantalla.setEditable(false);////Evitar la edicion del cuadro de mensajes
        

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cuadromensaje = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonenviar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cuadropantalla = new javax.swing.JEditorPane();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 150));
        setMinimumSize(new java.awt.Dimension(935, 580));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Orbitron", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ServMess(Messenger Service)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 870, 40);

        cuadromensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuadromensajeKeyTyped(evt);
            }
        });
        getContentPane().add(cuadromensaje);
        cuadromensaje.setBounds(20, 370, 650, 130);

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

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Write your message here.....");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 330, 610, 40);

        jScrollPane2.setViewportView(cuadropantalla);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 900, 270);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/30413hd.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 930, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonenviarActionPerformed
       
        try{
            String mensajesalida = "";//Variable para guardar el mensaje
            mensajesalida = cuadromensaje.getText().trim();//Tomar el texto del cuadromensaje
            cuadromensaje.setText("");//limpiar el cuadro mensaje
            client.mandarmensaje(mensajesalida+"\n");//enviar el mensaje por medio del metodo mandarmensaje de la clase cliente 
  
        }catch (Exception e){

        }

    }//GEN-LAST:event_botonenviarActionPerformed

    private void cuadromensajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuadromensajeKeyTyped
        char teclaenter = evt.getKeyChar();
        if (teclaenter==KeyEvent.VK_ENTER){
            botonenviar.doClick();//permitir enviar el mensaje si se presiona enter
        }
    }//GEN-LAST:event_cuadromensajeKeyTyped


    public static void main(String args[]) {
        


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientExec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientExec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientExec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientExec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
  


        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientExec().setVisible(true);
                
            }
        });
                 
            

                
                
            }
        

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonenviar;
    private javax.swing.JTextField cuadromensaje;
    private javax.swing.JEditorPane cuadropantalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
