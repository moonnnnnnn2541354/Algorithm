package level_1;

import java.util.Stack;

public class UnequalNumbers {
    public int[] solution(int[] arr) {
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) st.push(arr[i]);
            else if (st.peek() != arr[i]) st.push(arr[i]);
        }
        int[] answer = new int[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            answer[i] = st.pop();
        }

        return answer;
    }
}
