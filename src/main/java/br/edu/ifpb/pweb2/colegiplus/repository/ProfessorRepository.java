package br.edu.ifpb.pweb2.colegiplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.colegiplus.model.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

    Professor findByLogin(String login);

    List<Professor> findByCoordenadorTrue();

    List<Professor> findByNomeContainingIgnoreCase(String nome);
}
