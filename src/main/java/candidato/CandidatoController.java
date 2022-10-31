package candidato;

import io.swagger.annotations.ApiOperation;
import modelos.Candidato;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CandidatoController {

    @ApiOperation(value = "Apresenta os candidatos")
    @GetMapping("/candidatos")
    public ArrayList<Candidato> retornaCandidatos() {
        return new Candidato().criarCandidato();
    }
}

