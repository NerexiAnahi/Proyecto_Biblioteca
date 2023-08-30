
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
        this.precio = precio;
    }


    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(int idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getFechaprest() {
        return fechaprest;
    }

    public void setFechaprest(String fechaprest) {
        this.fechaprest = fechaprest;
    }

    public String getFechadevo() {
        return fechadevo;
    }

    public void setFechadevo(String fechadevo) {
        this.fechadevo = fechadevo;
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;
    }

   
  
    accesobd bd;

    public prestamoBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_prestamo() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idPrestamo) as num FROM prestamo;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_prestamo() throws SQLException {
        String cadena = "insert into prestamo values('" + Incremento_prestamo()+ "','" + getIdUsuario()+ "','" + getIdEjemplar()+ "','" + getFechaprest()+ "','" + getFechadevo()+ "')";
        bd.ActualizarBD(cadena);

    }

    public void Actualizar_prestamo() throws SQLException {
        String cadena = "update prestamo set idUsuario='" + getIdUsuario()+ "',idEjemplar='" + getIdEjemplar()+ "',fechaprest='" + getFechaprest()+ "', fechadevo ='" + getFechadevo() + "'where idPrestamo ='" +getIdPrestamo()+"'";
        bd.ActualizarBD(cadena);
        
                
    }

    public void Eliminar_prestamo() throws SQLException {
        String cadena = "delete from prestamo where idPrestamo='" + getIdPrestamo()+"'";
        bd.ActualizarBD(cadena);
    }

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
        rs = bd.consultaBD("select * from prestamo");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getInt(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getString(5) + " ");
            System.out.println("");
        }
    }

}