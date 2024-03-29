
package proyectoprimerbimestre;

import java.time.LocalDate;


public class ReciboPago extends javax.swing.JFrame {

    public Usuario usuario;
    public ReciboPago(Usuario cliente, float valor, String numCuenta, String numTarjeta) {
        initComponents();
        
        this.usuario=cliente;
        LocalDate fechaActual=LocalDate.now();
        lblPagoExitoso.setText("¡Pago exitoso!");
        lblTipoTransaccion.setText("Tarjeta");
        lblBeneficiario.setText("");
        lblNombre.setText("");
        lblValor.setText(String.valueOf(valor));
        lblCuenta.setText(numCuenta);
        lblTarjeta.setText(numTarjeta);
        txtFecha.setText(String.valueOf(fechaActual));
    }
    
    public ReciboPago(Usuario cliente, float valor, String numCuenta ,String numCuentaBene,String nombre){
        initComponents();
        
        this.usuario=cliente;
        LocalDate fechaActual=LocalDate.now();
        lblPagoExitoso.setText("¡Transferencia exitosa!");
        lblTipoTransaccion.setText("Cuenta");
        lblBeneficiario.setText("Beneficiario");
        lblNombre.setText(nombre);
        lblValor.setText(String.valueOf(valor));
        lblCuenta.setText(numCuenta);
        lblTarjeta.setText(numCuentaBene);
        txtFecha.setText(String.valueOf(fechaActual));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTipoTransaccion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        btnMenuPrincipal = new javax.swing.JButton();
        bntSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        lblCuenta = new javax.swing.JLabel();
        lblTarjeta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPagoExitoso = new javax.swing.JLabel();
        lblBeneficiario = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(535, 125));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Valor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Desde");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 60, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Para");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        lblTipoTransaccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipoTransaccion.setForeground(new java.awt.Color(153, 153, 153));
        lblTipoTransaccion.setText("Tarjeta");
        jPanel1.add(lblTipoTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Fecha");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtFecha.setEditable(false);
        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel1.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 110, -1));

        btnMenuPrincipal.setBackground(new java.awt.Color(15, 34, 64));
        btnMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnMenuPrincipal.setText("Menu Principal");
        btnMenuPrincipal.setBorder(null);
        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 110, 30));

        bntSalir.setBackground(new java.awt.Color(227, 29, 26));
        bntSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntSalir.setForeground(new java.awt.Color(255, 255, 255));
        bntSalir.setText("Salir");
        bntSalir.setBorder(null);
        bntSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSalirActionPerformed(evt);
            }
        });
        jPanel1.add(bntSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 90, 30));

        jPanel2.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 10));

        jPanel3.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 30));

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setText("0");
        jPanel1.add(lblValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, -1));

        lblCuenta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCuenta.setText("0");
        jPanel1.add(lblCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 110, -1));

        lblTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTarjeta.setText("0");
        jPanel1.add(lblTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 110, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoCheckPequeño.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 180, 160));

        lblPagoExitoso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPagoExitoso.setText("¡Transferencia exitosa!");
        jPanel1.add(lblPagoExitoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        lblBeneficiario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblBeneficiario.setText("Beneficiario");
        jPanel1.add(lblBeneficiario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombre.setText("nom");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 100, -1));

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

    private void bntSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSalirActionPerformed
        
        System.exit(0);
        
    }//GEN-LAST:event_bntSalirActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        PantallaPrincipal menuPrincipal=new PantallaPrincipal(this.usuario);
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReciboPago(null, -1, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSalir;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBeneficiario;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPagoExitoso;
    private javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTipoTransaccion;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtFecha;
    // End of variables declaration//GEN-END:variables
}
