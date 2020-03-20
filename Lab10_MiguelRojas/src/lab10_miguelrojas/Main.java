package lab10_miguelrojas;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        d_crearATM = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        l_ubicacion = new javax.swing.JLabel();
        tf_ubicacion = new javax.swing.JTextField();
        l_id = new javax.swing.JLabel();
        tf_id_atm = new javax.swing.JTextField();
        l_aFabricacion = new javax.swing.JLabel();
        tf_aFabricacion = new javax.swing.JTextField();
        l_tiempoMantenimiento = new javax.swing.JLabel();
        tf_tiempoMantenimiento = new javax.swing.JTextField();
        l_meses = new javax.swing.JLabel();
        b_crearATM = new javax.swing.JButton();
        l_hora2 = new javax.swing.JLabel();
        d_crearUsuario = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        l_id_usuario = new javax.swing.JLabel();
        tf_id_usuario = new javax.swing.JTextField();
        l_primerNombre = new javax.swing.JLabel();
        tf_primerNombre = new javax.swing.JTextField();
        b_crearUsuario = new javax.swing.JButton();
        l_segundoNombre = new javax.swing.JLabel();
        tf_segundoNombre = new javax.swing.JTextField();
        l_primerApellido = new javax.swing.JLabel();
        tf_primerApellido = new javax.swing.JTextField();
        l_segundoApellido = new javax.swing.JLabel();
        tf_segundoApellido = new javax.swing.JTextField();
        l_pwd = new javax.swing.JLabel();
        tf_aNacimiento = new javax.swing.JTextField();
        pf_pwd = new javax.swing.JPasswordField();
        l_aNacimiento = new javax.swing.JLabel();
        l_aAfiliacion = new javax.swing.JLabel();
        tf_aAfiliacion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rb_cliente = new javax.swing.JRadioButton();
        rb_mantenimiento = new javax.swing.JRadioButton();
        l_hora3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_ATMs = new javax.swing.JComboBox<>();
        b_iniciarSesion = new javax.swing.JButton();
        b_crearATM_frame = new javax.swing.JButton();
        b_crearUsuario_frame = new javax.swing.JButton();
        l_hora1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Crear ATM");

        l_ubicacion.setText("Ubicación");

        l_id.setText("ID");

        l_aFabricacion.setText("Año de Fabricación");

        l_tiempoMantenimiento.setText("Tiempo de Mantenimiento");

        l_meses.setText("meses");

        b_crearATM.setText("Crear");
        b_crearATM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearATMActionPerformed(evt);
            }
        });

        l_hora2.setText("l_hora2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_hora2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_ubicacion)
                            .addComponent(l_id))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_id_atm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ubicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(l_aFabricacion)
                        .addGap(50, 50, 50)
                        .addComponent(tf_aFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(l_tiempoMantenimiento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_tiempoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l_meses))
                    .addComponent(b_crearATM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(l_hora2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_ubicacion)
                    .addComponent(tf_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_id)
                    .addComponent(tf_id_atm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_aFabricacion)
                    .addComponent(tf_aFabricacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tiempoMantenimiento)
                    .addComponent(tf_tiempoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_meses))
                .addGap(18, 18, 18)
                .addComponent(b_crearATM))
        );

        javax.swing.GroupLayout d_crearATMLayout = new javax.swing.GroupLayout(d_crearATM.getContentPane());
        d_crearATM.getContentPane().setLayout(d_crearATMLayout);
        d_crearATMLayout.setHorizontalGroup(
            d_crearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_crearATMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        d_crearATMLayout.setVerticalGroup(
            d_crearATMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_crearATMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Crear Usuario");

        l_id_usuario.setText("ID");

        l_primerNombre.setText("Primer Nombre");

        b_crearUsuario.setText("Crear");
        b_crearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearUsuarioActionPerformed(evt);
            }
        });

        l_segundoNombre.setText("Segundo Nombre");

        l_primerApellido.setText("Primer Apellido");

        l_segundoApellido.setText("Segundo Apellido");

        l_pwd.setText("Contraseña");

        l_aNacimiento.setText("Año de Nacimiento");

        l_aAfiliacion.setText("Año de Afiliación");

        jLabel7.setText("Tipo de Usuario");

        buttonGroup1.add(rb_cliente);
        rb_cliente.setSelected(true);
        rb_cliente.setText("Cliente");

        buttonGroup1.add(rb_mantenimiento);
        rb_mantenimiento.setText("Mantenimiento");

        l_hora3.setText("l_hora3");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_hora3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b_crearUsuario)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(l_primerApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(l_segundoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_id_usuario)
                            .addComponent(l_primerNombre))
                        .addGap(108, 108, 108)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_primerNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_id_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_segundoApellido)
                            .addComponent(l_pwd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_segundoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(pf_pwd)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_aNacimiento)
                            .addComponent(l_aAfiliacion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_aNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tf_aAfiliacion))
                        .addGap(50, 50, 50))
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_cliente)
                        .addGap(18, 18, 18)
                        .addComponent(rb_mantenimiento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(l_hora3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_id_usuario)
                    .addComponent(tf_id_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_primerNombre)
                    .addComponent(tf_primerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_segundoNombre)
                    .addComponent(tf_segundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_primerApellido)
                    .addComponent(tf_primerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_segundoApellido)
                    .addComponent(tf_segundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_pwd)
                    .addComponent(pf_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_aNacimiento)
                    .addComponent(tf_aNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_aAfiliacion)
                    .addComponent(tf_aAfiliacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_cliente)
                    .addComponent(rb_mantenimiento))
                .addGap(18, 18, 18)
                .addComponent(b_crearUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout d_crearUsuarioLayout = new javax.swing.GroupLayout(d_crearUsuario.getContentPane());
        d_crearUsuario.getContentPane().setLayout(d_crearUsuarioLayout);
        d_crearUsuarioLayout.setHorizontalGroup(
            d_crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_crearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        d_crearUsuarioLayout.setVerticalGroup(
            d_crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_crearUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Examen II - Miguel Rojas");

        cb_ATMs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un ATM" }));

        b_iniciarSesion.setText("Iniciar Sesión");

        b_crearATM_frame.setText("Crear ATM");
        b_crearATM_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearATM_frameActionPerformed(evt);
            }
        });

        b_crearUsuario_frame.setText("Crear Usuario");
        b_crearUsuario_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_crearUsuario_frameActionPerformed(evt);
            }
        });

        l_hora1.setText("l_hora1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(b_crearATM_frame)
                        .addGap(18, 18, 18)
                        .addComponent(b_crearUsuario_frame))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_hora1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cb_ATMs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(b_iniciarSesion))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(l_hora1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ATMs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_iniciarSesion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_crearATM_frame)
                    .addComponent(b_crearUsuario_frame))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

    private void b_crearATM_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearATM_frameActionPerformed
        d_crearATM.setModal(true);
        d_crearATM.pack();
        d_crearATM.setLocationRelativeTo(this);
        d_crearATM.setVisible(true);
    }//GEN-LAST:event_b_crearATM_frameActionPerformed

    private void b_crearUsuario_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearUsuario_frameActionPerformed
        d_crearUsuario.setModal(true);
        d_crearUsuario.pack();
        d_crearUsuario.setLocationRelativeTo(this);
        d_crearUsuario.setVisible(true);
    }//GEN-LAST:event_b_crearUsuario_frameActionPerformed

    private void b_crearATMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearATMActionPerformed
        // TODO: Crear el ATM
        
        d_crearATM.dispose();
    }//GEN-LAST:event_b_crearATMActionPerformed

    private void b_crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearUsuarioActionPerformed
        // TODO: Crear el Usuario
        
    }//GEN-LAST:event_b_crearUsuarioActionPerformed
    
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_crearATM;
    private javax.swing.JButton b_crearATM_frame;
    private javax.swing.JButton b_crearUsuario;
    private javax.swing.JButton b_crearUsuario_frame;
    private javax.swing.JButton b_iniciarSesion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cb_ATMs;
    private javax.swing.JDialog d_crearATM;
    private javax.swing.JDialog d_crearUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel l_aAfiliacion;
    private javax.swing.JLabel l_aFabricacion;
    private javax.swing.JLabel l_aNacimiento;
    private javax.swing.JLabel l_hora1;
    private javax.swing.JLabel l_hora2;
    private javax.swing.JLabel l_hora3;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_id_usuario;
    private javax.swing.JLabel l_meses;
    private javax.swing.JLabel l_primerApellido;
    private javax.swing.JLabel l_primerNombre;
    private javax.swing.JLabel l_pwd;
    private javax.swing.JLabel l_segundoApellido;
    private javax.swing.JLabel l_segundoNombre;
    private javax.swing.JLabel l_tiempoMantenimiento;
    private javax.swing.JLabel l_ubicacion;
    private javax.swing.JPasswordField pf_pwd;
    private javax.swing.JRadioButton rb_cliente;
    private javax.swing.JRadioButton rb_mantenimiento;
    private javax.swing.JTextField tf_aAfiliacion;
    private javax.swing.JTextField tf_aFabricacion;
    private javax.swing.JTextField tf_aNacimiento;
    private javax.swing.JTextField tf_id_atm;
    private javax.swing.JTextField tf_id_usuario;
    private javax.swing.JTextField tf_primerApellido;
    private javax.swing.JTextField tf_primerNombre;
    private javax.swing.JTextField tf_segundoApellido;
    private javax.swing.JTextField tf_segundoNombre;
    private javax.swing.JTextField tf_tiempoMantenimiento;
    private javax.swing.JTextField tf_ubicacion;
    // End of variables declaration//GEN-END:variables

    // Variables globales

}
