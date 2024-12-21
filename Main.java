import java.sql.*;   // Needed for JDBC classes

/**
************************NOTE**********************************
Unfortunatly for now, you cannot connect to the CoffeeDB database through replit. You can do your coding here, but you will only be able to test if you install an IDE on your local computer (such as VSCode or Eclipse) and run the code there.

**************************************************************
*/

 public class Main
 {
   public static void main(String[] args)
    {
       // Create a named constant for the URL.
       // NOTE: This value is specific for Java DB.
       final String DB_URL = "jdbc:derby:CoffeeDB";

       try
       {
          // Create a connection to the database.


          // Create a Statement object.


          // Create the query.


          // Send the query to the DBMS and store the result.


          // Move to the first row.


          // Get the sum of unpaid orders.


          // Close the statement and the connection.



          // Display the sum of unpaid orders.

       }
       catch(Exception ex)
       {
          System.out.println("ERROR: " + ex.getMessage());
       }
    }
 }