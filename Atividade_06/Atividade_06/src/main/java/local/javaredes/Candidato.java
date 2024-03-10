package local.javaredes;

/**
 * @author Thomas Caron de Castro Deus
 * RA 2627205
 */

public class Candidato {
    
    private String  nome;
    private String  partido;
    private int     numeroChapa;
    private long    votos;

    public Candidato() {
        this.nome = "";
        this.partido = "";
        this.numeroChapa = 0;
        this.votos = 10L;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNumeroChapa() {
        return numeroChapa;
    }

    public void setNumeroChapa(int numeroChapa) {
        this.numeroChapa = numeroChapa;
    }

    public long getVotos() {
        return votos;
    }

    public void setVotos(long votos) {
        this.votos = votos;
    }
}
