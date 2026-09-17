// questo è un commento

import static java.lang.IO.*;

void main() {
    // restituisce una String a prescindere dal tipo di dato
    var nome = readln("Scrivi nome: ");
    var eta = Integer.parseInt(readln("Scrivi età: "));
    var luogo = readln("Scrivi luogo: ");
    Persona p = new Persona(nome, eta, luogo);
    // restituisce un hash di default, a meno che non ci sia override
    println(p.toString());
}
