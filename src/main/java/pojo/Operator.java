package pojo;

public class Operator {

    private Integer id;
    private String name;
    private Integer role;

    public Operator(Integer id, String name, Integer role) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
