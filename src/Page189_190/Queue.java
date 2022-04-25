package Page189_190;

public class Queue {
    char q[];
    int putloc, getloc;
    Queue(int size){
        q = new char[size];
        putloc = getloc = 0;
    }
    void put(char ch){
        if(putloc == q.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
    char get(){
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }
        return q[getloc++];
    }
}
