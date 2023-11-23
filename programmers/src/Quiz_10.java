import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.
        System.out.println("정수를 입력받아서 그 수의 팩토리얼(n! = 1 × 2 × ... × (n-1) × n) 출력하기");
        System.out.println("(예시) 입력값 = 4 일 경우(1 × 2 × 3 × 4) 결과값 = 24");
        int num1 = Integer.parseInt(scanner.next());
        int answer = 1;
        for (int i = 1; i <= num1; i++) {
            answer *= i;
        }
        System.out.println(answer);
        System.out.println("---------------------------------------------------------------------");

        // 2.
        System.out.println("1부터 26사이의 정수를 입력해서 알파벳 출력하기.  (1=A 2=B ... 26=Z)");
        System.out.println("다른수 입력시 \"1부터 26사이를 입력하시오\" 문구 출력하기");
        int num2 = Integer.parseInt(scanner.next());
        if (num2 > 0 && num2 < 27) {
            num2 += 64;
            System.out.println((char) num2);
        } else {
            System.out.println("1부터 26사이를 입력하시오");
        }
        System.out.println("---------------------------------------------------------------------");

        // 3.
        System.out.println("숫자 5개를 입력해서 최소값과 최대값을 출력하기.");
        List<Integer> intList3 = new ArrayList<>();
        System.out.println("숫자입력");
        for (int i = 0; i < 5; i++) {
            intList3.add(Integer.parseInt(scanner.next()));
        }
        Collections.sort(intList3);
        System.out.println("최소 : " + intList3.getFirst());
        System.out.println("최대 : " + intList3.getLast());
        System.out.println("---------------------------------------------------------------------");

        // 4. TODO: X X O X?

        // 5.
        System.out.println("1 ~ 입력값 사이에 홀수 출력하기.  (continue를 반드시 사용하여 구현)");
        int num5 = Integer.parseInt(scanner.next());
        for (int i = 1; i <= num5; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("---------------------------------------------------------------------");

        // 6.
        System.out.println("정수 5개 입력해서 , 입력한 순서의 역순으로 출력하기.");
        System.out.println("(반드시 정수형 배열에 입력받아야만 인정)");
        System.out.println();
        System.out.println("다섯 개의 수를 입력하시오.");
        List<Integer> intList4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            intList4.addFirst(Integer.parseInt(scanner.next()));
        }
        System.out.print("역순 : ");
        for (int i = 0; i < intList4.size(); i++) {
            System.out.print(intList4.get(i) + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");

        // 7.
        System.out.println("입력한 숫자 3의배수 인지 확인하기.  (switch ~ case 문을 사용하기)");
        System.out.println();
        System.out.println("숫자를 입력하시오.");
        int num7 = scanner.nextInt();
        String result = (num7 % 3 == 0) ? "3의 배수" : "3의 배수 아님";
        switch (num7 % 3) {
            case 0 -> System.out.println("3의 배수"); // break 들어가 있는거임
            default -> System.out.println("3의 배수 아님");
        }
        System.out.println("---------------------------------------------------------------------");

        // 8.
        System.out.println("이중 for문 활용 만들기");
        System.out.println();
        System.out.println("1.");
        int a = 25;
        int b = 0;
        for (int i = 0; i < 5; i++) {
            a -= 5;
            b = a;
            System.out.print(a);
            for (int j = 0; j < 4; j++) {
                b--;
                System.out.print(" " + b);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("2.");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                if ((i + 1) % 2 != 0) {
                    System.out.print("〇");
                }
                if ((i + 1) % 2 == 0) {
                    System.out.print("✖");
                }

            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------------------------");

        // 9.
        System.out.println("가위바위보 출력하기");
        System.out.println();
        System.out.println("1~3 숫자를 입력해주세요.");
        System.out.println("1:바위 , 2:가위 , 3:보");
        int user = scanner.nextInt();
        int com = (int) (Math.random() * 3) + 1;
        System.out.println("user : " + user);
        System.out.println("com : " + com);
        switch (user) {
            case 1:
                switch (com) {
                    case 1:
                        System.out.println("무승부");
                        break;
                    case 2:
                        System.out.println("user 승");
                        break;
                    case 3:
                        System.out.println("com 승");
                        break;
                }
                break;
            case 2:
                switch (com) {
                    case 1:
                        System.out.println("com 승");
                        break;
                    case 2:
                        System.out.println("무승부");
                        break;
                    case 3:
                        System.out.println("user 승");
                        break;
                }
                break;
            case 3:
                switch (com) {
                    case 1:
                        System.out.println("나 승");
                        break;
                    case 2:
                        System.out.println("com 승");
                        break;
                    case 3:
                        System.out.println("user 승");
                        break;
                }
                break;
        }
        System.out.println("끝!");


    }

}
