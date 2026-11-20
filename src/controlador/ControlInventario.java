package controlador;

import conexion.Conexion;
import modelo.Inventario;
import java.sql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ControlInventario {

    private static final Logger logger = LoggerFactory.getLogger(ControlInventario.class);

    public boolean guardar(Inventario objeto) {
        MDC.put("loggerName", "ControlInventario");
        boolean respuesta = false;

        String sql = "INSERT INTO tb_inventario VALUES(?,?,?,?,?,?,?,?)";

        try (Connection cn = Conexion.conectar();
             PreparedStatement consulta = cn.prepareStatement(sql)) {

            consulta.setInt(1, 0); // ID autoincrement
            consulta.setString(2, objeto.getNombre());
            consulta.setInt(3, objeto.getCantidad());
            consulta.setDouble(4, objeto.getPrecio());
            consulta.setString(5, objeto.getDescripcion());
            consulta.setInt(6, objeto.getIgv());
            consulta.setInt(7, objeto.getIdCategoria());
            consulta.setInt(8, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                logger.info("Producto '{}' guardado correctamente.", objeto.getNombre());
            }

        } catch (SQLException e) {
            logger.error("Error al guardar producto '{}': {}", objeto.getNombre(), e.getMessage(), e);
        } finally {
            MDC.clear();
        }

        return respuesta;
    }

    public boolean existeProducto(String descripcion) {
        MDC.put("loggerName", "ControlInventario");
        boolean respuesta = false;
        String sql = "SELECT nombre FROM tb_inventario WHERE descripcion = ?";

        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setString(1, descripcion);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                respuesta = true;
                logger.info("Producto con descripción '{}' ya existe.", descripcion);
            }

        } catch (SQLException e) {
            logger.error("Error al consultar existencia de producto '{}': {}", descripcion, e.getMessage(), e);
        } finally {
            MDC.clear();
        }

        return respuesta;
    }
}

