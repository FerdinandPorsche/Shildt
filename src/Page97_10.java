public class Page97_10 {
    //print all prime numbers from 2 to 100
    public static void main(String[] args) {
        int i, j, count;
        for (i = 2; i <= 100; i++) {
            count = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(i + " - is prime");
        }
    }
}
