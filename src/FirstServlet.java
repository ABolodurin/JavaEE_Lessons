import SessionUserData.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/NorthWind",
                    "admin", "admin");

            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT * from customers");
            while(result.next())
                pw.println(result.getString("*"));

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
