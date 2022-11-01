import SessionUserData.Cart;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class SetCookiesServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookieID = new Cookie("ID", "1234");
        Cookie cookieName = new Cookie("name", "Ivan");

        cookieID.setMaxAge(24 * 60 * 60);
        cookieName.setMaxAge(24 * 60 * 60);

        resp.addCookie(cookieID);
        resp.addCookie(cookieName);
    }
}
