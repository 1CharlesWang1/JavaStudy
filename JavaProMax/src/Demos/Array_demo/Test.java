package Demos.Array_demo;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    /**
     * 数组排序,toString格式化
     * @param args
     */
    public static void main(String[] args) {


        int[] arr1 = {4,3,5,7,33,77,8};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1, 33));

        Student[] students = new Student[2];

        students[0] = new Student(2,"wcl",170.0);
        students[1] = new Student(1,"cyb",180.5);

        //自定义数组排序比较器
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getId()-o2.getId();
                return Double.compare(o2.getHight(),o1.getHight());
            }
        });

        System.out.println(Arrays.toString(students));

    }
}
