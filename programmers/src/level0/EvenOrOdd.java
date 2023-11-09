package level0;

public class EvenOrOdd {
    public String solution(int num) {
        String answer = "";
        if (num%2==0){
            answer = "Even";
        } else if (num%2!=0){
            answer = "Odd";
        }
        return answer;
    }
}
