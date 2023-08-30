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

    
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

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
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_libro() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idLibro) as num FROM libro;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_libro() throws SQLException {
        String cadena = "insert into libro values('" + Incremento_libro() + "','" + getTitulo() + "','" + getISBN() + "','" + getEditorial()+ "','" + getPaginas() + "','" + getIdAutor()+ "')";
        bd.ActualizarBD(cadena);

    }

    public void Actualizar_libro() throws SQLException {
        String cadena = "update libro set titulo='" + getTitulo()+ "', ISBN='" + getISBN()+ "', editorial='" + getEditorial()+ "', paginas='" + getPaginas()+ "'where idLibro ='" +getIdLibro()+"'";
        bd.ActualizarBD(cadena);
        
                
    }

    public void Eliminar_libro() throws SQLException {
        String cadena = "delete from libro where idLibro='" + getIdLibro()+"'";
        bd.ActualizarBD(cadena);
    }

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
        rs = bd.consultaBD("select * from libro");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.print(rs.getInt(5) + " ");
            System.out.print(rs.getInt(6) + " ");
            System.out.println("");
        }
    }

}

