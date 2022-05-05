package Page252_253_example;

public class QSDemo {
    public static void main(String[] args) {
        //char a[] = {'d', 'x', 'a', 'r', 'p', 'j', 'i'};
        int a[] = new int[100_000];
        int i;

        for (i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (200_000+1)) - 100_000;
        }

        System.out.println("Исходный массив: ");
        for (i = 0; i < a.length; i++) System.out.println(a[i]);
        System.out.println();
        long start = System.nanoTime();
        QuickSort.qsort(a);
        long end = System.nanoTime();
        System.out.println("Отсортированный массив: ");
        for (i = 0; i < a.length; i++) System.out.println(a[i]);
        long dura = end - start;
        System.out.println(dura / 1_000_000 + " ms");
    }
}
