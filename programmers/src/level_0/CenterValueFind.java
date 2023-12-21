package level_0;

import java.util.Arrays;

public class CenterValueFind {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
