package Page485_490exercise;

public class TrafficLightsSimulator implements Runnable {
    private TrafficLightColor tlc; //текущий цвет светофора
    boolean stop = false; // для остановки иммитации установить в true
    boolean changed = false; // true, если светофор переключился

    TrafficLightsSimulator(TrafficLightColor init){
        tlc = init;
    }
    TrafficLightsSimulator(){
        tlc = TrafficLightColor.RED;
    }
    @Override
    public void run() {
        while(!stop){
            try{
                switch (tlc){
                    case GREEN: Thread.sleep(1000);
                    break;
                    case YELLOW: Thread.sleep(200);
                    break;
                    case RED: Thread.sleep(1200);
                    break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }
    synchronized void changeColor(){
        switch (tlc) {
            case RED: tlc = TrafficLightColor.GREEN;
            break;
            case YELLOW : tlc = TrafficLightColor.RED;
            break;
            case GREEN : tlc = TrafficLightColor.YELLOW;
            break;
        }
        changed = true;
        notify();
    }
    synchronized void waitForChange(){
        try {
            while (!changed) {
                wait();
                changed = false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized TrafficLightColor getColor(){
        return tlc;
    }
    synchronized void cancel(){
        stop = true;
    }
}