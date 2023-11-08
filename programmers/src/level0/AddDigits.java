package level0;

public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        while (n > 0) {
            sum += n % 10; //  123=3,  12=3+2    1=3+2+1
            n /= 10; //     123=12  12=1,   1=0
        }
        System.out.println(sum);
    }
}
