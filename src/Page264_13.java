public class Page264_13 {
    private static int summa = 0;
    static int sum(int ... v){
        for (int i = 0; i < v.length; i++) {
            summa += v[i];
        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 1, 1));
    }
}
