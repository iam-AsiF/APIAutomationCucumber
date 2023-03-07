package Core;

import java.sql.*;

public class DatabaseManager {
    // Connection object


    public ResultSet connectionManager(String query) throws ClassNotFoundException, SQLException {

        //String dbUrl = "jdbc:mysql://colins-macbook-pro.local:3036/qa_test";
        String dbUrl = "jdbc:mysql://localhost:3306/qa_test";

        //Database Username
        String username = "root";

        //Database Password
        String password = "";

        //Load mysql jdbc driver
        Class.forName("com.mysql.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String myName = rs.getString(1);
            String myAge = rs.getString(2);
            System. out.println(myName+"  "+myAge);
        }


        con.close();
//        return rs;

        return  rs;
    }

}