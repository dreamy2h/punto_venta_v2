package modelos;
import java.sql.*;
import javax.swing.JOptionPane;

public class conexionMySQL {
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String basedatos = "punto_venta";
    public String nombrehost = "localhost";
    public String puerto = "3306";
    
    public String url = "jdbc:mysql://" + nombrehost + ":" + puerto + "/" + basedatos + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public String usuario = "root";
    public String clave = "az580580$";
    
    public Connection conexion() {
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, usuario, clave);
            //JOptionPane.showMessageDialog(null, "Conectado");
            //System.out.println("conectado");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión");
        }
        return conn;
    }
}
