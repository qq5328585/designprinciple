package dependencyInversion;

/**
 * 2021/11/22
 * author:ljh
 */
public class CourseStudy {
    private IStudy iStudy;

    public void setiStudy(IStudy iStudy) {
        this.iStudy = iStudy;
    }

    public void study() {
        this.iStudy.study();
    }
}
