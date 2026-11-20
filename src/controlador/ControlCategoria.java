package controlador;

import conexion.Conexion;
import modelo.Categoria;
import java.sql.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ControlCategoria {

    private static final Logger logger = LoggerFactory.getLogger(ControlCategoria.class);

    public boolean guardar(Categoria objeto) {
        MDC.put("loggerName", "ControlCategoria");
        boolean respuesta = false;
        try (Connection cn = Conexion.conectar()) {
            PreparedStatement consulta = cn.prepareStatement("INSERT INTO tb_categoria VALUES(?,?,?)");
            consulta.setInt(1, 0);
            consulta.setString(2, objeto.getDescripcion());
            consulta.setInt(3, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
                logger.info("Categoría '{}' guardada correctamente.", objeto.getDescripcion());
            }
        } catch (SQLException e) {
            logger.error("Error al guardar categoría '{}': {}", objeto.getDescripcion(), e.getMessage(), e);
        } finally {
            MDC.clear();
        }
        return respuesta;
    }

    public boolean existeCategoria(String categoria) {
        MDC.put("loggerName", "ControlCategoria");
        boolean respuesta = false;
        String sql = "SELECT descripcion FROM tb_categoria WHERE descripcion = ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, categoria);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                respuesta = true;
                logger.info("La categoría '{}' ya existe.", categoria);
            }
        } catch (SQLException e) {
            logger.error("Error al consultar existencia de categoría '{}': {}", categoria, e.getMessage(), e);
        } finally {
            MDC.clear();
        }
        return respuesta;
    }

    public boolean actualizar(Categoria objeto, int idCategoria) {
        MDC.put("loggerName", "ControlCategoria");
        boolean respuesta = false;
        String sql = "UPDATE tb_categoria SET descripcion = ? WHERE idCategoria = ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, objeto.getDescripcion());
            ps.setInt(2, idCategoria);
            if (ps.executeUpdate() > 0) {
                respuesta = true;
                logger.info("Categoría con ID {} actualizada a '{}'.", idCategoria, objeto.getDescripcion());
            }
        } catch (SQLException e) {
            logger.error("Error al actualizar categoría con ID {}: {}", idCategoria, e.getMessage(), e);
        } finally {
            MDC.clear();
        }
        return respuesta;
    }

    public boolean eliminar(int idCategoria) {
        MDC.put("loggerName", "ControlCategoria");
        boolean respuesta = false;
        String sql = "DELETE FROM tb_categoria WHERE idCategoria = ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, idCategoria);
            if (ps.executeUpdate() > 0) {
                respuesta = true;
                logger.info("Categoría con ID {} eliminada correctamente.", idCategoria);
            }
        } catch (SQLException e) {
            logger.error("Error al eliminar categoría con ID {}: {}", idCategoria, e.getMessage(), e);
        } finally {
            MDC.clear();
        }
        return respuesta;
    }
}
