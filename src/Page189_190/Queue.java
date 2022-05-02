package Page189_190;

//Uodated from excersize 6.2 page 241

public class Queue {
    private char q[];
    private int putloc, getloc;
    Queue(int size){
        q = new char[size+1];
        putloc = 0;
        getloc = 0;
    }

    //6.2 start
    Queue(Queue ob){
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        for (int i = getloc+1; i <= putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    Queue(char a[]){
        putloc = 0;
        getloc = 0;
        q = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            put(a[i]);
        }
    }
//6.2 end

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
