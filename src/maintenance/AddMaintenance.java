/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintenance;

import java.awt.Color;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author John
 */
public class AddMaintenance extends javax.swing.JDialog {

    public static int pos;
    private int validos = 0;
    
    public AddMaintenance(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(parent);
        
        this.inicializarComponentes();
    }
    
    private void inicializarComponentes(){
        txtNombre.setForeground(Color.gray);
        txtCosto.setForeground(Color.gray);
        txtDuracion.setForeground(Color.gray);
        txtFrecuencia.setForeground(Color.gray);
        
        txtNombreMaquina.setText(Main.maquinas.get(pos).getNombre());
        txtModeloMaquina.setText(Main.maquinas.get(pos).getModelo());
        
        ImageIcon ico = new ImageIcon(Main.maquinas.get(pos).getImagen());
        Icon icono = new ImageIcon(ico.getImage().getScaledInstance(220, 180, Image.SCALE_DEFAULT));
        lblImagen.setIcon(icono);
        this.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainContainer = new javax.swing.JPanel();
        panelImagen = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        txtNombreMaquina = new javax.swing.JTextField();
        txtModeloMaquina = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtFrecuencia = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        btnAgregar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MainContainer.setBackground(new java.awt.Color(134, 154, 216));

        panelImagen.setBackground(new java.awt.Color(255, 255, 255));
        panelImagen.setPreferredSize(new java.awt.Dimension(155, 155));

        javax.swing.GroupLayout panelImagenLayout = new javax.swing.GroupLayout(panelImagen);
        panelImagen.setLayout(panelImagenLayout);
        panelImagenLayout.setHorizontalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );
        panelImagenLayout.setVerticalGroup(
            panelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
        );

        txtNombreMaquina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombreMaquina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreMaquina.setEnabled(false);

        txtModeloMaquina.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtModeloMaquina.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtModeloMaquina.setEnabled(false);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre de Mantenimiento");
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNombreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNombreMouseExited(evt);
            }
        });

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCosto.setText("Costo de Mantenimiento");
        txtCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtCostoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCostoMouseExited(evt);
            }
        });
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        txtFrecuencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFrecuencia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFrecuencia.setText("Frecuencia");
        txtFrecuencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtFrecuenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFrecuenciaMouseExited(evt);
            }
        });
        txtFrecuencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFrecuenciaKeyTyped(evt);
            }
        });

        txtDuracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDuracion.setText("Duracion");
        txtDuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtDuracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDuracionMouseExited(evt);
            }
        });
        txtDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDuracionKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tipo de Mantenimiento:");

        cbTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Preventivo", "Predictivo", "Correctivo" }));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAgregar.setText("Agregar Mantenimiento");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCerrar.setText("Cerrar Ventana");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainContainerLayout = new javax.swing.GroupLayout(MainContainer);
        MainContainer.setLayout(MainContainerLayout);
        MainContainerLayout.setHorizontalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainContainerLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainContainerLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainContainerLayout.createSequentialGroup()
                        .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFrecuencia, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(112, 112, 112))
            .addGroup(MainContainerLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainContainerLayout.createSequentialGroup()
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModeloMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainContainerLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainContainerLayout.setVerticalGroup(
            MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainContainerLayout.createSequentialGroup()
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainContainerLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(panelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainContainerLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(txtNombreMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtModeloMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrecuencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(MainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IniciarPlaceHolder(JTextField field, String texto){
        if(field.getText().trim().equals(texto)){
            field.setForeground(Color.black);
            field.setText(null);
            
            validos++;
        }
    }
    
    private void TerminarPlaceHolder(JTextField field, String texto){
        if(field.getText().trim().equals("")){
            field.setForeground(Color.gray);
            field.setText(texto);
            
            validos--;
            btnAgregar.requestFocus();
        }
    }
    
    private boolean TextFieldRellenado(JTextField txt){
        return !txt.getText().trim().isEmpty();
    }
    
    private void txtNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseEntered
        IniciarPlaceHolder(txtNombre, "Nombre de Mantenimiento");
    }//GEN-LAST:event_txtNombreMouseEntered

    private void txtNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseExited
        TerminarPlaceHolder(txtNombre, "Nombre de Mantenimiento");
    }//GEN-LAST:event_txtNombreMouseExited

    private void txtCostoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostoMouseEntered
        IniciarPlaceHolder(txtCosto, "Costo de Mantenimiento");
    }//GEN-LAST:event_txtCostoMouseEntered

    private void txtCostoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCostoMouseExited
        TerminarPlaceHolder(txtCosto, "Costo de Mantenimiento");
    }//GEN-LAST:event_txtCostoMouseExited

    private void txtDuracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDuracionMouseEntered
        IniciarPlaceHolder(txtDuracion, "Duracion");
    }//GEN-LAST:event_txtDuracionMouseEntered

    private void txtDuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDuracionMouseExited
        TerminarPlaceHolder(txtDuracion, "Duracion");
    }//GEN-LAST:event_txtDuracionMouseExited

    private void txtFrecuenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFrecuenciaMouseEntered
        IniciarPlaceHolder(txtFrecuencia, "Frecuencia");
    }//GEN-LAST:event_txtFrecuenciaMouseEntered

    private void txtFrecuenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFrecuenciaMouseExited
        TerminarPlaceHolder(txtFrecuencia, "Frecuencia");
    }//GEN-LAST:event_txtFrecuenciaMouseExited

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char input = evt.getKeyChar();
        
        if(((input < '0') || (input > '9')) && (input != '.')){
            evt.consume();
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDuracionKeyTyped
        char input = evt.getKeyChar();
        
        if(((input < '0') || (input > '9')) && (input != '.')){
            evt.consume();
        }
    }//GEN-LAST:event_txtDuracionKeyTyped

    private void txtFrecuenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFrecuenciaKeyTyped
        char input = evt.getKeyChar();
        
        if(((input < '0') || (input > '9'))){
            evt.consume();
        }
    }//GEN-LAST:event_txtFrecuenciaKeyTyped

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(TextFieldRellenado(txtNombre) && TextFieldRellenado(txtCosto) && TextFieldRellenado(txtDuracion) && TextFieldRellenado(txtFrecuencia) && (validos == 4)){
            Mantenimiento mantenimiento = new Mantenimiento(txtNombre.getText(), cbTipo.getSelectedItem().toString(), Double.parseDouble(txtCosto.getText()),
                                            Double.parseDouble(txtDuracion.getText()), Integer.parseInt(txtFrecuencia.getText()));
            
            Main.maquinas.get(pos).mantenimientos.add(mantenimiento);
            
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Maquinas.dat"));
                oos.writeObject(Main.maquinas);
                oos.close();
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(AddMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMaintenance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddMaintenance dialog = new AddMaintenance(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainContainer;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JPanel panelImagen;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFrecuencia;
    private javax.swing.JTextField txtModeloMaquina;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreMaquina;
    // End of variables declaration//GEN-END:variables
}
