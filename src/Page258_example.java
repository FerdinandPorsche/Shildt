import java.util.Arrays;

public class Page258_example {
    static void vaTest(int ... v){
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: " + Arrays.toString(v));
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
