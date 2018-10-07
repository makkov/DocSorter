package controller.documentFeatureManagerController;

import pojo.Category;
import pojo.Operator;
import service.DocumentFeaturesManager;
import service.OperatorManager;
import service.serviceImpl.DocumentFeaturesManagerImpl;
import service.serviceImpl.OperatorManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CategoryServlet extends HttpServlet {

    DocumentFeaturesManager documentFeaturesManager;

    public CategoryServlet() {
        documentFeaturesManager = new DocumentFeaturesManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categoryList = documentFeaturesManager.getСategories();
        req.setAttribute("category", categoryList);
        req.getRequestDispatcher("/documentFeature/category.jsp").forward(req, resp);
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String nameOfOperator = req.getParameter("nameOperator");
//        String categoryId = req.getParameter("categoryId");
//        operatorManager.addOperator(nameOfOperator, categoryId);
//        this.doGet(req, resp);
//    }
}
