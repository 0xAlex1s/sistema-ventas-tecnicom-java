/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author ASUS
 */
public class InterCliente extends javax.swing.JInternalFrame {

    public InterCliente() {
        initComponents();          // inicializa toda la GUI
        setResizable(false);
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        txt_Usuario = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txt_Contraseña = new javax.swing.JTextField();
        Nombre_Nombre = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        Nombre_Apellido = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nombre_Guardar = new javax.swing.JLabel();
        Nombre_Dni = new javax.swing.JLabel();
        txt_Dni = new javax.swing.JTextField();
        Nombre_Usuario = new javax.swing.JLabel();
        Nombre_Contraseña = new javax.swing.JLabel();
        txt_Telefono = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        Nombre_Telefono = new javax.swing.JLabel();
        txt_Apellido = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Nombre_Registrarusuario = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        Nombre_Direccion = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setForeground(new java.awt.Color(255, 255, 255));

        txt_Usuario.setBackground(new java.awt.Color(255, 255, 255));
        txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Usuario.setForeground(new java.awt.Color(0, 0, 0));
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
        txt_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
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

        Nombre_Nombre.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Nombre.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Nombre.setText("Nombre:");

        Nombre_Apellido.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Apellido.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Apellido.setText("Apellido:");

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        Nombre_Guardar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        Nombre_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Nombre_Guardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre_Guardar.setText("GUARDAR");
        Nombre_Guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nombre_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre_GuardarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nombre_Guardar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nombre_Guardar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Nombre_Dni.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Dni.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Dni.setText("DNI:");

        txt_Dni.setBackground(new java.awt.Color(255, 255, 255));
        txt_Dni.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Dni.setForeground(new java.awt.Color(0, 0, 0));
        txt_Dni.setBorder(null);
        txt_Dni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_DniMousePressed(evt);
            }
        });
        txt_Dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DniActionPerformed(evt);
            }
        });

        Nombre_Usuario.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Usuario.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Usuario.setText("Usuario:");

        Nombre_Contraseña.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Contraseña.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Contraseña.setText("Contraseña:");

        txt_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_Telefono.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Telefono.setForeground(new java.awt.Color(0, 0, 0));
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

        Nombre_Telefono.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Telefono.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Telefono.setText("Telefono:");

        txt_Apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_Apellido.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Apellido.setForeground(new java.awt.Color(0, 0, 0));
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

        Nombre_Registrarusuario.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        Nombre_Registrarusuario.setForeground(new java.awt.Color(0, 102, 255));
        Nombre_Registrarusuario.setText("REGISTRAR NUEVO CLIENTE");

        txt_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(0, 0, 0));
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

        Nombre_Direccion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        Nombre_Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Nombre_Direccion.setText("Direccion:");

        txt_Direccion.setBackground(new java.awt.Color(255, 255, 255));
        txt_Direccion.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_Direccion.setForeground(new java.awt.Color(0, 0, 0));
        txt_Direccion.setBorder(null);
        txt_Direccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_DireccionMousePressed(evt);
            }
        });
        txt_Direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DireccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(Nombre_Registrarusuario))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Nombre_Telefono)
                                    .addComponent(Nombre_Contraseña))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Nombre_Apellido)
                                    .addComponent(Nombre_Nombre)
                                    .addComponent(Nombre_Usuario)
                                    .addComponent(Nombre_Dni)
                                    .addComponent(Nombre_Direccion))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jSeparator3)
                                    .addComponent(jSeparator2)
                                    .addComponent(txt_Usuario)
                                    .addComponent(txt_Dni)
                                    .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Nombre)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator7))))))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Nombre_Registrarusuario)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_Dni)
                    .addComponent(txt_Dni, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre_Nombre)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre_Apellido)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(txt_Apellido)
                        .addGap(2, 2, 2)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre_Direccion)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(txt_Direccion)
                        .addGap(2, 2, 2)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Usuario)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Telefono)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre_Contraseña)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void Nombre_GuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_GuardarMousePressed
        // VALIDACIONES USANDO COMMONS LANG3
        String nombre = txt_Nombre.getText().trim();
        String apellido = txt_Apellido.getText().trim();
        String telefono = txt_Telefono.getText().trim();
        String dni = txt_Dni.getText().trim();
        String direccion = txt_Direccion.getText().trim();

        // Validación de campos vacíos o en blanco
        if (StringUtils.isBlank(nombre) || StringUtils.isBlank(apellido)
                || StringUtils.isBlank(telefono) || StringUtils.isBlank(dni)
                || StringUtils.isBlank(direccion)) {

            JOptionPane.showMessageDialog(this, "Completa todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de DNI: debe tener 8 dígitos numéricos
        if (!NumberUtils.isDigits(dni) || dni.length() != 8) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener exactamente 8 dígitos numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validación de Teléfono: debe tener 9 dígitos numéricos
        if (!NumberUtils.isDigits(telefono) || telefono.length() != 9) {
            JOptionPane.showMessageDialog(this, "El teléfono debe tener exactamente 9 dígitos numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (java.sql.Connection con = conexion.Conexion.conectar()) {

            // Verificar si el DNI ya existe
            String sqlExiste = "SELECT idCliente FROM tb_cliente WHERE dni = ?";
            try (java.sql.PreparedStatement pstExiste = con.prepareStatement(sqlExiste)) {
                pstExiste.setString(1, dni);
                try (java.sql.ResultSet rs = pstExiste.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "El DNI ya está registrado.", "Aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            // Insertar nuevo cliente
            String sqlCliente = "INSERT INTO tb_cliente (nombre, apellido, dni, telefono, direccion, estado) VALUES (?, ?, ?, ?, ?, ?)";
            try (java.sql.PreparedStatement pstCliente = con.prepareStatement(sqlCliente)) {
                pstCliente.setString(1, nombre);
                pstCliente.setString(2, apellido);
                pstCliente.setString(3, dni);
                pstCliente.setString(4, telefono);
                pstCliente.setString(5, direccion);
                pstCliente.setInt(6, 1); // Estado: activo
                pstCliente.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Cliente registrado exitosamente.");

            // Limpiar campos
            txt_Dni.setText("");
            txt_Nombre.setText("");
            txt_Apellido.setText("");
            txt_Telefono.setText("");
            txt_Direccion.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();

    }//GEN-LAST:event_Nombre_GuardarMousePressed
    }

    private void txt_TelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_TelefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoMousePressed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_DniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DniMousePressed
        // Cuando haces clic en el campo usuario
    }//GEN-LAST:event_txt_DniMousePressed

    private void txt_DniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DniActionPerformed

    }//GEN-LAST:event_txt_DniActionPerformed

    private void txt_ApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ApellidoMousePressed
        // Cuando haces clic en el campo usuario
    }//GEN-LAST:event_txt_ApellidoMousePressed

    private void txt_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ApellidoActionPerformed

    private void txt_NombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_NombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreMousePressed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_DireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_DireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DireccionMousePressed

    private void txt_DireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DireccionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nombre_Apellido;
    private javax.swing.JLabel Nombre_Contraseña;
    private javax.swing.JLabel Nombre_Direccion;
    private javax.swing.JLabel Nombre_Dni;
    private javax.swing.JLabel Nombre_Guardar;
    private javax.swing.JLabel Nombre_Nombre;
    private javax.swing.JLabel Nombre_Registrarusuario;
    private javax.swing.JLabel Nombre_Telefono;
    private javax.swing.JLabel Nombre_Usuario;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Contraseña;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Dni;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
