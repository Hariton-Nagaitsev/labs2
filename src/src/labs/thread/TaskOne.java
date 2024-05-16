package src.labs.thread;

public class TaskOne implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - состояние перед началом: " + Thread.currentThread().getState());
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
        System.out.println(Thread.currentThread().getName() + " - состояние после выполнения: " + Thread.currentThread().getState());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new TaskOne());
            System.out.println(thread.getName() + " - состояние перед запуском: " + thread.getState());
            thread.start();
        }
    }
}
