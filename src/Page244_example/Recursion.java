package Page244_example;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Факториал 3 = " + f.factR(3));
        System.out.println("Факториал 4 = " + f.factR(4));
        System.out.println("Факториал 5 = " + f.factR(5));

        System.out.println("\nОбычный метод");
        System.out.println("Факториал 3 = " + f.factI(3));
        System.out.println("Факториал 4 = " + f.factI(4));
        System.out.println("Факториал 5 = " + f.factI(5));
    }
}
