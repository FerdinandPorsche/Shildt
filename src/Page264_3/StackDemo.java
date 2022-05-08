package Page264_3;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
