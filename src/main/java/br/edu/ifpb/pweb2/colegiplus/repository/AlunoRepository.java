package br.edu.ifpb.pweb2.colegiplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.colegiplus.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Aluno findByLogin(String login);

    boolean existsByMatricula(String matricula);

    boolean existsByLogin(String login);

    List<Aluno> findByNomeContainingIgnoreCase(String nome);
}