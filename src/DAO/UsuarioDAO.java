package dao;

import modelo.Usuario;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario validarLogin(String usuario, String contraseña) {
        Usuario user = null;
        String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND contraseña = ? AND estado = 1";

        try (Connection con = Conexion.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, usuario);
            ps.setString(2, contraseña);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new Usuario();
                user.setIdUsuario(rs.getInt("idUsuario"));
                user.setNombre(rs.getString("nombre"));
                user.setApellido(rs.getString("apellido"));
                user.setUsuario(rs.getString("usuario"));
                user.setContraseña(rs.getString("contraseña"));
                user.setTelefono(rs.getString("telefono"));
                user.setEstado(rs.getInt("estado"));
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al validar el login: " + e.getMessage());
        }

        return user;
    }
}
