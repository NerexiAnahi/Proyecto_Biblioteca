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
        this.idAutor = idAutor;  /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;  /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }

    public void setBd(accesobd bd) {
        this.bd = bd;  /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }
    
    accesobd bd;

    public autorBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_autor() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idAutor) as num FROM autor;"); /*3*/
        if (rs.next()) {                                                  /*4*/
            inc = rs.getInt(1) + 1;                                       /*5*/
        } else {                                                          /*6*/
            inc = 1;                                                      /*7*/
        }
        return inc;
         /* 
        3/ TA
        4/ TC
        5/ TA+TO
        7/ TA
       
        TP = TA+TC+TA+TO = 2TA+TC+TO
        TM = TA+TC+TA = 2TA+TC
        TE = 2TA+TC+TO - 2TA+TC = TO
    */
    }

    public void Insertar_autor() throws SQLException {
        String cadena = "insert into autor values('" + Incremento_autor() + "','" + getNombres() + "')";  /*1*/
        bd.ActualizarBD(cadena);                                                                          /*2*/
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */
    }

    public void Actualizar_autor() throws SQLException {
        String cadena = "update autor set nombres='" + getNombres()+ "'where idAutor ='" +getIdAutor()+"'";  /*1*/
        bd.ActualizarBD(cadena);                                                                             /*2*/
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */
                
    }

    public void Eliminar_autor() throws SQLException {
        String cadena = "delete from autor where idAutor='" + getIdAutor()+"'"; /*1*/
        bd.ActualizarBD(cadena);                                                /*2*/
        /* 
        1/ TA
        2/ 2TA
        T= TA+2TA =3TA
    */
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
            System.out.print(rs.getString(2) + " "); /*1*/
            System.out.println("");                  /*2*/
        }
        /* 
        1/ 2TA
        2/ N*TC+TC
        TP= 2TA+N*TC+TC
        TM= 2TA+TC
        TE= 2TA+N*TC+TC - 2TA+TC = N*TC
    */
    }

}