package controller.documentFeatureManagerController;

import pojo.Category;
import pojo.Field;
import service.DocumentFeaturesManager;
import service.serviceImpl.DocumentFeaturesManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class FieldsServlet extends HttpServlet {

    private DocumentFeaturesManager documentFeaturesManager;

    @Override
    public void init() throws ServletException {
        super.init();
        documentFeaturesManager = new DocumentFeaturesManagerImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String categoryId = request.getParameter("id");
        request.setAttribute("id", categoryId);
        List<Field> fieldList = documentFeaturesManager.getFieldByIdCategory(categoryId);
        request.setAttribute("fieldList", fieldList);
        request.getRequestDispatcher("/documentFeature/fields.jsp").forward(request, response);
    }
}
