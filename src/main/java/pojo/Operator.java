package pojo;

public class Operator {

    private Integer id;
    private String login;
    private String password;
    private String name;
    private Boolean isActive;
    private Integer role;

    public Operator(Integer id, String login, String password, String name, Boolean isActive, Integer role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.isActive = isActive;
        this.role = role;
    }

    public Operator() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", isActive=" + isActive +
                ", role=" + role +
                '}';
    }
}
