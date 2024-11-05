package heverton.victor.aula1spring.repository;


import heverton.victor.aula1spring.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
