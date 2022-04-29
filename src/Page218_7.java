public class Page218_7 {
        public static void main(String[] args) {
            String msg = "Текст для шифрования";
            String encmsg = "";
            String decmsg = "";
            String key = "19841984";
            int j;

            System.out.print("Исходное сообщение: ");
            System.out.println(msg);

            //Шифрование
            j = 1;
            for (int i = 0; i < msg.length(); i++) {
                encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
                j++;
                if(j == key.length()) j = 1;
            }

            System.out.print("Зашифрованное сообщение:");
            System.out.println(encmsg);

            //Дешифровка
            j = 1;
            for (int i = 0; i < encmsg.length(); i++) {
                decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
                j++;
                if(j == key.length()) j = 1;
            }

            System.out.print("Дешифрованное сообщение: ");
            System.out.println(decmsg);
        }
}
