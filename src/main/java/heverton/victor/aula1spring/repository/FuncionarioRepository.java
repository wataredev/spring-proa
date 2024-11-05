package heverton.victor.aula1spring.repository;

import heverton.victor.aula1spring.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
