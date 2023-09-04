
package miprimeraaplicacioncs;


import java.sql.ResultSet;
import java.sql.SQLException;

public class prestamoBeans {
    private int idPrestamo;
    private int idUsuario;
    private int idEjemplar;
    private String fechaprest;
    private String fechadevo;
    private Double precio;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public String getFechaprest() {
        return fechaprest;
    }

    public void setFechaprest(String fechaprest) {
        this.fechaprest = fechaprest;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

    public String getFechadevo() {
        return fechadevo;
    }

    public void setFechadevo(String fechadevo) {
        this.fechadevo = fechadevo;/*1*/
    }
    /* 
        1/ TA
        T= TA
    */

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

    public prestamoBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca"); /*1*/
        bd.conectarBD();                                           /*2*/
    }
    /* 
        1/ 5TA
        2/ 3TA
        T= 5TA+3TA =8TA
    */
    
    public int Incremento_prestamo() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idPrestamo) as num FROM prestamo;");/*3*/
        if (rs.next()) {                 /*4*/          
            inc = rs.getInt(1) + 1;      /*5*/
        } else {                         /*6*/
            inc = 1;                     /*7*/
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

    public void Insertar_prestamo() throws SQLException {
        String cadena = "insert into prestamo values('" + Incremento_prestamo()+ "','" + getIdUsuario()+ "','" + getIdEjemplar()+
         "','" + getFechaprest()+ "','" + getFechadevo()+ "')"; /*1*/
        bd.ActualizarBD(cadena);                               /*2*/

    }
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */

    public void Actualizar_prestamo() throws SQLException {
        String cadena = "update prestamo set idUsuario='" + getIdUsuario()+ "',idEjemplar='" + getIdEjemplar()+ 
        "',fechaprest='" + getFechaprest()+ "', fechadevo ='" + getFechadevo() + "'where idPrestamo ='" +getIdPrestamo()+"'";/*1*/
        bd.ActualizarBD(cadena);                                                                 /*2*/
                
    }
    /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */

    public void Eliminar_prestamo() throws SQLException {
        String cadena = "delete from prestamo where idPrestamo='" + getIdPrestamo()+"'";/*1*/
        bd.ActualizarBD(cadena);                                                       /*2*/
    }
    /* 
        1/ TA
        2/ 2TA
        T= TA+2TA =3TA
    */

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
public ResultSet obtenerprestamo() throws SQLException {
        String sql = "SELECT idPrestamo FROM prestamo";
        return bd.consultaBD(sql);
    }

    public ResultSet obtenerprestamo(int idPrestamo) throws SQLException {
        String sql = "SELECT * FROM prestamo WHERE idPrestamo = " + idPrestamo;
        return bd.consultaBD(sql);
    }
    
    
    
    public void Consultar_prestamo() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from prestamo"); /*1*/
        while (rs.next()) {                           /*2*/
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getInt(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
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