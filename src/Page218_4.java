public class Page218_4 {
    //Bubble sort array of strings
    public static void main(String[] args) {
        String str[] = {"one", "two", "three", "four", "five"};
        System.out.print("Unsorted array: ");
        //System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        //Bubble sort
        for (int i = 1; i < str.length; i++) {
            if (str[i - 1].length() > str[i].length()){
                String temp = str[i - 1];
                str[i - 1] = str[i];
                str[i] = temp;
            }
        }
        System.out.print("Sorted array: ");
        //System.out.println(Arrays.toString(str));
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }
}
