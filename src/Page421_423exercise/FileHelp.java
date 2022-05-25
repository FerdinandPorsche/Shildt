package Page421_423exercise;

public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("e:/Shildt/helpfile.txt");
        String topic;
        System.out.println("Справка.\n" + "Введите \"stop\" для выхода.");
        do {
            topic = hlpobj.getSelection();
            if (!hlpobj.helpon(topic)) System.out.println("Тема не найдена");
        } while (topic.compareTo("stop") != 0);
    }
}
