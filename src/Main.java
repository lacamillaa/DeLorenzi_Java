// questo è un commento

import static java.lang.IO.*;

void main() {
    // hash map: funzionamento
    String key = "utente_5aii";
    // decisione del # di bucket
    int n_bucket = 16;
    // calcolo dell'hash code
    int hash = key.hashCode();
    println("Hashcode: " + hash);
    // calcolo dell'indice
    int bucket_idx = Math.abs(hash) % n_bucket;
    println("Inserimento in bucket " + bucket_idx);

    // LIST, TREE, HASH
    int nElementi = 100_000;
    int target = nElementi - 1;
    List<Integer> arrayList = new ArrayList<>();
    Set<Integer> treeSet = new TreeSet<>();
    Set<Integer> hashSet = new HashSet<>();

    for(int i = 0; i < nElementi; i++) {
        arrayList.add(i);
        treeSet.add(i);
        hashSet.add(i);
    }

    long start = System.nanoTime();
    boolean contains = arrayList.contains(target);
    long end = System.nanoTime();
    println("Tempo di ricerca: " + (end - start) / 1_000_000.0 + " ms (array list) => O(n)");

    start = System.nanoTime();
    contains = treeSet.contains(target);
    end = System.nanoTime();
    println("Tempo di ricerca: " + (end - start) / 1_000_000.0 + " ms (tree set) => O(log n)");

    start = System.nanoTime();
    contains = hashSet.contains(target);
    end = System.nanoTime();
    println("Tempo di ricerca: " + (end - start) / 1_000_000.0 + " ms (hash set) => O(1)");
}
