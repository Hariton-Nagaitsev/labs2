package src.labs.thread;

public class NameThread extends Thread {
    private final String name;
    private static final Object lock = new Object();

    public NameThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                System.out.println(name);
                lock.notify();
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        NameThread name1 = new NameThread("Name 1");
        NameThread name2 = new NameThread("Name 2");

        name1.start();
        name2.start();
    }
}
