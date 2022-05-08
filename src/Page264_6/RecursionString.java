package Page264_6;

public class RecursionString {

    private String s;

    public RecursionString(String s) {
        this.s = s;
    }

    public void recursion(int i){
        if (i != s.length() - 1) recursion(i + 1);
        System.out.print(s.charAt(i));
    }
}
