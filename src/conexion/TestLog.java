package conexion;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class TestLog {

    private static final Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {

        // Registrar nombre para generar archivo TestLog_YYYY-MM-DD.log
        MDC.put("loggerName", "TestLog");

        logger.info("Inicio del sistema de prueba.");
        try {
            int resultado = 10 / 0; // Simula un error
        } catch (Exception e) {
            logger.error("Error capturado en TestLog", e);
        }

        logger.warn("Advertencia: prueba finalizada con error controlado.");

        MDC.clear(); // Limpieza obligatoria del contexto
    }
}
