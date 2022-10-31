package modelos;

import java.util.ArrayList;

public class Candidato {
    private Integer numeroCandidato;
    private Partido partido;
    private String nome;
    private String cargoPretendido;

    public Candidato(Integer numeroCandidato, Partido partido, String nome, String cargoPretendido) {
        this.numeroCandidato = numeroCandidato;
        this.partido = partido;
        this.nome = nome;
        this.cargoPretendido = cargoPretendido;
    }

    public Candidato(){ criarCandidato(); };

    public Integer getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(Integer numeroCandidato) {
        this.numeroCandidato = numeroCandidato;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargoPretendido() {
        return cargoPretendido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

    @Override
    public String toString() {
        return "Número do candidato: " + numeroCandidato +
                ", partido: " +  partido +
                ", nome candidato: " +  nome +
                ", cargo pretendidp: " + cargoPretendido;
    }

    public ArrayList<Candidato> criarCandidato(){
        ArrayList<Candidato> candidatos = new ArrayList<>();
        candidatos.add(new Candidato(13, Partido.PARTIDO_DOS_TRABALHADORES, "Lula", "Presidente"));
        candidatos.add(new Candidato(22, Partido.PARTIDO_LIBERAL, "Bolsonaro", "Presidente"));
        candidatos.add(new Candidato(12, Partido.PARTIDO_DEMOCRATICO_TRABALHISTA, "Ciro Gomes", "Presidente"));
        return candidatos;
    }
}
