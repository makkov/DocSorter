package controller.operatorController;

import service.OperatorManager;
import service.serviceImpl.OperatorManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateOperatorServlet extends HttpServlet {

    OperatorManager operatorManager;

    @Override
    public void init() throws ServletException {
        super.init();
        operatorManager = new OperatorManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/operator/createOperator.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginOfOperator = req.getParameter("loginOfOperator");
        String password = req.getParameter("password");
        String nameOfOperator = req.getParameter("nameOperator");
        String isActive = req.getParameter("isActive");
        String categoryId = req.getParameter("categoryId");
        operatorManager.addOperator(loginOfOperator, password, nameOfOperator, isActive, categoryId);
        resp.sendRedirect("/operators");
    }
}
