package miprimeraaplicacioncs;

import java.sql.*;

public class autorBeans {
    private int idAutor;
    private String nombres;

    public int getIdAutor() {
        return idAutor;
    }

    public String getNombres() {
        return nombres;
    }

    public accesobd getBd() {
        return bd;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;
    }
    
    accesobd bd;

    public autorBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_autor() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idAutor) as num FROM autor;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_autor() throws SQLException {
        String cadena = "insert into autor values('" + Incremento_autor() + "','" + getNombres() + "')";
        bd.ActualizarBD(cadena);

    }

    public void Actualizar_autor() throws SQLException {
        String cadena = "update autor set nombres='" + getNombres()+ "'where idAutor ='" +getIdAutor()+"'";
        bd.ActualizarBD(cadena);
        
                
    }

    public void Eliminar_autor() throws SQLException {
        String cadena = "delete from autor where idAutor='" + getIdAutor()+"'";
        bd.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
    public ResultSet obtenerautor() throws SQLException {
        String sql = "SELECT idAutor FROM autor";
        return bd.consultaBD(sql);
    }

    public ResultSet obtenerautor(int idAutor) throws SQLException {
        String sql = "SELECT * FROM autor WHERE idAutor = " + idAutor;
        return bd.consultaBD(sql);
    }

    public void Consultar_autor() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from Autor");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.println("");
        }
    }

}