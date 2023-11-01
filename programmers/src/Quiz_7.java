import java.util.*;

public class Quiz_7 {
    public static void main(String[] args) {
        // Queue : 선입선출 (First in - First out)
        // 선언 : Queue<래퍼클래스> queue = new LinkedList<>();
        // 추가 : queue.offer(0);
        // 읽기 : queue.peek(0);
        // 읽고 삭제 : queue.poll(0);
        // 전체삭제 : queue.clear();
        // 길이 : queue.size();
        // queue 이 비었는지 안비었는지 : queue.isEmpty();
        // 포함여부 : queue.contains(0);
        //

        Queue<Integer> queue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        // 카드 개수 정의 1부터 순서대로 들어가고
        // 섞는 횟수
        // 1,2,3 ...
        // 2,3,4 ... 1 ( 한번 섞으면 앞에가 뒤로 )

        System.out.print("카드의 개수 : ");
        int max = scanner.nextInt();
        for (int i = 0; i < max; i++) {
            queue.offer(i+1);
        }

        System.out.print("몇번 섞으시겠습니까? ");
        int mix = scanner.nextInt();
        for (int i = 0; i < mix; i++) {
            queue.offer(queue.poll());
        }

        System.out.println(queue.peek());

    }
}
