package pojo;

public class Document {

    private Integer id;
    private Integer category;
    private Integer operator;
    private String name;

    public Document(Integer id, Integer category, Integer operator, String name) {
        this.id = id;
        this.category = category;
        this.operator = operator;
        this.name = name;
    }

    public Document() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", category=" + category +
                ", operator=" + operator +
                ", name='" + name + '\'' +
                '}';
    }
}
