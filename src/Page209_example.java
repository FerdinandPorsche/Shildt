public class Page209_example {
    public static void main(String[] args) {
        String msg = "Текст для шифрования";
        String encmsg = "";
        String decmsg = "";
        int key = 1984;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        //Шифрование
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Зашифрованное сообщение:");
        System.out.println(encmsg);

        //Дешифровка
        for (int i = 0; i < encmsg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
