package Es_progetto;
import java.io.Serializable;

public class Utente1 {
	private String nome;
    private String cognome;
    private String email;
    private int numeroOrdini;
    private String indirizzoSpedizione;

    public Utente1(String nome, String cognome, String email, int numeroOrdini, String indirizzoSpedizione) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numeroOrdini = numeroOrdini;
        this.indirizzoSpedizione = indirizzoSpedizione;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Email: " + email +
               ", Ordini: " + numeroOrdini + ", Indirizzo: " + indirizzoSpedizione;
    }
}
