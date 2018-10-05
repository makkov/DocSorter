package controller.operatorController;

import pojo.Operator;
import service.OperatorManager;
import service.serviceImpl.OperatorManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class OperatorServlet extends HttpServlet {

    OperatorManager operatorManager;

    public OperatorServlet() {
        operatorManager = new OperatorManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Operator> operatorList = operatorManager.getOperators();
        req.setAttribute("operators", operatorList);
        req.getRequestDispatcher("/operator/operators.jsp").forward(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String nameOfOperator = req.getParameter("nameOperator");
//        String categoryId = req.getParameter("categoryId");
//        operatorManager.addOperator(nameOfOperator, categoryId);
//        this.doGet(req, resp);
//    }
}
