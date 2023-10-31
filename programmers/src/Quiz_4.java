import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //배열
//        System.out.print("배열 : ");
//        int[] intArr = {2,3,4,5,7,8,8,8};
//        for (int i = 0; i < intArr.length; i++) {
//            System.out.print(intArr[i] + " ");
//        }
//        System.out.println();

        // 선언 & 생성
        int[] intArr = new int[5];
        System.out.println("1 ~ 10까지의 수를 5번입력받아서 최빈값 구하기");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " 번째 입력 : ");
            intArr[i] = scanner.nextInt();
        }


        // 카운트배열 선언 & 생성
        int[] countArr = new int[11];
        for (int i = 0; i < intArr.length; i++) {
            int num = intArr[i]; // int = 2;
            countArr[num] +=1; // 2번째 인덱스 자리에 1+1
        }

        // 카운트 확인 코드
        System.out.print("카운트 확인 : ");
        for (int i = 0; i < countArr.length; i++) {
            System.out.print(countArr[i] + " ");
        }
        System.out.println();

        // 최빈값 찾기
        int result = 0;
        int max = 0;
        for (int i = 0; i < countArr.length; i++) {
            if (max < countArr[i]) {
                max = countArr[i];
                result = i;
            }
        }
        System.out.print("카운트 최고값 찾기 : " + result);
    }
}
