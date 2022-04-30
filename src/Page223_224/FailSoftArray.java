package Page223_224;

public class FailSoftArray {
    private int a[];
    private int errval;
    public int length;

    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }

    public int get(int index){
        if(indexOk(index)) return a[index];
        return errval;
    }
    public boolean put(int index, int val){
        if(indexOk(index)){
            a[index] = val;
            return true;
        }
        return false;
    }
    private boolean indexOk(int index){
        if(index >= 0 & index < length) return true;
        return false;
    }
}
