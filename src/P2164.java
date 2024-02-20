import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            queue.offer((i + 1));
        }
        while (queue.size() >= 2) {
            queue.pop();
            int n = queue.pop();
            queue.offer(n);
        }
        System.out.println(queue.peek());
    }
}
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        while (myQueue.size()>1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }
        System.out.println(myQueue.poll());/*
    }
}*/