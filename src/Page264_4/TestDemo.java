package Page264_4;

public class TestDemo {
    public static void main(String[] args) {
        Test t1 = new Test("Первый",11);
        Test t2 = new Test("Второй", 33);
        System.out.println(t1);
        System.out.println(t2);
        Test.swap(t1, t2);
        System.out.println(t1);
        System.out.println(t2);

    }


}
