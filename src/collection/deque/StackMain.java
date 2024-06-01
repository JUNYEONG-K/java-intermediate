package collection.deque;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // Stack 은 Vector 를 상속 받아 사용하는데, Vector 는 Java 1.0 에서 개발되었고, 지금은 사용하지 않음. 하위호환만을 위해 존재
        // 따라서 Vector 를 상속받은 Stack 도 우리는 활용하지 말자
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);

        System.out.println("stack.peek() = " + stack.peek());

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack = " + stack);
    }
}
