import java.sql.*;
 class Student  {
    public static void main(String[] args) throws ClassNotFoundException {
            Class.forName("Main");
    }
}
    class Vishnu{
       static {
           System.out.println("static");
       }
        {
            System.out.println("instance");
        }
       void fun(){
           System.out.println("void");
        }

    }

