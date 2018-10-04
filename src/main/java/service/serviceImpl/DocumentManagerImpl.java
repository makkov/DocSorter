package service.serviceImpl;

import pojo.Document;
import repository.dao.DocumentDao;
import repository.dao.daoImpl.DocumentDaoImpl;
import service.DocumentManager;

public class DocumentManagerImpl implements DocumentManager {

    DocumentDao documentDao;

    public DocumentManagerImpl() {
        this.documentDao = new DocumentDaoImpl();
    }

    @Override
    public int addDocumentByOperator(Integer operatorId, String nameOfDocument) {
        if (operatorId != null && nameOfDocument != null) {
            Document newDocument = new Document(null, 2, operatorId, nameOfDocument);
            documentDao.addDocument(newDocument);
            return 1;
        }
        return 0;
    }
}
