package Page376_378_exercise;

public class QExcDemo {
    public static void main(String[] args) {
        FixedQueue fix = new FixedQueue(10);
        try{
            for (int i = 0; i < 11; i++) {
                System.out.print("Попытка сохранения: " + (char) ('A' + i));
                fix.put((char) ('A' + i));
                System.out.print(" - OK\n");
            }
            System.out.println();
        } catch (QueueFullException e) {
            System.out.println(e);
        }
        System.out.println();
        try{
            for (int i = 0; i < 11; i++) {
                System.out.print("Получение очередного символа: ");
                char ch = fix.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException u) {
            System.out.println(u);
        }
    }
}
