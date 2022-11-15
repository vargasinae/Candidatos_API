package candidato.controllers;

import io.swagger.annotations.ApiOperation;
import modelos.Candidato;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @ApiOperation(value = "Consultar lista de candidatos cadastrado no TSE")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Candidato>> criarCandidato(List candidato) {
        return ResponseEntity.ok(candidato);
    }

}

