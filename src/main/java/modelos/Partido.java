package modelos;

public enum Partido {
    PARTIDO_DOS_TRABALHADORES("PT"),
    PARTIDO_LIBERAL("PL"),
    PARTIDO_DEMOCRATICO_TRABALHISTA("PDT");

    private final String sigla;

    public String sigla() {
        return this.sigla;
    }

    Partido(final String sigla){
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Partido{" +
                ", sigla='" + sigla + '\'' +
                '}';
    }
}
