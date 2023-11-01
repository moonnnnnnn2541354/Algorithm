import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //배열
        System.out.print("intArr : ");
        int[] intArr = {2,3,4,5,7,8,8,8};
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.println();

        // 선언 & 생성
//        int[] intArr = new int[5];
//        System.out.println("1 ~ 10까지의 수를 5번입력받아서 최빈값 구하기");
//        for (int i = 0; i < 5; i++) {
//            System.out.print((i + 1) + " 번째 입력 : ");
//            intArr[i] = scanner.nextInt();
//        }


        // 카운트배열 선언 & 생성
        int[] countArr = new int[11];
        for (int i = 0; i < intArr.length; i++) {
            int count = intArr[i];
            countArr[count]++;
        }

        // 카운트 확인 코드
        System.out.print("countArr : ");
        for (int i = 0; i < countArr.length; i++) {
            System.out.print(countArr[i] + " ");
        }
        System.out.println();

        // 최빈값 찾기
        int max = 0;
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                index = i;
            }
        }
        System.out.println("count max : " + max);
        System.out.println("arr index : " + index);












    }
}
