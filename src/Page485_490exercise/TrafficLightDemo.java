package Page485_490exercise;

public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightsSimulator ts = new TrafficLightsSimulator(TrafficLightColor.GREEN);
        Thread thrd = new Thread(ts);
        thrd.start();
        for (int i = 0; i < 9; i++) {
            System.out.println(ts.getColor());
            ts.waitForChange();
        }
        ts.cancel();
    }
}
