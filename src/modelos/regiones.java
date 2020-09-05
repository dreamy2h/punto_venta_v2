package modelos;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.Vector;

public class regiones {
    private int id;
    private String nombre;
    
    public regiones(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toString() {
        return this.nombre;
    }
    
    public Vector<regiones> mostrarRegiones() {
        PreparedStatement ps = null;
        conexionMySQL conn =  new conexionMySQL();
        Connection con = conn.conexion();
        
        Vector<regiones> datos = new Vector<regiones>();
        regiones dat = null;
        
        try {
            String sql = "select id, nombre from regiones";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            dat = new regiones(id, nombre);
            
            dat.setId(0);
            dat.setNombre("Selecciona una región...");
            
            datos.add(dat);
            
            while (rs.next()) {
                dat = new regiones(id, nombre);
                dat.setId(rs.getInt("id"));
                dat.setNombre(rs.getString("nombre"));
                datos.add(dat);
            }
            
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        
        return datos;
    }
}
