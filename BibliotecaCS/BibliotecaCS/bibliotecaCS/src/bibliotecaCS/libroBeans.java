package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class libroBeans {
    private int idLibro;
    private String titulo;
    private int ISBN;
    private String editorial;
    private int paginas;
    private int idAutor;

    
    public void setIdLibro(int idLibro) {                   /* 1*/
        this.idLibro = idLibro;
    }
     /* 
        1/ Ta
        T= Ta
    */
    public void setTitulo(String titulo) {                 /* 1*/
        this.titulo = titulo;
    }
    /* 
        1/ Ta
        T= Ta
    */
    public void setISBN(int ISBN) {                       /* 1*/
        this.ISBN = ISBN;
    }
    /* 
        1/ Ta
        T= Ta
    */
    public void setEditorial(String editorial) {         /* 1*/
        this.editorial = editorial;
    }
/* 
        1/ Ta
        T= Ta
    */ 
    public void setPaginas(int paginas) {              /* 1*/
        this.paginas = paginas;
    }
/* 
        1/ Ta
        T= Ta
    */
    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getIdAutor() {
        return idAutor;
    }

    
    accesobd bd;

    public libroBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca"); /*1*/
        bd.conectarBD();                                           /*2*/
    }
    /* 
    1/ Ta
    2/ 3ta
    T= 5Ta+3TAa=8Ta
    */

    
    public int Incremento_libro() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idLibro) as num FROM libro;"); /*3*/
        if (rs.next()) {                                              /*4*/
            inc = rs.getInt(1) + 1;                                   /*5*/
        } else {                                                      /*6*/
            inc = 1;
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

    public void Insertar_libro() throws SQLException {
        String cadena = "insert into libro values('" + Incremento_libro() + "','" + getTitulo() + "','" + getISBN() + "','" + getEditorial()+ "','" + getPaginas() + "','" + getIdAutor()+ "')";
        bd.ActualizarBD(cadena);

    }
    /* 
        1/ Ta
        2/ 3Ta
        T= Ta+3Ta =4Ta
    */
    public void Actualizar_libro() throws SQLException {
        String cadena = "update libro set titulo='" + getTitulo()+ "', ISBN='" + getISBN()+ "', editorial='" + getEditorial()+ "', paginas='" + getPaginas()+ "'where idLibro ='" +getIdLibro()+"'";
        bd.ActualizarBD(cadena);
        
                
    }
    /* 
        1/ Ta
        2/ 3Ta
        T= Ta+3Ta =4Ta
    */
    public void Eliminar_libro() throws SQLException {
        String cadena = "delete from libro where idLibro='" + getIdLibro()+"'";        /*1*/   
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
    
    public ResultSet obtenerlibro() throws SQLException {
        String sql = "SELECT idLibro FROM libro";
        return bd.consultaBD(sql);
    }

    public ResultSet obtenerlibro(int idLibro) throws SQLException {
        String sql = "SELECT * FROM libro WHERE idLibro = " + idLibro;
        return bd.consultaBD(sql);
    }

    public void Consultar_libro() throws SQLException {
        ResultSet rs;
        rs = bd.consultaBD("select * from libro");           /*1*/ 
        while (rs.next()) {                                  /*2*/                                
        while (rs.next()) {                                  
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getInt(5) + " ");
            System.out.print(rs.getInt(6) + " ");
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