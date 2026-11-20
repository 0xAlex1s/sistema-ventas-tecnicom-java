package controlador;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ControlCliente {

    // Declarar el logger
    private static final Logger logger = LoggerFactory.getLogger(ControlCliente.class);

    // Guardar
    public boolean guardar(Cliente c) {
        MDC.put("loggerName", "ControlCliente");
        String sql = "INSERT INTO tb_cliente (idCliente, nombre, apellido, dni, telefono, direccion, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, 0); 
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellido());
            ps.setString(4, c.getDni());
            ps.setString(5, c.getTelefono());
            ps.setString(6, c.getDireccion());
            ps.setInt(7, c.getEstado());

            boolean exito = ps.executeUpdate() > 0;
            if (exito) {
                logger.info("Cliente '{}' guardado correctamente.", c.getNombre());
            } else {
                logger.warn("No se pudo guardar el cliente '{}'.", c.getNombre());
            }
            return exito;
        } catch (SQLException e) {
            logger.error("Error al guardar cliente '{}': {}", c.getNombre(), e.getMessage(), e);
            return false;
        } finally {
            MDC.clear();
        }
    }

    // Existe por DNI
    public boolean existeCliente(String dni) {
        MDC.put("loggerName", "ControlCliente");
        String sql = "SELECT idCliente FROM tb_cliente WHERE dni = ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, dni);
            try (ResultSet rs = ps.executeQuery()) {
                boolean existe = rs.next();
                logger.info("Consulta de cliente con DNI '{}': {}", dni, existe ? "Existe" : "No existe");
                return existe;
            }
        } catch (SQLException e) {
            logger.error("Error al consultar cliente por DNI '{}': {}", dni, e.getMessage(), e);
            return false;
        } finally {
            MDC.clear();
        }
    }

    // Actualizar
    public boolean actualizar(Cliente c, int idCliente) {
        MDC.put("loggerName", "ControlCliente");
        String sql = "UPDATE tb_cliente SET nombre=?, apellido=?, dni=?, telefono=?, direccion=?, estado=? WHERE idCliente = ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setString(3, c.getDni());
            ps.setString(4, c.getTelefono());
            ps.setString(5, c.getDireccion());
            ps.setInt(6, c.getEstado());
            ps.setInt(7, idCliente);

            boolean exito = ps.executeUpdate() > 0;
            if (exito) {
                logger.info("Cliente '{}' actualizado correctamente.", c.getNombre());
            } else {
                logger.warn("No se pudo actualizar el cliente '{}'.", c.getNombre());
            }
            return exito;
        } catch (SQLException e) {
            logger.error("Error al actualizar cliente '{}': {}", c.getNombre(), e.getMessage(), e);
            return false;
        } finally {
            MDC.clear();
        }
    }

    // Eliminar
    public boolean eliminar(int idCliente) {
        MDC.put("loggerName", "ControlCliente");
        String sql = "DELETE FROM tb_cliente WHERE idCliente = ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setInt(1, idCliente);
            boolean exito = ps.executeUpdate() > 0;
            if (exito) {
                logger.info("Cliente con ID {} eliminado correctamente.", idCliente);
            } else {
                logger.warn("No se encontró cliente con ID {} para eliminar.", idCliente);
            }
            return exito;
        } catch (SQLException e) {
            logger.error("Error al eliminar cliente con ID {}: {}", idCliente, e.getMessage(), e);
            return false;
        } finally {
            MDC.clear();
        }
    }

    // Validar duplicado de DNI
    public boolean existeClienteConDNI(String dni, int idActual) {
        MDC.put("loggerName", "ControlCliente");
        String sql = "SELECT idCliente FROM tb_cliente WHERE dni = ? AND idCliente != ?";
        try (Connection cn = Conexion.conectar();
             PreparedStatement pst = cn.prepareStatement(sql)) {
            pst.setString(1, dni);
            pst.setInt(2, idActual);
            ResultSet rs = pst.executeQuery();
            boolean duplicado = rs.next();
            if (duplicado) {
                logger.warn("DNI duplicado detectado: '{}' para cliente diferente al ID {}", dni, idActual);
            }
            return duplicado;
        } catch (SQLException e) {
            logger.error("Error comprobando DNI duplicado '{}': {}", dni, e.getMessage(), e);
            return false;
        } finally {
            MDC.clear();
        }
    }
}
