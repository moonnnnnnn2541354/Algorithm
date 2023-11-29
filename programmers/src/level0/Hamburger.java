package level0;

import java.util.Stack;

public class Hamburger {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            while (stack.size()>=4) {
                if (stack.peek().equals(1)) {
                    stack.pop();
                    if (stack.peek().equals(3)) {
                        stack.pop();
                        if (stack.peek().equals(2)) {
                            stack.pop();
                            if (stack.peek().equals(1)) {
                                stack.pop();
                                answer++;
                                break;
                            } else {stack.push(2); stack.push(3); stack.push(1); break;}
                        } else {stack.push(3); stack.push(1); break;}
                    } else {stack.push(1); break;}
                } else {break;}
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 1 빵
        // 2 야채
        // 3 고기
        // 1,2,3,1 이 루틴이 적용되는거만 햄버거가 됨
        int[] ingredient = {1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> surveStack = new Stack<>();
        int[] hamburger = {1,3,2,1};
        // 메인스택 : 1,2,3,1
        // 서브스택 : 1,3,2,1
        // 맞으면 answer++, 틀리면 메인스택 : 1,2,3,1

        for (int i = 0; i < ingredient.length; i++) { // 문제 배열만큼 돌고
            mainStack.push(ingredient[i]); // 메인스택에 저장

            if (mainStack.peek().equals(1) && mainStack.size()>=4) { // 스택처음이 1 && 스택길이가 4이상 일때
                boolean success = true; // 완성 true;
                for (int j = 0; j < hamburger.length; j++) { // 햄버거배열 만큼 돌고
                    if (hamburger[j] != mainStack.peek()){
                        while (!surveStack.isEmpty()){ // 서브스택이 빌때까지
                            mainStack.push(surveStack.pop()); // 메인스택에 서브스택 저장
                        }
                        success = false;
                        break;
                    }
                    surveStack.push(mainStack.pop()); // if문 아닐때는 서브스택에 메인스택pop
                }
                if (success){ // success가 true면
                    answer++; // answer++ 하고
                    surveStack.clear(); // 서브스택 초기화
                }
            }
        }
        System.out.println(answer);
    }
}
