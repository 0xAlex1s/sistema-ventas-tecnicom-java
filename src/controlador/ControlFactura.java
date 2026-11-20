package controlador;

import conexion.Conexion;
import modelo.Factura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ControlFactura {

    private static final Logger logger = LoggerFactory.getLogger(ControlFactura.class);

    public boolean guardarFactura(Factura factura) {
        MDC.put("loggerName", "ControlFactura");
        boolean resultado = false;

        String sql = "INSERT INTO factura (id_cliente, id_usuario, fecha, total, estado) VALUES (?, ?, ?, ?, ?)";
        try (Connection cn = Conexion.conectar();
             PreparedStatement ps = cn.prepareStatement(sql)) {

            ps.setInt(1, factura.getCliente().getIdCliente());
            ps.setInt(2, factura.getUsuario().getIdUsuario());
            ps.setString(3, factura.getFecha());
            ps.setDouble(4, factura.getTotal());
            ps.setInt(5, factura.getEstado());

            ps.executeUpdate();
            resultado = true;
            logger.info("Factura guardada correctamente. Cliente: {}, Usuario: {}, Total: {}",
                        factura.getCliente().getIdCliente(),
                        factura.getUsuario().getIdUsuario(),
                        factura.getTotal());

        } catch (SQLException e) {
            logger.error("Error al guardar factura: {}", e.getMessage(), e);
        } finally {
            MDC.clear();
        }

        return resultado;
    }
}

