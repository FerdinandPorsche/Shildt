import java.io.FileInputStream;
import java.io.IOException;

public class Page404_405_example {
    // COMPARE 2 FILES
    public static void main(String[] args) {
        //here author take names from command line, but we take it from the String
//        if(args.length !=2){
//            System.out.println("Wrong arguments");
//            return;
//        }
        int i = 0, j = 0, pos = 0;
        String file1 = "e:/ban.txt";
        String file2 = "e:/banan.txt";

        try (FileInputStream f1 = new FileInputStream(file1);
        FileInputStream f2 = new FileInputStream(file2))
        {
            do {
                i = f1.read();
                j = f2.read();
                pos += 1;
                if (i != j) break;
            } while (i != -1 && j != -1);
            if (i != j) System.out.println("Содержимое файлов различается в позиции: " + pos);
            else System.out.println("Файлы идентичны");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
