package Page331_336_exercise;

public class CircularQueue implements ICharQ{
    private char q[];
    private int putloc, getloc;

    public CircularQueue(int size) {
        q = new char[size +1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) {
        if (putloc +1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; //переход в начало очереди
    }

    @Override
    public char get() {
        if (putloc == getloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0;
        return q[getloc];
    }
}
