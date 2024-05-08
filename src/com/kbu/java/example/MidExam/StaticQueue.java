package com.kbu.java.example.MidExam;

import java.util.Scanner;

public class StaticQueue {
    private static int[] queue = makeQueueArray(10); //new int[10];
    private static int rear = 0;  // 마지막으로 입력된 값의 인덱스
    private static int front = 0;  // 삭제될 값의 인덱스 (꺼내올 데이터 인덱스)

    // rear == front면 큐가 비었다
    // rear == MAX_INDEX 면 큐가 꽉찼다
    private static String getQueueString(){
        StringBuilder sb = new StringBuilder();
        for (int i = front ; i < rear ; i++){
            sb.append(queue[i] + ", ");
        }
        return sb.toString();
    }

    // 큐에 보관 가능한 데이터 갯수이다.
    public static int getQueueSize(){
        return queue.length;
    }

    public static boolean isEmpty(){
        return rear == front;
    }

    public static boolean isFull(){
        return rear == getQueueSize();
    }

    public static boolean isDisable(){
        return (front == rear) && (rear == getQueueSize());
    }

    static int[] makeQueueArray(int N){
        rear = 0;
        front = 0;
        return new int[N];
    }

    public static void push(int x) {
        if(isFull()){
            expandQueue();
        }
        queue[rear++] = x;
    }

    public static int pop() {
        int result = -1;
        if((!isEmpty()) && (!isDisable())){
            result = queue[front++];
        }
        return result;
    }

    private static void expandQueue() {
        int[] newQueue = new int[queue.length * 2];
        System.arraycopy(queue, 0, newQueue, 0, queue.length);
        queue = newQueue;
    }
    

    public static void showQueueInfo() {
        System.out.println("------------------------------------------------------");
        if (isDisable()){
            System.out.printf("\t 더이상 큐를 사용할수 없습니다. rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
        } else if(isFull()){
            System.out.printf("\t 큐가 다 찼습니다. rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
            System.out.printf("\t\t queue : [%s] \n",getQueueString());
        } else if (isEmpty()) {
            System.out.printf("\t 큐가 비었습니다. rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
        } else {
            System.out.printf("\t 큐의 상태 rear : %d, front: %d, qSize: %d \n", rear, front, getQueueSize());
            System.out.printf("\t\t queue : [%s] \n",getQueueString());
        }
        System.out.println("------------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.print("Enter a positive number to push, 'p' for pop, `e` for expand, `s` for showInfo, `i` for initialize and 'q' to quit: ");
        while (!(input = scanner.nextLine()).equals("q")) {
            System.out.print("\n");
            switch (input) {
                case "p":
                    int result = pop();
                    if (result > -1){
                        System.out.printf("%d, 값이 삭제 되었습니다. \n", result);
                    } else {
                        System.out.println("삭제에 실패 했습니다.");
                    }
                    break;
                case "s" :
                    showQueueInfo();
                    break;
                case "i" :
                    System.out.println("initializing Queue...");
                    queue = makeQueueArray(10);
                    showQueueInfo();
                    break;
                case "e":
                    System.out.println("Expanding Array...");
                    expandQueue();
                    showQueueInfo();
                    break;
                default:
                    try {
                        int value = Integer.parseInt(input);
                        push(value);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a positive number, 'p', 'o', or 'q'.");
                    }
                    break;
            }
            System.out.print("Enter a positive number to push, 'p' for pop, `e` for expand, `s` for showInfo, `i` for initialize and 'q' to quit: ");
        }
        scanner.close();
    }
}
