package Page461_example;

public class MyThread implements Runnable{
    Thread thrd;
    TickTock ttOb;

    public MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        this.ttOb = tt;
    }

    public static MyThread createAndStart(String name, TickTock tt){
        MyThread myThrd = new MyThread(name, tt);
        myThrd.thrd.start();
        return myThrd;
    }

    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i < 5; i++) ttOb.tick(true);
            ttOb.tick(false);
        } else {
            for (int i = 0; i < 5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}
