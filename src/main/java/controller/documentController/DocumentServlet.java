package controller.documentController;

import pojo.Document;
import service.DocumentManager;
import service.serviceImpl.DocumentManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DocumentServlet extends HttpServlet {

    DocumentManager documentManager;

    public DocumentServlet() {
        documentManager= new DocumentManagerImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Document> documents = documentManager.getAllDocuments();
        req.setAttribute("documents", documents);
        req.getRequestDispatcher("/documents/documents.jsp").forward(req, resp);
    }
}
