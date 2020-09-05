package modelos;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.Vector;

public class provincias {
    private int id;
    private String nombre;
    
    public provincias(int id, String nombre) {
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
    
    public Vector<provincias> mostrarProvincias(Integer id_region) {
        PreparedStatement ps = null;
        conexionMySQL conn =  new conexionMySQL();
        Connection con = conn.conexion();
        
        Vector<provincias> datos = new Vector<provincias>();
        provincias dat = null;
        
        try {
            String sql = "select id, nombre from provincias where id_region = " + id_region;
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            dat = new provincias(id, nombre);
            
            dat.setId(0);
            dat.setNombre("Selecciona una provincia...");
            
            datos.add(dat);
            
            while (rs.next()) {
                dat = new provincias(id, nombre);
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
