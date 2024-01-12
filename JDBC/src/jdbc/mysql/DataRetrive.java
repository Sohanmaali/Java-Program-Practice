package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetrive {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
            String quary = "SELECT * FROM student";
            PreparedStatement st = con.prepareStatement(quary);
            ResultSet rs = st.executeQuery();
            System.out.println("ROll\t Name\t Father\t Mark");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
            }
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
        }
    }
}
