import java.io.IOException;

public class Page138_10 {
    //
    public static void main(String[] args) throws IOException {
        char input, small, big;
        int k, counter = 0;
        do {
            input = (char) System.in.read();
            k = input;
            if (k >= 97 && k <= 122){
                k = k - 32;
                big = (char) k;
                System.out.println(big);
                counter++;
            } else if (k >= 65 && k <= 90){
                k += 32;
                small = (char) k;
                System.out.println(small);
                counter++;
            }
        } while (input != '.');
        System.out.println(counter);
    }
}
