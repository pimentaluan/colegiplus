package br.edu.ifpb.pweb2.colegiplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifpb.pweb2.colegiplus.model.Aluno;
import br.edu.ifpb.pweb2.colegiplus.model.Assunto;
import br.edu.ifpb.pweb2.colegiplus.model.Processo;
import br.edu.ifpb.pweb2.colegiplus.model.Professor;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long> {

    List<Processo> findByInteressado(Aluno interessado);

    List<Processo> findByInteressadoAndAssunto(Aluno interessado, Assunto assunto);

    List<Processo> findByRelator(Professor relator);

    List<Processo> findByAssunto(Assunto assunto);

    List<Processo> findByInteressadoNomeContainingIgnoreCase(String nomeAluno);

    List<Processo> findByRelatorNomeContainingIgnoreCase(String nomeProfessor);
}
