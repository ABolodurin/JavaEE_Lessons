import SessionUserData.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        Cart cart = (Cart) session.getAttribute("cart");

        String name;
        int quantity;
        if (cart == null) {
            cart = new Cart();
            name = "пусто";
            quantity = 0;
        }
        else {
            name = req.getParameter("name");
            quantity = Integer.parseInt(req.getParameter("quantity"));
        }

        cart.setName(name);
        cart.setQuantity(quantity);

        session.setAttribute("c", cart);

        getServletContext().getRequestDispatcher("/CartReview.jsp").forward(req, resp);


    }
}
