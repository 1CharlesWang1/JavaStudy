package Demos.Genericity_demo;

public class Genericity_Method {
    public static void main(String[] args) {

        String[] arr = {"o","p","q"};
        printArray(arr);

        Integer[] arr2 = {1,2,3};
        printArray(arr2);
    }

    public static <T> void printArray(T[] arr){
        if (arr!=null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i== arr.length-1?"":",");
            }
            sb.append("]");
            System.out.println(sb);
        }else {
            System.out.println(arr);
        }
    }
}
