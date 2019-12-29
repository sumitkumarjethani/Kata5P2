package View;

import Model.Mail;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderBD {
    
    public static List<Mail> read(){
        List<Mail> list = new ArrayList<>();
        String sql = "SELECT * FROM mail";
        try {
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                list.add(new Mail(rs.getString("mail")));
            }
            return list;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }
    
    private static Connection connect() {
        Connection con = null;
        try {
            String url = "jdbc:sqlite:kata5.db";
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
