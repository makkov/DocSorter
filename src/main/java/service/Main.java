package service;

import service.serviceImpl.*;

public class Main {
    public static void main(String[] args) {
        OperatorManagerImpl operatorManager = new OperatorManagerImpl();
//        operatorManager.addRole("superviser");
//        operatorManager.removeRoleById(3);
//        operatorManager.addOperator("makkov","123321", "Sushkin", "true", "1");
//        operatorManager.changeRoleOfOperatorById("2", "1");
//        System.out.println(operatorManager.getOperators());

        DocumentManagerImpl documentManager = new DocumentManagerImpl();
//        documentManager.addDocumentByOperator(2, "YAdoc")
        documentManager.addDocument("1", "2", "newDoc", "3", "plachu ya");

        RoleManager roleManager = new RoleManagerImpl();
//        roleManager.addRole("бездельник");

        DocumentFeaturesManager documentFeaturesManager = new DocumentFeaturesManagerImpl();
//        documentFeaturesManager.addCategoryOfDocument("YA bureaucratic document");
//        documentFeaturesManager.addFieldsOfCategory(4, "bla bla bla");
//        System.out.println(documentFeaturesManager.getFieldByIdCategory("1"));


        LoginManager loginManager = new LoginManagerImpl();
//        System.out.println(loginManager.getRole("makkov"));

    }
}
