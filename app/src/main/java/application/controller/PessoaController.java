package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import application.model.Pessoa;
import application.repository.PessoaRepository;

@RestController
public class PessoaController {
    @Autowired
    private PessoaRepository pessoaRepo;

    @PostMapping("/pessoas")
    public Pessoa insert(@RequestBody Pessoa novoRegistro) {
        return pessoaRepo.save(novoRegistro);
    }
}
