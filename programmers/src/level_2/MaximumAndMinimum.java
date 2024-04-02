package level_2;

public class MaximumAndMinimum {
    public String solution(String s) {
        String[] strArr = s.split(" ");

        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);
        for (String str : strArr){
            max = Math.max(max,Integer.parseInt(str));
            min = Math.min(min,Integer.parseInt(str));
        }

        StringBuilder answer = new StringBuilder();
        answer.append(min);
        answer.append(" ");
        answer.append(max);

        return answer.toString();
    }
}
