package Page438_example;

public class ThreadVariations {
    public static void main(String[] args) {
        System.out.println("Main thread start");
        MyThread mt = MyThread.createAndstart("Поток 1");
        for (int i = 0; i < 50; i++) {
            System.out.println("Main thread " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Main thread exception");
            }
        }
        System.out.println("Main thread stop");
    }
}
