package service;

public interface LoginManager {

    int getRole(String login);
    boolean checkAuth(String login, String password);
}
