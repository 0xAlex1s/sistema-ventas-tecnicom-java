/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author ASUS ROG STRIX
 */
public class prueba {
    public static void main(String[] args) {
        try {
            Connection cn = Conexion.conectar();
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SHOW TABLES;");
            while (rs.next()) {
                System.out.println("Tabla: " + rs.getString(1));
            }
            cn.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

