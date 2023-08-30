package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ejemplarBeans {
    private int idEjemplar;
    private int idLibro;
    private int localizacion;

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setLocalizacion(int localizacion) {
        this.localizacion = localizacion;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public int getLocalizacion() {
        return localizacion;
    }


    public accesobd getBd() {
        return bd;
    }
    
    accesobd bd;

    public ejemplarBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_ejemplar() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idEjemplar) as num FROM ejemplar;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_ejemplar() throws SQLException {
        String cadena = "insert into ejemplar values('" + Incremento_ejemplar() + "','" + getIdLibro() + "','" +  getLocalizacion()+ "')";
        bd.ActualizarBD(cadena);

    }

    public void Actualizar_ejemplar() throws SQLException {
        String cadena = "update ejemplar set localizacion='" + getLocalizacion()+ "'where idEjemplar ='" +getIdEjemplar()+"'";
        bd.ActualizarBD(cadena);
        
                
    }

    public void Eliminar_ejemplar() throws SQLException {
        String cadena = "delete from ejemplar where idEjemplar='" + getIdEjemplar()+"'";
        bd.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
public ResultSet obtenerejemplar() throws SQLException {
        String sql = "SELECT idEjemplar FROM ejemplar";
        return bd.consultaBD(sql);
    }

    public ResultSet obtenerejemplar(int idEjemplar) throws SQLException {
        String sql = "SELECT * FROM ejemplar WHERE idEjemplar = " + idEjemplar;
        return bd.consultaBD(sql);
    }
    
    public void Consultar_ejemplar() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from ejemplar");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getInt(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.println("");
        }
    }

}