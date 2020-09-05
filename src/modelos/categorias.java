package modelos;

import com.mysql.cj.protocol.Resultset;
import java.sql.*;
import java.util.Vector;

public class categorias {
    private int id;
    private String nombre;
    private String descripcion;
    private int estado;

    public categorias(int id, String nombre, String descripcion, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public String toString() {
        return this.nombre;
    }
    
    public Vector<categorias> mostrarCategorias() {
        PreparedStatement ps = null;
        conexionMySQL conn =  new conexionMySQL();
        Connection con = conn.conexion();
        
        Vector<categorias> datos = new Vector<categorias>();
        categorias dat = null;
        
        try {
            String sql = "select id, nombre from categorias";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            dat = new categorias(id, nombre, descripcion, estado);
            
            dat.setId(0);
            dat.setNombre("Selecciona una categoría...");
            
            datos.add(dat);
            
            while (rs.next()) {
                dat = new categorias(id, nombre, descripcion, estado);
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
