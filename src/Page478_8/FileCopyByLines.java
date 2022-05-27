package Page478_8;

import java.io.*;

public class FileCopyByLines {
    public static void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("e:/Shildt/1.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("e:/Shildt/2.txt"))) {
            do {
                s = br.readLine();
                if (s != null) {
                    bw.write(s);
                    System.out.println(s);
                }
            } while (s != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
