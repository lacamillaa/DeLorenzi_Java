import java.util.ArrayList;
import java.util.List;

import static java.lang.IO.println;

public class Main {
    static void main() {
        ArrayList<Integer> v = new ArrayList<>(List.of(3, 4, 63, 1, 3, 4, 2));
        Ricerca r = new Ricerca(v, 0, 6, 3);
        try {
            r.start();
            r.join();
            println("Ricerca terminata");
        } catch (InterruptedException e) {
            println("Ricerca interrotta all'indice " + r.getFinalIndex());
        } finally {
            println("Occorrenze trovate: " + r.getResult());
        }
    }
}
