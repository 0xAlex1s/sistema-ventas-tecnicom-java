package ventanas;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import controlador.ControlUsuario;
import java.awt.Color;
import modelo.Usuario;
import dao.UsuarioDAO;


public class Login extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Login - Sistema de ventas TECNICOM");
        this.setSize(new Dimension(635, 480));

        // --- Enlazar eventos esenciales ---
        // Enter en usuario -> salta a contraseña
        txt_usuario.addActionListener(e -> txt_contraseña.requestFocus());

        txt_contraseña.addActionListener(e -> login());

        BotonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                login();
            }
        });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        Azulclaro = new javax.swing.JPanel();
        sistemasdeventas = new javax.swing.JLabel();
        Azulfuerte = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreGrupo = new javax.swing.JLabel();
        NombreTecnicom = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        NombreContraseña = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        BotonEntrar = new javax.swing.JPanel();
        NombreEntrar = new javax.swing.JLabel();
        iconouser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Azulclaro.setBackground(new java.awt.Color(31, 126, 227));

        sistemasdeventas.setBackground(new java.awt.Color(255, 255, 255));
        sistemasdeventas.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        sistemasdeventas.setForeground(new java.awt.Color(255, 255, 255));
        sistemasdeventas.setText("SISTEMA DE VENTAS");

        Azulfuerte.setBackground(new java.awt.Color(4, 52, 114));

        javax.swing.GroupLayout AzulfuerteLayout = new javax.swing.GroupLayout(Azulfuerte);
        Azulfuerte.setLayout(AzulfuerteLayout);
        AzulfuerteLayout.setHorizontalGroup(
            AzulfuerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        AzulfuerteLayout.setVerticalGroup(
            AzulfuerteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modelo.png"))); // NOI18N

        NombreGrupo.setBackground(new java.awt.Color(255, 255, 255));
        NombreGrupo.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        NombreGrupo.setForeground(new java.awt.Color(255, 255, 255));
        NombreGrupo.setText("@Grupo GPT");

        javax.swing.GroupLayout AzulclaroLayout = new javax.swing.GroupLayout(Azulclaro);
        Azulclaro.setLayout(AzulclaroLayout);
        AzulclaroLayout.setHorizontalGroup(
            AzulclaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Azulfuerte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AzulclaroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sistemasdeventas)
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addGroup(AzulclaroLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(NombreGrupo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AzulclaroLayout.setVerticalGroup(
            AzulclaroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AzulclaroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(sistemasdeventas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NombreGrupo)
                .addGap(225, 225, 225)
                .addComponent(Azulfuerte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bg.add(Azulclaro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 280, 450));

        NombreTecnicom.setBackground(new java.awt.Color(255, 255, 0));
        NombreTecnicom.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        NombreTecnicom.setText("TECNICOM");
        bg.add(NombreTecnicom, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        NombreUsuario.setBackground(new java.awt.Color(0, 0, 0));
        NombreUsuario.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        NombreUsuario.setText("USUARIO");
        bg.add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        txt_usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });
        bg.add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 170, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 190, 20));

        NombreContraseña.setBackground(new java.awt.Color(0, 0, 0));
        NombreContraseña.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        NombreContraseña.setText("CONTRASEÑA");
        bg.add(NombreContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        txt_contraseña.setBorder(null);
        txt_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraseñaMousePressed(evt);
            }
        });
        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });
        bg.add(txt_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 150, -1));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 190, 20));

        BotonEntrar.setBackground(new java.awt.Color(31, 126, 227));
        BotonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        NombreEntrar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        NombreEntrar.setForeground(new java.awt.Color(255, 255, 255));
        NombreEntrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreEntrar.setText("ENTRAR");
        NombreEntrar.setToolTipText("");
        NombreEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreEntrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BotonEntrarLayout = new javax.swing.GroupLayout(BotonEntrar);
        BotonEntrar.setLayout(BotonEntrarLayout);
        BotonEntrarLayout.setHorizontalGroup(
            BotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonEntrarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(NombreEntrar)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        BotonEntrarLayout.setVerticalGroup(
            BotonEntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonEntrarLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(NombreEntrar)
                .addContainerGap())
        );

        bg.add(BotonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 100, 40));

        iconouser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/P.png"))); // NOI18N
        bg.add(iconouser, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        // Cuando haces clic en el campo usuario
        txt_usuario.setForeground(Color.black); // se marca en negro

        // Si la contraseña está vacía, vuelve a mostrar los asteriscos
        if (String.valueOf(txt_contraseña.getPassword()).isEmpty()) {
            txt_contraseña.setText("");
            txt_contraseña.setForeground(Color.gray);
    }//GEN-LAST:event_txt_usuarioMousePressed
    }
    private void txt_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraseñaMousePressed
        // Cuando haces clic en el campo contraseña
        if (String.valueOf(txt_contraseña.getPassword()).equals("********")) {
            txt_contraseña.setText("");
            txt_contraseña.setForeground(Color.black);
        }

        // El usuario también se marca en negro al enfocarlo antes
        txt_usuario.setForeground(Color.black);
   
    }//GEN-LAST:event_txt_contraseñaMousePressed

    private void NombreEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreEntrarMouseClicked
           this.login();

    }//GEN-LAST:event_NombreEntrarMouseClicked

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

    public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Azulclaro;
    private javax.swing.JPanel Azulfuerte;
    private javax.swing.JPanel BotonEntrar;
    private javax.swing.JLabel NombreContraseña;
    private javax.swing.JLabel NombreEntrar;
    private javax.swing.JLabel NombreGrupo;
    private javax.swing.JLabel NombreTecnicom;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel iconouser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel sistemasdeventas;
    private javax.swing.JPasswordField txt_contraseña;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
    private void login() {
    String usuario = txt_usuario.getText().trim();
    String contraseña = String.valueOf(txt_contraseña.getPassword()).trim();

    if (!usuario.isEmpty() && !contraseña.isEmpty()) {
        UsuarioDAO userDAO = new UsuarioDAO();
        Usuario user = userDAO.validarLogin(usuario, contraseña);

        if (user != null) {
            String nombreCompleto = user.getNombre() + " " + user.getApellido();
            JOptionPane.showMessageDialog(this, "✅ ¡Bienvenido, " + nombreCompleto + "!");
            
            Menu menu = new Menu(nombreCompleto); // pásale el nombre si deseas mostrarlo en el menú
            menu.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "❌ Usuario o contraseña incorrectos");
        }
    } else {
        JOptionPane.showMessageDialog(this, "⚠️ Ingrese sus credenciales");
    }
}
}
