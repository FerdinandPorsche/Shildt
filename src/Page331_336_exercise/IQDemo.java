package Page331_336_exercise;

import Page347_1.CircularQueue;
import Page347_1.DynQueue;
import Page347_1.FixedQueue;
import Page347_1.ICharQ;

public class IQDemo {
    public static void main(String[] args) {
        FixedQueue fix = new FixedQueue(10);
        DynQueue dyn = new DynQueue(5);
        CircularQueue cir = new CircularQueue(10);

        ICharQ iQ;

        iQ = fix;
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.println("Фиксированная очередь");
        for (int i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println("\n-------------------");

        iQ = dyn;
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('Z' - i));
        }
        System.out.println("Динамическая очередь");
        for (int i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println("\n-------------------");

        iQ = cir;
        for (int i = 0; i < 10; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.println("Кольцевая очередь");
        for (int i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println("\n-------------------");
        for (int i = 10; i < 20; i++) {
            iQ.put((char) ('A' + i));
        }
        System.out.println("Добавка в кольцевую очередь");
        for (int i = 0; i < 10; i++) {
            System.out.print(iQ.get());
        }
        System.out.println("\n-------------------");
        for (int i = 0; i < 20; i++) {
            iQ.put((char) ('A' + i));
            System.out.print(iQ.get());
        }
    }
}
