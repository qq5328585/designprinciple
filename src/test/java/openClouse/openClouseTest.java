package openClouse;

import openClose.ICourse;
import openClose.JavaCourse;
import openClose.JavaDiscountCourse;

/**
 * 2021/11/22
 * author:ljh
 */
public class openClouseTest {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "Java课程", 10000D);
        System.out.println("课程ID: " + iCourse.getId() +
                           "\n课程名称: " + iCourse.getName() +
                           "\n课程价格: " + iCourse.getPrice());
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID: " + javaDiscountCourse.getId() +
                           "\n课程名称: " + javaDiscountCourse.getName() +
                           "\n课程价格: " + javaDiscountCourse.getPrice() +
                           "\n课程折扣价格: " + javaDiscountCourse.getDiscountPrice());
    }
}
