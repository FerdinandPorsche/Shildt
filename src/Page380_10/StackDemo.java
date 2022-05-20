package Page380_10;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        try {
            s.push(1);
            s.push(2);
            s.push(3);
        } catch (StackFullException e) {
            System.out.println(e);
        }
        try {
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
    }
}
