public class Page61_10 {
    //Inches to meters
    public static void main(String[] args) {
        double inches, meters;
        int counter;
        counter = 0;
        for (inches = 1; inches <=100; inches++) {
            meters = inches * 0.025;
            System.out.println(inches + " дюймам соответствует " + meters + " метра.");
            counter++;
            if(counter == 12){
                System.out.println();
                counter = 0;
            }
        }
    }
}
