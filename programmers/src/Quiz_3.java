public class Quiz_3 {
    public static void main(String[] args) {

        // 숫자 나열하기
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
//                System.out.print(j+(i+1));
                System.out.print(i+j+1);
            }
            System.out.println();
        }


        // 배열 연습
        // 선언
        int[][] arr = new int[5][5];

        // 생성
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i;
            }
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }


        
        


    }
}
