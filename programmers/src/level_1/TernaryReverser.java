package level_1;

public class TernaryReverser {

    public int solution(int n) {
        StringBuilder sb = new StringBuilder(Integer.toString(n,3));
        sb.reverse();
        int answer = Integer.parseInt(String.valueOf(sb),3);
        return answer;
    }

    public static void main(String[] args) {
        int n = 45;

        StringBuilder sb = new StringBuilder(Integer.toString(n,3));
        sb.reverse();
        int answer = Integer.parseInt(String.valueOf(sb),3);


    }


}
