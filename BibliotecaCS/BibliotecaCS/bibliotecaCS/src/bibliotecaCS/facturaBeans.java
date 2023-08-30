
package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class facturaBeans {
    private int idFactura;
    private int idUsuario;
    private int IVA;
    private int total;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {
        this.bd = bd;
    }

    
    accesobd bd;

    public facturaBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_factura() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idFactura) as num FROM factura;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_factura() throws SQLException {
        String cadena = "insert into factura values('" + Incremento_factura() + "','" + getIdUsuario() + "','" + getIVA() + "','" + getTotal() + "')";
        bd.ActualizarBD(cadena);

    }

    public void Actualizar_factura() throws SQLException {
        String cadena = "update usuario set idUsuario='" + getIdUsuario()+ "', iva='" + getIVA()+ "', total='" + getTotal()+ "'where idFactura='" +getIdFactura()+"'";
        bd.ActualizarBD(cadena);
        
                
    }

    public void Eliminar_factura() throws SQLException {
        String cadena = "delete from factura where idFactura='" + getIdFactura()+"'";
        bd.ActualizarBD(cadena);
    }

    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
    public void Consultar_factura() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from factura");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getInt(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getInt(4) + " ");
            System.out.println("");
        }
    }

}