package pojo;

public class Field {

    private Integer id;
    private String name;
    private Integer category;

    public Field(Integer id, String name, Integer category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public Field() {
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

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                '}';
    }
}
