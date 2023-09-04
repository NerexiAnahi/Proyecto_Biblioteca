package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;


public class usuarioBeans {
    private int idUsuario;
    private String nombre;
    private int telefono;
    private String direccion;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public void setNombre(String nombre) {
        this.nombre = nombre;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public void setTelefono(int telefono) {
        this.telefono = telefono;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public void setDireccion(String direccion) {
        this.direccion = direccion;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */
    
    accesobd bd;

    public usuarioBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");/*1*/
        bd.conectarBD();                /*1*/
    }
    /* 
        1/ 5TA
        2/ 3TA
        T= 5TA+3TA =8TA
    */
    public int Incremento_usuario() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idUsuario) as num FROM usuario;");/*3*/
        if (rs.next()) {             /*4*/
            inc = rs.getInt(1) + 1; /*5*/
        } else {                   /*6*/
            inc = 1;              /*7*/
        }
        return inc;
    }
    /* 
        3/ TA
        4/ TC
        5/ TA+TO
        7/ TA
       
        TP = TA+TC+TA+TO = 2TA+TC+TO
        TM = TA+TC+TA = 2TA+TC
        TE = 2TA+TC+TO - 2TA+TC = TO
    */

    public void Insertar_usuario() throws SQLException {
        String cadena = "insert into usuario values('" + Incremento_usuario() + "','" + getNombre() + 
        "','" + getTelefono() + "','" + getDireccion() + "')"; /*1*/
        bd.ActualizarBD(cadena);                               /*2*/

    }
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */

    public void Actualizar_usuario() throws SQLException {
        String cadena = "update usuario set nombre='" + getNombre()+ "', telefono='" + getTelefono()+
         "', direccion='" + getDireccion()+ "'where idUruario ='" +getIdUsuario()+"'";/*1*/
        bd.ActualizarBD(cadena);                                                      /*2*/
    }
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */

    public void Eliminar_usuario() throws SQLException {
        String cadena = "delete from usuario where idUsuario='" + getIdUsuario()+"'";/*1*/
        bd.ActualizarBD(cadena);                                                    /*2*/
    }
    /* 
        1/ TA
        2/ 2TA
        T= TA+2TA =3TA
    */

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
public ResultSet obtenerusuario() throws SQLException {
        String sql = "SELECT idUsuario FROM usuario";
        return bd.consultaBD(sql);
    }

    public ResultSet obtenerusuario(int idUsuario) throws SQLException {
        String sql = "SELECT * FROM usuario WHERE idUsuario = " + idUsuario;
        return bd.consultaBD(sql);
    }
    
    public void Consultar_usuario() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from usuario"); /*1*/
        while (rs.next()) {                         /*2*/
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.println("");
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