import java.io.IOException;

public class Page137_1 {
    //read symbols from keyboard while don't enter dot
    public static void main(String[] args) throws IOException {
        char s;
        int count = 0;
        do {
            s = (char) System.in.read();
            if (s == ' ') {
                count++;
            }
        } while (s != '.');
        System.out.println(count);

    }
}
