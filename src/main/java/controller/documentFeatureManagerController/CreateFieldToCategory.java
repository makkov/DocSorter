package controller.documentFeatureManagerController;

import service.DocumentFeaturesManager;
import service.serviceImpl.DocumentFeaturesManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateFieldToCategory extends HttpServlet {

    DocumentFeaturesManager documentFeaturesManager;

    @Override
    public void init() throws ServletException {
        super.init();
        documentFeaturesManager = new DocumentFeaturesManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/documentFeature/createField.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String categoryId = req.getParameter("id");
        String nameField = req.getParameter("nameField");
        documentFeaturesManager.addFieldsOfCategory(categoryId, nameField);
        resp.sendRedirect("/category/fields?id=" + categoryId);
    }
}

