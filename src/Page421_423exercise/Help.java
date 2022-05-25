package Page421_423exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Help {
    String help;

    public Help(String help) {
        this.help = help;
    }

    public boolean helpon(String what){
        int ch;
        String topic, info;
        //open helpfile
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(help))) {
            do {
                //читать символы, пока не встретится символ #
                ch = helpRdr.read();
                //проверить, не совпадают ли темы?
                if (ch == '#') {
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = helpRdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        }
        catch (IOException e) {
            System.out.println("Ошибка доступа. Файл не найден");
            return false;
        }
        return false; //тема не найдена
    }

    //получение темы справки
    public String getSelection() {
        String topic = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите тему: ");
        try {
            topic = br.readLine();
        }
        catch (IOException e) {
            System.out.println("Ошибка при чтении с консоли");
        }
        return topic;
    }
}