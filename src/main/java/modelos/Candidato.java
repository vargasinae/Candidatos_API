package modelos;

import java.util.ArrayList;

public class Candidato {
    private static Integer numeroCandidato;
    private static Partido partido;
    private static String nome;
    private static String cargoPretendido;

    public Candidato(Integer numeroCandidato, Partido partido, String nome, String cargoPretendido) {
        Candidato.numeroCandidato = numeroCandidato;
        Candidato.partido = partido;
        Candidato.nome = nome;
        Candidato.cargoPretendido = cargoPretendido;
    }

    public static Integer getNumeroCandidato() {
        return numeroCandidato;
    }

    public void setNumeroCandidato(Integer numeroCandidato) {
        Candidato.numeroCandidato = numeroCandidato;
    }

    public static Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        Candidato.partido = partido;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Candidato.nome = nome;
    }

    public static String getCargoPretendido() {
        return cargoPretendido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

}
