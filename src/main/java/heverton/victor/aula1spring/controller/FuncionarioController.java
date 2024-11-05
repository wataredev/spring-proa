package heverton.victor.aula1spring.controller;

import heverton.victor.aula1spring.model.Funcionario;
import heverton.victor.aula1spring.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @PostMapping("/add")
    public ResponseEntity<String> addFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        return ResponseEntity.ok("Funcionário adicionado com sucesso!");
    }

    @GetMapping("/list")
    public ResponseEntity <List<Funcionario>> listFuncionarios() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        return ResponseEntity.ok(funcionarios);
    }
}
