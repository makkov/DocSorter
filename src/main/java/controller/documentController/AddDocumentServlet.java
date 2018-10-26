package controller.documentController;

import service.DocumentFeaturesManager;
import service.DocumentManager;
import service.serviceImpl.DocumentFeaturesManagerImpl;
import service.serviceImpl.DocumentManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddDocumentServlet extends HttpServlet {

    DocumentManager documentManager;

    @Override
    public void init() throws ServletException {
        super.init();
        documentManager = new DocumentManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/documents/addDocument.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String operatorId = req.getParameter("operatorId");
        String categoryId = req.getParameter("categoryId");
        String nameDoc = req.getParameter("nameDoc");
        documentManager.addDocumentByOperator(operatorId, categoryId, nameDoc);
        resp.sendRedirect("/documents");
    }

}
