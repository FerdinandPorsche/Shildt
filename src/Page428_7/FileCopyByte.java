package Page428_7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyByte {
    public static void main(String[] args) {
        int i;
        FileInputStream src = null;
        FileOutputStream out = null;
        try {
            src = new FileInputStream("e:/Shildt/1.txt");
            out = new FileOutputStream("e:/Shildt/2.txt");

            do {
                i = src.read();
                if (i != -1) out.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                if (src != null) src.close();
            } catch (IOException x) {
                System.out.println(x);
            }
            try {
                if (out != null) out.close();
            } catch (IOException y) {
                System.out.println(y);
            }
        }
    }
}
