package Page380_10;

public class StackFullException extends Throwable {
    int size;
    StackFullException(int s){
        this.size = s;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Максимальный размер: " + size;
    }
}
