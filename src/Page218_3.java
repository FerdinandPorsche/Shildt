public class Page218_3 {
    public static void main(String[] args) {
        double arr[] = {1.1, 2.1, 3.1, 4.1, 5.0, 6.6, 7.7, 83.8, 9.9, 10.10};
        double result = 0;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            result += arr[i];
        }
        result = result / length;
        System.out.println(result);
    }
}
