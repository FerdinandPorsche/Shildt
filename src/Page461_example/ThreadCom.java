package Page461_example;

public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();

        // В книжке у Шилдта тут вместо вызова фабричного метода стоит обычное
        // создание объектов MyThread mt1 = new MyThread("Tick", tt);
        // и программа не работает. Можете убедиться сами. А вот если
        // вызвать фабричный метод, тогда да - всё взлетает.
        MyThread mt1 = MyThread.createAndStart("Tick", tt);
        MyThread mt2 = MyThread.createAndStart("Tock", tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
        }
    }
}
