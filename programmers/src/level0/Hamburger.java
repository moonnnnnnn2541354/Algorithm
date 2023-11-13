package level0;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import level0.NationalCompetition.StudentList;

public class Hamburger {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
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
                            } else { stack.add(2); stack.add(3); stack.add(1); break;}
                        } else { stack.add(3); stack.add(1); break;}
                    } else { stack.add(1); break;}
                } else { break;}
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
        Stack<Integer> stack = new Stack<>();

        // 1차시도
        for (int i = 0; i < ingredient.length; i++) {
            if (ingredient[i]==1) {
                if (ingredient[i+1]==2) {
                    if (ingredient[i+2]==3) {
                        if (ingredient[i+3]==1) {
                            answer++;
                            i += 3;
                        }
                    }
                }
            }
        }
        System.out.println(answer);

        // 2차시도
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
            if (stack.peek().equals(1)) {
                stack.pop();
                if (stack.peek().equals(3)) {
                    stack.pop();
                    if (stack.peek().equals(2)) {
                        stack.pop();
                        if (stack.peek().equals(1)) {
                            stack.pop();
                            answer++;
                        } else { stack.add(2); stack.add(3); stack.add(1);}
                    } else { stack.add(3); stack.add(1);}
                } else { stack.add(1);}
            }
        }
        System.out.println(answer);

        // 3차시도
        for (int i = 0; i < ingredient.length; i++) {
            stack.add(ingredient[i]);
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
                            } else { stack.add(2); stack.add(3); stack.add(1); break;}
                        } else { stack.add(3); stack.add(1); break;}
                    } else { stack.add(1); break;}
                } else { break;}
            }
        }
        System.out.println(answer);
        }
}
