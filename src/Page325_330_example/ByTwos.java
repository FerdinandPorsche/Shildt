package Page325_330_example;

public class ByTwos implements Series{
    int start, val;

    public ByTwos() {
        start = 0;
        val = 0;
    }

    @Override
    public int getNext() {
        val += 2;
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
