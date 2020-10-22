package modelos;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.Vector;

public class dependencias {
    private int id;
    private String nombre;

    public dependencias(int id, String nombre) {
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
    
    public Vector<dependencias> mostrarDependencias() {
        PreparedStatement ps = null;
        conexionMySQL conn =  new conexionMySQL();
        Connection con = conn.conexion();
        
        Vector<dependencias> datos = new Vector<dependencias>();
        dependencias dat = null;
        
        try {
            String sql = "select id, nombre from dependencias";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            dat = new dependencias(id, nombre);
            
            dat.setId(0);
            dat.setNombre("Selecciona una dependencia...");
            
            datos.add(dat);
            
            while (rs.next()) {
                dat = new dependencias(id, nombre);
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

