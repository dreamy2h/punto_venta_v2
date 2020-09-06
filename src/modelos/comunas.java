package modelos;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.Vector;

public class comunas {
    private int id;
    private String nombre;
    
    public comunas(int id, String nombre) {
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
    
    public Vector<comunas> mostrarComunas(Integer id_provincia) {
        PreparedStatement ps = null;
        conexionMySQL conn =  new conexionMySQL();
        Connection con = conn.conexion();
        
        Vector<comunas> datos = new Vector<comunas>();
        comunas dat = null;
        
        try {
            String sql = "select id, nombre from comunas"; 
            if (id_provincia != 0) {
                sql += " where id_provincia = " + id_provincia;
            }
            
            sql += " order by nombre asc";
            
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            dat = new comunas(id, nombre);
            
            dat.setId(0);
            dat.setNombre("Selecciona una comuna...");
            
            datos.add(dat);
            
            while (rs.next()) {
                dat = new comunas(id, nombre);
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
