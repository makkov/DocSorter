package service;

import service.serviceImpl.DocumentFeaturesManagerImpl;
import service.serviceImpl.DocumentManagerImpl;
import service.serviceImpl.OperatorManagerImpl;
import service.serviceImpl.RoleManagerImpl;

public class Main {
    public static void main(String[] args) {
        OperatorManagerImpl operatorManager = new OperatorManagerImpl();
//        operatorManager.addRole("superviser");
//        operatorManager.removeRoleById(3);
        operatorManager.addOperator("makkov","123321", "Sushkin", "true", "1");
//        operatorManager.changeRoleOfOperatorById("2", "1");
//        System.out.println(operatorManager.getOperators());

        DocumentManagerImpl documentManager = new DocumentManagerImpl();
//        documentManager.addDocumentByOperator(2, "YAdoc")

        RoleManager roleManager = new RoleManagerImpl();
//        roleManager.addRole("бездельник");

        DocumentFeaturesManager documentFeaturesManager = new DocumentFeaturesManagerImpl();
//        documentFeaturesManager.addCategoryOfDocument("YA bureaucratic document");
//        documentFeaturesManager.addFieldsOfCategory(4, "bla bla bla");
    }
}
