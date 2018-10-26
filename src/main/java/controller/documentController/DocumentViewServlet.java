package controller.documentController;

import pojo.Value;
import service.DocumentManager;
import service.serviceImpl.DocumentManagerImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class DocumentViewServlet extends HttpServlet {

    DocumentManager documentManager;

    public DocumentViewServlet() {
        documentManager = new DocumentManagerImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String documentId = request.getParameter("id");
        List<Value> valueList = documentManager.getValueById(documentId);
        request.setAttribute("valueList", valueList);
        request.getRequestDispatcher("/documents/docInfo.jsp").forward(request, response);
    }

}
