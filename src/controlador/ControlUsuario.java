package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import conexion.Conexion;
import modelo.Usuario;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ControlUsuario {

    private static final Logger logger = LoggerFactory.getLogger(ControlUsuario.class);

    // Método para validar login de usuario
    public boolean loginUser(Usuario usuario) {
        boolean respuesta = false;

        try (Connection cn = Conexion.conectar(); PreparedStatement pst = cn.prepareStatement(
                "SELECT usuario FROM tb_usuario WHERE usuario = ? AND `contraseña` = ?")) {

            pst.setString(1, usuario.getUsuario().trim());
            pst.setString(2, usuario.getContraseña().trim());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                respuesta = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return respuesta;
    }

    // Método para actualizar usuario
    public boolean actualizar(Usuario usuario, int idUsuario) {
        MDC.put("loggerName", "ControlUsuario");
        boolean actualizado = false;

        try (Connection con = Conexion.conectar(); PreparedStatement pst = con.prepareStatement(
                "UPDATE tb_usuario SET nombre=?, apellido=?, usuario=?, contraseña=?, telefono=?, estado=? WHERE idUsuario=?")) {

            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getApellido());
            pst.setString(3, usuario.getUsuario());
            pst.setString(4, usuario.getContraseña());
            pst.setString(5, usuario.getTelefono());
            pst.setInt(6, usuario.getEstado());
            pst.setInt(7, idUsuario);

            if (pst.executeUpdate() > 0) {
                actualizado = true;
                logger.info("Usuario actualizado correctamente: ID {}", idUsuario);
            }

        } catch (SQLException e) {
            logger.error("Error al actualizar usuario: {}", e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el usuario. Verifica los datos.");
        } finally {
            MDC.clear();
        }

        return actualizado;
    }

    // Método para eliminar usuario
    public boolean eliminar(int idUsuario) {
        MDC.put("loggerName", "ControlUsuario");
        boolean eliminado = false;

        try (Connection con = Conexion.conectar(); PreparedStatement pst = con.prepareStatement("DELETE FROM tb_usuario WHERE idUsuario = ?")) {

            pst.setInt(1, idUsuario);
            if (pst.executeUpdate() > 0) {
                eliminado = true;
                logger.info("Usuario eliminado correctamente: ID {}", idUsuario);
            }

        } catch (SQLException e) {
            logger.error("Error al eliminar usuario: {}", e.getMessage(), e);
            JOptionPane.showMessageDialog(null, "No se pudo eliminar el usuario.");
        } finally {
            MDC.clear();
        }

        return eliminado;
    }
}
