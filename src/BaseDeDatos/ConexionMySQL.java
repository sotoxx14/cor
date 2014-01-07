package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConexionMySQL {
    public String db="centro_odontologico";
    public String url="jdbc:mysql://localhost/"+db;
    public String user="root";
    public String pass="";
    public ConexionMySQL(){
    
}
    public Connection Conectar(){
    Connection link=null;
    try{
        //Cargamos el Driver MySQL
        Class.forName("org.gjt.mm.mysql.Driver");
        //Creamos un enlace hacia la base de datos
        link=DriverManager.getConnection(this.url, this.user, this.pass);
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    return link;
}
    
}
