package controller.loginController;

import service.LoginManager;
import service.serviceImpl.LoginManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class LoginServlet extends HttpServlet {

    LoginManager loginManager;

    @Override
    public void init() throws ServletException {
        super.init();
        loginManager = new LoginManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (loginManager.checkAuth(login, password)) {
            int role = loginManager.getRole(login);
            req.getSession().setAttribute("login", login);
            req.getSession().setAttribute("role", role);
            resp.sendRedirect("/dashBoard");
        } else {
            resp.sendRedirect("/login?errorCode=wrongLogin");
        }
    }
}
