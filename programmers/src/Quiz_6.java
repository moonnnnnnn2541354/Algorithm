import java.util.Scanner;
import java.util.Stack;

public class Quiz_6 {
    public static void main(String[] args) {
        // Stack : 선입후출 (Last in - First out)
        // 선언 : Stack<래퍼클래스> stack = new Stack<>();
        // 추가 : stack.push(0);
        // 읽기 : stack.peek(0);
        // 읽고 삭제 : stack.pop(0);
        // 전체삭제 : stack.clear();
        // 길이 : stack.size();
        // stack 이 비었는지 안비었는지 : stack.empty();
        // 포함여부 : stack.contains(0);

        // 길이값
        // 처음에는 길이 정하기
        // 0 pop
        // 1 peek

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int num1 = scanner.nextInt();
        System.out.println("-----------------");
        for (int i = 0; i < num1; i++) {
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                stack.pop();
            } else {
                stack.push(num2);
            }
        }
        System.out.println(stack.peek());
    }
}
