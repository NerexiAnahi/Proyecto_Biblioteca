package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ejemplarBeans {
    private int idEjemplar;
    private int idLibro;
    private int localizacion;

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;    /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;    /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }

    public void setLocalizacion(int localizacion) {
        this.localizacion = localizacion;    /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }

    public void setBd(accesobd bd) {
        this.bd = bd;    /*1*/
       
        /* 
            1/ TA
            T= TA
        */
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public int getIdLibro() {
        return idLibro;    /*1*/
       
        /* 
            1/ TA
            T= TA
        */
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
        rs = bd.consultaBD("SELECT max(idEjemplar) as num FROM ejemplar;"); /*3*/
        if (rs.next()) {                                                        /*4*/
            inc = rs.getInt(1) + 1;                                             /*5*/
        } else {                                                                /*6*/
            inc = 1;                                                            /*7*/
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

    public void Insertar_ejemplar() throws SQLException {
        String cadena = "insert into ejemplar values('" + Incremento_ejemplar() + "','" + getIdLibro() + "','" +  getLocalizacion()+ "')"; /*1*/
        bd.ActualizarBD(cadena);                                                                                                          /*2*/
     /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */

    }

    public void Actualizar_ejemplar() throws SQLException {
        String cadena = "update ejemplar set localizacion='" + getLocalizacion()+ "'where idEjemplar ='" +getIdEjemplar()+"'"; /*1*/
        bd.ActualizarBD(cadena);                                                                                               /*2*/
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */
                
    }

    public void Eliminar_ejemplar() throws SQLException {
        String cadena = "delete from ejemplar where idEjemplar='" + getIdEjemplar()+"'"; /*1*/
        bd.ActualizarBD(cadena);                                                         /*2*/
         /* 
        1/ TA
        2/ 2TA
        T= TA+2TA =3TA
    */
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
            System.out.println(""); /*1*/ 
                                   /*2*/
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