package service.serviceImpl;

import pojo.Document;
import pojo.Value;
import repository.dao.DocumentDao;
import repository.dao.ValueDao;
import repository.dao.daoImpl.DocumentDaoImpl;
import repository.dao.daoImpl.ValueDaoImpl;
import service.DocumentManager;

import java.util.List;

public class DocumentManagerImpl implements DocumentManager {

    DocumentDao documentDao;
    ValueDao valueDao;

    public DocumentManagerImpl() {
        this.documentDao = new DocumentDaoImpl();
        this.valueDao = new ValueDaoImpl();
    }

    @Override
    public int addDocumentByOperator(String operatorId, String category, String nameOfDocument) {
        if (operatorId != null && nameOfDocument != null) {
            Document newDocument = new Document(null, Integer.parseInt(category), Integer.parseInt(operatorId), nameOfDocument);
            documentDao.addDocument(newDocument);
            return 1;
        }
        return 0;
    }

    @Override
    public int addDocument(String operatorId, String categoryId, String nameDoc, String fieldId, String info) {
        if (operatorId != null && categoryId != null && nameDoc != null && fieldId != null && info != null) {
            Document newDocument = new Document(null, Integer.parseInt(categoryId), Integer.parseInt(operatorId), nameDoc);
            documentDao.addDocument(newDocument);
            Value valueOfDocument = new Value(null, newDocument.getId(), Integer.parseInt(fieldId), info);
            valueDao.addValue(valueOfDocument);
            return 1;
        }
        return 0;
    }

    //    @Override
//    public int addDocumentByOperator(Integer operatorId, String category, String nameOfDocument) {
//        if (operatorId != null && nameOfDocument != null) {
//            Document newDocument = new Document(null, Integer.parseInt(category), operatorId, nameOfDocument);
//            documentDao.addDocument(newDocument);
//            return 1;
//        }
//        return 0;
//    }
//
    @Override
    public List<Document> getAllDocuments() {
        return documentDao.getAllDocumentsWithId();
    }

    @Override
    public Value getValueOfField(String documentId, String valueId) {
//        return valueDao.getValueByDocIdAndFieldId(Integer.parseInt(documentId), Integer.parseInt(valueId));
        return new Value();
    }

    @Override
    public List<Value> getValueById(String documentId) {
        return valueDao.getValueById(Integer.parseInt(documentId));
    }
}
