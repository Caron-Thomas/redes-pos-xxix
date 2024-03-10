package local.javaredes;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Thomas Caron de Castro Deus
 * RA 2627205
 */

public class FormClientePresidenteSecao extends javax.swing.JFrame {
    
    

    public FormClientePresidenteSecao() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextNumeroVotos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxCandidatos = new javax.swing.JComboBox<>();
        jButtonEnviaAoServidor = new javax.swing.JButton();
        jButtonEncerraUrna = new javax.swing.JButton();
        textRespServidor = new java.awt.TextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(500, 500));

        jLabel1.setText("Urna Eletrônica");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setText("Urna Java");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Selecione o Candidato");

        jTextNumeroVotos.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextNumeroVotos.setPreferredSize(new java.awt.Dimension(64, 25));

        jLabel4.setText("Quantidade de votos:");

        jComboBoxCandidatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCandidatosActionPerformed(evt);
            }
        });

        jButtonEnviaAoServidor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonEnviaAoServidor.setLabel("Enviar ao Servidor");
        jButtonEnviaAoServidor.setMaximumSize(new java.awt.Dimension(124, 30));
        jButtonEnviaAoServidor.setMinimumSize(new java.awt.Dimension(124, 30));
        jButtonEnviaAoServidor.setPreferredSize(new java.awt.Dimension(124, 30));
        jButtonEnviaAoServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviaAoServidorActionPerformed(evt);
            }
        });

        jButtonEncerraUrna.setLabel("Encerra esta Urna");
        jButtonEncerraUrna.setMaximumSize(new java.awt.Dimension(124, 30));
        jButtonEncerraUrna.setPreferredSize(new java.awt.Dimension(124, 30));

        textRespServidor.setBackground(new java.awt.Color(204, 204, 204));
        textRespServidor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textRespServidor.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxCandidatos, 0, 210, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jTextNumeroVotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textRespServidor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonEncerraUrna, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonEnviaAoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(42, 42, 42))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNumeroVotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jButtonEnviaAoServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(textRespServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEncerraUrna, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCandidatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCandidatosActionPerformed

    private void jButtonEnviaAoServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviaAoServidorActionPerformed
        try {
            textRespServidor.append("Dados enviado ao servidor.");
            Thread.sleep(1000);
            enviarVotos();
        } catch (InterruptedException ex) {
            Logger.getLogger(FormClientePresidenteSecao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonEnviaAoServidorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientePresidenteSecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEncerraUrna;
    private javax.swing.JButton jButtonEnviaAoServidor;
    private javax.swing.JComboBox<String> jComboBoxCandidatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextNumeroVotos;
    private java.awt.TextArea textRespServidor;
    // End of variables declaration//GEN-END:variables

    public void enviarVotos() {
        
        try {
            Registry servidorRegistro = LocateRegistry.getRegistry("127.0.0.1",1099);
            UrnaDoPresidenteSecao stub = (UrnaDoPresidenteSecao) servidorRegistro.lookup("UrnaPresidente");
            textRespServidor.setText("");
            textRespServidor.append(String.valueOf(stub.contarVotos()));
        
        } catch (RemoteException ex) {
            Logger.getLogger(FormClientePresidenteSecao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(FormClientePresidenteSecao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}