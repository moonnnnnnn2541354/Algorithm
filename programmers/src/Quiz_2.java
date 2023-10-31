import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2의배수,3의배수 맞추기
        System.out.println("환영합니다.");
        System.out.println("입력 받은 수 까지 2의 배수인지 3의 배수인지 체크합니다!!");
        System.out.print("입력 : ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " -> 2와 3의 배수입니다.");
            } else if (i % 3 == 0) {
                System.out.println(i + " -> 3의 배수입니다.");
            } else if (i % 2 == 0) {
                System.out.println(i + " -> 2의 배수입니다.");
            } else {
                System.out.println(i);
            }
        }

    }
}
