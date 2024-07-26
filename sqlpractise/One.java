package sqlpractise;

import java.sql.*;
import java.util.Scanner;

public class One {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String age=sc.nextLine();
        char gender=sc.next().charAt(0);
        String id=sc.next();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "Deepak@2003");
            Statement s=c.createStatement();
            // String query="insert into practise values('"+name+"','"+age+"','"+gender+"','"+id+"')";
            // int x=s.executeUpdate(query);
            // if(x>0){
            //     System.out.println("Data inserted successfully");
            // }else
            // System.out.println("Failed");
            ResultSet rs=s.executeQuery("select * from demo.practise");
            while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            }
            s.close();
            c.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
