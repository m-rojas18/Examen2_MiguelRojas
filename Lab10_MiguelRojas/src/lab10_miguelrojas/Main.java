package lab10_miguelrojas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    public Main() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        adminATM.cargar();
        updateComboBoxATMs();
        adminCliente.cargar();
        adminMantenimiento.cargar();
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
        l_tipoUsuario_crearUsuario = new javax.swing.JLabel();
        rb_cliente = new javax.swing.JRadioButton();
        rb_mantenimiento = new javax.swing.JRadioButton();
        l_hora3 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        d_iniciarSesion = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        l_tipoUsuario_iniciarSesion = new javax.swing.JLabel();
        rb_cliente_iniciarSesion = new javax.swing.JRadioButton();
        rb_mantenimiento_iniciarSesion = new javax.swing.JRadioButton();
        l_primerNombre_iniciarSesion = new javax.swing.JLabel();
        tf_primerNombre_iniciarSesion = new javax.swing.JTextField();
        l_pwd_iniciarSesion = new javax.swing.JLabel();
        pf_pwd_iniciarSesion = new javax.swing.JPasswordField();
        b_iniciarSesion = new javax.swing.JButton();
        l_hora4 = new javax.swing.JLabel();
        buttonGroup2 = new javax.swing.ButtonGroup();
        d_ventanaCliente = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        l_hora5 = new javax.swing.JLabel();
        mb_acciones_ventanaCliente = new javax.swing.JMenuBar();
        m_retiro = new javax.swing.JMenu();
        mi_atm = new javax.swing.JMenuItem();
        m_deposito = new javax.swing.JMenu();
        mi_cuentaPropia = new javax.swing.JMenuItem();
        mi_transferencia = new javax.swing.JMenuItem();
        m_crearCuenta = new javax.swing.JMenu();
        mi_nuevaCuenta = new javax.swing.JMenuItem();
        m_revisarEstado = new javax.swing.JMenu();
        mi_revisarEstado_cuentaPropia = new javax.swing.JMenuItem();
        m_revisarTransacciones = new javax.swing.JMenu();
        mi_revisarTransacciones_cuentaPropia = new javax.swing.JMenuItem();
        d_ventanaMantenimiento = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        l_billetes100 = new javax.swing.JLabel();
        l_billetes500 = new javax.swing.JLabel();
        tf_billetes100 = new javax.swing.JTextField();
        tf_billetes500 = new javax.swing.JTextField();
        b_ingresarBilletes = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_ATMs = new javax.swing.JComboBox<>();
        b_iniciarSesion_frame = new javax.swing.JButton();
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

        l_tipoUsuario_crearUsuario.setText("Tipo de Usuario");

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
                    .addComponent(l_tipoUsuario_crearUsuario)
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
                .addComponent(l_tipoUsuario_crearUsuario)
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

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Iniciar Sesión");

        l_tipoUsuario_iniciarSesion.setText("Tipo de Usuario");

        buttonGroup2.add(rb_cliente_iniciarSesion);
        rb_cliente_iniciarSesion.setSelected(true);
        rb_cliente_iniciarSesion.setText("Cliente");

        buttonGroup2.add(rb_mantenimiento_iniciarSesion);
        rb_mantenimiento_iniciarSesion.setText("Mantenimiento");

        l_primerNombre_iniciarSesion.setText("Primer Nombre");

        l_pwd_iniciarSesion.setText("Contraseña");

        b_iniciarSesion.setText("Iniciar Sesión");
        b_iniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_iniciarSesionActionPerformed(evt);
            }
        });

        l_hora4.setText("l_hora4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addComponent(l_hora4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l_tipoUsuario_iniciarSesion)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rb_cliente_iniciarSesion)
                        .addGap(18, 18, 18)
                        .addComponent(rb_mantenimiento_iniciarSesion))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_primerNombre_iniciarSesion)
                            .addComponent(l_pwd_iniciarSesion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_primerNombre_iniciarSesion)
                            .addComponent(pf_pwd_iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addComponent(b_iniciarSesion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(l_hora4))
                .addGap(18, 18, 18)
                .addComponent(l_tipoUsuario_iniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_cliente_iniciarSesion)
                    .addComponent(rb_mantenimiento_iniciarSesion))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_primerNombre_iniciarSesion)
                    .addComponent(tf_primerNombre_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_pwd_iniciarSesion)
                    .addComponent(pf_pwd_iniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_iniciarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout d_iniciarSesionLayout = new javax.swing.GroupLayout(d_iniciarSesion.getContentPane());
        d_iniciarSesion.getContentPane().setLayout(d_iniciarSesionLayout);
        d_iniciarSesionLayout.setHorizontalGroup(
            d_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_iniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        d_iniciarSesionLayout.setVerticalGroup(
            d_iniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_iniciarSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        l_hora5.setText("l_hora5");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(485, Short.MAX_VALUE)
                .addComponent(l_hora5)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_hora5)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        m_retiro.setText("Retiro");

        mi_atm.setText("ATM");
        mi_atm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_atmActionPerformed(evt);
            }
        });
        m_retiro.add(mi_atm);

        mb_acciones_ventanaCliente.add(m_retiro);

        m_deposito.setText("Depósito");

        mi_cuentaPropia.setText("Cuenta Propia");
        mi_cuentaPropia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_cuentaPropiaActionPerformed(evt);
            }
        });
        m_deposito.add(mi_cuentaPropia);

        mi_transferencia.setText("Transferencia");
        m_deposito.add(mi_transferencia);

        mb_acciones_ventanaCliente.add(m_deposito);

        m_crearCuenta.setText("Crear Cuenta");

        mi_nuevaCuenta.setText("Nueva Cuenta");
        m_crearCuenta.add(mi_nuevaCuenta);

        mb_acciones_ventanaCliente.add(m_crearCuenta);

        m_revisarEstado.setText("Revisar Estado");

        mi_revisarEstado_cuentaPropia.setText("Cuenta Propia");
        m_revisarEstado.add(mi_revisarEstado_cuentaPropia);

        mb_acciones_ventanaCliente.add(m_revisarEstado);

        m_revisarTransacciones.setText("Revisar Transacciones");

        mi_revisarTransacciones_cuentaPropia.setText("Cuenta Propia");
        m_revisarTransacciones.add(mi_revisarTransacciones_cuentaPropia);

        mb_acciones_ventanaCliente.add(m_revisarTransacciones);

        d_ventanaCliente.setJMenuBar(mb_acciones_ventanaCliente);

        javax.swing.GroupLayout d_ventanaClienteLayout = new javax.swing.GroupLayout(d_ventanaCliente.getContentPane());
        d_ventanaCliente.getContentPane().setLayout(d_ventanaClienteLayout);
        d_ventanaClienteLayout.setHorizontalGroup(
            d_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_ventanaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        d_ventanaClienteLayout.setVerticalGroup(
            d_ventanaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_ventanaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Mantenimiento");

        l_billetes100.setText("Cantidad de billetes de Lps. 100");

        l_billetes500.setText("Cantidad de billetes de Lps. 500");

        b_ingresarBilletes.setText("Ingresar Billetes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(l_billetes100)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_billetes100, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(l_billetes500)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tf_billetes500)))
                    .addComponent(b_ingresarBilletes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_billetes100)
                    .addComponent(tf_billetes100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_billetes500)
                    .addComponent(tf_billetes500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_ingresarBilletes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout d_ventanaMantenimientoLayout = new javax.swing.GroupLayout(d_ventanaMantenimiento.getContentPane());
        d_ventanaMantenimiento.getContentPane().setLayout(d_ventanaMantenimientoLayout);
        d_ventanaMantenimientoLayout.setHorizontalGroup(
            d_ventanaMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_ventanaMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        d_ventanaMantenimientoLayout.setVerticalGroup(
            d_ventanaMantenimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(d_ventanaMantenimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Examen II - Miguel Rojas");

        cb_ATMs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un ATM" }));
        cb_ATMs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_ATMsItemStateChanged(evt);
            }
        });

        b_iniciarSesion_frame.setText("Iniciar Sesión");
        b_iniciarSesion_frame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_iniciarSesion_frameActionPerformed(evt);
            }
        });

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
                            .addComponent(b_iniciarSesion_frame))))
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
                    .addComponent(b_iniciarSesion_frame))
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
        // Crear el ATM
        String ubicacion = null, id_atm = null;
        int aFabricacion = 0, tiempoMantenimiento = 0;
        
        boolean crearAtm = true;
        
        // Verificar los datos ingresados
        // ubicación
        if (tf_ubicacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearATM, "Falta la Ubicación");
            crearAtm = false;
        } else {
            ubicacion = tf_ubicacion.getText();
        }
        
        if (tf_id_atm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearATM, "Falta el ID");
            crearAtm = false;
        } else {
            // Verificar que el ID no se repita
            boolean idRepetido = false;
            for (ATM atm : adminATM.ATMs) {
                if (tf_id_atm.getText().equals(atm.getID())) {
                    idRepetido = true;
                    break;
                }
            }
            if (!idRepetido) {
                id_atm = tf_id_atm.getText();
            } else {
                JOptionPane.showMessageDialog(d_crearATM, "El ID que ingresó ya existe.");
                tf_id_atm.setText("");
                crearAtm = false;
            }
        }
        
        // año de fabricación
        if (tf_aFabricacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearATM, "Falta el Año de Fabricación");
            crearAtm = false;
        } else {
            aFabricacion = Integer.parseInt(tf_aFabricacion.getText());
        }
        
        // tiempo de mantenimiento
        if (tf_tiempoMantenimiento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearATM, "Falta el Tiempo de Mantenimiento");
            crearAtm = false;
        } else {
            tiempoMantenimiento = Integer.parseInt(tf_tiempoMantenimiento.getText());
        }
        
        if (crearAtm) {
            ATM atm = new ATM(ubicacion, id_atm, aFabricacion, tiempoMantenimiento);
            adminATM.addATM(atm);
            adminATM.escribir();
            updateComboBoxATMs();
            JOptionPane.showMessageDialog(d_crearATM, "El ATM fue creado exitosamente.");
            
            tf_ubicacion.setText("");
            tf_id_atm.setText("");
            tf_aFabricacion.setText("");
            tf_tiempoMantenimiento.setText("");
            
            d_crearATM.dispose();
        }
    }//GEN-LAST:event_b_crearATMActionPerformed

    private void b_crearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_crearUsuarioActionPerformed
        // Crear el Usuario
        String id = null, primerNombre = null, segundoNombre = null, primerApellido = null, segundoApellido = null, pwd = null;
        int aNacimiento = 0, aAfiliacion = 0;
        
        boolean crearUsuario = true;
        
        // Verificar los datos ingresados
        // id
        if (tf_id_usuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el ID.");
            crearUsuario = false;
        } else {
            id = tf_id_usuario.getText();
        }
        
        // primerNombre
        if (tf_primerNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el Primer Nombre.");
            crearUsuario = false;
        } else {
            primerNombre = tf_primerNombre.getText();
        }
        
        // segundoNombre
        if (tf_segundoNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el Segundo Nombre.");
            crearUsuario = false;
        } else {
            segundoNombre = tf_segundoNombre.getText();
        }
        
        // primerApellido
        if (tf_primerApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el Primer Apellido.");
            crearUsuario = false;
        } else {
            primerApellido = tf_primerApellido.getText();
        }
        
        // segundoApellido
        if (tf_segundoApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el Segundo Apellido.");
            crearUsuario = false;
        } else {
            segundoApellido = tf_segundoApellido.getText();
        }
        
        // pwd
        if (pf_pwd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta la Contraseña.");
            crearUsuario = false;
        } else {
            pwd = pf_pwd.getText();
        }
        
        // aNacimiento
        if (tf_aNacimiento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el Año de Nacimiento.");
            crearUsuario = false;
        } else {
            aNacimiento = Integer.parseInt(tf_aNacimiento.getText());
        }
        
        // aAfiliacion
        if (tf_aAfiliacion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_crearUsuario, "Hace falta el Año de Afiliación.");
            crearUsuario = false;
        } else {
            aAfiliacion = Integer.parseInt(tf_aAfiliacion.getText());
        }
        
        // tipo de usuario
        boolean tipoCliente = true;
        if (!rb_cliente.isSelected())
            tipoCliente = false;
        
        if (crearUsuario) {
            if (tipoCliente) {
                // Crear (Usuario) Cliente
                Cliente cliente = new Cliente(id, primerNombre, segundoNombre, primerApellido, segundoApellido, pwd, aNacimiento, aAfiliacion);
                
                // Agregar Cuentas
                int resp = 0;
                while (resp != 1) {
                    String num_cuenta = JOptionPane.showInputDialog(d_crearUsuario, "Ingrese el número de cuenta:");
                    int saldo = Integer.parseInt(JOptionPane.showInputDialog(d_crearUsuario, "Ingrese el saldo:"));
                    
                    Cuenta cuenta = new Cuenta(num_cuenta, saldo, id);
                    cliente.addCuenta(cuenta);
                    JOptionPane.showMessageDialog(d_crearUsuario, "La Cuenta fue agregada exitosamente.");
                    
                    resp = JOptionPane.showConfirmDialog(d_crearUsuario, "¿Desea agregar otra Cuenta?");
                }
                
                adminCliente.addCliente(cliente);
                adminCliente.escribir();
                JOptionPane.showMessageDialog(d_crearUsuario, "El Cliente fue creado exitosamente.");
            } else {
                // Crear (Usuario) Mantenimiento
                Mantenimiento mantenimiento = new Mantenimiento(id, primerNombre, segundoNombre, primerApellido, segundoApellido, pwd, aNacimiento, aAfiliacion);
                
                // Agregar ATMs
                String listaATMs = "";
                for (ATM atm : adminATM.ATMs)
                    listaATMs += adminATM.ATMs.indexOf(atm) + ". " + atm + "\n";
                
                int resp = 0;
                while (resp != 1) {
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(d_crearUsuario, "ATMs\n" + listaATMs + "Ingrese la posición del ATM que desea agregar."));
                    
                    mantenimiento.addATM(adminATM.getATM(pos));
                    JOptionPane.showMessageDialog(d_crearUsuario, "El ATM fue agregado exitosamente.");
                    
                    resp = JOptionPane.showConfirmDialog(d_crearUsuario, "¿Desea agregar otro ATM?");
                }
                
                adminMantenimiento.addMantenimiento(mantenimiento);
                adminMantenimiento.escribir();
                JOptionPane.showMessageDialog(d_crearUsuario, "El Usuario de Mantenimiento fue creado exitosamente.");
            }
            
            tf_id_usuario.setText("");
            tf_primerNombre.setText("");
            tf_segundoNombre.setText("");
            tf_primerApellido.setText("");
            tf_segundoApellido.setText("");
            pf_pwd.setText("");
            tf_aNacimiento.setText("");
            tf_aAfiliacion.setText("");
            
            d_crearUsuario.dispose();
        }
    }//GEN-LAST:event_b_crearUsuarioActionPerformed

    private void b_iniciarSesion_frameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_iniciarSesion_frameActionPerformed
        if (cb_ATMs.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un ATM.");
        } else {
            d_iniciarSesion.setModal(true);
            d_iniciarSesion.pack();
            d_iniciarSesion.setLocationRelativeTo(this);
            d_iniciarSesion.setVisible(true);
        }
    }//GEN-LAST:event_b_iniciarSesion_frameActionPerformed

    private void b_iniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_iniciarSesionActionPerformed
        String primerNombre = null, pwd = null;
        
        boolean iniciarSesion = true;
        
        // primerNombre
        if (tf_primerNombre_iniciarSesion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_iniciarSesion, "Hace falta el Primer Nombre.");
            iniciarSesion = false;
        } else {
            primerNombre = tf_primerNombre_iniciarSesion.getText();
        }
        
        // pwd
        if (pf_pwd_iniciarSesion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(d_iniciarSesion, "Hace falta la Contraseña.");
            iniciarSesion = false;
        } else {
            pwd = pf_pwd_iniciarSesion.getText();
        }
        
        // tipo de usuario
        boolean tipoCliente = true;
        if (!rb_cliente_iniciarSesion.isSelected())
            tipoCliente = false;
        
        if (iniciarSesion) {
            if (tipoCliente) {
                boolean encontroPN = false;
                for (Cliente cliente : adminCliente.clientes) {
                    String pnCliente = cliente.getPrimerNombre();
                    String pwdCliente = cliente.getPwd();
                    if (primerNombre.equals(pnCliente)) {
                        encontroPN = true;
                        if (pwd.equals(pwdCliente)) {
                            client = cliente;
                            intentos = 5;
                            // TODO: Abrir la ventana de Cliente
                            // TODO: Generar log de inicio de sesión
                            
                            tf_primerNombre_iniciarSesion.setText("");
                            pf_pwd_iniciarSesion.setText("");
                            
                            d_iniciarSesion.dispose();
                            
                            d_ventanaCliente.setModal(true);
                            d_ventanaCliente.pack();
                            d_ventanaCliente.setLocationRelativeTo(d_iniciarSesion);
                            d_ventanaCliente.setVisible(true);
                            
                            break;
                        } else {
                            JOptionPane.showMessageDialog(d_iniciarSesion, "La contraseña es incorrecta.");
                            pf_pwd_iniciarSesion.setText("");
                            intentos--;
                            if (intentos == 0) {
                                // TODO: Generar el log por fallar 5 veces
                            }
                        }
                    }
                }
                
                if (!encontroPN) {
                    JOptionPane.showMessageDialog(d_iniciarSesion, "No se encontró ningún Cliente con ese nombre.", "Iniciar Sesión - Cliente", JOptionPane.WARNING_MESSAGE);
                    tf_primerNombre_iniciarSesion.setText("");
                    // TODO: Generar log por no haber encontrado ningún usuario con ese nombre
                }
            } else {
                boolean encontroPN = false;
                for (Mantenimiento mantenimiento : adminMantenimiento.mantenimientos) {
                    String pnMantenimiento = mantenimiento.getPrimerNombre();
                    String pwdMantenimiento = mantenimiento.getPwd();
                    if (primerNombre.equals(pnMantenimiento)) {
                        encontroPN = true;
                        if (pwd.equals(pwdMantenimiento)) {
                            maintenance = mantenimiento;
                            intentos = 5;
                            // TODO: Abrir la ventana de Mantenimiento
                            // TODO: Generar log de inicio de sesión
                            
                            tf_primerNombre_iniciarSesion.setText("");
                            pf_pwd_iniciarSesion.setText("");
            
                            d_iniciarSesion.dispose();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(d_iniciarSesion, "La contraseña es incorrecta.");
                            pf_pwd_iniciarSesion.setText("");
                            intentos--;
                            if (intentos == 0) {
                                // TODO: Generar el log por fallar 5 veces
                            }
                        }
                    }
                }
                
                if (!encontroPN) {
                    JOptionPane.showMessageDialog(d_iniciarSesion, "No se encontró ningún Usuario de Mantenimiento con ese nombre.", "Iniciar Sesión - Cliente", JOptionPane.WARNING_MESSAGE);
                    tf_primerNombre_iniciarSesion.setText("");
                    // TODO: Generar log por no haber encontrado ningún usuario con ese nombre
                }
            }
        }
    }//GEN-LAST:event_b_iniciarSesionActionPerformed

    private void cb_ATMsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_ATMsItemStateChanged
        int posicion = cb_ATMs.getSelectedIndex() - 1;
        
        if (posicion >= 0) {
            atmSistema = (ATM) cb_ATMs.getSelectedItem();
        }
    }//GEN-LAST:event_cb_ATMsItemStateChanged

    private void mi_atmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_atmActionPerformed
        int retiro = Integer.parseInt(JOptionPane.showInputDialog(d_ventanaCliente, "Ingrese la cantidad de dinero que desea retirar:"));
        if (atmSistema.getSaldo() < retiro) {
            JOptionPane.showMessageDialog(d_ventanaCliente, "El saldo es insuficiente para realizar el retiro.", "Retiro", JOptionPane.INFORMATION_MESSAGE);
            // TODO: Generar log por fallo en la transacción
        } else {
            atmSistema.setSaldo(atmSistema.getSaldo() - retiro);
            JOptionPane.showMessageDialog(d_ventanaCliente, "El retiro se realizó exitosamente.", "Retiro", JOptionPane.INFORMATION_MESSAGE);
            // TODO: Generar log por transacción exitosa
        }
    }//GEN-LAST:event_mi_atmActionPerformed

    private void mi_cuentaPropiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_cuentaPropiaActionPerformed
        String cuentas = "";
        for (Cuenta cuenta : client.cuentas)
            cuentas += client.cuentas.indexOf(cuenta) + ". " + cuenta + "\n";
        
        int pos = Integer.parseInt(JOptionPane.showInputDialog(d_ventanaCliente, "CUENTAS\n" + cuentas + "Ingrese la posición de la cuenta a la que le quiere depositar:"));
        Cuenta cuenta = client.getCuenta(pos);
        
        int deposito = Integer.parseInt(JOptionPane.showInputDialog(d_ventanaCliente, "Ingrese la cantidad de dinero que desea depositar:"));
        
        cuenta.setSaldo(cuenta.getSaldo() + deposito);
        
        JOptionPane.showMessageDialog(d_ventanaCliente, "El depósito se realizó exitosamente.", "Depósito", JOptionPane.INFORMATION_MESSAGE);
        // TODO: Generar log por transacción exitosa
    }//GEN-LAST:event_mi_cuentaPropiaActionPerformed
    
    public void updateComboBoxATMs() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione un ATM");
        for (ATM atm : adminATM.ATMs)
            modelo.addElement(atm);
        cb_ATMs.setModel(modelo);
    }
    
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
                try {
                    new Main().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_crearATM;
    private javax.swing.JButton b_crearATM_frame;
    private javax.swing.JButton b_crearUsuario;
    private javax.swing.JButton b_crearUsuario_frame;
    private javax.swing.JButton b_ingresarBilletes;
    private javax.swing.JButton b_iniciarSesion;
    private javax.swing.JButton b_iniciarSesion_frame;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cb_ATMs;
    private javax.swing.JDialog d_crearATM;
    private javax.swing.JDialog d_crearUsuario;
    private javax.swing.JDialog d_iniciarSesion;
    private javax.swing.JDialog d_ventanaCliente;
    private javax.swing.JDialog d_ventanaMantenimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel l_aAfiliacion;
    private javax.swing.JLabel l_aFabricacion;
    private javax.swing.JLabel l_aNacimiento;
    private javax.swing.JLabel l_billetes100;
    private javax.swing.JLabel l_billetes500;
    private javax.swing.JLabel l_hora1;
    private javax.swing.JLabel l_hora2;
    private javax.swing.JLabel l_hora3;
    private javax.swing.JLabel l_hora4;
    private javax.swing.JLabel l_hora5;
    private javax.swing.JLabel l_id;
    private javax.swing.JLabel l_id_usuario;
    private javax.swing.JLabel l_meses;
    private javax.swing.JLabel l_primerApellido;
    private javax.swing.JLabel l_primerNombre;
    private javax.swing.JLabel l_primerNombre_iniciarSesion;
    private javax.swing.JLabel l_pwd;
    private javax.swing.JLabel l_pwd_iniciarSesion;
    private javax.swing.JLabel l_segundoApellido;
    private javax.swing.JLabel l_segundoNombre;
    private javax.swing.JLabel l_tiempoMantenimiento;
    private javax.swing.JLabel l_tipoUsuario_crearUsuario;
    private javax.swing.JLabel l_tipoUsuario_iniciarSesion;
    private javax.swing.JLabel l_ubicacion;
    private javax.swing.JMenu m_crearCuenta;
    private javax.swing.JMenu m_deposito;
    private javax.swing.JMenu m_retiro;
    private javax.swing.JMenu m_revisarEstado;
    private javax.swing.JMenu m_revisarTransacciones;
    private javax.swing.JMenuBar mb_acciones_ventanaCliente;
    private javax.swing.JMenuItem mi_atm;
    private javax.swing.JMenuItem mi_cuentaPropia;
    private javax.swing.JMenuItem mi_nuevaCuenta;
    private javax.swing.JMenuItem mi_revisarEstado_cuentaPropia;
    private javax.swing.JMenuItem mi_revisarTransacciones_cuentaPropia;
    private javax.swing.JMenuItem mi_transferencia;
    private javax.swing.JPasswordField pf_pwd;
    private javax.swing.JPasswordField pf_pwd_iniciarSesion;
    private javax.swing.JRadioButton rb_cliente;
    private javax.swing.JRadioButton rb_cliente_iniciarSesion;
    private javax.swing.JRadioButton rb_mantenimiento;
    private javax.swing.JRadioButton rb_mantenimiento_iniciarSesion;
    private javax.swing.JTextField tf_aAfiliacion;
    private javax.swing.JTextField tf_aFabricacion;
    private javax.swing.JTextField tf_aNacimiento;
    private javax.swing.JTextField tf_billetes100;
    private javax.swing.JTextField tf_billetes500;
    private javax.swing.JTextField tf_id_atm;
    private javax.swing.JTextField tf_id_usuario;
    private javax.swing.JTextField tf_primerApellido;
    private javax.swing.JTextField tf_primerNombre;
    private javax.swing.JTextField tf_primerNombre_iniciarSesion;
    private javax.swing.JTextField tf_segundoApellido;
    private javax.swing.JTextField tf_segundoNombre;
    private javax.swing.JTextField tf_tiempoMantenimiento;
    private javax.swing.JTextField tf_ubicacion;
    // End of variables declaration//GEN-END:variables

    // Variables globales
    AdminATM adminATM = new AdminATM("./ATMs.marh");
    AdminCliente adminCliente = new AdminCliente("./Clientes.marh");
    AdminMantenimiento adminMantenimiento = new AdminMantenimiento("./Mantenimientos.marh");
    
    Cliente client;
    int intentos = 5;
    Mantenimiento maintenance;
    ATM atmSistema;
    
}
