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
}
