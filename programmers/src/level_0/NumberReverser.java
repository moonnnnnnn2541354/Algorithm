package level_0;

public class NumberReverser {
    public int[] solution(long n) {
        String str = "" + n;
        int[] answer = new int[str.length()];
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num = (int) (n % 10); //
            n /=  10;
            answer[i] = num;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 100;
        StringBuilder str = new StringBuilder();
        str.append(n);
    }

}
