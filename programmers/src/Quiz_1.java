import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        // 우승상금게임
        System.out.println("-----------------------------");
        System.out.println("우승 상금 게임!!!");
        System.out.println();
        System.out.print("천번째 숫자 : ");
        int num1 = scanner.nextInt();
        System.out.println();
        System.out.print("두번째 숫자 : ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 == num2) {
            result = (num1 + num2) * 1000;
            System.out.println("상금 : " + result);
        } else if (num1 > num2) {
            result = num1 * 1000;
            System.out.println("상금 : " + result);
        } else if (num1 < num2) {
            result = num2 * 1000;
            System.out.println("상금 : " + result);
        }
        System.out.println("-----------------------------");
    }
}