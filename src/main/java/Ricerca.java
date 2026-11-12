import java.util.ArrayList;

public class Ricerca extends Thread {
    private ArrayList<Integer> vector = new ArrayList<>();
    private int start;
    private int end;
    private int target;
    private int result = 0;
    private int finalIndex;

    public Ricerca(ArrayList<Integer> vector, int start, int end, int target) {
        this.vector = vector;
        this.start = start;
        this.end = end;
        this.target = target;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            try {
                if (vector.get(i) == target) {
                    result++;
                }
            } catch (IndexOutOfBoundsException e) {
                finalIndex = end - 1;
                return;
            }
            finalIndex = i;
        }
    }

    public int getResult() {
        return result;
    }

    public int getFinalIndex() {
        return finalIndex;
    }
}
