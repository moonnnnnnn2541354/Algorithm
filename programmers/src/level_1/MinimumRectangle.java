package level_1;

public class MinimumRectangle {

    public int solution(int[][] sizes) {
        int[][] intArr = new int[sizes.length][sizes[0].length];
        for (int i = 0; i < sizes.length; i++) {
            intArr[i][0] = Math.max(sizes[i][0], sizes[i][1]);
            intArr[i][1] = Math.min(sizes[i][0], sizes[i][1]);
        }

        int[][] arr = new int[1][2];
        for (int i = 0; i < intArr.length; i++) {
            arr[0][0] = Math.max(arr[0][0], intArr[i][0]);
            arr[0][1] = Math.max(arr[0][1], intArr[i][1]);
        }
        return arr[0][0] * arr[0][1];
    }

}
