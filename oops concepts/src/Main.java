/*
load and register the driver
connect the driver
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","vishnu2310");
            System.out.println("successfully created");
            
        }catch (Exception e){

        }

    }
}