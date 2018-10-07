package controller.documentFeatureManagerController;

import service.DocumentFeaturesManager;
import service.OperatorManager;
import service.serviceImpl.DocumentFeaturesManagerImpl;
import service.serviceImpl.OperatorManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateCategoryServlet extends HttpServlet {

    DocumentFeaturesManager documentFeaturesManager;

    @Override
    public void init() throws ServletException {
        super.init();
        documentFeaturesManager = new DocumentFeaturesManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/documentFeature/createCategory.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameCategory = req.getParameter("nameCategory");
        documentFeaturesManager.addCategoryOfDocument(nameCategory);
        resp.sendRedirect("/category");
    }
}
