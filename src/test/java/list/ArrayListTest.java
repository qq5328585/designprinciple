package list;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * 2022/8/30
 * author:ljh
 */
public class ArrayListTest {

    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(new String(inetAddress.getAddress(), "GBK"));
            System.out.println(new String(inetAddress.getAddress(), "UTF-8"));
            System.out.println(new String(inetAddress.getAddress(), "ISO8859-1"));
            System.out.println(inetAddress.getCanonicalHostName());
            System.out.println(inetAddress.getHostAddress());
            System.out.println(inetAddress.getHostName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        final Person person = new Person(1, "2");
        person.setAge(10);
        person.setSex("1");
        subListTest();
    }

    /**
     * 测试ArrayList的subList方法
     * 只可修改，不可增删
     * 原因在于subList是内部类，初始化时长度固定为原始List的长度，不再变更，
     * 故原List发生增删时，在subList类中比较长度发现不同抛出ConcurrentModificationException
     */
    private static void subListTest() {
        String[] test = {"123"};
        String[] test1 = new String[7];
        String[] test2 = new String[]{"2"};
        List<String> oldList = new ArrayList<String>();
        oldList.add("one");
        oldList.add("two");
        oldList.add("three");
        oldList.add("four");
        oldList.add("five");

        //模拟直接sublist
//        List<String> subList = oldList.subList(3, 5);
//        System.out.println("oldList: " + oldList);
//        System.out.println("subList: " + subList);
//        oldList.set(3, "new four");
//        System.out.println("oldList: " + oldList);
//        System.out.println("subList: " + subList);
//        subList.set(0, "new value");
//        System.out.println("oldList: " + oldList);
//        System.out.println("subList: " + subList);
//        System.out.println("====================================");

        //模拟删除，抛出ConcurrentModificationException
//        oldList.remove(3);
//        System.out.println("oldList: " + oldList);
//        System.out.println("subList: " + subList);

        //模拟新增，抛出ConcurrentModificationException
//        oldList.add("six");
//        System.out.println("oldList: " + oldList);
//        System.out.println("subList: " + subList);

        //模拟sublist再套一层arraylist
        List<String> subList = oldList.subList(3, 5);
        List<String> new_subList = new ArrayList<String>(subList);
        System.out.println("oldList: " + oldList);
        System.out.println("new_subList: " + new_subList);
        oldList.set(3, "new four");
        System.out.println("oldList: " + oldList);
        System.out.println("new_subList: " + new_subList);
        new_subList.set(0, "new value");
        System.out.println("oldList: " + oldList);
        System.out.println("new_subList: " + new_subList);
        System.out.println("====================================");

        //模拟删除，无影响，已经为无关联的两个list
        oldList.remove(3);
        System.out.println("oldList: " + oldList);
        System.out.println("new_subList: " + new_subList);

        //模拟新增，无影响，已经为无关联的两个list
        oldList.add("six");
        System.out.println("oldList: " + oldList);
        System.out.println("new_subList: " + new_subList);
    }
}
