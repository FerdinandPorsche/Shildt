package Page189_190;

//Excersize 6.2 page 241-243

public class QDemo2_page243 {
    public static void main(String[] args) {
        Queue q1 = new Queue(10);
        //создание очереди на основе массива
        char name[] = {'T', 'o', 'm'};
        Queue q2 = new Queue(name);
        char ch;
        int i;
        //помещение ряда символов в очередь q1
        for (i = 0; i < 10; i++) {
            q1.put((char) ('A' + i));
        }
        //создание одной очереди на основе другой
        Queue q3 = new Queue(q1);
        //отображение очередей
        System.out.print("Содержимое q1: ");
        for (i = 0; i < 10; i++) {
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("Содержимое q2: ");
        for (i = 0; i < 3; i++) {
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("Содержимое q3: ");
        for (i = 0; i < 10; i++) {
            ch = q3.get();
            System.out.print(ch);
        }
        System.out.println("\n");

    }
}
