package Page325_330_example;

public class ByThrees implements Series{
    int start, val;

    public ByThrees() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }

    @Override
    public void reset() {
        start = val = 0;
    }

    @Override
    public void setStart(int x) {
        start = val = x;
    }
}
