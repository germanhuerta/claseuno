package cl.duoc.cinehoytsmarkplanet.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {
    
    private Connection connection;
    
    public ConexionBD(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/moviebd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root",
                    ""
            );
            
          JOptionPane.showMessageDialog(null,  "Conectado correctamente");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Error al conectar amigo :(");
        }
    }
    
    public Connection getConnection() {
        return connection;
    }


        }
    
