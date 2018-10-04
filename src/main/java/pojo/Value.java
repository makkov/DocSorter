package pojo;

public class Value {

    private Integer id;
    private Integer document;
    private Integer field;
    private String info;

    public Value(Integer id, Integer document, Integer field, String info) {
        this.id = id;
        this.document = document;
        this.field = field;
        this.info = info;
    }

    public Value() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDocument() {
        return document;
    }

    public void setDocument(Integer document) {
        this.document = document;
    }

    public Integer getField() {
        return field;
    }

    public void setField(Integer field) {
        this.field = field;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Value{" +
                "id=" + id +
                ", document=" + document +
                ", field=" + field +
                ", info='" + info + '\'' +
                '}';
    }
}
