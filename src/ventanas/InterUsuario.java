/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventanas;

import java.awt.Color;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author ASUS
 */
public class InterUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuario
     */
    public InterUsuario() {
        initComponents();
        this.setLocation(0, 0); // Aparece en la esquina superior izquierda

        // Forzamos los fondos blancos (sin depender del Look & Feel)
        this.getContentPane().setBackground(Color.WHITE);
        bg.setBackground(Color.WHITE);
        jPanel2.setBackground(new Color(51, 153, 255)); // color azul del botón
        this.setSize(500, 450);
        txt_Nombre.setForeground(Color.BLACK);
        txt_Apellido.setForeground(Color.BLACK);
        txt_Usuario.setForeground(Color.BLACK);
        txt_Telefono.setForeground(Color.BLACK);
        txt_Contraseña.setForeground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre_Registrarusuario = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        Nombre_Nombre = new javax.swing.JLabel();
        Nombre_Apellido = new javax.swing.JLabel();
        Nombre_Usuario = new javax.swing.JLabel();
        Nombre_Contraseña = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txt_Apellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txt_Usuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_Contraseña = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Nombre_Contraseña1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);

        Nombre_Registrarusuario.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Nombre_Registrarusuario.setForeground(new java.awt.Color(0, 102, 255));
        Nombre_Registrarusuario.setText("REGISTRA NUEVO USUARIO");

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre_Nombre.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Nombre.setText("Nombre:");

        Nombre_Apellido.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Apellido.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Apellido.setText("Apellido:");

        Nombre_Usuario.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Usuario.setText("Usuario:");

        Nombre_Contraseña.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Contraseña.setText("Contraseña:");

        txt_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(204, 204, 204));
        txt_Nombre.setBorder(null);
        txt_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_NombreMousePressed(evt);
            }
        });
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });

        txt_Apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_Apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Apellido.setForeground(new java.awt.Color(204, 204, 204));
        txt_Apellido.setBorder(null);
        txt_Apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ApellidoMousePressed(evt);
            }
        });
        txt_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ApellidoActionPerformed(evt);
            }
        });

        txt_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(204, 204, 204));
        txt_Usuario.setBorder(null);
        txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_UsuarioMousePressed(evt);
            }
        });
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });

        txt_Contraseña.setBackground(new java.awt.Color(255, 255, 255));
        txt_Contraseña.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Contraseña.setForeground(new java.awt.Color(204, 204, 204));
        txt_Contraseña.setBorder(null);
        txt_Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ContraseñaMousePressed(evt);
            }
        });
        txt_Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraseñaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GUARDAR");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Telefono.setForeground(new java.awt.Color(204, 204, 204));
        txt_Telefono.setBorder(null);
        txt_Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_TelefonoMousePressed(evt);
            }
        });
        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });

        Nombre_Contraseña1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Contraseña1.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Contraseña1.setText("Telefono:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(Nombre_Registrarusuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Nombre_Apellido)
                                    .addComponent(Nombre_Nombre)
                                    .addComponent(Nombre_Usuario))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txt_Usuario)
                                    .addComponent(txt_Nombre)
                                    .addComponent(txt_Apellido)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Nombre_Contraseña1)
                                    .addComponent(Nombre_Contraseña))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Nombre_Registrarusuario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_Nombre)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_Apellido)
                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_Usuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Contraseña1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Contraseña)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_NombreMousePressed
        // Cuando haces clic en el campo usuario

    }//GEN-LAST:event_txt_NombreMousePressed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_ApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ApellidoMousePressed
        // Cuando haces clic en el campo usuario

    }//GEN-LAST:event_txt_ApellidoMousePressed

    private void txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoActionPerformed

    private void txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UsuarioMousePressed
        // Cuando haces clic en el campo usuario

    }//GEN-LAST:event_txt_UsuarioMousePressed

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed

    private void txt_ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ContraseñaMousePressed
        // Cuando haces clic en el campo usuario

    }//GEN-LAST:event_txt_ContraseñaMousePressed

    private void txt_ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraseñaActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // BOTÓN GUARDAR CON VALIDACIONES USANDO COMMONS LANG3

        String nombre = txt_Nombre.getText().trim();
        String apellido = txt_Apellido.getText().trim();
        String usuario = txt_Usuario.getText().trim();
        String contraseña = txt_Contraseña.getText().trim();
        String telefono = txt_Telefono.getText().trim();

        // Validación de campos vacíos o solo espacios
        if (StringUtils.isBlank(nombre) || StringUtils.isBlank(apellido)
                || StringUtils.isBlank(usuario) || StringUtils.isBlank(contraseña)
                || StringUtils.isBlank(telefono)) {

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Todos los campos deben estar completos",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación del teléfono
        if (!NumberUtils.isCreatable(telefono) || telefono.length() != 9) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "El teléfono debe tener exactamente 9 dígitos numéricos",
                    "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Inserción a la base de datos
        try {
            java.sql.Connection con = conexion.Conexion.conectar();
            String sql = "INSERT INTO tb_usuario (nombre, apellido, usuario, contraseña, telefono, estado) VALUES (?, ?, ?, ?, ?, ?)";
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, usuario);
            pst.setString(4, contraseña);
            pst.setString(5, telefono);
            pst.setInt(6, 1); // estado activo

            int resultado = pst.executeUpdate();
            if (resultado > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso");

                // Limpiar campos
                txt_Nombre.setText("");
                txt_Apellido.setText("");
                txt_Usuario.setText("");
                txt_Contraseña.setText("");
                txt_Telefono.setText("");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Error al registrar",
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }

            pst.close();
            con.close();
        } catch (Exception e) {
            System.err.println("Error al conectar con la base de datos: " + e.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No se pudo conectar con la base de datos. Verifica la conexión.",
                    "Error de conexión",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jLabel1MousePressed

    private void txt_TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TelefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoMousePressed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre_Apellido;
    private javax.swing.JLabel Nombre_Contraseña;
    private javax.swing.JLabel Nombre_Contraseña1;
    private javax.swing.JLabel Nombre_Nombre;
    private javax.swing.JLabel Nombre_Registrarusuario;
    private javax.swing.JLabel Nombre_Usuario;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Contraseña;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
