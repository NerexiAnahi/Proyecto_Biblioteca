package miprimeraaplicacioncs;

import java.sql.ResultSet;
import java.sql.SQLException;


public class usuarioBeans {
    private int idUsuario;
    private String nombre;
    private int telefono;
    private String direccion;

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

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
        this.bd = bd;
    }
    
    accesobd bd;

    public usuarioBeans() throws Exception {
        bd = new accesobd("localhost", "root", "", "bliblioteca");
        bd.conectarBD();
    }

    
    public int Incremento_usuario() throws SQLException {
        int inc;
        ResultSet rs;
        rs = bd.consultaBD("SELECT max(idUsuario) as num FROM usuario;");
        if (rs.next()) {
            inc = rs.getInt(1) + 1;
        } else {
            inc = 1;
        }
        return inc;
    }

    public void Insertar_usuario() throws SQLException {
        String cadena = "insert into usuario values('" + Incremento_usuario() + "','" + getNombre() + "','" + getTelefono() + "','" + getDireccion() + "')";
        bd.ActualizarBD(cadena);

    }

    public void Actualizar_usuario() throws SQLException {
        String cadena = "update usuario set nombre='" + getNombre()+ "', telefono='" + getTelefono()+ "', direccion='" + getDireccion()+ "'where idUruario ='" +getIdUsuario()+"'";
        bd.ActualizarBD(cadena);
        
                
    }

    public void Eliminar_usuario() throws SQLException {
        String cadena = "delete from usuario where idUsuario='" + getIdUsuario()+"'";
        bd.ActualizarBD(cadena);
    }

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
        rs = bd.consultaBD("select * from usuario");
        while (rs.next()) {
            System.out.print(rs.getInt(1) + " ");
            System.out.print(rs.getString(2) + " ");
            System.out.print(rs.getInt(3) + " ");
            System.out.print(rs.getString(4) + " ");
            System.out.println("");
        }
    }

}