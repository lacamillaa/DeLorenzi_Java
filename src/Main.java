// questo è un commento

import static java.lang.IO.*;

void main() {
    // input: classe Scanner
    Scanner s = new Scanner(System.in);
    System.out.print("Come ti chiami? ");
    String nome = s.nextLine();

    System.out.print("Quanti anni hai? ");
    int eta = s.nextInt();
    // pulizia del buffer
    s.nextLine();

    System.out.print("Dove vivi? ");
    String luogo = s.nextLine();
    // nuovo metodo per l'output: IO.println();
    println("Ti chiami " + nome + ", hai " + eta + " anni e vivi a " + luogo);

    // input con IO.readln()
    // restituisce una String a prescindere dal tipo di dato
    var nome2 = readln("Scrivi nome: ");
    var eta2 = readln("Scrivi età: ");
    var luogo2 = readln("Scrivi luogo: ");
    println("Ti chiami " + nome2 + ", hai " + eta2 + " anni e vivi a " + luogo2);

    // classi wrapper: dati primitivi + altri metodi utili
    Integer n = 25;
    println(n.toString());
    // lettura di interi
    n = Integer.parseInt(readln("Scrivi un numero: "));
    println(n);
}
