package Page471exercise;

public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        thrd = Thread.currentThread(); //получить ссылку на текущий поток (main)
        System.out.println("Имя основного потока - " + thrd.getName());
        System.out.println("Приоритет - " + thrd.getPriority());
        System.out.println("\nУстановка имени и приоритета");
        thrd.setName("Поток 1");
        thrd.setPriority(Thread.NORM_PRIORITY + 3);
        System.out.println("Новое имя основного потока - " + thrd.getName());
        System.out.println("Новый приоритет - " + thrd.getPriority());
    }
}
