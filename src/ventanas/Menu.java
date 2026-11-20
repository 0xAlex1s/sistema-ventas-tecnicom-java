package ventanas;

import ventanas.InterGestionarCategoria;
import ventanas.InterGestionarCliente;
import ventanas.InterCliente;
import ventanas.InterCategoria;
import ventanas.InterActualizarStock;
import java.awt.Dimension;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    private void setWallpaper() {
        ImageIcon fondo = new ImageIcon(getClass().getResource("/img/TECNICOM.png"));
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jDesktopPane1_menu.getWidth(), jDesktopPane1_menu.getHeight(), java.awt.Image.SCALE_SMOOTH));
        Wallpaper.setIcon(icono);
        Wallpaper.setBounds(0, 0, jDesktopPane1_menu.getWidth(), jDesktopPane1_menu.getHeight());
    }
    private String usuarioActivo;
    private static final java.util.logging.Logger logger
            = java.util.logging.Logger.getLogger(Menu.class.getName());

    public Menu(String nombreUsuarioActivo) {
        initComponents();
        setWallpaper();

        // Aquí guardamos el nombre recibido
        this.usuarioActivo = nombreUsuarioActivo;

        // Configuración básica de la ventana
        setTitle("Sistema de ventas TECNICOM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(1200, 745);

        // Mostrar saludo en el JLabel
        mostrarBienvenida();

        // Acciones de menú
        jMenuItem_gestionar_cliente.addActionListener(e -> {
            InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
            jDesktopPane1_menu.add(interGestionarCliente);
            interGestionarCliente.setVisible(true);
        });

        setJMenuBar(jMenuBar1);
    }

    private void mostrarBienvenida() {
        java.time.LocalTime hora = java.time.LocalTime.now();
        java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss");

        String texto = "Bienvenido " + usuarioActivo + " — Ingresaste a las " + hora.format(formato);

        nombreUsuario.setText(texto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1_menu = new javax.swing.JDesktopPane();
        nombreUsuario = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem_nuevo_usuario = new javax.swing.JMenuItem();
        jMenuItem_gestionar_usuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem_nuevo_producto = new javax.swing.JMenuItem();
        jMenuItem_gestionar_producto = new javax.swing.JMenuItem();
        jMenuItem_actualizar_stock = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem_nuevo_cliente = new javax.swing.JMenuItem();
        jMenuItem_gestionar_cliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem_nueva_categoria = new javax.swing.JMenuItem();
        jMenuItem_gestionar_categoria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem_nueva_venta = new javax.swing.JMenuItem();
        jMenuItem_gestionar_venta = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem_reportes_clientes = new javax.swing.JMenuItem();
        jMenuItem_reportes_categorias = new javax.swing.JMenuItem();
        jMenuItem_reportes_inventario = new javax.swing.JMenuItem();
        jMenuItem_reportes_ventas = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem_ver_historial = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem_cerrar_sesión = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 153));
        setFont(new java.awt.Font("Agency FB", 1, 10)); // NOI18N
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        nombreUsuario.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        nombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1_menu.add(nombreUsuario);
        nombreUsuario.setBounds(0, 610, 540, 30);

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/TECNICOM.png"))); // NOI18N
        jDesktopPane1_menu.add(Wallpaper);
        Wallpaper.setBounds(0, 0, 1200, 680);

        getContentPane().add(jDesktopPane1_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        jMenu1.setBackground(new java.awt.Color(0, 51, 153));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nuevo_usuario.setText("Nuevo Usuario");
        jMenuItem_nuevo_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_nuevo_usuario);

        jMenuItem_gestionar_usuario.setText("Gestionar Usuario");
        jMenuItem_gestionar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_usuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem_gestionar_usuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 51, 153));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario.png"))); // NOI18N
        jMenu2.setText("Inventario");
        jMenu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nuevo_producto.setText("Nuevo Producto");
        jMenuItem_nuevo_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_nuevo_producto);

        jMenuItem_gestionar_producto.setText("Gestionar Producto");
        jMenuItem_gestionar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_productoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_gestionar_producto);

        jMenuItem_actualizar_stock.setText("Actualizar Stock");
        jMenuItem_actualizar_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_actualizar_stockActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem_actualizar_stock);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 51, 153));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientes.png"))); // NOI18N
        jMenu3.setText("Cliente");
        jMenu3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nuevo_cliente.setText("Nuevo Cliente");
        jMenuItem_nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nuevo_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_nuevo_cliente);

        jMenuItem_gestionar_cliente.setText("Gestionar Cliente");
        jMenuItem_gestionar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_clienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem_gestionar_cliente);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 51, 153));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/categoria.png"))); // NOI18N
        jMenu4.setText("Categoria");
        jMenu4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nueva_categoria.setText("Nueva Categoria");
        jMenuItem_nueva_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_nueva_categoria);

        jMenuItem_gestionar_categoria.setText("Gestionar Categoria");
        jMenuItem_gestionar_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_categoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem_gestionar_categoria);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 51, 153));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facturar.png"))); // NOI18N
        jMenu5.setText("Facturar");
        jMenu5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_nueva_venta.setText("Nueva venta");
        jMenuItem_nueva_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_nueva_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_nueva_venta);

        jMenuItem_gestionar_venta.setText("Gestionar Venta");
        jMenuItem_gestionar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_gestionar_ventaActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem_gestionar_venta);

        jMenuBar1.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(0, 51, 153));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reportes.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu6.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_reportes_clientes.setText("Reportes Clientes");
        jMenuItem_reportes_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_reportes_clientesActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem_reportes_clientes);

        jMenuItem_reportes_categorias.setText("Reportes Categorias");
        jMenu6.add(jMenuItem_reportes_categorias);

        jMenuItem_reportes_inventario.setText("Reportes Inventario");
        jMenu6.add(jMenuItem_reportes_inventario);

        jMenuItem_reportes_ventas.setText("Reportes ventas");
        jMenu6.add(jMenuItem_reportes_ventas);

        jMenuBar1.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(0, 51, 153));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/historial.png"))); // NOI18N
        jMenu7.setText("Historial");
        jMenu7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu7.setPreferredSize(new java.awt.Dimension(150, 30));

        jMenuItem_ver_historial.setText("Ver Historial");
        jMenuItem_ver_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_ver_historialActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem_ver_historial);

        jMenuBar1.add(jMenu7);

        jMenu8.setBackground(new java.awt.Color(0, 51, 153));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        jMenu8.setText("Cerrar sesión");
        jMenu8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenu8.setMinimumSize(new java.awt.Dimension(150, 30));
        jMenu8.setPreferredSize(new java.awt.Dimension(250, 30));

        jMenuItem_cerrar_sesión.setText("Cerrar sesión");
        jMenuItem_cerrar_sesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_cerrar_sesiónActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem_cerrar_sesión);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_nuevo_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_usuarioActionPerformed

        InterUsuario interUsuario = new InterUsuario();
        jDesktopPane1_menu.add(interUsuario);
        interUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_usuarioActionPerformed


    private void jMenuItem_nuevo_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_productoActionPerformed
