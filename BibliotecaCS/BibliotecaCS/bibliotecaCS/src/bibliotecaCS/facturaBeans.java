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

    public void setIdFactura(int idFactura) {       /* 1*/
        this.idFactura = idFactura;
    }
     /* 
        1/ Ta
        T= Ta
    */
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {        /* 1*/
        this.idUsuario = idUsuario;
    }
    /* 
        1/ Ta
        T= Ta
    */
    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {                /* 1*/
        this.IVA = IVA;
    }
    /* 
        1/ Ta
        T= Ta
    */
    public int getTotal() {                 
        return total;
    }

    public void setTotal(int total) {          /* 1*/
        this.total = total;
    }
     /* 
        1/ Ta
        T= Ta
    */
    public accesobd getBd() {
        return bd;
    }

    public void setBd(accesobd bd) {             /* 1*/
        this.bd = bd;
    }

    /* 
        1/ Ta
        T= Ta
    */
    accesobd bd;

    public facturaBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");   /* 1*/
        bd.conectarBD();                                             /* 2 */
    }
/* 
1/ Ta
2/ 3ta
T= 5Ta+3TAa=8Ta
*/
    
    public int Incremento_factura() throws SQLException {        
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idFactura) as num FROM factura;"); /* 3*/
        if (rs.next()) {                                                  /* 4*/
            inc = rs.getInt(1) + 1;                                       /* 5*/
        } else {                                                          /* 6*/
            inc = 1;                                                      /* 7*/
        }
        return inc;
    }
    /* 
        3/ Ta
        4/ Tc
        5/ Ta+To
        7/ Ta
       
        TP = Ta+Tc+Ta+To = 2Ta+Tc+To
        TM = Ta+Tc+Ta = 2Ta+Tc
        TE = 2Ta+Tc+To - 2Ta+Tc = To
    */
    public void Insertar_factura() throws SQLException {
        String cadena = "insert into factura values('" + Incremento_factura() + "','" + getIdUsuario() + "','" + getIVA() + "','" + getTotal() + "')";
        bd.ActualizarBD(cadena);                                                                                                                        /*1*/  

    }
    /* 
        1/ Ta
        2/ 3Ta
        T= Ta+3Ta =4Ta
    */
    public void Actualizar_factura() throws SQLException {
        String cadena = "update usuario set idUsuario='" + getIdUsuario()+ "', iva='" + getIVA()+ "', total='" + getTotal()+ "'where idFactura='" +getIdFactura()+"'";
        bd.ActualizarBD(cadena);
        
                
    }
    /* 
        1/ Ta
        2/ 3Ta
        T= Ta+3Ta =4Ta
    */

    public void Eliminar_factura() throws SQLException {
        String cadena = "delete from factura where idFactura='" + getIdFactura()+"'";  /*1*/
        bd.ActualizarBD(cadena);                                                       /*2*/
    }
    /* 
        1/ Ta
        2/ 2Ta
        T= Ta+2Ta =3Ta
    */
    public ResultSet consultaTabla(String sql) throws SQLException {
        return bd.consultaBD(sql);
    }
    
    public void Consultar_factura() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from factura");         /*1*/ 
        while (rs.next()) {                                  /*2*/ 
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getInt(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getInt(4) + " ");
            System.out.println("");
        }
        /* 
        1/ 2Ta
        2/ n*Tc+Tc
        TP= 2Ta+n*Tc+Tc
        TM= 2Ta+Tc
        TE= 2Ta+n*Tc+Tc - 2Ta+Tc = n*Tc
    */   
    }

}