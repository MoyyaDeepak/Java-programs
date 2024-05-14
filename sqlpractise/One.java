package sqlpractise;

import java.sql.*;

public class One {
    public static void main(String[] args) {
        String name="Deepak";
        String age="20";
        char gender='M';

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Deepak@2003");
            Statement s=c.createStatement();
            String query="insert into practise values('"+name+"','"+age+"','"+gender+"')";
            int x=s.executeUpdate(query);
            if(x>0){
                System.out.println("Data inserted successfully");
            }else
            System.out.println("Failed");
            s.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
