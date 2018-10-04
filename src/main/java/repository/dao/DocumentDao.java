package repository.dao;


import pojo.Document;

import java.util.List;

public interface DocumentDao {

    boolean addDocument(Document document);

    boolean deleteDocumentById(Integer id);

    Document getDocumentById(Integer id);

    List<Document> getAllDocumentsWithId();

}
