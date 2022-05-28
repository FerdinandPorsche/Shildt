package Page438_example;

public class MyThread implements Runnable{
    Thread thrd;

    MyThread(String name){
        thrd = new Thread(this, name);
    }

    public static MyThread createAndstart(String name){
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start();
        return myThrd;
    }

    public void run(){
        System.out.println(thrd.getName() + " - запуск");
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(400);
                System.out.println("Счетчик " + thrd.getName() + " - " + i);
            }
        } catch (InterruptedException e) {
            System.out.println(thrd.getName() + " - прерван");
        }
        System.out.println(thrd.getName() + " - завершено");
    }
}
