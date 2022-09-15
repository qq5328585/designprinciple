package openClose;

/**
 * 2021/11/22
 * author:ljh
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(int id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
