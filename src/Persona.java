public class Persona {
    private String nome;
    private int eta;
    private String luogo;

    // Alt + Ins: generazione di snippet tra cui costruttore
    public Persona(String nome, int eta, String luogo) {
        this.nome = nome;
        this.eta = eta;
        this.luogo = luogo;
    }

    @Override
    public String toString() {
        return "Persona { " +
                "nome: " + nome +
                ", eta: " + eta +
                ", luogo: " + luogo + " }";
    }
}