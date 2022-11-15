package candidato.config;

import modelos.Candidato;
import modelos.Partido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidatoService {

    public List<Candidato> candidato() {
        List<Candidato> candidato = new ArrayList<>();
        candidato.add(new Candidato(13, Partido.PARTIDO_DOS_TRABALHADORES, "Lula", "Presidente"));
        candidato.add(new Candidato(22, Partido.PARTIDO_LIBERAL, "Bolsonaro", "Presidente"));
        candidato.add(new Candidato(12, Partido.PARTIDO_DEMOCRATICO_TRABALHISTA, "Ciro Gomes", "Presidente"));
        return candidato;
    }

    @Override
    public String toString() {
        return "Número do candidato: " + Candidato.getNumeroCandidato() +
                ", partido: " +  Candidato.getPartido() +
                ", nome candidato: " +  Candidato.getNome() +
                ", cargo pretendidp: " + Candidato.getCargoPretendido();
    }
}
