package modelos;

import java.sql.*;
import java.util.Vector;

public class unidad_medida {
    private int id;
    private String glosa;

    public unidad_medida(int id, String unidad_medida) {
        this.id = id;
        this.glosa = unidad_medida;
    }

    public int getId() {
        return id;
    }

    public String getGlosa() {
        return glosa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGlosa(String glosa) {
        this.glosa = glosa;
    }
    
    public String toString() {
        return this.glosa;
    }
    
    public Vector<unidad_medida> mostrarUnidadMedida() {
        PreparedStatement ps = null;
        conexionMySQL conn =  new conexionMySQL();
        Connection con = conn.conexion();
        
        Vector<unidad_medida> datos = new Vector<unidad_medida>();
        unidad_medida dat = null;
        
        try {
            String sql = "select id, glosa from prod_unidad_medida";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            dat = new unidad_medida(id, glosa);
            
            dat.setId(0);
            dat.setGlosa("Selecciona una unidad de medida...");
            
            datos.add(dat);
            
            while (rs.next()) {
                dat = new unidad_medida(id, glosa);
                dat.setId(rs.getInt("id"));
                dat.setGlosa(rs.getString("glosa"));
                datos.add(dat);
            }
            
            rs.close();
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        
        return datos;
    }
}
