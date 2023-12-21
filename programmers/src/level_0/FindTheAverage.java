package level_0;

public class FindTheAverage {
    public double solution(int[] arr) {
        double answer = 0.0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        return answer/ arr.length;
        // return Arrays.stream(arr).average().getAsDouble();
    }
}


