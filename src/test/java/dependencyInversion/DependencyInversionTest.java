package dependencyInversion;

/**
 * 2021/11/22
 * author:ljh
 */
public class DependencyInversionTest {
    public static void main(String[] args) {
        CourseStudy courseStudy = new CourseStudy();
        courseStudy.setiStudy(new JavaIStudy());
        courseStudy.study();
        courseStudy.setiStudy(new PhtyonIStudy());
        courseStudy.study();
    }
}
