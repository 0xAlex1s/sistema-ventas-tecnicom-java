package ventanas;

import conexion.Conexion;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class InterGestionarProducto extends JInternalFrame {

    private JTable tablaProductos;
    private DefaultTableModel modeloTabla;
    private JScrollPane scrollPane;
    private JButton btnAgregar, btnEditar, btnEliminar, btnActualizarStock;
    private JLabel lbl_titulo, lbl_wallpaper;

    public InterGestionarProducto() {
        // Configuración de la ventana
        setTitle("Gestionar Productos");
        setSize(750, 500);
        setClosable(true);
        setIconifiable(true);
        setResizable(false);
        setLayout(null);

        // === TÍTULO ===
        lbl_titulo = new JLabel("Gestión de Productos", SwingConstants.CENTER);
        lbl_titulo.setFont(new Font("Segoe UI", Font.BOLD, 20));
        lbl_titulo.setForeground(Color.WHITE);
        lbl_titulo.setBounds(200, 10, 350, 40);
        add(lbl_titulo);

        // === TABLA ===
        String[] columnas = {"ID", "Nombre", "Cantidad", "Precio", "Descripción", "Categoría", "IGV"};
        modeloTabla = new DefaultTableModel(columnas, 0);
        tablaProductos = new JTable(modeloTabla);
        scrollPane = new JScrollPane(tablaProductos);
        scrollPane.setBounds(40, 70, 660, 280);
        add(scrollPane);

        // === BOTONES ===
        btnAgregar = new JButton("Agregar Producto");
        btnAgregar.setBounds(40, 370, 150, 30);
        add(btnAgregar);

        btnEditar = new JButton("Editar Producto");
        btnEditar.setBounds(210, 370, 150, 30);
        add(btnEditar);

        btnEliminar = new JButton("Eliminar Producto");
        btnEliminar.setBounds(380, 370, 150, 30);
        add(btnEliminar);

        btnActualizarStock = new JButton("Actualizar Stock");
        btnActualizarStock.setBounds(550, 370, 150, 30);
        add(btnActualizarStock);

        // === FONDO ===
        lbl_wallpaper = new JLabel();
        ImageIcon wallpaper = new ImageIcon(getClass().getResource("/img/fondo1.png"));
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(750, 500, Image.SCALE_SMOOTH));
        lbl_wallpaper.setIcon(icono);
        lbl_wallpaper.setBounds(0, 0, 750, 500);
        add(lbl_wallpaper);

        // === CARGAR PRODUCTOS DESDE LA BD ===
        cargarProductos();

        // === ACCIONES ===
        btnAgregar.addActionListener(e -> agregarProducto());
        btnEditar.addActionListener(e -> editarProducto());
        btnEliminar.addActionListener(e -> eliminarProducto());
        btnActualizarStock.addActionListener(e -> actualizarStock());
    }

    // === MÉTODOS DE FUNCIONALIDAD ===

    private void cargarProductos() {
        modeloTabla.setRowCount(0);
        try (Connection cn = Conexion.conectar();
             PreparedStatement pst = cn.prepareStatement("SELECT * FROM tb_inventario");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Object[] fila = new Object[]{
                        rs.getInt("idInventario"),
                        rs.getString("nombre"),
                        rs.getInt("cantidad"),
                        rs.getDouble("precio"),
                        rs.getString("descripcion"),
                        rs.getInt("idCategoria"),
                        rs.getInt("igv")
                };
                modeloTabla.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los productos: " + e.getMessage());
        }
    }

    private void agregarProducto() {
        JOptionPane.showMessageDialog(this, 
                "Para agregar un producto, usa el formulario 'Nuevo Producto' del menú Inventario.");
    }

    private void editarProducto() {
        int fila = tablaProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para editar.");
            return;
        }

        try {
            int id = (int) modeloTabla.getValueAt(fila, 0);
            String nuevoNombre = JOptionPane.showInputDialog("Nuevo nombre:", modeloTabla.getValueAt(fila, 1));
            String nuevoPrecio = JOptionPane.showInputDialog("Nuevo precio:", modeloTabla.getValueAt(fila, 3));

            if (nuevoNombre != null && nuevoPrecio != null) {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "UPDATE tb_inventario SET nombre=?, precio=? WHERE idInventario=?");
                pst.setString(1, nuevoNombre);
                pst.setDouble(2, Double.parseDouble(nuevoPrecio));
                pst.setInt(3, id);

                int resultado = pst.executeUpdate();
                cn.close();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this, "Producto actualizado correctamente.");
                    cargarProductos();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al actualizar producto.");
                }
            }

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al editar producto: " + e.getMessage());
        }
    }

    private void eliminarProducto() {
        int fila = tablaProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para eliminar.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de eliminar este producto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try {
                int id = (int) modeloTabla.getValueAt(fila, 0);
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("DELETE FROM tb_inventario WHERE idInventario=?");
                pst.setInt(1, id);
                pst.executeUpdate();
                cn.close();

                JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
                cargarProductos();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar producto: " + e.getMessage());
            }
        }
    }

    private void actualizarStock() {
        int fila = tablaProductos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un producto para actualizar stock.");
            return;
        }

        try {
            int id = (int) modeloTabla.getValueAt(fila, 0);
            String nuevoStock = JOptionPane.showInputDialog("Ingrese nuevo stock:", modeloTabla.getValueAt(fila, 2));

            if (nuevoStock != null) {
                int stock = Integer.parseInt(nuevoStock);
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "UPDATE tb_inventario SET cantidad=? WHERE idInventario=?");
                pst.setInt(1, stock);
                pst.setInt(2, id);

                int resultado = pst.executeUpdate();
                cn.close();

                if (resultado > 0) {
                    JOptionPane.showMessageDialog(this, "Stock actualizado correctamente.");
                    cargarProductos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar el stock.");
                }
            }

        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar stock: " + e.getMessage());
        }
    }
}



