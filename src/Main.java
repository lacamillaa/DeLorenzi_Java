// questo è un commento

import static java.lang.IO.*;

void main() {
    int nElementi = 100_000;

    // array dinamici
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    long start = System.nanoTime();
    for(int i = 0; i < nElementi; i++) {
        arrayList.add(i);
    }
    long end = System.nanoTime();
    println("Tempo di inserimento: " + (end - start) / 1_000_000.0 + "ms (array list)");

    start = System.nanoTime();
    for(int i = 0; i < nElementi; i++) {
        linkedList.add(i);
    }
    end = System.nanoTime();
    println("Tempo di inserimento: " + (end - start) / 1_000_000.0 + "ms (linked list)");

    start = System.nanoTime();
    for(int i = 0; i < 1_000; i++) {
        arrayList.get(nElementi / 2);
    }
    end = System.nanoTime();
    println("Tempo di accesso al centro: " + (end - start) / 1_000_000.0 + "ms (array list)");

    start = System.nanoTime();
    for(int i = 0; i < 1_000; i++) {
        linkedList.get(nElementi / 2);
    }
    end = System.nanoTime();
    println("Tempo di accesso al centro: " + (end - start) / 1_000_000.0 + "ms (linked list)");

    boolean contains = false;
    start = System.nanoTime();
    for(int i = 0; i < 1_000; i++) {
        contains = arrayList.contains(nElementi - 1);
        if(contains) break;
    }
    end = System.nanoTime();
    println("Tempo di ricerca: " + (end - start) / 1_000_000.0 + "ms (array list)");

    contains = false;
    start = System.nanoTime();
    for(int i = 0; i < 1_000; i++) {
        contains = linkedList.contains(nElementi - 1);
        if(contains) break;
    }
    end = System.nanoTime();
    println("Tempo di ricerca: " + (end - start) / 1_000_000.0 + "ms (linked list)");

}
