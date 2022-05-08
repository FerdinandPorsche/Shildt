package Page264_4;

public class Test {
    private int a;
    private String name;

    public Test(String name, int a) {
        this.name = name;
        this.a = a;
    }

    static void swap(Test a1, Test a2){
        int tmp = a1.a;
        a1.a = a2.a;
        a2.a = tmp;
    }

    @Override
    public String toString() {
        return "Test{" +
                "a=" + a +
                ", name='" + name + '\'' +
                '}';
    }
}
