package ventanas;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterActualizarStock extends JInternalFrame {

    private JTextField txt_idProducto, txt_nuevoStock;
    private JButton btn_actualizar, btn_buscar;
    private JLabel lbl_idProducto, lbl_nuevoStock, lbl_nombreProducto, lbl_wallpaper;
    private JLabel lbl_titulo;
    private String nombreProducto = "";

    public InterActualizarStock() {
        setTitle("Actualizar Stock de Productos");
        setSize(450, 300);
        setClosable(true);
        setIconifiable(true);
        setResizable(false);
        setLayout(null);

        // === ETIQUETAS ===
        lbl_titulo = new JLabel("Actualizar Stock de Productos", SwingConstants.CENTER);
        lbl_titulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        lbl_titulo.setForeground(Color.WHITE);
        lbl_titulo.setBounds(60, 20, 320, 30);
        add(lbl_titulo);

        lbl_idProducto = new JLabel("ID del Producto:");
        lbl_idProducto.setForeground(Color.WHITE);
        lbl_idProducto.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lbl_idProducto.setBounds(60, 80, 130, 25);
        add(lbl_idProducto);

        txt_idProducto = new JTextField();
        txt_idProducto.setBounds(200, 80, 150, 25);
        add(txt_idProducto);

        btn_buscar = new JButton("Buscar");
        btn_buscar.setBounds(360, 80, 80, 25);
        add(btn_buscar);

        lbl_nombreProducto = new JLabel("Nombre: ");
        lbl_nombreProducto.setForeground(Color.WHITE);
        lbl_nombreProducto.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lbl_nombreProducto.setBounds(60, 120, 350, 25);
        add(lbl_nombreProducto);

        lbl_nuevoStock = new JLabel("Nuevo Stock:");
        lbl_nuevoStock.setForeground(Color.WHITE);
        lbl_nuevoStock.setFont(new Font("Segoe UI", Font.BOLD, 14));
        lbl_nuevoStock.setBounds(60, 160, 130, 25);
        add(lbl_nuevoStock);

        txt_nuevoStock = new JTextField();
        txt_nuevoStock.setBounds(200, 160, 150, 25);
        add(txt_nuevoStock);

        btn_actualizar = new JButton("Actualizar");
        btn_actualizar.setBounds(180, 210, 100, 30);
        add(btn_actualizar);

        // === FONDO ===
        lbl_wallpaper = new JLabel();
        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/img/fondo1.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(450, 300, Image.SCALE_SMOOTH));
        lbl_wallpaper.setIcon(icono);
        lbl_wallpaper.setBounds(0, 0, 450, 300);
        add(lbl_wallpaper);

        // === ACCIONES ===
        btn_buscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarProducto();
            }
        });

        btn_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarStock();
            }
        });
    }

    private void buscarProducto() {
        String idTexto = txt_idProducto.getText().trim();

        if (idTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el ID del producto.");
            return;
        }

        try {
            int id = Integer.parseInt(idTexto);
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("SELECT nombre FROM tb_inventario WHERE idInventario=?");
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                nombreProducto = rs.getString("nombre");
                lbl_nombreProducto.setText("Nombre: " + nombreProducto);
            } else {
                lbl_nombreProducto.setText("Producto no encontrado.");
                nombreProducto = "";
            }

            cn.close();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el ID.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar producto: " + e);
        }
    }

    private void actualizarStock() {
        String idTexto = txt_idProducto.getText().trim();
        String nuevoStock = txt_nuevoStock.getText().trim();

        if (idTexto.isEmpty() || nuevoStock.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos.");
            return;
        }

        try {
            int id = Integer.parseInt(idTexto);
            int stock = Integer.parseInt(nuevoStock);

            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement("UPDATE tb_inventario SET cantidad=? WHERE idInventario=?");
            pst.setInt(1, stock);
            pst.setInt(2, id);

            int resultado = pst.executeUpdate();

            if (resultado > 0) {
                JOptionPane.showMessageDialog(this, "Stock actualizado correctamente.");
                txt_idProducto.setText("");
                txt_nuevoStock.setText("");
                lbl_nombreProducto.setText("Nombre: ");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el producto con ese ID.");
            }

            cn.close();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido para el stock o ID.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar stock: " + e);
        }
    }
}

