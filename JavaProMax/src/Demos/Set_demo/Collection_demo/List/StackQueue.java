package Demos.Set_demo.Collection_demo.List;

import java.util.LinkedList;

public class StackQueue {
    public static void main(String[] args) {

        LinkedList<String> stack = new LinkedList<>();
        //入栈
        stack.push("1");
        stack.push("2");
        stack.push("3");
        System.out.println(stack);
        //出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("--------------------");

        LinkedList<String> queue = new LinkedList<>();
        //入队
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        System.out.println(queue);
        //出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

    }
}
