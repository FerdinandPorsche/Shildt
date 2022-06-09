package Page461_example;

public class TickTock {
    String state;
     synchronized void tick(boolean running){
         if(!running) {
             state = "ticked";
             notify();
             return;
         }
         System.out.print("Tick ");
         state = "ticked";
         notify();
         try {
             while (!state.equals("tocked")) {
                 wait();
             }
         } catch (InterruptedException e) {
             System.out.println("Прерывание потока");
         }
     }
     synchronized void tock(boolean running){
         if (!running) {
             state = "tocked";
             notify();
             return;
         }
         System.out.print("Tock ");
         state = "tocked";
         notify();
         try {
             if (!state.equals("ticked")){
                 wait();
             }
         } catch (InterruptedException e){
             System.out.println("Прерывание потока");
         }
     }
}
