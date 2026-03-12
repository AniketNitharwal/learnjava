import java.sql.*;
import java.util.Scanner;

public class SearchStudent {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/studentdb","root","root");

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();

            PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM student WHERE rollno=?");

            ps.setInt(1, roll);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getInt(3));
            }

            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
} 