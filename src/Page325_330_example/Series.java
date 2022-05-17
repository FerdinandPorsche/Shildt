package Page325_330_example;

public interface Series {
    int getNext();
    default void reset(){
        System.out.println("ERROR");
    }
    void setStart(int x);
}