// Crear una instancia de la ventana interna
    InterNuevoProducto interNuevoProducto = new InterNuevoProducto();

    // Agregar la ventana interna al escritorio del menú
    jDesktopPane1_menu.add(interNuevoProducto);

    // Mostrar la ventana
    interNuevoProducto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_productoActionPerformed

    private void jMenuItem_gestionar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_usuarioActionPerformed
        InterGestionarUsuario gestionarUsuario = new InterGestionarUsuario();
        jDesktopPane1_menu.add(gestionarUsuario);
        gestionarUsuario.setVisible(true);

    }//GEN-LAST:event_jMenuItem_gestionar_usuarioActionPerformed

    private void jMenuItem_actualizar_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_actualizar_stockActionPerformed
        // TODO add your handling code here:
            InterActualizarStock interActualizarStock = new InterActualizarStock();
    jDesktopPane1_menu.add(interActualizarStock);
    interActualizarStock.setVisible(true);

    }//GEN-LAST:event_jMenuItem_actualizar_stockActionPerformed

    private void jMenuItem_nueva_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_categoriaActionPerformed
        InterCategoria interCategoria = new InterCategoria();
        jDesktopPane1_menu.add(interCategoria);
        interCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nueva_categoriaActionPerformed

    private void jMenuItem_gestionar_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_categoriaActionPerformed
        InterGestionarCategoria interGestionarCategoria = new InterGestionarCategoria();
        jDesktopPane1_menu.add(interGestionarCategoria);
        interGestionarCategoria.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_categoriaActionPerformed

    private void jMenuItem_nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nuevo_clienteActionPerformed

        InterCliente interCliente = new InterCliente();
        // Añadimos el formulario al JDesktopPane principal
        jDesktopPane1_menu.add(interCliente);

        // Lo hacemos visible
        interCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_nuevo_clienteActionPerformed

    private void jMenuItem_cerrar_sesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_cerrar_sesiónActionPerformed
        int opcion = javax.swing.JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro que deseas cerrar sesión?",
                "Confirmar cierre",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE
        );

        if (opcion == javax.swing.JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem_cerrar_sesiónActionPerformed

    private void jMenuItem_gestionar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_productoActionPerformed
        // TODO add your handling code here:
    InterGestionarProducto interGestionar = new InterGestionarProducto();
    jDesktopPane1_menu.add(interGestionar);
    interGestionar.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_productoActionPerformed

    private void jMenuItem_gestionar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_clienteActionPerformed
        // TODO add your handling code here:
        InterGestionarCliente interGestionarCliente = new InterGestionarCliente();
    jDesktopPane1_menu.add(interGestionarCliente);
    interGestionarCliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem_gestionar_clienteActionPerformed

    private void jMenuItem_nueva_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_nueva_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_nueva_ventaActionPerformed

    private void jMenuItem_gestionar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_gestionar_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_gestionar_ventaActionPerformed

    private void jMenuItem_reportes_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_reportes_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_reportes_clientesActionPerformed

    private void jMenuItem_ver_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_ver_historialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem_ver_historialActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new Menu("Usuario de prueba").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JDesktopPane jDesktopPane1_menu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_actualizar_stock;
    private javax.swing.JMenuItem jMenuItem_cerrar_sesión;
    private javax.swing.JMenuItem jMenuItem_gestionar_categoria;
    private javax.swing.JMenuItem jMenuItem_gestionar_cliente;
    private javax.swing.JMenuItem jMenuItem_gestionar_producto;
    private javax.swing.JMenuItem jMenuItem_gestionar_usuario;
    private javax.swing.JMenuItem jMenuItem_gestionar_venta;
    private javax.swing.JMenuItem jMenuItem_nueva_categoria;
    private javax.swing.JMenuItem jMenuItem_nueva_venta;
    private javax.swing.JMenuItem jMenuItem_nuevo_cliente;
    private javax.swing.JMenuItem jMenuItem_nuevo_producto;
    private javax.swing.JMenuItem jMenuItem_nuevo_usuario;
    private javax.swing.JMenuItem jMenuItem_reportes_categorias;
    private javax.swing.JMenuItem jMenuItem_reportes_clientes;
    private javax.swing.JMenuItem jMenuItem_reportes_inventario;
    private javax.swing.JMenuItem jMenuItem_reportes_ventas;
    private javax.swing.JMenuItem jMenuItem_ver_historial;
    private javax.swing.JLabel nombreUsuario;
    // End of variables declaration//GEN-END:variables
}
