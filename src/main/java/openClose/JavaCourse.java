package openClose;

/**
 * 2021/11/22
 * author:ljh
 */
public class JavaCourse implements ICourse {

    private int id;
    private String name;
    private Double price;

    public JavaCourse(int id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

}
