/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoprimerbimestre;

/**
 *
 * @author nivek
 */
public class PantallaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form PantallaRegistro
     */
    public PantallaRegistro() {
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
        BloqueAzulFondo = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        lblTituloPagina = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblDatosPersonales = new javax.swing.JLabel();
        txtFldNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        txtFldApellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFldCedula = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        txtFldAnio = new javax.swing.JTextField();
        txtFldDia = new javax.swing.JTextField();
        txtFldMes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblUSD = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        lblUsuario = new javax.swing.JLabel();
        txtFldUsuario = new javax.swing.JTextField();
        lblContra = new javax.swing.JLabel();
        txtFldContra = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        lblCreacionCuenta = new javax.swing.JLabel();
        lblAbono = new javax.swing.JLabel();
        txtFldAbono = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        BloqueRojoFondo = new javax.swing.JPanel();
        lblCI = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BloqueAzulFondo.setBackground(new java.awt.Color(15, 34, 64));
        BloqueAzulFondo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BloqueAzulFondoLayout = new javax.swing.GroupLayout(BloqueAzulFondo);
        BloqueAzulFondo.setLayout(BloqueAzulFondoLayout);
        BloqueAzulFondoLayout.setHorizontalGroup(
            BloqueAzulFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BloqueAzulFondoLayout.setVerticalGroup(
            BloqueAzulFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(BloqueAzulFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 30));

        imgLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/LogoLargov1.png"))); // NOI18N
        jPanel1.add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, -1));

        lblTituloPagina.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lblTituloPagina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloPagina.setText("Registro de nuevo usuario");
        jPanel1.add(lblTituloPagina, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 240, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, 10));

        lblDatosPersonales.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblDatosPersonales.setForeground(new java.awt.Color(153, 153, 153));
        lblDatosPersonales.setText("Datos personales");
        jPanel1.add(lblDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(txtFldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 180, -1));

        lblNombre.setText("Nombre:");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 22));

        lblApellido.setText("Apellido:");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 22));
        jPanel1.add(txtFldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 180, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AAAA");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 40, 10));
        jPanel1.add(txtFldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 180, -1));

        lblFecha.setText("Fecha nacimiento:");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 22));

        txtFldAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtFldAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 40, -1));

        txtFldDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFldDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldDiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtFldDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 30, -1));

        txtFldMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtFldMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 30, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("-");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 10, 22));

        lblUSD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUSD.setText("USD");
        lblUSD.setToolTipText("");
        jPanel1.add(lblUSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 30, 22));

        lblAcceso.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(153, 153, 153));
        lblAcceso.setText("Datos de acceso");
        jPanel1.add(lblAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 130, 10));

        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 22));

        txtFldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtFldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 160, -1));

        lblContra.setText("Contraseña:");
        jPanel1.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 22));
        jPanel1.add(txtFldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 160, -1));

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 120, 10));

        lblCreacionCuenta.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        lblCreacionCuenta.setForeground(new java.awt.Color(153, 153, 153));
        lblCreacionCuenta.setText("Creación de cuenta");
        jPanel1.add(lblCreacionCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lblAbono.setText("Abono inicial: ");
        jPanel1.add(lblAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 22));

        txtFldAbono.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtFldAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 120, -1));

        lblTipo.setText("Tipo:");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 22));

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Ahorros", " Corriente" }));
        jPanel1.add(cmbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, -1));

        btnVolver.setBackground(new java.awt.Color(227, 29, 26));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 90, -1));

        btnFinalizar.setBackground(new java.awt.Color(15, 34, 64));
        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 90, -1));

        jSeparator4.setForeground(new java.awt.Color(15, 34, 64));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 240, 10));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("-");
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 10, 22));

        BloqueRojoFondo.setBackground(new java.awt.Color(227, 29, 26));
        BloqueRojoFondo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BloqueRojoFondoLayout = new javax.swing.GroupLayout(BloqueRojoFondo);
        BloqueRojoFondo.setLayout(BloqueRojoFondoLayout);
        BloqueRojoFondoLayout.setHorizontalGroup(
            BloqueRojoFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        BloqueRojoFondoLayout.setVerticalGroup(
            BloqueRojoFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(BloqueRojoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 10));

        lblCI.setText("C.I.:");
        jPanel1.add(lblCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 22));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("DD");
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 30, 10));

        jLabel19.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MM");
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 30, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFldDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldDiaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // AQUI HACER LA RECEPCION Y VALIDACION DE DATOS
        // PARA ESCRIBIR EN EL ARCHIVO
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtFldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BloqueAzulFondo;
    private javax.swing.JPanel BloqueRojoFondo;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAbono;
    private javax.swing.JLabel lblAcceso;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCI;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblCreacionCuenta;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTituloPagina;
    private javax.swing.JLabel lblUSD;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtFldAbono;
    private javax.swing.JTextField txtFldAnio;
    private javax.swing.JTextField txtFldApellido;
    private javax.swing.JTextField txtFldCedula;
    private javax.swing.JPasswordField txtFldContra;
    private javax.swing.JTextField txtFldDia;
    private javax.swing.JTextField txtFldMes;
    private javax.swing.JTextField txtFldNombre;
    private javax.swing.JTextField txtFldUsuario;
    // End of variables declaration//GEN-END:variables
}