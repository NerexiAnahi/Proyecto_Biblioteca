package miprimeraaplicacioncs;

import java.sql.*;
public class accesobd {
    private final String host;
    private final String user;
    private final String passwd;
    private final String bd;
    
    private Connection conexion;
//
    public accesobd(String host, String user, String passwd, String bd) {
        this.host = host;
        this.user = user;
        this.passwd = passwd;
        this.bd = bd;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getBd() {
        return bd;
    }
    
    public void conectarBD() throws Exception{
        try {
            Driver driver=(Driver)                                        /*1*/
                    Class.forName("com.mysql.jdbc.Driver").newInstance(); /*2*/
            String cadena="jdbc:mysql://"+getHost()+"/"+getBd();           /*3*/
            conexion=DriverManager.getConnection(cadena,getUser(),getPasswd()); /*4*/
           } catch (SQLException e) {             
            System.out.println("Error a la conexion a la Base de Datos"+e.toString()); 
        }
    }
    /* 
        /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */
    
    
    
    public void ActualizarBD(String sql)throws SQLException{
        try {
            Statement stm=conexion.createStatement(); /*1*/
            stm.executeUpdate(sql);                   /*2*/
            System.out.println("Transaccion Exitosa");/*3*/
        } catch (SQLException e) {
            System.out.println("Error en la Transaccion "+ e.toString()); /*4*/
        }
        
    }
    /* 
        /* 
        1/ TA
        2/ 3TA
        T= TA+3TA =4TA
    */
    
    public ResultSet consultaBD(String sql)throws SQLException{
        ResultSet cursor;                        /*1*/
        Statement stm=conexion.createStatement();/*2*/
        cursor=stm.executeQuery(sql);            /*3*/
        return cursor;
    }
    /* 
        1/ TA
        2/ 2TA
        T= TA+2TA =3TA
     */
    
   public void cerrarBD()throws SQLException{
       conexion.close(); /*1*/
   }
}

    

