package service;

import pojo.Document;
import pojo.Value;

import java.util.List;

public interface DocumentManager {

    int addDocumentByOperator(String operatorId, String category, String nameOfDocument);

    int addDocument(String operatorId, String categoryId, String nameDoc, String fieldId, String info);

    List<Document> getAllDocuments();

    Value getValueOfField(String documentId, String valueId);

    List<Value> getValueById(String documentId);


}
